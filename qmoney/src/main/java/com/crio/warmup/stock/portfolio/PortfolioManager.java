
package com.crio.warmup.stock.portfolio;

import com.crio.warmup.stock.dto.AnnualizedReturn;
import com.crio.warmup.stock.dto.PortfolioTrade;
import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;

public interface PortfolioManager { 

  // CHECKSTYLE:OFF
  // TODO: CRIO_TASK_MODULE_REFACTOR
  // Refactor the code to fit below signature. We will not use file to transfer json data anymore,
  // rather we will try to use java objects. The reason is, this service is going to get exposed as
  // a library in future.

  public List<AnnualizedReturn> calculateAnnualizedReturn(List<PortfolioTrade> portfolioTrades,
      LocalDate endDate) throws IOException, URISyntaxException;
  // CHECKSTYLE:ON
}

