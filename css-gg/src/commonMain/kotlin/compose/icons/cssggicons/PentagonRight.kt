package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PentagonRight: ImageVector
    get() {
        if (_pentagonRight != null) {
            return _pentagonRight!!
        }
        _pentagonRight = Builder(name = "PentagonRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 12.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineTo(16.0f)
                lineTo(18.0f, 12.0f)
                lineTo(16.0f, 17.0f)
                horizontalLineTo(6.0f)
                lineTo(8.0f, 12.0f)
                close()
                moveTo(8.9541f, 15.0f)
                lineTo(10.1541f, 12.0f)
                lineTo(8.9541f, 9.0f)
                horizontalLineTo(14.6459f)
                lineTo(15.8459f, 12.0f)
                lineTo(14.6459f, 15.0f)
                horizontalLineTo(8.9541f)
                close()
            }
        }
        .build()
        return _pentagonRight!!
    }

private var _pentagonRight: ImageVector? = null
