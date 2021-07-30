package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(17.1717f)
                lineTo(12.7072f, 15.5354f)
                curveTo(12.3166f, 15.1449f, 11.6835f, 15.1449f, 11.2929f, 15.5354f)
                lineTo(6.8284f, 20.0f)
                lineTo(5.0f, 20.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.3432f, 6.3432f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(17.6569f, 4.0f, 19.0f, 5.3431f, 19.0f, 7.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(17.0f, 7.0f)
                curveTo(17.0f, 6.4477f, 16.5523f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 6.0f, 7.0f, 6.4477f, 7.0f, 7.0f)
                verticalLineTo(17.0f)
                lineTo(9.8787f, 14.1212f)
                curveTo(11.0503f, 12.9497f, 12.9498f, 12.9497f, 14.1214f, 14.1212f)
                lineTo(17.0f, 16.9999f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
