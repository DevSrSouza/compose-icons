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

public val CssGgIcons.ArrowsExpandRightAlt: ImageVector
    get() {
        if (_arrowsExpandRightAlt != null) {
            return _arrowsExpandRightAlt!!
        }
        _arrowsExpandRightAlt = Builder(name = "ArrowsExpandRightAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8995f, 2.1005f)
                verticalLineTo(4.1005f)
                horizontalLineTo(18.4852f)
                lineTo(12.707f, 9.8788f)
                lineTo(14.1212f, 11.293f)
                lineTo(19.8995f, 5.5147f)
                verticalLineTo(10.1005f)
                horizontalLineTo(21.8995f)
                verticalLineTo(2.1005f)
                horizontalLineTo(13.8995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5147f, 19.8995f)
                horizontalLineTo(10.1005f)
                verticalLineTo(21.8995f)
                horizontalLineTo(2.1005f)
                verticalLineTo(13.8995f)
                horizontalLineTo(4.1005f)
                verticalLineTo(18.4853f)
                lineTo(9.8787f, 12.707f)
                lineTo(11.2929f, 14.1213f)
                lineTo(5.5147f, 19.8995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1715f, 7.7574f)
                lineTo(7.7573f, 9.1716f)
                lineTo(14.8284f, 16.2427f)
                lineTo(16.2426f, 14.8285f)
                lineTo(9.1715f, 7.7574f)
                close()
            }
        }
        .build()
        return _arrowsExpandRightAlt!!
    }

private var _arrowsExpandRightAlt: ImageVector? = null
