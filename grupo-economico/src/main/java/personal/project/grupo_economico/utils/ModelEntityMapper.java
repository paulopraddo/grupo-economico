package personal.project.grupo_economico.utils;

import java.util.List;
import java.util.stream.Collectors;

public abstract class ModelEntityMapper<E, M> {
    
    public abstract M convertToRestModel(E entity);

    public abstract E convertToEntity(M model);

    public List<M> convertToDtoList(List<E> entityList) {
        return entityList.stream()
                .map(this::convertToRestModel)
                .collect(Collectors.toList());
    }

    public List<E> convertToEntityFromRestModelList(List<M> dtoList) {
        return dtoList.stream()
                .map(this::convertToEntity)
                .collect(Collectors.toList());
    }
}
