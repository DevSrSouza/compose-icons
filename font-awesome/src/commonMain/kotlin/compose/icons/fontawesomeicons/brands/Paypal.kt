package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.4f, 295.9f)
                curveToRelative(-3.5f, 19.2f, -17.4f, 108.7f, -21.5f, 134.0f)
                curveToRelative(-0.3f, 1.8f, -1.0f, 2.5f, -3.0f, 2.5f)
                horizontalLineTo(12.3f)
                curveToRelative(-7.6f, 0.0f, -13.1f, -6.6f, -12.1f, -13.9f)
                lineTo(58.8f, 46.6f)
                curveToRelative(1.5f, -9.6f, 10.1f, -16.9f, 20.0f, -16.9f)
                curveToRelative(152.3f, 0.0f, 165.1f, -3.7f, 204.0f, 11.4f)
                curveToRelative(60.1f, 23.3f, 65.6f, 79.5f, 44.0f, 140.3f)
                curveToRelative(-21.5f, 62.6f, -72.5f, 89.5f, -140.1f, 90.3f)
                curveToRelative(-43.4f, 0.7f, -69.5f, -7.0f, -75.3f, 24.2f)
                close()
                moveTo(357.1f, 152.0f)
                curveToRelative(-1.8f, -1.3f, -2.5f, -1.8f, -3.0f, 1.3f)
                curveToRelative(-2.0f, 11.4f, -5.1f, 22.5f, -8.8f, 33.6f)
                curveToRelative(-39.9f, 113.8f, -150.5f, 103.9f, -204.5f, 103.9f)
                curveToRelative(-6.1f, 0.0f, -10.1f, 3.3f, -10.9f, 9.4f)
                curveToRelative(-22.6f, 140.4f, -27.1f, 169.7f, -27.1f, 169.7f)
                curveToRelative(-1.0f, 7.1f, 3.5f, 12.9f, 10.6f, 12.9f)
                horizontalLineToRelative(63.5f)
                curveToRelative(8.6f, 0.0f, 15.7f, -6.3f, 17.4f, -14.9f)
                curveToRelative(0.7f, -5.4f, -1.1f, 6.1f, 14.4f, -91.3f)
                curveToRelative(4.6f, -22.0f, 14.3f, -19.7f, 29.3f, -19.7f)
                curveToRelative(71.0f, 0.0f, 126.4f, -28.8f, 142.9f, -112.3f)
                curveToRelative(6.5f, -34.8f, 4.6f, -71.4f, -23.8f, -92.6f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
