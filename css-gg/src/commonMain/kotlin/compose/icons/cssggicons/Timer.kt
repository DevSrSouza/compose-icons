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

public val CssGgIcons.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.071f)
                curveTo(16.392f, 5.556f, 19.0f, 8.474f, 19.0f, 12.0f)
                curveTo(19.0f, 15.866f, 15.866f, 19.0f, 12.0f, 19.0f)
                curveTo(8.134f, 19.0f, 5.0f, 15.866f, 5.0f, 12.0f)
                curveTo(5.0f, 9.962f, 5.871f, 8.127f, 7.262f, 6.847f)
                lineTo(5.847f, 5.432f)
                curveTo(4.095f, 7.074f, 3.0f, 9.409f, 3.0f, 12.0f)
                curveTo(3.0f, 16.971f, 7.029f, 21.0f, 12.0f, 21.0f)
                curveTo(16.971f, 21.0f, 21.0f, 16.971f, 21.0f, 12.0f)
                curveTo(21.0f, 7.029f, 16.971f, 3.0f, 12.0f, 3.0f)
                curveTo(11.662f, 3.0f, 11.328f, 3.019f, 11.0f, 3.055f)
                verticalLineTo(9.086f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.707f, 8.707f)
                curveTo(7.317f, 9.098f, 7.317f, 9.731f, 7.707f, 10.121f)
                lineTo(10.535f, 12.95f)
                curveTo(10.926f, 13.34f, 11.559f, 13.34f, 11.95f, 12.95f)
                curveTo(12.34f, 12.559f, 12.34f, 11.926f, 11.95f, 11.535f)
                lineTo(9.121f, 8.707f)
                curveTo(8.731f, 8.317f, 8.098f, 8.317f, 7.707f, 8.707f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
