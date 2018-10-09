package com.imooc.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.dataObject.ProductCategory;


/**
 * @Package:com.imooc.dao
 * @ClassName:ProductCategoryRepositoryTest
 * @Description:TODO 栏目Dao测试类
 * @author:Jiangxb
 * @date:2018年10月9日 下午4:32:22
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@Test
	public void findOneTest() {
		// 根据id查找
		Optional<ProductCategory> productCategory = productCategoryRepository.findById(1);
		// 值不为空
		if(productCategory.isPresent()) {
			logger.info(productCategory.get().toString());
		}else {
			logger.error("不存在");
		}
	}
	
	@Test
	@Transactional	// 在测试中，这个事务是完全回滚
	public void saveTest() {
		ProductCategory productCategory = new ProductCategory();
		productCategory.setCategoryName("女生最爱");
		productCategory.setCategoryType(3);
		ProductCategory category = productCategoryRepository.save(productCategory);
		// 断言,可用于数据合法性检查
		Assert.assertNotNull(category);
		Assert.assertNotEquals(null, category);
	}
	
	@Test
	public void updateTest() {
		ProductCategory productCategory = new ProductCategory();
		// 注意，更新操作 与 新增操作类似；只是更新时要指定id
		productCategory.setCategoryId(2);
		productCategory.setCategoryName("女生最爱");
		productCategory.setCategoryType(3);
		productCategoryRepository.save(productCategory);
	}
	
	/**
	 * 第二种情况：
	 * 	做更新的时候，先做查找，查找到了，再更新指定的字段信息
	 * 		如:当前问题存在的问题？CategoryType字段值修改了，但是updateTime字段没有做更新
	 * 		修改：
	 * 			在实体类ProductCategory 上面添加@DynamicUpdate注解
	 */
	@Test
	public void updateTest1() {
		Optional<ProductCategory> productCategory = productCategoryRepository.findById(2);
		if(productCategory.isPresent()) {
			productCategory.get().setCategoryType(3);
			productCategoryRepository.save(productCategory.get());
		}else {
			logger.error("不存在");
		}
	}
	
	@Test
	public void findByCategoryTypeInTest() {
		List<Integer> list = Arrays.asList(2,3,4);
		// 注意，这种方式的查询，需要实体类存在一个无参的构造方法
		List<ProductCategory> categories = productCategoryRepository.findByCategoryTypeIn(list);
		// 集合的元素个数 不为0 表示成功
		Assert.assertNotEquals(0, categories.size());
	}
}
