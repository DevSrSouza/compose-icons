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

public val CssGgIcons.SandClock: ImageVector
    get() {
        if (_sandClock != null) {
            return _sandClock!!
        }
        _sandClock = Builder(name = "SandClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 7.5523f, 11.4477f, 8.0f, 12.0f, 8.0f)
                curveTo(12.5523f, 8.0f, 13.0f, 7.5523f, 13.0f, 7.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                curveTo(9.2386f, 12.0f, 7.0f, 14.2386f, 7.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 14.2386f, 14.7614f, 12.0f, 12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 8.6568f, 13.6569f, 10.0f, 12.0f, 10.0f)
                curveTo(10.3431f, 10.0f, 9.0f, 8.6568f, 9.0f, 7.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 15.3431f, 13.6569f, 14.0f, 12.0f, 14.0f)
                curveTo(10.3431f, 14.0f, 9.0f, 15.3431f, 9.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sandClock!!
    }

private var _sandClock: ImageVector? = null
