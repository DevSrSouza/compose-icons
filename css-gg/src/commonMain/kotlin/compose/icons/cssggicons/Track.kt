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
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
                verticalLineTo(5.0709f)
                curveTo(16.0657f, 5.5094f, 18.4906f, 7.9343f, 18.9291f, 11.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 11.0f, 21.0f, 11.4477f, 21.0f, 12.0f)
                curveTo(21.0f, 12.5523f, 20.5523f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(18.9291f)
                curveTo(18.4906f, 16.0657f, 16.0657f, 18.4906f, 13.0f, 18.9291f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.5523f, 12.5523f, 21.0f, 12.0f, 21.0f)
                curveTo(11.4477f, 21.0f, 11.0f, 20.5523f, 11.0f, 20.0f)
                verticalLineTo(18.9291f)
                curveTo(7.9343f, 18.4906f, 5.5094f, 16.0657f, 5.0709f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
                curveTo(3.0f, 11.4477f, 3.4477f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(5.0709f)
                curveTo(5.5094f, 7.9343f, 7.9343f, 5.5094f, 11.0f, 5.0709f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.4477f, 11.4477f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveTo(7.0f, 9.2386f, 9.2386f, 7.0f, 12.0f, 7.0f)
                curveTo(14.7614f, 7.0f, 17.0f, 9.2386f, 17.0f, 12.0f)
                curveTo(17.0f, 14.7614f, 14.7614f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _track!!
    }

private var _track: ImageVector? = null
