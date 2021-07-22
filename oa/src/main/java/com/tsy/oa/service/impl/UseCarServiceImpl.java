package com.tsy.oa.service.impl;

import com.tsy.oa.entity.Car;
import com.tsy.oa.entity.UseCar;
import com.tsy.oa.dao.UseCarDao;
import com.tsy.oa.service.UseCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UseCar)表服务实现类
 *
 * @author makejava
 * @since 2021-07-21 18:34:26
 */
@Service("useCarService")
public class UseCarServiceImpl implements UseCarService {
    @Resource
    private UseCarDao useCarDao;

    @Override
    public List<UseCar> selectUseCar() {
        return useCarDao.selectUseCar();
    }

    @Override
    public Integer inserUseCar(UseCar useCar) {
        return useCarDao.inserUseCar(useCar);
    }

    /**
     高级查询
     */
    @Override
    public List<UseCar> selectBylikeUseCar(String numberModel) {
        return useCarDao.selectBylikeUseCar(numberModel);
    }

}
