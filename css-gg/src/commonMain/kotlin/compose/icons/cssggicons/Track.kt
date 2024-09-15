package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Track: ImageVector
    get() {
        if (_track != null) {
            return _track!!
        }
        _track = Builder(name = "Track", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(12.552f, 3.0f, 13.0f, 3.448f, 13.0f, 4.0f)
                verticalLineTo(5.071f)
                curveTo(16.066f, 5.509f, 18.491f, 7.934f, 18.929f, 11.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 11.0f, 21.0f, 11.448f, 21.0f, 12.0f)
                curveTo(21.0f, 12.552f, 20.552f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(18.929f)
                curveTo(18.491f, 16.066f, 16.066f, 18.491f, 13.0f, 18.929f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.552f, 12.552f, 21.0f, 12.0f, 21.0f)
                curveTo(11.448f, 21.0f, 11.0f, 20.552f, 11.0f, 20.0f)
                verticalLineTo(18.929f)
                curveTo(7.934f, 18.491f, 5.509f, 16.066f, 5.071f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 13.0f, 3.0f, 12.552f, 3.0f, 12.0f)
                curveTo(3.0f, 11.448f, 3.448f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(5.071f)
                curveTo(5.509f, 7.934f, 7.934f, 5.509f, 11.0f, 5.071f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.448f, 11.448f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveTo(7.0f, 9.239f, 9.239f, 7.0f, 12.0f, 7.0f)
                curveTo(14.761f, 7.0f, 17.0f, 9.239f, 17.0f, 12.0f)
                curveTo(17.0f, 14.761f, 14.761f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _track!!
    }

private var _track: ImageVector? = null
