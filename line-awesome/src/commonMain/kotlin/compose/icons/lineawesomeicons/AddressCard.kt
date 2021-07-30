package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.AddressCard: ImageVector
    get() {
        if (_addressCard != null) {
            return _addressCard!!
        }
        _addressCard = Builder(name = "AddressCard", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 24.0f)
                lineTo(23.5938f, 24.0f)
                curveTo(23.5156f, 23.8633f, 23.5508f, 23.6758f, 23.4375f, 23.5625f)
                curveTo(23.0586f, 23.1836f, 22.5234f, 23.0f, 22.0f, 23.0f)
                curveTo(21.4766f, 23.0f, 20.9414f, 23.1836f, 20.5625f, 23.5625f)
                curveTo(20.4492f, 23.6758f, 20.4844f, 23.8633f, 20.4063f, 24.0f)
                lineTo(11.5938f, 24.0f)
                curveTo(11.5156f, 23.8633f, 11.5508f, 23.6758f, 11.4375f, 23.5625f)
                curveTo(11.0586f, 23.1836f, 10.5234f, 23.0f, 10.0f, 23.0f)
                curveTo(9.4766f, 23.0f, 8.9414f, 23.1836f, 8.5625f, 23.5625f)
                curveTo(8.4492f, 23.6758f, 8.4844f, 23.8633f, 8.4063f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(9.8008f, 10.0f, 8.0f, 11.8008f, 8.0f, 14.0f)
                curveTo(8.0f, 15.1133f, 8.4766f, 16.1172f, 9.2188f, 16.8438f)
                curveTo(7.8867f, 17.7461f, 7.0f, 19.2852f, 7.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                curveTo(9.0f, 19.3438f, 10.3438f, 18.0f, 12.0f, 18.0f)
                curveTo(13.6563f, 18.0f, 15.0f, 19.3438f, 15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                curveTo(17.0f, 19.2852f, 16.1133f, 17.7461f, 14.7813f, 16.8438f)
                curveTo(15.5234f, 16.1172f, 16.0f, 15.1133f, 16.0f, 14.0f)
                curveTo(16.0f, 11.8008f, 14.1992f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.1172f, 12.0f, 14.0f, 12.8828f, 14.0f, 14.0f)
                curveTo(14.0f, 15.1172f, 13.1172f, 16.0f, 12.0f, 16.0f)
                curveTo(10.8828f, 16.0f, 10.0f, 15.1172f, 10.0f, 14.0f)
                curveTo(10.0f, 12.8828f, 10.8828f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(19.0f, 13.0f)
                lineTo(19.0f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 13.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(19.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 17.0f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null
