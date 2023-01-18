package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Call: ImageVector
    get() {
        if (_call != null) {
            return _call!!
        }
        _call = Builder(name = "Call", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0565f, 2.4184f)
                lineTo(8.2235f, 2.0667f)
                curveTo(9.546f, 1.668f, 10.959f, 2.3123f, 11.5253f, 3.5721f)
                lineTo(12.427f, 5.5778f)
                curveTo(12.9097f, 6.6516f, 12.6553f, 7.9137f, 11.7943f, 8.7166f)
                lineTo(10.3f, 10.1101f)
                curveTo(10.2563f, 10.1508f, 10.2286f, 10.2058f, 10.222f, 10.2652f)
                curveTo(10.1777f, 10.6623f, 10.4469f, 11.4357f, 11.0671f, 12.51f)
                curveTo(11.5182f, 13.2913f, 11.9264f, 13.8391f, 12.2739f, 14.1473f)
                curveTo(12.516f, 14.362f, 12.6493f, 14.4084f, 12.7061f, 14.3915f)
                lineTo(14.7164f, 13.7769f)
                curveTo(15.842f, 13.4328f, 17.0618f, 13.8431f, 17.7505f, 14.7976f)
                lineTo(19.0312f, 16.5726f)
                curveTo(19.8373f, 17.6898f, 19.6924f, 19.2311f, 18.6921f, 20.1784f)
                lineTo(17.8057f, 21.0178f)
                curveTo(16.8493f, 21.9236f, 15.4877f, 22.2611f, 14.219f, 21.907f)
                curveTo(11.4649f, 21.1383f, 8.9956f, 18.8141f, 6.7837f, 14.9831f)
                curveTo(4.5688f, 11.1467f, 3.7916f, 7.8422f, 4.508f, 5.0704f)
                curveTo(4.8359f, 3.8019f, 5.802f, 2.7966f, 7.0565f, 2.4184f)
                close()
                moveTo(7.4894f, 3.8546f)
                curveTo(6.7367f, 4.0815f, 6.157f, 4.6847f, 5.9603f, 5.4458f)
                curveTo(5.3576f, 7.7773f, 6.0465f, 10.7062f, 8.0828f, 14.2331f)
                curveTo(10.1163f, 17.7552f, 12.3052f, 19.8155f, 14.6223f, 20.4622f)
                curveTo(15.3835f, 20.6747f, 16.2004f, 20.4722f, 16.7743f, 19.9287f)
                lineTo(17.6606f, 19.0893f)
                curveTo(18.1153f, 18.6587f, 18.1812f, 17.9581f, 17.8148f, 17.4503f)
                lineTo(16.5341f, 15.6753f)
                curveTo(16.221f, 15.2415f, 15.6666f, 15.0549f, 15.1549f, 15.2114f)
                lineTo(13.1396f, 15.8275f)
                curveTo(11.9699f, 16.1762f, 10.9082f, 15.2347f, 9.7681f, 13.26f)
                curveTo(8.9998f, 11.9293f, 8.6417f, 10.9006f, 8.7313f, 10.0987f)
                curveTo(8.7777f, 9.6832f, 8.9712f, 9.2981f, 9.277f, 9.013f)
                lineTo(10.7713f, 7.6196f)
                curveTo(11.1627f, 7.2546f, 11.2783f, 6.681f, 11.0589f, 6.1929f)
                lineTo(10.1572f, 4.1871f)
                curveTo(9.8998f, 3.6145f, 9.2575f, 3.3217f, 8.6564f, 3.5029f)
                lineTo(7.4894f, 3.8546f)
                close()
            }
        }
        .build()
        return _call!!
    }

private var _call: ImageVector? = null
