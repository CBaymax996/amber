package top.cbaymax.misty.client.model.common;

/**
 * 统一返回结构
 */
public record Result<DATA>(boolean success, DATA data, PageInfo pageInfo, ErrorInfo errorInfo) {

    public static <D> Result<D> buildSuccess(D data) {
        return new Result<>(true, data, null, null);
    }

    public static <D> Result<D> buildSuccess(D data, PageInfo pageInfo) {
        return new Result<>(true, data, pageInfo, null);
    }

    public static <D> Result<D> buildError(ErrorInfo errorInfo) {
        return new Result<>(false, null, null, errorInfo);
    }

    public static <D> Result<D> buildError(String errorCode, String errorMessage) {
        return new Result<>(false, null, null, new ErrorInfo(errorCode, errorMessage));
    }
}



