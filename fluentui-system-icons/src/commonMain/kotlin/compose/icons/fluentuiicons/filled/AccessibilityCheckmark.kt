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

public val FilledGroup.AccessibilityCheckmark: ImageVector
    get() {
        if (_accessibilityCheckmark != null) {
            return _accessibilityCheckmark!!
        }
        _accessibilityCheckmark = Builder(name = "AccessibilityCheckmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                lineTo(11.0716f, 18.468f)
                curveTo(11.0244f, 18.1522f, 11.0f, 17.8289f, 11.0f, 17.5f)
                curveTo(11.0f, 14.4256f, 13.1345f, 11.8497f, 16.0023f, 11.1734f)
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
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(20.8536f, 15.1464f)
                curveTo(20.6583f, 14.9512f, 20.3417f, 14.9512f, 20.1464f, 15.1464f)
                lineTo(16.5f, 18.7929f)
                lineTo(14.8536f, 17.1464f)
                curveTo(14.6583f, 16.9512f, 14.3417f, 16.9512f, 14.1464f, 17.1464f)
                curveTo(13.9512f, 17.3417f, 13.9512f, 17.6583f, 14.1464f, 17.8536f)
                lineTo(16.1464f, 19.8536f)
                curveTo(16.3417f, 20.0488f, 16.6583f, 20.0488f, 16.8536f, 19.8536f)
                lineTo(20.8536f, 15.8536f)
                curveTo(21.0488f, 15.6583f, 21.0488f, 15.3417f, 20.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _accessibilityCheckmark!!
    }

private var _accessibilityCheckmark: ImageVector? = null
