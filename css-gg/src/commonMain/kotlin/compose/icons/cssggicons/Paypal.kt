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

public val CssGgIcons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.47f, 3.544f)
                horizontalLineTo(14.47f)
                curveTo(16.109f, 3.544f, 17.415f, 4.319f, 18.096f, 5.515f)
                curveTo(19.316f, 6.387f, 19.943f, 7.915f, 19.608f, 9.653f)
                curveTo(19.087f, 12.365f, 16.425f, 14.563f, 13.664f, 14.563f)
                horizontalLineTo(11.664f)
                lineTo(10.53f, 20.455f)
                horizontalLineTo(6.398f)
                lineTo(6.629f, 19.256f)
                horizontalLineTo(3.447f)
                lineTo(6.47f, 3.544f)
                close()
                moveTo(8.092f, 5.508f)
                horizontalLineTo(14.092f)
                curveTo(15.749f, 5.508f, 16.838f, 6.827f, 16.525f, 8.454f)
                curveTo(16.212f, 10.081f, 14.616f, 11.4f, 12.959f, 11.4f)
                horizontalLineTo(8.959f)
                lineTo(7.825f, 17.292f)
                horizontalLineTo(5.825f)
                lineTo(8.092f, 5.508f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
