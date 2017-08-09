package com.example.administrator.superdemo.ui.adapter;

public class AppInfoAdapter /*extends BaseQuickAdapter<AppInfo, BaseViewHolder> */{

    /*String baseImgUrl = "http://file.market.xiaomi.com/mfc/thumbnail/png/w150q80/";

    private Builder mBuilder;

    private DownloadButtonConntroller mDownloadButtonConntroller;

    private AppInfoAdapter(Builder builder) {
        super(builder.layoutId);
        this.mBuilder = builder;
        mDownloadButtonConntroller = new DownloadButtonConntroller(builder.mRxDownload);
        openLoadAnimation();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    protected void convert(BaseViewHolder helper, AppInfo item) {
        ImageLoader.load(baseImgUrl + item.getIcon(), (ImageView) helper.getView(R.id.img_app_icon));
        helper.setText(R.id.txt_app_name, item.getDisplayName());

        helper.addOnClickListener(R.id.btn_download);

        View viewBtn = helper.getView(R.id.btn_download);

        TextView textViewBrief = helper.getView(R.id.txt_brief);
        if (mBuilder.isUpdateStatus) {
            ExpandableTextView viewChangeLog = helper.getView(R.id.view_changelog);
            viewChangeLog.setText(item.getChangeLog());

            if (textViewBrief != null) {
                textViewBrief.setVisibility(View.VISIBLE);
                textViewBrief.setText("v" + item.getVersionName() + "  " + (item.getApkSize() / 1014 / 1024) + "Mb");
            }

            if (viewBtn instanceof DownloadProgressButton) {
                DownloadProgressButton btn = (DownloadProgressButton) viewBtn;
                btn.setText("升级");
            }

        } else {
            TextView txtViewPosition = helper.getView(R.id.txt_position);
            if (txtViewPosition != null) {
                txtViewPosition.setVisibility(mBuilder.isShowPosition ? View.VISIBLE : View.GONE);
                txtViewPosition.setText((item.getPosition() + 1) + " .");
            }

            TextView textViewCategoryName = helper.getView(R.id.txt_category);
            if (textViewCategoryName != null) {
                textViewCategoryName.setVisibility(mBuilder.isShowCategoryName ? View.VISIBLE : View.GONE);
                textViewCategoryName.setText(item.getLevel1CategoryName());
            }

            if (textViewBrief != null) {
                textViewBrief.setVisibility(mBuilder.isShowBrief ? View.VISIBLE : View.GONE);
                textViewBrief.setText(item.getBriefShow());
            }

            TextView textViewSize = helper.getView(R.id.txt_apk_size);
            if (textViewSize != null) {
                textViewSize.setText((item.getApkSize() / 1014 / 1024) + "Mb");
            }

            if (viewBtn instanceof DownloadProgressButton) {
                DownloadProgressButton btn = (DownloadProgressButton) viewBtn;
                mDownloadButtonConntroller.handClick(btn, item);
            }
        }
    }

    public static class Builder {
        private boolean isShowPosition;
        private boolean isShowCategoryName;
        private boolean isShowBrief;
        private boolean isUpdateStatus;
        private RxDownload mRxDownload;
        private int layoutId = R.layout.template_appinfo;

        public Builder showPosition(boolean b) {
            this.isShowPosition = b;
            return this;
        }

        public Builder showCategoryName(boolean b) {
            this.isShowCategoryName = b;
            return this;
        }

        public Builder showBrief(boolean b) {
            this.isShowBrief = b;
            return this;
        }

        public Builder layout(int resId) {
            this.layoutId = resId;
            return this;
        }

        public AppInfoAdapter build() {
            return new AppInfoAdapter(this);
        }

        public Builder rxDownload(RxDownload rxDownload) {
            this.mRxDownload = rxDownload;
            return this;
        }

        public Builder updateStatus(boolean b) {
            this.isUpdateStatus = b;
            return this;
        }
    }*/
}
