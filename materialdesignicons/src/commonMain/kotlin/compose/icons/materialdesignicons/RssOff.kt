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

public val MaterialDesignIcons.RssOff: ImageVector
    get() {
        if (_rssOff != null) {
            return _rssOff!!
        }
        _rssOff = Builder(name = "RssOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 3.77f)
                lineTo(3.78f, 2.5f)
                lineTo(21.5f, 20.22f)
                lineTo(20.23f, 21.5f)
                lineTo(18.73f, 20.0f)
                horizontalLineTo(16.73f)
                curveTo(16.73f, 19.25f, 16.67f, 18.5f, 16.54f, 17.81f)
                lineTo(6.19f, 7.46f)
                curveTo(5.5f, 7.33f, 4.75f, 7.27f, 4.0f, 7.27f)
                verticalLineTo(5.27f)
                lineTo(2.5f, 3.77f)
                moveTo(6.18f, 15.64f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 8.36f, 17.82f)
                curveTo(8.36f, 19.0f, 7.38f, 20.0f, 6.18f, 20.0f)
                curveTo(5.0f, 20.0f, 4.0f, 19.0f, 4.0f, 17.82f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 6.18f, 15.64f)
                moveTo(4.0f, 10.1f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 13.9f, 20.0f)
                horizontalLineTo(11.07f)
                arcTo(7.07f, 7.07f, 0.0f, false, false, 4.0f, 12.93f)
                verticalLineTo(10.1f)
                moveTo(9.13f, 5.31f)
                curveTo(13.59f, 6.87f, 17.13f, 10.41f, 18.69f, 14.87f)
                lineTo(9.13f, 5.31f)
                close()
            }
        }
        .build()
        return _rssOff!!
    }

private var _rssOff: ImageVector? = null
