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

public val CssGgIcons.ArrowsExpandLeftAlt: ImageVector
    get() {
        if (_arrowsExpandLeftAlt != null) {
            return _arrowsExpandLeftAlt!!
        }
        _arrowsExpandLeftAlt = Builder(name = "ArrowsExpandLeftAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1005f, 2.1005f)
                verticalLineTo(4.1005f)
                horizontalLineTo(5.5147f)
                lineTo(11.293f, 9.8788f)
                lineTo(9.8787f, 11.293f)
                lineTo(4.1005f, 5.5147f)
                lineTo(4.1005f, 10.1005f)
                horizontalLineTo(2.1005f)
                lineTo(2.1005f, 2.1005f)
                horizontalLineTo(10.1005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8995f, 13.8995f)
                horizontalLineTo(19.8995f)
                verticalLineTo(18.4853f)
                lineTo(14.1212f, 12.707f)
                lineTo(12.707f, 14.1213f)
                lineTo(18.4853f, 19.8995f)
                horizontalLineTo(13.8995f)
                verticalLineTo(21.8995f)
                horizontalLineTo(21.8995f)
                verticalLineTo(13.8995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2426f, 9.1716f)
                lineTo(14.8284f, 7.7574f)
                lineTo(7.7573f, 14.8285f)
                lineTo(9.1715f, 16.2427f)
                lineTo(16.2426f, 9.1716f)
                close()
            }
        }
        .build()
        return _arrowsExpandLeftAlt!!
    }

private var _arrowsExpandLeftAlt: ImageVector? = null
