package name.mikanoshi.customiuizer.prefs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ListViewEx extends ListView {

	public ListViewEx(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.setDivider(null);
		this.setDividerHeight(0);
	}

	public ListViewEx(Context context) {
		super(context);
	}

	public ListViewEx(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}