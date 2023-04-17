package iot.cloud.platform.cloud.mapper;

import iot.cloud.platform.cloud.entity.DeviceMsgEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceMsgMapper {
  List<DeviceMsgEntity> getByTag(String iotId, String tag);

  boolean save(DeviceMsgEntity msg);
}
