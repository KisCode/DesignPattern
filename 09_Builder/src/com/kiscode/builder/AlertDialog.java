package com.kiscode.builder;


public class AlertDialog {
    private static final String TAG = "AlertDialog";
    private String title;
    private String message;
    private String negativeButtonText;
    private String positiveButtonText;
    private OnClickListener negativeButtonClickListener;
    private OnClickListener positiveButtonClickListener;


    private AlertDialog(Builder builder) {
        this.title = builder.title;
        this.message = builder.message;
        this.negativeButtonText = builder.negativeButtonText;
        this.positiveButtonText = builder.positiveButtonText;
        this.negativeButtonClickListener = builder.negativeButtonClickListener;
        this.positiveButtonClickListener = builder.positiveButtonClickListener;
    }

    public void dismiss() {
        System.out.println(TAG + " dismiss:\n" + toString());
    }

    public void show() {
        System.out.println(TAG + " show:\n" + toString());
    }

    @Override
    public String toString() {
        return "AlertDialog{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", negativeButtonText='" + negativeButtonText + '\'' +
                ", positiveButtonText='" + positiveButtonText + '\'' +
                ", negativeButtonClickListener=" + negativeButtonClickListener +
                ", positiveButtonClickListener=" + positiveButtonClickListener +
                '}';
    }

    public static class Builder {
        private String title;
        private String message;
        private String negativeButtonText;
        private String positiveButtonText;
        private OnClickListener negativeButtonClickListener;
        private OnClickListener positiveButtonClickListener;

        public AlertDialog create() {
            if (title == null || title.isEmpty()) {
                title = "标题";
            }

            if (message == null || message.isEmpty()) {
                title = "内容";
            }

            if (negativeButtonText == null || negativeButtonText.isEmpty()) {
                negativeButtonText = "取消";
            }


            if (positiveButtonText == null || positiveButtonText.isEmpty()) {
                positiveButtonText = "确定";
            }

            return new AlertDialog(this);
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setNegtiveButton(String negtiveButtonText, OnClickListener negtiveButtonClickListener) {
            this.negativeButtonText = negtiveButtonText;
            this.negativeButtonClickListener = negtiveButtonClickListener;
            return this;
        }

        public Builder setPostiveButton(String postiveButtonText, OnClickListener postiveButtonClickListener) {
            this.positiveButtonText = postiveButtonText;
            this.positiveButtonClickListener = postiveButtonClickListener;
            return this;
        }

    }


    public interface OnClickListener {
        void onClick();
    }
}
