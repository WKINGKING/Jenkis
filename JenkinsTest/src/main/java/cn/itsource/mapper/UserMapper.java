package cn.itsource.mapper;

/**
 * @author wangkui
 * @date 2023-05-17 19:06
 * @description:
 * @version:
 */
import cn.itsource.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//表明这是一个Mapper，也可以在启动类上加上包扫描
//Mapper 继承该接口后，无需编写 mapper.xml 文件，即可获得CRUD功能
public interface UserMapper extends BaseMapper<User> {

}

