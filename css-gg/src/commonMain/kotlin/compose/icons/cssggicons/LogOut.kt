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

public val CssGgIcons.LogOut: ImageVector
    get() {
        if (_logOut != null) {
            return _logOut!!
        }
        _logOut = Builder(name = "LogOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.514f, 20.0f)
                horizontalLineTo(4.514f)
                curveTo(3.41f, 20.0f, 2.514f, 19.105f, 2.514f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.514f, 4.895f, 3.41f, 4.0f, 4.514f, 4.0f)
                horizontalLineTo(8.514f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.514f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.514f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.842f, 17.385f)
                lineTo(15.262f, 15.977f)
                lineTo(11.343f, 12.024f)
                lineTo(20.486f, 12.024f)
                curveTo(21.038f, 12.024f, 21.486f, 11.576f, 21.486f, 11.024f)
                curveTo(21.486f, 10.472f, 21.038f, 10.024f, 20.486f, 10.024f)
                lineTo(11.324f, 10.024f)
                lineTo(15.304f, 6.077f)
                lineTo(13.896f, 4.657f)
                lineTo(7.505f, 10.994f)
                lineTo(13.842f, 17.385f)
                close()
            }
        }
        .build()
        return _logOut!!
    }

private var _logOut: ImageVector? = null
