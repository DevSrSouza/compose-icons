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

public val LineAwesomeIcons.Speakap: ImageVector
    get() {
        if (_speakap != null) {
            return _speakap!!
        }
        _speakap = Builder(name = "Speakap", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3945f, 3.0f)
                curveTo(8.5605f, 3.0f, 3.0f, 8.588f, 3.0f, 15.457f)
                curveTo(3.0f, 22.197f, 8.0f, 29.0f, 19.168f, 29.0f)
                curveTo(21.981f, 29.0f, 25.7697f, 27.921f, 25.9297f, 27.875f)
                lineTo(28.0f, 27.2813f)
                lineTo(26.2852f, 25.9707f)
                curveTo(25.6602f, 25.4927f, 24.9492f, 24.8968f, 24.1992f, 24.2168f)
                curveTo(26.4942f, 21.8988f, 27.7891f, 18.769f, 27.7891f, 15.457f)
                curveTo(27.7891f, 8.588f, 22.2285f, 3.0f, 15.3945f, 3.0f)
                close()
                moveTo(15.3945f, 5.0f)
                curveTo(21.1265f, 5.0f, 25.7891f, 9.691f, 25.7891f, 15.457f)
                curveTo(25.7891f, 18.236f, 24.7213f, 20.8466f, 22.7793f, 22.8086f)
                lineTo(21.3086f, 24.2949f)
                lineTo(22.8574f, 25.6973f)
                curveTo(23.1224f, 25.9373f, 23.3827f, 26.1687f, 23.6367f, 26.3887f)
                curveTo(22.3517f, 26.6767f, 20.588f, 27.0f, 19.168f, 27.0f)
                curveTo(8.711f, 27.0f, 5.0f, 20.782f, 5.0f, 15.457f)
                curveTo(5.0f, 9.691f, 9.6625f, 5.0f, 15.3945f, 5.0f)
                close()
                moveTo(16.2461f, 9.002f)
                curveTo(13.6661f, 8.951f, 11.5185f, 10.3965f, 11.4785f, 12.9355f)
                curveTo(11.4685f, 13.4975f, 11.4888f, 14.7515f, 12.9238f, 15.6445f)
                curveTo(14.6208f, 16.6975f, 17.1902f, 16.6988f, 17.1602f, 18.2148f)
                curveTo(17.1402f, 19.2688f, 15.8657f, 19.4885f, 15.2637f, 19.4785f)
                curveTo(15.1127f, 19.4785f, 13.7671f, 19.4596f, 12.9141f, 18.2656f)
                lineTo(10.9473f, 20.3633f)
                curveTo(12.3323f, 21.6983f, 13.8485f, 21.978f, 15.0625f, 21.998f)
                curveTo(15.5645f, 22.008f, 19.8109f, 22.0089f, 19.8809f, 18.0039f)
                curveTo(19.8909f, 17.2209f, 19.7791f, 16.0478f, 18.4551f, 15.2148f)
                curveTo(16.7691f, 14.1508f, 14.2708f, 14.2506f, 14.3008f, 12.7656f)
                curveTo(14.3208f, 11.6206f, 15.8255f, 11.5095f, 16.1465f, 11.5195f)
                curveTo(16.1665f, 11.5195f, 17.4615f, 11.53f, 18.1035f, 12.373f)
                lineTo(20.002f, 10.3555f)
                curveTo(19.53f, 9.9135f, 18.4241f, 9.032f, 16.2461f, 9.002f)
                close()
            }
        }
        .build()
        return _speakap!!
    }

private var _speakap: ImageVector? = null
