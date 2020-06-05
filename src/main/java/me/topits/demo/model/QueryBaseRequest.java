package me.topits.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Wang Ziyue
 * @since 2020/6/2 14:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class QueryBaseRequest {

    /** 当前页 */
    private Integer current = 1;
    /** 条数 */
    private Integer size = 20;
    /** 单页最大条数 */
    private static final Integer MAX_SIZE = 100;

    private Integer getOffset() {
        if (this.current > 1) {
            return (this.current - 1) * this.size;
        }
        return 0;
    }

    private Integer getSize() throws Exception {
        if (this.size > MAX_SIZE) {
            throw new Exception("分页数超过上限");
        }
        return this.size;
    }

}
