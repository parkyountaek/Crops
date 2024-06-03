package com.crops.managment.domain.model.converter;

import com.crops.managment.domain.model.valueobjct.Range;
import com.crops.managment.domain.model.valueobjct.UnitType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Objects;

@Converter(autoApply = true)
public class RangeConverter implements AttributeConverter<Range, String> {
    @Override
    public Range convertToEntityAttribute(String attribute) {
        if(Objects.isNull(attribute))
            return null;
        String[] split = attribute.split(" ");
        String unit = split[split.length - 1];
        String[] fromTo =  split[0].split("~");
        Double from = Double.valueOf(fromTo[0]);
        Double to = Double.valueOf(fromTo[1]);
        return new Range(UnitType.valueOfOrNull(unit), from, to);
    }

    @Override
    public String convertToDatabaseColumn(Range dbData) {
        if(Objects.isNull(dbData))
            return null;
        return String.format("%f~%f %s", dbData.getFrom(), dbData.getTo(), dbData.getUnit());
    }
}
