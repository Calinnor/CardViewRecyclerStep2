package ocr.exercice.cardviewandrecyclerstep2;

class CardViewItem {

    private int mImageRsrcCovertImg1;
    private String mTextView1NewspaperName;
    private String mTextView2ContentNews;
    private String mTextView3AuthorName;
    private String mTextView4Date;


    CardViewItem(int imageRsrcCovertImg1, String textView1NewspaperName, String textView2ContentNews, String textView3AuthorName, String textView4Date) {
        this.mImageRsrcCovertImg1 = imageRsrcCovertImg1;
        this.mTextView1NewspaperName = textView1NewspaperName;
        this.mTextView2ContentNews = textView2ContentNews;
        this.mTextView3AuthorName = textView3AuthorName;
        this.mTextView4Date = textView4Date;
    }

    String getmTextView1NewspaperName() {
        return mTextView1NewspaperName;
    }

    String getmTextView2ContentNews() {
        return mTextView2ContentNews;
    }

    String getmTextView3AuthorName() {
        return mTextView3AuthorName;
    }

    String getmTextView4Date() {
        return mTextView4Date;
    }

    public int getmImageRsrcCovertImg1() {
        return mImageRsrcCovertImg1;
    }
}
