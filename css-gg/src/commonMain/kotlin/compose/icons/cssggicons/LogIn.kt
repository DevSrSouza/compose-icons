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
                moveTo(15.4857f, 20.0f)
                horizontalLineTo(19.4857f)
                curveTo(20.5903f, 20.0f, 21.4857f, 19.1046f, 21.4857f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.4857f, 4.8954f, 20.5903f, 4.0f, 19.4857f, 4.0f)
                horizontalLineTo(15.4857f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.4857f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.4857f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1582f, 17.385f)
                lineTo(8.738f, 15.9768f)
                lineTo(12.6572f, 12.0242f)
                lineTo(3.5143f, 12.0242f)
                curveTo(2.962f, 12.0242f, 2.5143f, 11.5765f, 2.5143f, 11.0242f)
                curveTo(2.5143f, 10.4719f, 2.962f, 10.0242f, 3.5143f, 10.0242f)
                lineTo(12.6765f, 10.0242f)
                lineTo(8.696f, 6.0774f)
                lineTo(10.1042f, 4.6572f)
                lineTo(16.4951f, 10.9941f)
                lineTo(10.1582f, 17.385f)
                close()
            }
        }
        .build()
        return _logIn!!
    }

private var _logIn: ImageVector? = null
