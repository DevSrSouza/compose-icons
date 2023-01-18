package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FoodApple: ImageVector
    get() {
        if (_foodApple != null) {
            return _foodApple!!
        }
        _foodApple = Builder(name = "FoodApple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4715f, 3.4193f)
                curveTo(5.3896f, 4.8053f, 5.8618f, 6.2208f, 6.8886f, 7.3017f)
                curveTo(5.0111f, 7.8413f, 3.518f, 9.439f, 3.2281f, 11.5176f)
                curveTo(2.8997f, 13.8731f, 3.3839f, 16.2702f, 4.6007f, 18.3136f)
                lineTo(4.9517f, 18.9031f)
                curveTo(4.9647f, 18.9249f, 4.9788f, 18.9461f, 4.994f, 18.9665f)
                lineTo(6.41f, 20.8732f)
                curveTo(7.6864f, 22.5921f, 10.2013f, 22.752f, 11.6853f, 21.2087f)
                curveTo(11.857f, 21.0301f, 12.1429f, 21.0301f, 12.3147f, 21.2087f)
                curveTo(13.7986f, 22.752f, 16.3135f, 22.5921f, 17.59f, 20.8732f)
                lineTo(19.0059f, 18.9665f)
                curveTo(19.0211f, 18.9461f, 19.0352f, 18.9249f, 19.0482f, 18.9031f)
                lineTo(19.3992f, 18.3136f)
                curveTo(20.6161f, 16.2702f, 21.1002f, 13.8731f, 20.7718f, 11.5176f)
                curveTo(20.3631f, 8.5863f, 17.5611f, 6.6112f, 14.6629f, 7.2117f)
                lineTo(12.7608f, 7.6058f)
                lineTo(12.7577f, 7.6064f)
                curveTo(12.7881f, 6.8266f, 12.9097f, 5.9855f, 13.149f, 5.2678f)
                curveTo(13.4383f, 4.3998f, 13.8411f, 3.878f, 14.2884f, 3.6916f)
                curveTo(14.6708f, 3.5323f, 14.8516f, 3.0932f, 14.6923f, 2.7109f)
                curveTo(14.533f, 2.3285f, 14.0939f, 2.1477f, 13.7115f, 2.307f)
                curveTo(12.6588f, 2.7457f, 12.0616f, 3.7864f, 11.726f, 4.7934f)
                curveTo(11.7103f, 4.8404f, 11.6951f, 4.8878f, 11.6803f, 4.9354f)
                curveTo(11.4405f, 4.4709f, 11.1259f, 4.0351f, 10.7366f, 3.6458f)
                curveTo(9.6441f, 2.5532f, 8.1846f, 2.0495f, 6.7564f, 2.1341f)
                curveTo(6.0633f, 2.1752f, 5.5124f, 2.7262f, 5.4715f, 3.4193f)
                close()
                moveTo(8.3969f, 11.2345f)
                curveTo(8.0501f, 11.3038f, 7.7324f, 11.5478f, 7.5329f, 12.0132f)
                curveTo(7.3297f, 12.4874f, 7.258f, 13.1895f, 7.4773f, 14.0672f)
                curveTo(7.5777f, 14.4691f, 7.3333f, 14.8763f, 6.9314f, 14.9767f)
                curveTo(6.5296f, 15.077f, 6.1224f, 14.8327f, 6.022f, 14.4308f)
                curveTo(5.7417f, 13.3085f, 5.795f, 12.2606f, 6.1542f, 11.4224f)
                curveTo(6.5172f, 10.5752f, 7.1993f, 9.9442f, 8.1027f, 9.7636f)
                curveTo(8.5089f, 9.6824f, 8.904f, 9.9458f, 8.9853f, 10.3519f)
                curveTo(9.0665f, 10.7581f, 8.8031f, 11.1532f, 8.3969f, 11.2345f)
                close()
            }
        }
        .build()
        return _foodApple!!
    }

private var _foodApple: ImageVector? = null
