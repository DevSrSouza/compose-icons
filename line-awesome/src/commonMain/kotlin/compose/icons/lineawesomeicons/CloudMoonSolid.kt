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

public val LineAwesomeIcons.CloudMoonSolid: ImageVector
    get() {
        if (_cloudMoonSolid != null) {
            return _cloudMoonSolid!!
        }
        _cloudMoonSolid = Builder(name = "CloudMoonSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4063f, 5.9375f)
                lineTo(8.75f, 5.9688f)
                curveTo(5.0078f, 6.1055f, 2.0f, 9.1953f, 2.0f, 12.9688f)
                curveTo(2.0f, 15.1992f, 3.0547f, 17.1836f, 4.6875f, 18.4688f)
                curveTo(4.2539f, 19.2109f, 4.0f, 20.082f, 4.0f, 21.0f)
                curveTo(4.0f, 23.7578f, 6.2422f, 26.0f, 9.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                curveTo(27.7578f, 26.0f, 30.0f, 23.7578f, 30.0f, 21.0f)
                curveTo(30.0f, 18.9805f, 28.7891f, 17.1797f, 26.9688f, 16.4063f)
                curveTo(26.6875f, 13.9883f, 24.6563f, 12.0977f, 22.1875f, 12.0f)
                curveTo(21.125f, 10.1523f, 19.1641f, 9.0f, 17.0f, 9.0f)
                curveTo(14.6836f, 9.0f, 12.6172f, 10.3398f, 11.625f, 12.3438f)
                curveTo(10.2969f, 11.7969f, 9.3438f, 10.5078f, 9.3438f, 8.9688f)
                curveTo(9.3438f, 8.4102f, 9.4609f, 7.8867f, 9.6875f, 7.4063f)
                close()
                moveTo(7.5f, 8.3125f)
                curveTo(7.4727f, 8.543f, 7.3438f, 8.7305f, 7.3438f, 8.9688f)
                curveTo(7.3438f, 10.9219f, 8.332f, 12.6328f, 9.8438f, 13.6563f)
                curveTo(8.9961f, 14.2109f, 8.332f, 15.0781f, 8.0938f, 16.0938f)
                curveTo(7.3242f, 16.2344f, 6.6328f, 16.5547f, 6.0313f, 17.0f)
                curveTo(4.8047f, 16.0859f, 4.0f, 14.6211f, 4.0f, 12.9688f)
                curveTo(4.0f, 10.7305f, 5.4844f, 8.957f, 7.5f, 8.3125f)
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
        return _cloudMoonSolid!!
    }

private var _cloudMoonSolid: ImageVector? = null
