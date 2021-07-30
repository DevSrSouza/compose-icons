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
                moveTo(13.0f, 5.0709f)
                curveTo(16.3923f, 5.5561f, 19.0f, 8.4735f, 19.0f, 12.0f)
                curveTo(19.0f, 15.866f, 15.866f, 19.0f, 12.0f, 19.0f)
                curveTo(8.134f, 19.0f, 5.0f, 15.866f, 5.0f, 12.0f)
                curveTo(5.0f, 9.9616f, 5.8713f, 8.1267f, 7.2618f, 6.8474f)
                lineTo(5.8466f, 5.4322f)
                curveTo(4.0946f, 7.0743f, 3.0f, 9.4093f, 3.0f, 12.0f)
                curveTo(3.0f, 16.9706f, 7.0294f, 21.0f, 12.0f, 21.0f)
                curveTo(16.9706f, 21.0f, 21.0f, 16.9706f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                curveTo(11.662f, 3.0f, 11.3283f, 3.0186f, 11.0f, 3.0549f)
                verticalLineTo(9.0855f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0709f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7071f, 8.7071f)
                curveTo(7.3166f, 9.0976f, 7.3166f, 9.7308f, 7.7071f, 10.1213f)
                lineTo(10.5355f, 12.9497f)
                curveTo(10.9261f, 13.3402f, 11.5592f, 13.3402f, 11.9497f, 12.9497f)
                curveTo(12.3403f, 12.5592f, 12.3403f, 11.926f, 11.9497f, 11.5355f)
                lineTo(9.1213f, 8.7071f)
                curveTo(8.7308f, 8.3166f, 8.0976f, 8.3166f, 7.7071f, 8.7071f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
