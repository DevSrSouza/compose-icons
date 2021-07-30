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

public val LineAwesomeIcons.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(6.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                lineTo(8.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 4.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(13.8008f, 10.0f, 12.0f, 11.8008f, 12.0f, 14.0f)
                curveTo(12.0f, 15.1133f, 12.4766f, 16.1172f, 13.2188f, 16.8438f)
                curveTo(11.8867f, 17.7461f, 11.0f, 19.2852f, 11.0f, 21.0f)
                lineTo(13.0f, 21.0f)
                curveTo(13.0f, 19.3438f, 14.3438f, 18.0f, 16.0f, 18.0f)
                curveTo(17.6563f, 18.0f, 19.0f, 19.3438f, 19.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                curveTo(21.0f, 19.2852f, 20.1133f, 17.7461f, 18.7813f, 16.8438f)
                curveTo(19.5234f, 16.1172f, 20.0f, 15.1133f, 20.0f, 14.0f)
                curveTo(20.0f, 11.8008f, 18.1992f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(6.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                lineTo(5.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(17.1172f, 12.0f, 18.0f, 12.8828f, 18.0f, 14.0f)
                curveTo(18.0f, 15.1172f, 17.1172f, 16.0f, 16.0f, 16.0f)
                curveTo(14.8828f, 16.0f, 14.0f, 15.1172f, 14.0f, 14.0f)
                curveTo(14.0f, 12.8828f, 14.8828f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(6.0f, 17.0f)
                lineTo(6.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 17.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
