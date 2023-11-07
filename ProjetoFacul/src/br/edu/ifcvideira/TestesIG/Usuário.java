package br.edu.ifcvideira.TestesIG;

import br.com.timer.annotations.ColumnRow;
import br.com.timer.annotations.PrimaryKeyAutoIncrement;
import br.com.timer.annotations.TableName;
import br.com.timer.collectors.DBCollector;
import br.com.timer.objects.HandlerDAO;

@TableName(name="Users")
public class Usuário extends HandlerDAO {
	
	@ColumnRow
	@PrimaryKeyAutoIncrement
	private int id;
	
	@ColumnRow
	private String nome;
	@ColumnRow
	private String senha;

	@Override
	public DBCollector<?> getDatabase() {
		// TODO Auto-generated method stub
		return telaprincipal.BancoDados;
		
	}

	@Override
	public HandlerDAO getHandle() {
		// TODO Auto-generated method stub
		return this;
	}

}
