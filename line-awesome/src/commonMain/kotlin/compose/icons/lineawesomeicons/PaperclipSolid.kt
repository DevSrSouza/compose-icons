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

public val LineAwesomeIcons.PaperclipSolid: ImageVector
    get() {
        if (_paperclipSolid != null) {
            return _paperclipSolid!!
        }
        _paperclipSolid = Builder(name = "PaperclipSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(19.6094f, 4.0f, 18.2422f, 4.5391f, 17.1875f, 5.5938f)
                lineTo(7.8125f, 14.9688f)
                curveTo(4.8398f, 17.9414f, 4.8398f, 22.7773f, 7.8125f, 25.75f)
                curveTo(10.7852f, 28.7227f, 15.6211f, 28.7227f, 18.5938f, 25.75f)
                lineTo(24.8438f, 19.5f)
                lineTo(23.4375f, 18.0938f)
                lineTo(17.1875f, 24.3438f)
                curveTo(14.9805f, 26.5508f, 11.4258f, 26.5508f, 9.2188f, 24.3438f)
                curveTo(7.0117f, 22.1367f, 7.0117f, 18.582f, 9.2188f, 16.375f)
                lineTo(18.5938f, 7.0f)
                curveTo(19.9375f, 5.6563f, 22.0938f, 5.6563f, 23.4375f, 7.0f)
                curveTo(24.7813f, 8.3438f, 24.7813f, 10.5f, 23.4375f, 11.8438f)
                lineTo(14.0625f, 21.2188f)
                curveTo(13.582f, 21.6992f, 12.8242f, 21.6992f, 12.3438f, 21.2188f)
                curveTo(11.8633f, 20.7383f, 11.8633f, 19.9805f, 12.3438f, 19.5f)
                lineTo(20.9375f, 10.9063f)
                lineTo(19.5313f, 9.5f)
                lineTo(10.9375f, 18.0938f)
                curveTo(9.6914f, 19.3398f, 9.6914f, 21.3789f, 10.9375f, 22.625f)
                curveTo(12.1836f, 23.8711f, 14.2227f, 23.8711f, 15.4688f, 22.625f)
                lineTo(24.8438f, 13.25f)
                curveTo(26.9531f, 11.1406f, 26.9531f, 7.7031f, 24.8438f, 5.5938f)
                curveTo(23.7891f, 4.5391f, 22.3906f, 4.0f, 21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _paperclipSolid!!
    }

private var _paperclipSolid: ImageVector? = null
