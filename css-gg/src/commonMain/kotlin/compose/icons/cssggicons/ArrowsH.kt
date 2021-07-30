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

public val CssGgIcons.ArrowsH: ImageVector
    get() {
        if (_arrowsH != null) {
            return _arrowsH!!
        }
        _arrowsH = Builder(name = "ArrowsH", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.657f, 9.1716f)
                lineTo(4.2428f, 7.7573f)
                lineTo(1.0E-4f, 12.0f)
                lineTo(4.2428f, 16.2426f)
                lineTo(5.657f, 14.8284f)
                lineTo(3.8286f, 13.0f)
                horizontalLineTo(10.0001f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.8285f)
                lineTo(5.657f, 9.1716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0001f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.1716f)
                lineTo(18.3432f, 14.8284f)
                lineTo(19.7574f, 16.2426f)
                lineTo(24.0001f, 12.0f)
                lineTo(19.7574f, 7.7573f)
                lineTo(18.3432f, 9.1716f)
                lineTo(20.1717f, 11.0f)
                horizontalLineTo(14.0001f)
                close()
            }
        }
        .build()
        return _arrowsH!!
    }

private var _arrowsH: ImageVector? = null
