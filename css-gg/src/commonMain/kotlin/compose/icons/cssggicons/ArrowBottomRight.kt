package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowBottomRight: ImageVector
    get() {
        if (_arrowBottomRight != null) {
            return _arrowBottomRight!!
        }
        _arrowBottomRight = Builder(name = "ArrowBottomRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7574f, 7.1715f)
                lineTo(7.1716f, 5.7573f)
                lineTo(16.2426f, 14.8283f)
                lineTo(16.2426f, 10.2427f)
                horizontalLineTo(18.2426f)
                lineTo(18.2426f, 18.2427f)
                horizontalLineTo(10.2426f)
                verticalLineTo(16.2427f)
                lineTo(14.8285f, 16.2427f)
                lineTo(5.7574f, 7.1715f)
                close()
            }
        }
        .build()
        return _arrowBottomRight!!
    }

private var _arrowBottomRight: ImageVector? = null
