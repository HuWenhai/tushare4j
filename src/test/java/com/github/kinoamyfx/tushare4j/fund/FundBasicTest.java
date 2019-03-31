package com.github.kinoamyfx.tushare4j.fund;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class FundBasicTest {
    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>基金代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>name</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>简称</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>management</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>管理人</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>custodian</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>托管人</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>fund_type</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>投资类型</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>found_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>成立日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>due_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>到期日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>list_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>上市时间</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>issue_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>发行日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>delist_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>退市日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>issue_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>发行份额(亿)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>m_fee</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>管理费</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_fee</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>托管费</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>duration_year</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>存续期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>p_value</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>面值</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>min_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>起点金额(万元)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>exp_return</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>预期收益率</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>benchmark</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>业绩比较基准</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>status</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>存续状态D摘牌 I发行 L已上市</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>invest_type</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>投资风格</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>type</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>基金类型</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trustee</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>受托人</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>purc_startdate</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>日常申购起始日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>redm_startdate</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>日常赎回起始日</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>market</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>E场内O场外</td>\n" +
            "</tr>\n" +
            "</tbody>";

    @Test
    public void codeg() {
        CodeUtils.codeg4(content);
    }
}