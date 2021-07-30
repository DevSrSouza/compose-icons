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

public val CssGgIcons.ToggleSquareOff: ImageVector
    get() {
        if (_toggleSquareOff != null) {
            return _toggleSquareOff!!
        }
        _toggleSquareOff = Builder(name = "ToggleSquareOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                curveTo(14.4477f, 9.0f, 14.0f, 9.4477f, 14.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.5523f, 14.4477f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 15.0f, 20.0f, 14.5523f, 20.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 9.4477f, 19.5523f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                curveTo(0.0f, 5.8954f, 0.8954f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1046f, 5.0f, 24.0f, 5.8954f, 24.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(24.0f, 18.1046f, 23.1046f, 19.0f, 22.0f, 19.0f)
                horizontalLineTo(2.0f)
                curveTo(0.8954f, 19.0f, 0.0f, 18.1046f, 0.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(2.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 7.0f)
                close()
            }
        }
        .build()
        return _toggleSquareOff!!
    }

private var _toggleSquareOff: ImageVector? = null
