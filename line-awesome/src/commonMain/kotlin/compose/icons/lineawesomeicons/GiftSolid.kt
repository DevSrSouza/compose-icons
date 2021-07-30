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

public val LineAwesomeIcons.GiftSolid: ImageVector
    get() {
        if (_giftSolid != null) {
            return _giftSolid!!
        }
        _giftSolid = Builder(name = "GiftSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(10.3555f, 5.0f, 9.0f, 6.3555f, 9.0f, 8.0f)
                curveTo(9.0f, 8.3516f, 9.0742f, 8.6836f, 9.1875f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(27.0f, 15.0f)
                lineTo(28.0f, 15.0f)
                lineTo(28.0f, 9.0f)
                lineTo(22.8125f, 9.0f)
                curveTo(22.9258f, 8.6836f, 23.0f, 8.3516f, 23.0f, 8.0f)
                curveTo(23.0f, 6.3555f, 21.6445f, 5.0f, 20.0f, 5.0f)
                curveTo(18.25f, 5.0f, 17.0625f, 6.3281f, 16.2813f, 7.4375f)
                curveTo(16.1758f, 7.5859f, 16.0938f, 7.7305f, 16.0f, 7.875f)
                curveTo(15.9063f, 7.7305f, 15.8242f, 7.5859f, 15.7188f, 7.4375f)
                curveTo(14.9375f, 6.3281f, 13.75f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.625f, 7.0f, 13.4375f, 7.6719f, 14.0625f, 8.5625f)
                curveTo(14.2148f, 8.7813f, 14.1914f, 8.793f, 14.3125f, 9.0f)
                lineTo(12.0f, 9.0f)
                curveTo(11.4336f, 9.0f, 11.0f, 8.5664f, 11.0f, 8.0f)
                curveTo(11.0f, 7.4336f, 11.4336f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(20.0f, 7.0f)
                curveTo(20.5664f, 7.0f, 21.0f, 7.4336f, 21.0f, 8.0f)
                curveTo(21.0f, 8.5664f, 20.5664f, 9.0f, 20.0f, 9.0f)
                lineTo(17.6875f, 9.0f)
                curveTo(17.8086f, 8.793f, 17.7852f, 8.7813f, 17.9375f, 8.5625f)
                curveTo(18.5625f, 7.6719f, 19.375f, 7.0f, 20.0f, 7.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(26.0f, 11.0f)
                lineTo(26.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                close()
            }
        }
        .build()
        return _giftSolid!!
    }

private var _giftSolid: ImageVector? = null
