package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.RssBox: ImageVector
    get() {
        if (_rssBox != null) {
            return _rssBox!!
        }
        _rssBox = Builder(name = "RssBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                moveTo(7.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 15.0f)
                moveTo(6.0f, 10.0f)
                verticalLineTo(12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 18.0f)
                horizontalLineTo(14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 6.0f, 10.0f)
                moveTo(6.0f, 6.0f)
                verticalLineTo(8.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 16.0f, 18.0f)
                horizontalLineTo(18.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _rssBox!!
    }

private var _rssBox: ImageVector? = null
