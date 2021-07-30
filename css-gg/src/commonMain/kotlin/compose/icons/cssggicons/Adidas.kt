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

public val CssGgIcons.Adidas: ImageVector
    get() {
        if (_adidas != null) {
            return _adidas!!
        }
        _adidas = Builder(name = "Adidas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3294f, 19.0f)
                lineTo(0.7313f, 17.9641f)
                lineTo(5.0615f, 15.4641f)
                lineTo(7.1029f, 19.0f)
                horizontalLineTo(1.3294f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1858f, 19.0f)
                horizontalLineTo(9.4123f)
                lineTo(5.7935f, 12.7321f)
                lineTo(10.1236f, 10.2321f)
                lineTo(15.1858f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2687f, 19.0f)
                horizontalLineTo(17.4952f)
                lineTo(10.8557f, 7.5f)
                lineTo(15.1858f, 5.0f)
                lineTo(23.2687f, 19.0f)
                close()
            }
        }
        .build()
        return _adidas!!
    }

private var _adidas: ImageVector? = null
