package rocks.bastion.core.model;

import java.util.Optional;

/**
 * Provides hints to the {@link ResponseDecoder} about how to interpret the given HTTP response. This includes the type of model
 * that was requested by the user, if any, so that a {@link ResponseDecoder} can decode the response into a specific model
 * as requested by the user.
 */
public class DecodingHints {

    private Class<?> modelType;

    public DecodingHints(Class<?> modelType) {
        this.modelType = modelType;
    }

    public Optional<Class<?>> getModelType() {
        return Optional.ofNullable(modelType);
    }
}
