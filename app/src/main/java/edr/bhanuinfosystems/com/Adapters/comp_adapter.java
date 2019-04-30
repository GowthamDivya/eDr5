package edr.bhanuinfosystems.com.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import edr.bhanuinfosystems.com.R;
import edr.bhanuinfosystems.com.model.Complaint;


public class comp_adapter extends RecyclerView.Adapter<comp_adapter.ProductViewHolder> {


    private Context mCtx;
    private List<Complaint> productList;

    public comp_adapter(Context mCtx, List<Complaint> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.compliant_list_item, parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        Complaint product = productList.get(position);


        //holder.textViewTitle.setText(product.getCid());
        holder.complaints.setText(product.getCname());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        public RelativeLayout relativeLayout;

        // TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;

        CheckBox complaints;

        public ProductViewHolder(View itemView) {

            super(itemView);
            complaints = itemView.findViewById(R.id.complaints);






        }
    }
}