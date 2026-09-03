package com.example.expensestrackinglist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Bill_Adapter extends RecyclerView.Adapter<Bill_Adapter.BillViewHolder> {

    private List<Bill> billList;

    public Bill_Adapter(List<Bill> billList) {
        this.billList = billList;
    }

    @NonNull
    @Override
    public BillViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bill, parent, false);
        return new BillViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BillViewHolder holder, int position) {
        Bill bill = billList.get(position);
        holder.billName.setText(bill.getName());
        holder.billDate.setText(bill.getDate());
        holder.billAmount.setText(bill.getAmount() + " PLN");
    }

    @Override
    public int getItemCount() {
        return billList != null ? billList.size() : 0;
    }

    public static class BillViewHolder extends RecyclerView.ViewHolder {
        TextView billName;
        TextView billDate;
        TextView billAmount;

        public BillViewHolder(@NonNull View itemView) {
            super(itemView);
            billName = itemView.findViewById(R.id.bill_name);
            billDate = itemView.findViewById(R.id.bill_date);
            billAmount = itemView.findViewById(R.id.bill_amount);
        }
    }
}
