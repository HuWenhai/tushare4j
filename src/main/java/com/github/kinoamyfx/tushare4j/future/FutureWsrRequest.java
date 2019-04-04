package com.github.kinoamyfx.tushare4j.future;

import com.github.kinoamyfx.tushare4j.core.TsDate;
import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import lombok.Data;

import static com.github.kinoamyfx.tushare4j.core.TsParam.RequiredType.ALTERNATIVE;

@Data
public class FutureWsrRequest implements TsRequest<FutureWsr> {

    @TsParam(name = "trade_date", required = ALTERNATIVE)
    private TsDate tradeDate;

    @TsParam(name = "symbol", required = ALTERNATIVE)
    private String symbol;

    @TsParam(name = "start_date")
    private TsDate startDate;

    @TsParam(name = "end_date")
    private TsDate endDate;

    @TsParam(name = "exchange")
    private FutureExchange exchange;

    @Override
    public String apiName() {
        return "fut_wsr";
    }
}
