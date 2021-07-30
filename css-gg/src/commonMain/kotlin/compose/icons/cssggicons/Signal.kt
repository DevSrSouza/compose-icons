package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Signal: ImageVector
    get() {
        if (_signal != null) {
            return _signal!!
        }
        _signal = Builder(name = "Signal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                curveTo(15.0f, 6.4477f, 15.4477f, 6.0f, 16.0f, 6.0f)
                curveTo(16.5523f, 6.0f, 17.0f, 6.4477f, 17.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 17.5523f, 16.5523f, 18.0f, 16.0f, 18.0f)
                curveTo(15.4477f, 18.0f, 15.0f, 17.5523f, 15.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                curveTo(7.0f, 14.4477f, 7.4477f, 14.0f, 8.0f, 14.0f)
                curveTo(8.5523f, 14.0f, 9.0f, 14.4477f, 9.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 17.5523f, 8.5523f, 18.0f, 8.0f, 18.0f)
                curveTo(7.4477f, 18.0f, 7.0f, 17.5523f, 7.0f, 17.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 10.4477f, 11.0f, 11.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.5523f, 11.4477f, 18.0f, 12.0f, 18.0f)
                curveTo(12.5523f, 18.0f, 13.0f, 17.5523f, 13.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 10.4477f, 12.5523f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _signal!!
    }

private var _signal: ImageVector? = null
