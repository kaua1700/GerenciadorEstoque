package br.edu.ifcvideira.TestesIG;

import br.com.timer.annotations.ColumnRow;
import br.com.timer.annotations.PrimaryKeyAutoIncrement;
import br.com.timer.annotations.TableName;
import br.com.timer.collectors.DBCollector;
import br.com.timer.objects.HandlerDAO;
import br.com.timer.objects.rows.Row;
import br.com.timer.objects.rows.Rows;

@TableName(name="Material")
public class Material extends HandlerDAO {
	
	@ColumnRow
	@PrimaryKeyAutoIncrement
	private int id;
	
	@ColumnRow
	private String typeMaterial;
	@ColumnRow
	private int quantidade;
	
	
	public void save() {
		// TODO Auto-generated method stub
		super.save(Rows.of("typeMaterial", typeMaterial));
	}
	
	
	public String getTypeMaterial() {
		return typeMaterial;
	}


	public void setTypeMaterial(String typeMaterial) {
		this.typeMaterial = typeMaterial;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getId() {
		return id;
	}


	public void load() {
		// TODO Auto-generated method stub
		super.load(Rows.of("id", id));
	}

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
