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

public val LineAwesomeIcons.Scribd: ImageVector
    get() {
        if (_scribd != null) {
            return _scribd!!
        }
        _scribd = Builder(name = "Scribd", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2988f, 4.002f)
                curveTo(11.7348f, 4.002f, 8.0f, 6.6205f, 8.0f, 11.6055f)
                curveTo(8.01f, 13.2865f, 8.4304f, 14.6265f, 9.2324f, 15.5645f)
                curveTo(10.6984f, 17.3435f, 13.4827f, 17.4504f, 14.9297f, 15.9844f)
                curveTo(16.1127f, 14.7814f, 16.2787f, 12.6319f, 14.9688f, 11.4199f)
                curveTo(14.2747f, 10.7549f, 13.3564f, 10.4626f, 12.1934f, 10.7266f)
                curveTo(11.3334f, 10.9806f, 10.7754f, 10.8821f, 10.7754f, 9.9531f)
                curveTo(10.7754f, 7.5191f, 13.8064f, 6.1329f, 16.3184f, 6.1719f)
                curveTo(18.4884f, 6.1429f, 20.6097f, 6.7572f, 22.4277f, 7.9492f)
                lineTo(21.0879f, 9.8652f)
                lineTo(22.9453f, 11.0879f)
                lineTo(25.4473f, 7.5117f)
                curveTo(24.0793f, 6.4367f, 21.1958f, 3.924f, 16.2988f, 4.002f)
                close()
                moveTo(21.666f, 15.0059f)
                curveTo(19.783f, 14.9089f, 18.1448f, 16.391f, 18.1738f, 18.332f)
                curveTo(18.1448f, 19.171f, 18.4748f, 19.9713f, 19.0898f, 20.5273f)
                curveTo(19.7818f, 21.2193f, 20.7199f, 21.5013f, 21.8809f, 21.2383f)
                curveTo(22.7399f, 20.9843f, 23.2949f, 21.0925f, 23.2949f, 22.0195f)
                curveTo(23.2949f, 22.2235f, 23.2656f, 22.4376f, 23.2266f, 22.6426f)
                curveTo(22.3966f, 24.6716f, 20.28f, 25.832f, 17.207f, 25.832f)
                curveTo(14.641f, 25.842f, 12.1332f, 25.0242f, 10.0742f, 23.4922f)
                lineTo(11.7422f, 21.541f)
                lineTo(9.9766f, 20.1855f)
                lineTo(6.9629f, 23.7363f)
                lineTo(7.7324f, 24.4199f)
                curveTo(10.3274f, 26.7419f, 13.6947f, 28.019f, 17.1777f, 28.0f)
                curveTo(19.7237f, 28.0f, 21.851f, 27.4835f, 23.793f, 25.8145f)
                curveTo(26.622f, 23.2685f, 26.4758f, 18.4189f, 24.7988f, 16.4199f)
                curveTo(24.0378f, 15.4929f, 22.876f, 14.9669f, 21.666f, 15.0059f)
                close()
            }
        }
        .build()
        return _scribd!!
    }

private var _scribd: ImageVector? = null
