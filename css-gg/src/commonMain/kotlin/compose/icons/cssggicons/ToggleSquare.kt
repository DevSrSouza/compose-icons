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

public val CssGgIcons.ToggleSquare: ImageVector
    get() {
        if (_toggleSquare != null) {
            return _toggleSquare!!
        }
        _toggleSquare = Builder(name = "ToggleSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                curveTo(9.552f, 9.0f, 10.0f, 9.448f, 10.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(10.0f, 14.552f, 9.552f, 15.0f, 9.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 15.0f, 4.0f, 14.552f, 4.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 9.448f, 4.448f, 9.0f, 5.0f, 9.0f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 7.0f)
                curveTo(24.0f, 5.895f, 23.105f, 5.0f, 22.0f, 5.0f)
                horizontalLineTo(2.0f)
                curveTo(0.895f, 5.0f, 0.0f, 5.895f, 0.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(0.0f, 18.105f, 0.895f, 19.0f, 2.0f, 19.0f)
                horizontalLineTo(22.0f)
                curveTo(23.105f, 19.0f, 24.0f, 18.105f, 24.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(22.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _toggleSquare!!
    }

private var _toggleSquare: ImageVector? = null
