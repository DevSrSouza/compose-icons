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

public val LineAwesomeIcons.StripeS: ImageVector
    get() {
        if (_stripeS != null) {
            return _stripeS!!
        }
        _stripeS = Builder(name = "StripeS", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5156f, 4.0f)
                curveTo(10.7356f, 4.0f, 7.0f, 7.1136f, 7.0f, 11.9336f)
                curveTo(7.0f, 16.7066f, 11.289f, 18.1293f, 14.127f, 19.0703f)
                curveTo(15.403f, 19.4933f, 16.989f, 20.0181f, 17.0f, 20.5371f)
                curveTo(16.992f, 20.9381f, 16.0426f, 21.0f, 15.4766f, 21.0f)
                curveTo(13.5906f, 21.0f, 10.6984f, 20.2205f, 8.4434f, 19.1035f)
                lineTo(7.0f, 18.3887f)
                lineTo(7.0f, 26.1855f)
                lineTo(7.6113f, 26.4414f)
                curveTo(9.9583f, 27.4274f, 12.7073f, 27.995f, 15.1543f, 28.0f)
                curveTo(21.3193f, 28.0f, 25.0f, 25.1584f, 25.0f, 20.4004f)
                curveTo(25.0f, 15.2084f, 20.5918f, 13.7973f, 17.6758f, 12.8633f)
                curveTo(16.6098f, 12.5213f, 15.0f, 12.0052f, 15.0f, 11.5742f)
                curveTo(15.0f, 11.3452f, 15.0005f, 11.0f, 16.2305f, 11.0f)
                curveTo(18.0795f, 11.0f, 20.6523f, 11.7654f, 22.4883f, 12.8594f)
                lineTo(24.0f, 13.7617f)
                lineTo(24.0f, 5.5469f)
                lineTo(23.3633f, 5.2988f)
                curveTo(21.2073f, 4.4608f, 18.7766f, 4.0f, 16.5156f, 4.0f)
                close()
                moveTo(16.5156f, 6.0f)
                curveTo(18.3146f, 6.0f, 20.237f, 6.3277f, 22.0f, 6.9297f)
                lineTo(22.0f, 10.3613f)
                curveTo(20.114f, 9.5223f, 17.9535f, 9.0f, 16.2305f, 9.0f)
                curveTo(13.3155f, 9.0f, 13.0f, 10.8002f, 13.0f, 11.5742f)
                curveTo(13.0f, 13.4652f, 14.9754f, 14.0986f, 17.0664f, 14.7676f)
                curveTo(20.5414f, 15.8806f, 23.0f, 16.9344f, 23.0f, 20.4004f)
                curveTo(23.0f, 25.4534f, 17.5133f, 26.0f, 15.1563f, 26.0f)
                curveTo(13.1753f, 25.996f, 10.967f, 25.5768f, 9.0f, 24.8418f)
                lineTo(9.0f, 21.5371f)
                curveTo(10.993f, 22.3341f, 13.4656f, 23.0f, 15.4766f, 23.0f)
                curveTo(18.5306f, 23.0f, 18.997f, 21.466f, 19.0f, 20.543f)
                lineTo(19.0f, 20.5371f)
                lineTo(19.0f, 20.5313f)
                curveTo(18.992f, 18.5753f, 16.9349f, 17.8939f, 14.7559f, 17.1719f)
                curveTo(11.3859f, 16.0539f, 9.0f, 15.0246f, 9.0f, 11.9336f)
                curveTo(9.0f, 8.2726f, 11.8796f, 6.0f, 16.5156f, 6.0f)
                close()
            }
        }
        .build()
        return _stripeS!!
    }

private var _stripeS: ImageVector? = null
