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
                moveTo(8.5143f, 20.0f)
                horizontalLineTo(4.5143f)
                curveTo(3.4097f, 20.0f, 2.5143f, 19.1046f, 2.5143f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.5143f, 4.8954f, 3.4097f, 4.0f, 4.5143f, 4.0f)
                horizontalLineTo(8.5143f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.5143f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.5143f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8418f, 17.385f)
                lineTo(15.262f, 15.9768f)
                lineTo(11.3428f, 12.0242f)
                lineTo(20.4857f, 12.0242f)
                curveTo(21.038f, 12.0242f, 21.4857f, 11.5765f, 21.4857f, 11.0242f)
                curveTo(21.4857f, 10.4719f, 21.038f, 10.0242f, 20.4857f, 10.0242f)
                lineTo(11.3236f, 10.0242f)
                lineTo(15.304f, 6.0774f)
                lineTo(13.8958f, 4.6572f)
                lineTo(7.5049f, 10.9941f)
                lineTo(13.8418f, 17.385f)
                close()
            }
        }
        .build()
        return _logOut!!
    }

private var _logOut: ImageVector? = null
