package com.imooc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.imooc.dao.ProductInfoRepository;
import com.imooc.dataObject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.service.ProductInfoService;
/**
 * @Package:com.imooc.service.impl
 * @ClassName:ProductInfoServiceImpl
 * @Description:TODO 商品类 服务层的实现类
 * @author:Jiangxb
 * @date:2018年10月17日 下午7:23:02
 * 
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	private ProductInfoRepository productInfoRepository;
	
	@Override
	public ProductInfo findOne(String productId) {
		Optional<ProductInfo> productInfo = productInfoRepository.findById(productId);
		// 值不为空
		if(productInfo.isPresent()) {
			return productInfo.get();
		}else {
			return null;
		}
	}

	@Override
	public List<ProductInfo> findUpAll() {
		// 0表示 上架状态，尽量不要体现0/1这样的，用枚举来体现
		return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
	}

	@Override
	public Page<ProductInfo> findAll(Pageable pageable) {
		return productInfoRepository.findAll(pageable);
	}

	@Override
	public ProductInfo save(ProductInfo productInfo) {
		return productInfoRepository.save(productInfo);
	}

}
