package org.framestudy.spring_mybatis.pojos;

import java.util.List;

/**
 * 分页对象
 * @author Administrator
 *
 */
public class Pager {

	private int page;//当前页码
	private int rows;//每页显示的条数
	private int index;//起始位置
	
	private int totalRows;//总条数
	private int totalPage;//总页数
	private List<?> datas;
	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Pager(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}



	public Pager(int page,int rows, int totalRows, List<?> datas) {
		super();
		this.page = page;
		this.rows = rows;
		this.totalRows = totalRows;
		this.datas = datas;
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
		totalPage = (totalRows % rows) == 0 ? (totalRows / rows) : (totalRows / rows) + 1;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getDatas() {
		return datas;
	}
	public void setDatas(List<?> datas) {
		this.datas = datas;
	}
	public int getIndex() {
		index = (page-1) * rows;
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", index=" + index + ", totalRows=" + totalRows
				+ ", totalPage=" + totalPage + ", datas=" + datas + "]";
	}
}
