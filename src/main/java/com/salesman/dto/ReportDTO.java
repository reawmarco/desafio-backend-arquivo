package com.salesman.dto;

import java.io.Serializable;

public class ReportDTO implements Serializable {

    private static final long serialVersionUID = 2772805375215315611L;
    private int salesmanTotal;
    private int customerTotal;
    private long mostExpensiveSaleId;
    private String worstSalesmanName;

    public static Builder builder() {
        return new Builder();
    }

    public int getSalesmanTotal() {
        return salesmanTotal;
    }

    public void setSalesmanTotal(int salesmanTotal) {
        this.salesmanTotal = salesmanTotal;
    }

    public int getCustomerTotal() {
        return customerTotal;
    }

    public void setCustomerTotal(int customerTotal) {
        this.customerTotal = customerTotal;
    }

    public long getMostExpensiveSaleId() {
        return mostExpensiveSaleId;
    }

    public void setMostExpensiveSaleId(long mostExpensiveSaleId) {
        this.mostExpensiveSaleId = mostExpensiveSaleId;
    }

    public String getWorstSalesmanName() {
        return worstSalesmanName;
    }

    public void setWorstSalesmanName(String worstSalesmanName) {
        this.worstSalesmanName = worstSalesmanName;
    }

    public String formattedReport() {
        return "Report Result\n"
                + "Salesman Count: " + salesmanTotal
                + "\nCustomer Count: " + customerTotal
                + "\nMost Expensive Sale Id: " + mostExpensiveSaleId
                + "\nWorst Salesman Name: " + worstSalesmanName;
    }

    public static final class Builder {
        private int salesmanTotal;
        private int customerTotal;
        private long mostExpensiveSaleId;
        private String worstSalesmanName;

        private Builder() {
        }

        public Builder salesmanTotal(int salesmanTotal) {
            this.salesmanTotal = salesmanTotal;
            return this;
        }

        public Builder customerTotal(int customerTotal) {
            this.customerTotal = customerTotal;
            return this;
        }

        public Builder mostExpensiveSaleId(long mostExpensiveSaleId) {
            this.mostExpensiveSaleId = mostExpensiveSaleId;
            return this;
        }

        public Builder worstSalesmanName(String worstSalesmanName) {
            this.worstSalesmanName = worstSalesmanName;
            return this;
        }

        public ReportDTO build() {
            ReportDTO reportDTO = new ReportDTO();
            reportDTO.setSalesmanTotal(salesmanTotal);
            reportDTO.setCustomerTotal(customerTotal);
            reportDTO.setMostExpensiveSaleId(mostExpensiveSaleId);
            reportDTO.setWorstSalesmanName(worstSalesmanName);
            return reportDTO;
        }
    }
}
