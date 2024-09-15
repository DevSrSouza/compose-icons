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
                moveTo(1.329f, 19.0f)
                lineTo(0.731f, 17.964f)
                lineTo(5.061f, 15.464f)
                lineTo(7.103f, 19.0f)
                horizontalLineTo(1.329f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.186f, 19.0f)
                horizontalLineTo(9.412f)
                lineTo(5.793f, 12.732f)
                lineTo(10.124f, 10.232f)
                lineTo(15.186f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.269f, 19.0f)
                horizontalLineTo(17.495f)
                lineTo(10.856f, 7.5f)
                lineTo(15.186f, 5.0f)
                lineTo(23.269f, 19.0f)
                close()
            }
        }
        .build()
        return _adidas!!
    }

private var _adidas: ImageVector? = null
