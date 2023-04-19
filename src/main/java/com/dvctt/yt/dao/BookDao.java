package com.dvctt.yt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dvctt.yt.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author etern
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
