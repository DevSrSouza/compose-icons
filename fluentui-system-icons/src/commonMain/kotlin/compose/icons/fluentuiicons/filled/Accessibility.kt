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

public val FilledGroup.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = Builder(name = "Accessibility", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveTo(13.2426f, 6.5f, 14.25f, 5.4926f, 14.25f, 4.25f)
                curveTo(14.25f, 3.0074f, 13.2426f, 2.0f, 12.0f, 2.0f)
                curveTo(10.7574f, 2.0f, 9.75f, 3.0074f, 9.75f, 4.25f)
                curveTo(9.75f, 5.4926f, 10.7574f, 6.5f, 12.0f, 6.5f)
                close()
                moveTo(6.1498f, 4.178f)
                curveTo(5.0066f, 3.6928f, 3.6819f, 4.2224f, 3.1883f, 5.3619f)
                curveTo(2.6931f, 6.5054f, 3.2223f, 7.8293f, 4.3694f, 8.3162f)
                lineTo(7.3931f, 9.5997f)
                curveTo(7.7625f, 9.7564f, 8.0023f, 10.1189f, 8.0023f, 10.5202f)
                verticalLineTo(13.5597f)
                lineTo(6.1234f, 19.0167f)
                curveTo(5.7188f, 20.1916f, 6.3433f, 21.4721f, 7.5183f, 21.8766f)
                curveTo(8.6932f, 22.2812f, 9.9736f, 21.6567f, 10.3782f, 20.4817f)
                lineTo(11.7636f, 16.4582f)
                curveTo(11.841f, 16.2334f, 12.159f, 16.2334f, 12.2364f, 16.4582f)
                lineTo(13.6219f, 20.4819f)
                curveTo(14.0264f, 21.6569f, 15.3069f, 22.2814f, 16.4818f, 21.8768f)
                curveTo(17.6568f, 21.4723f, 18.2813f, 20.1918f, 17.8767f, 19.0169f)
                lineTo(16.0023f, 13.56f)
                verticalLineTo(10.5181f)
                curveTo(16.0023f, 10.1168f, 16.2422f, 9.7544f, 16.6116f, 9.5976f)
                lineTo(19.6304f, 8.3162f)
                curveTo(20.7775f, 7.8293f, 21.3068f, 6.5054f, 20.8115f, 5.3619f)
                curveTo(20.3179f, 4.2224f, 18.9932f, 3.6928f, 17.85f, 4.178f)
                lineTo(16.244f, 4.8597f)
                curveTo(15.9033f, 5.0044f, 15.6657f, 5.2826f, 15.5492f, 5.5907f)
                curveTo(15.0072f, 7.025f, 13.6215f, 8.0429f, 12.0f, 8.0429f)
                curveTo(10.3784f, 8.0429f, 8.9927f, 7.025f, 8.4507f, 5.5907f)
                curveTo(8.3342f, 5.2826f, 8.0966f, 5.0044f, 7.7559f, 4.8598f)
                lineTo(6.1498f, 4.178f)
                close()
            }
        }
        .build()
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
