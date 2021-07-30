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

public val LineAwesomeIcons.Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = Builder(name = "Dribbble", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(18.5352f, 6.0f, 20.832f, 6.9531f, 22.5938f, 8.5f)
                curveTo(22.4063f, 8.7617f, 22.1523f, 9.0781f, 21.75f, 9.4688f)
                curveTo(20.8945f, 10.2969f, 19.5273f, 11.293f, 17.4375f, 12.0625f)
                curveTo(16.0234f, 9.4492f, 14.6367f, 7.4844f, 13.7188f, 6.25f)
                curveTo(14.4492f, 6.082f, 15.2148f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.75f, 6.9375f)
                curveTo(12.5703f, 8.0117f, 14.0313f, 10.0039f, 15.5f, 12.6563f)
                curveTo(11.4336f, 13.7344f, 7.7031f, 13.8711f, 6.2188f, 13.875f)
                curveTo(6.8828f, 10.7852f, 8.9609f, 8.2422f, 11.75f, 6.9375f)
                close()
                moveTo(23.9688f, 9.9688f)
                curveTo(25.1875f, 11.582f, 25.9453f, 13.5781f, 26.0f, 15.75f)
                curveTo(25.1094f, 15.5508f, 23.7969f, 15.3555f, 22.0938f, 15.3438f)
                curveTo(21.207f, 15.3398f, 20.2031f, 15.4023f, 19.125f, 15.5313f)
                curveTo(18.875f, 14.9609f, 18.6055f, 14.4102f, 18.3438f, 13.875f)
                curveTo(20.5859f, 13.0156f, 22.1133f, 11.8828f, 23.125f, 10.9063f)
                curveTo(23.4688f, 10.5703f, 23.7383f, 10.2617f, 23.9688f, 9.9688f)
                close()
                moveTo(16.4063f, 14.4688f)
                curveTo(16.6367f, 14.9336f, 16.8711f, 15.4102f, 17.0938f, 15.9063f)
                curveTo(12.8203f, 17.0898f, 9.75f, 20.7148f, 8.4375f, 22.5313f)
                curveTo(6.9258f, 20.7813f, 6.0f, 18.5f, 6.0f, 16.0f)
                curveTo(6.0f, 15.957f, 6.0f, 15.918f, 6.0f, 15.875f)
                curveTo(7.3516f, 15.8906f, 11.6484f, 15.7969f, 16.4063f, 14.4688f)
                close()
                moveTo(22.0938f, 17.3125f)
                curveTo(23.8789f, 17.3125f, 25.1133f, 17.5625f, 25.8438f, 17.75f)
                curveTo(25.3789f, 20.4141f, 23.875f, 22.6992f, 21.75f, 24.1875f)
                curveTo(21.3516f, 21.7969f, 20.6953f, 19.5234f, 19.9063f, 17.4375f)
                curveTo(20.6953f, 17.3594f, 21.4414f, 17.3125f, 22.0938f, 17.3125f)
                close()
                moveTo(17.875f, 17.7813f)
                curveTo(18.7734f, 20.0625f, 19.5273f, 22.5664f, 19.9063f, 25.2188f)
                curveTo(18.7109f, 25.7227f, 17.3828f, 26.0f, 16.0f, 26.0f)
                curveTo(13.707f, 26.0f, 11.5898f, 25.2305f, 9.9063f, 23.9375f)
                curveTo(10.9336f, 22.5313f, 13.9531f, 18.7891f, 17.875f, 17.7813f)
                close()
            }
        }
        .build()
        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
