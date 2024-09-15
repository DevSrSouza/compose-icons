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
                moveTo(16.516f, 4.0f)
                curveTo(10.736f, 4.0f, 7.0f, 7.114f, 7.0f, 11.934f)
                curveTo(7.0f, 16.707f, 11.289f, 18.129f, 14.127f, 19.07f)
                curveTo(15.403f, 19.493f, 16.989f, 20.018f, 17.0f, 20.537f)
                curveTo(16.992f, 20.938f, 16.043f, 21.0f, 15.477f, 21.0f)
                curveTo(13.591f, 21.0f, 10.698f, 20.221f, 8.443f, 19.104f)
                lineTo(7.0f, 18.389f)
                lineTo(7.0f, 26.186f)
                lineTo(7.611f, 26.441f)
                curveTo(9.958f, 27.427f, 12.707f, 27.995f, 15.154f, 28.0f)
                curveTo(21.319f, 28.0f, 25.0f, 25.158f, 25.0f, 20.4f)
                curveTo(25.0f, 15.208f, 20.592f, 13.797f, 17.676f, 12.863f)
                curveTo(16.61f, 12.521f, 15.0f, 12.005f, 15.0f, 11.574f)
                curveTo(15.0f, 11.345f, 15.0f, 11.0f, 16.23f, 11.0f)
                curveTo(18.079f, 11.0f, 20.652f, 11.765f, 22.488f, 12.859f)
                lineTo(24.0f, 13.762f)
                lineTo(24.0f, 5.547f)
                lineTo(23.363f, 5.299f)
                curveTo(21.207f, 4.461f, 18.777f, 4.0f, 16.516f, 4.0f)
                close()
                moveTo(16.516f, 6.0f)
                curveTo(18.315f, 6.0f, 20.237f, 6.328f, 22.0f, 6.93f)
                lineTo(22.0f, 10.361f)
                curveTo(20.114f, 9.522f, 17.953f, 9.0f, 16.23f, 9.0f)
                curveTo(13.315f, 9.0f, 13.0f, 10.8f, 13.0f, 11.574f)
                curveTo(13.0f, 13.465f, 14.975f, 14.099f, 17.066f, 14.768f)
                curveTo(20.541f, 15.881f, 23.0f, 16.934f, 23.0f, 20.4f)
                curveTo(23.0f, 25.453f, 17.513f, 26.0f, 15.156f, 26.0f)
                curveTo(13.175f, 25.996f, 10.967f, 25.577f, 9.0f, 24.842f)
                lineTo(9.0f, 21.537f)
                curveTo(10.993f, 22.334f, 13.466f, 23.0f, 15.477f, 23.0f)
                curveTo(18.531f, 23.0f, 18.997f, 21.466f, 19.0f, 20.543f)
                lineTo(19.0f, 20.537f)
                lineTo(19.0f, 20.531f)
                curveTo(18.992f, 18.575f, 16.935f, 17.894f, 14.756f, 17.172f)
                curveTo(11.386f, 16.054f, 9.0f, 15.025f, 9.0f, 11.934f)
                curveTo(9.0f, 8.273f, 11.88f, 6.0f, 16.516f, 6.0f)
                close()
            }
        }
        .build()
        return _stripeS!!
    }

private var _stripeS: ImageVector? = null
