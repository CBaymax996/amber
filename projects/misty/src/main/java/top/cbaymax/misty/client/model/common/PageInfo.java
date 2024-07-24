package top.cbaymax.misty.client.model.common;


/**
 * 分页信息
 *
 * @param current  当前页号
 * @param total    总数量
 * @param pageSize 每页数量
 */
public record PageInfo(Integer current, Long total, Integer pageSize) {
}
