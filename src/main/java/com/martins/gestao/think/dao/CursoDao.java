package com.martins.gestao.think.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.martins.gestao.think.dto.CursoDto;

public class CursoDao {
	
	
	public CursoDto insertCurso(CursoDto cursoDto) throws SQLException {
		PreparedStatement ps = null;
		Connection conn = new Dao().getConn();
		try {
			
			StringBuilder qry = new StringBuilder();
			
			int i = 1;
			
			qry.append("insert into cursos (cd_curso, nm_curso, nm_categoria)").
				append(" values (?, ?, ?) ");
			
			ps = conn .prepareStatement(qry.toString());
			ps.setString(i++, cursoDto.getId());
			ps.setString(i++, cursoDto.getNome());
			ps.setString(i++, cursoDto.getCategoria());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ps.close();
			conn.close();
		}
		
		return cursoDto;
	}

	public CursoDto getCursoPeloCodigo(String codigo) throws SQLException {
		CursoDto cursoDto = null;
		Connection conn = new Dao().getConn();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		try {
			StringBuilder qry = new StringBuilder();
		
			qry.append(" select codigo, cd_curso, nm_curso, nm_categoria from cursos ")
				.append("where cd_curso = ?");
		
			ps = conn.prepareStatement(qry.toString());
			
			ps.setString(1, codigo);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				cursoDto = new CursoDto();
				
				cursoDto.setId(rs.getString("cd_curso"));
				cursoDto.setNome(rs.getString("nm_curso"));
				cursoDto.setCategoria(rs.getString("nm_categoria"));
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			rs.close();
			ps.close();
			conn.close();
		}
		
		return cursoDto;
	}

	public int getUltimoCodigo() throws SQLException {
		int ultimoCodigo = 1;
		Connection conn = new Dao().getConn();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		
		try {
			StringBuilder qry = new StringBuilder();
		
			qry.append(" select max(cd_curso) as cd_curso from cursos ");
		
			ps = conn.prepareStatement(qry.toString());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ultimoCodigo = rs.getInt("cd_curso");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs.close();
			ps.close();
			conn.close();
		}
			
		return ultimoCodigo;
	}

}
