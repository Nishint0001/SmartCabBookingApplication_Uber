package com.nishintgoyal.project.uber.uberApplication.configurations;

import com.nishintgoyal.project.uber.uberApplication.dto.PointDto;
import com.nishintgoyal.project.uber.uberApplication.utils.GeometryUtil;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PrivateKey;

@Configuration
public class MapperConfig
{
    @Bean
    public ModelMapper modelmapper()
    {
        ModelMapper mapper = new ModelMapper();

        mapper.typeMap(PointDto.class, Point.class).setConverter(context->
        {
            PointDto pointDto=context.getSource();

            return GeometryUtil.createPoint(pointDto);

        });

        mapper.typeMap(Point.class, PointDto.class).setConverter(context->{
            Point point=context.getSource();
            double coordinates[]={
                    point.getX(),
                    point.getY()

            };
            return new PointDto(coordinates);
        });

        return mapper;
    }
}
