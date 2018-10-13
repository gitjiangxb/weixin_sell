package com.imooc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imooc.dataObject.ProductCategory;

/**
 * @Package:com.imooc.dao	也可以叫com.imooc.repository
 * @ClassName:ProductCategoryRepository
 * @Description:TODO 类目实体的Dao
 * @author:Jiangxb
 * @date:2018年10月9日 下午4:26:48
 * 	extends JpaRepository<ProductCategory, Integer>
 * 		泛型：第一个参数——实体类
 * 			 第二个参数——主键类型
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{
	/**
	 * 可以自定义去扩展方法：
	 * 	自定义方法时的命名规则：
	 * 		需要遵守JPA的规则，同时需要使用实体类字段的必用，
	 * 	如“findByCategoryTypeIn”
	 * 			SQL含义：select * from XXX where CategoryType in(x,x,x)
	 */
	
	/**
	 * @Title:findByCategoryTypeIn
	 * @Description:TODO 通过类目编号查出类目信息
	 * @param categoryTypeList
	 * @return:List<ProductCategory>
	 * @author:Jiangxb
	 * @date: 2018年10月9日 下午6:59:33
	 * 	说明：
	 * 		类目表                      商品表
	 * 		  category_type
	 */
	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
