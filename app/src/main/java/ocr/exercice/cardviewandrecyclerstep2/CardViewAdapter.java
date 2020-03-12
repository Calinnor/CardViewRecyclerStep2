package ocr.exercice.cardviewandrecyclerstep2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {

    private ArrayList<CardViewItem> mCardViewList;
    private OnCardviewListerner mOnCardviewListerner;



    static class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

       private ImageView mImageRsrcCovertImg1;
       private TextView mTextView1NewspaperName;
       private TextView mTextView2ContentNews;
       private TextView mTextView3AuthorName;
       private TextView mTextView4Date;

       OnCardviewListerner mOnCardviewListerner;//implementation de l'interface dans class viewholder

        CardViewHolder(@NonNull View itemView, OnCardviewListerner onCardviewListerner) {
            super(itemView);
            mImageRsrcCovertImg1 = itemView.findViewById(R.id.covert_img1);
            mTextView1NewspaperName = itemView.findViewById(R.id.newspaper_name);
            mTextView2ContentNews = itemView.findViewById(R.id.content_news);
            mTextView3AuthorName = itemView.findViewById(R.id.author_name);
            mTextView4Date = itemView.findViewById(R.id.date);
            this.mOnCardviewListerner = onCardviewListerner;//on indique que le listerner est sur this

            itemView.setOnClickListener(this);//implementation listerner dans viewholder
        }

        @Override
        public void onClick(View v) {
            mOnCardviewListerner.onCardviewClik(getAdapterPosition());
        }
    }

    CardViewAdapter(ArrayList<CardViewItem> cardViewList, OnCardviewListerner onCardviewListerner){
        mCardViewList = cardViewList;
        this.mOnCardviewListerner = onCardviewListerner;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview_one,parent,false);
        return new CardViewHolder(v, mOnCardviewListerner);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder viewHolder, int position) {

        CardViewItem currentItem = mCardViewList.get(position);
        viewHolder.mTextView1NewspaperName.setText(currentItem.getmTextView1NewspaperName());
        viewHolder.mTextView2ContentNews.setText(currentItem.getmTextView2ContentNews());
        viewHolder.mImageRsrcCovertImg1.setImageResource(currentItem.getmImageRsrcCovertImg1());
        viewHolder.mTextView3AuthorName.setText(currentItem.getmTextView3AuthorName());
        viewHolder.mTextView4Date.setText(currentItem.getmTextView4Date());
    }

    @Override
    public int getItemCount() {
        return mCardViewList.size();
    }

    public interface OnCardviewListerner{//creation de l'interface surveilant un clik
        void onCardviewClik(int position);
    }

}
