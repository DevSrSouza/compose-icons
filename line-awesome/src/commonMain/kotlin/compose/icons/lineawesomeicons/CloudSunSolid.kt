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

public val LineAwesomeIcons.CloudSunSolid: ImageVector
    get() {
        if (_cloudSunSolid != null) {
            return _cloudSunSolid!!
        }
        _cloudSunSolid = Builder(name = "CloudSunSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                lineTo(9.0f, 9.0938f)
                curveTo(8.3672f, 9.2227f, 7.7734f, 9.4961f, 7.25f, 9.8438f)
                lineTo(5.0625f, 7.625f)
                lineTo(3.625f, 9.0625f)
                lineTo(5.8438f, 11.25f)
                curveTo(5.4961f, 11.7734f, 5.2227f, 12.3672f, 5.0938f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 15.0f)
                lineTo(5.125f, 15.0f)
                curveTo(5.2539f, 15.6289f, 5.5078f, 16.1992f, 5.8438f, 16.7188f)
                lineTo(3.625f, 18.9375f)
                lineTo(4.25f, 19.5625f)
                curveTo(4.1133f, 20.0195f, 4.0f, 20.5f, 4.0f, 21.0f)
                curveTo(4.0f, 23.7578f, 6.2422f, 26.0f, 9.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                curveTo(27.7578f, 26.0f, 30.0f, 23.7578f, 30.0f, 21.0f)
                curveTo(30.0f, 18.9805f, 28.7891f, 17.1797f, 26.9688f, 16.4063f)
                curveTo(26.6875f, 13.9883f, 24.6563f, 12.0977f, 22.1875f, 12.0f)
                curveTo(21.125f, 10.1523f, 19.1641f, 9.0f, 17.0f, 9.0f)
                curveTo(16.7734f, 9.0f, 16.5625f, 9.0078f, 16.3438f, 9.0313f)
                lineTo(14.9375f, 7.625f)
                lineTo(12.75f, 9.8438f)
                curveTo(12.2266f, 9.5078f, 11.6289f, 9.2539f, 11.0f, 9.125f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(10.7656f, 11.0f, 11.4453f, 11.2852f, 11.9688f, 11.75f)
                curveTo(11.707f, 12.1523f, 11.4727f, 12.5977f, 11.3125f, 13.0625f)
                curveTo(9.7305f, 13.332f, 8.4609f, 14.543f, 8.0938f, 16.0938f)
                curveTo(8.0391f, 16.1016f, 7.9883f, 16.1133f, 7.9375f, 16.125f)
                curveTo(7.3789f, 15.582f, 7.0f, 14.8477f, 7.0f, 14.0f)
                curveTo(7.0f, 12.332f, 8.332f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(18.6055f, 11.0f, 20.0547f, 11.9609f, 20.6875f, 13.4375f)
                lineTo(20.9688f, 14.125f)
                lineTo(21.875f, 14.0313f)
                curveTo(21.918f, 14.0234f, 21.9531f, 14.0f, 22.0f, 14.0f)
                curveTo(23.6523f, 14.0f, 24.9961f, 15.3516f, 25.0f, 16.9375f)
                lineTo(24.9688f, 17.9063f)
                lineTo(25.75f, 18.0938f)
                curveTo(27.082f, 18.4336f, 28.0f, 19.6367f, 28.0f, 21.0f)
                curveTo(28.0f, 22.6523f, 26.6523f, 24.0f, 25.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                curveTo(7.3477f, 24.0f, 6.0f, 22.6523f, 6.0f, 21.0f)
                curveTo(6.0f, 19.3477f, 7.3477f, 18.0f, 9.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                lineTo(10.0f, 17.0f)
                curveTo(10.0f, 15.8984f, 10.8945f, 15.0039f, 11.9063f, 15.0f)
                lineTo(12.9063f, 15.0625f)
                lineTo(13.0938f, 14.2188f)
                curveTo(13.4688f, 12.3594f, 15.1016f, 11.0f, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _cloudSunSolid!!
    }

private var _cloudSunSolid: ImageVector? = null
