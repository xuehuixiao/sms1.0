package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Shool;

public interface ShoolMapper {
	List<Shool> findAll();

	Shool findById(long id);

	void updateById(Shool shool);

	void deleteById(long id);

	void save(Shool shool);

}
