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

public val CssGgIcons.LogIn: ImageVector
    get() {
        if (_logIn != null) {
            return _logIn!!
        }
        _logIn = Builder(name = "LogIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.486f, 20.0f)
                horizontalLineTo(19.486f)
                curveTo(20.59f, 20.0f, 21.486f, 19.105f, 21.486f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.486f, 4.895f, 20.59f, 4.0f, 19.486f, 4.0f)
                horizontalLineTo(15.486f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.486f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.486f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.158f, 17.385f)
                lineTo(8.738f, 15.977f)
                lineTo(12.657f, 12.024f)
                lineTo(3.514f, 12.024f)
                curveTo(2.962f, 12.024f, 2.514f, 11.576f, 2.514f, 11.024f)
                curveTo(2.514f, 10.472f, 2.962f, 10.024f, 3.514f, 10.024f)
                lineTo(12.677f, 10.024f)
                lineTo(8.696f, 6.077f)
                lineTo(10.104f, 4.657f)
                lineTo(16.495f, 10.994f)
                lineTo(10.158f, 17.385f)
                close()
            }
        }
        .build()
        return _logIn!!
    }

private var _logIn: ImageVector? = null
