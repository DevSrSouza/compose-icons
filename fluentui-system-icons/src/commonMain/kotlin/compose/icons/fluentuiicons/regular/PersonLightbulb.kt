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

public val RegularGroup.PersonLightbulb: ImageVector
    get() {
        if (_personLightbulb != null) {
            return _personLightbulb!!
        }
        _personLightbulb = Builder(name = "PersonLightbulb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0247f, 15.5002f)
                curveTo(13.0771f, 14.9716f, 13.2119f, 14.4673f, 13.416f, 14.0002f)
                horizontalLineTo(6.2523f)
                curveTo(5.0103f, 14.0002f, 4.0034f, 15.007f, 4.0034f, 16.2491f)
                verticalLineTo(16.8267f)
                curveTo(4.0034f, 17.7195f, 4.3219f, 18.583f, 4.9017f, 19.2619f)
                curveTo(6.468f, 21.0962f, 8.854f, 22.0013f, 11.9999f, 22.0013f)
                curveTo(13.1749f, 22.0013f, 14.2441f, 21.875f, 15.2044f, 21.6212f)
                lineTo(14.9097f, 20.1476f)
                curveTo(14.0596f, 20.3829f, 13.0909f, 20.5013f, 11.9999f, 20.5013f)
                curveTo(9.2616f, 20.5013f, 7.2957f, 19.7555f, 6.0424f, 18.2878f)
                curveTo(5.6945f, 17.8805f, 5.5034f, 17.3624f, 5.5034f, 16.8267f)
                verticalLineTo(16.2491f)
                curveTo(5.5034f, 15.8355f, 5.8387f, 15.5002f, 6.2523f, 15.5002f)
                horizontalLineTo(13.0247f)
                close()
                moveTo(16.9999f, 7.0049f)
                curveTo(16.9999f, 4.2435f, 14.7613f, 2.0049f, 11.9999f, 2.0049f)
                curveTo(9.2385f, 2.0049f, 6.9999f, 4.2435f, 6.9999f, 7.0049f)
                curveTo(6.9999f, 9.7663f, 9.2385f, 12.0049f, 11.9999f, 12.0049f)
                curveTo(14.7613f, 12.0049f, 16.9999f, 9.7663f, 16.9999f, 7.0049f)
                close()
                moveTo(8.4999f, 7.0049f)
                curveTo(8.4999f, 5.0719f, 10.0669f, 3.5049f, 11.9999f, 3.5049f)
                curveTo(13.9329f, 3.5049f, 15.4999f, 5.0719f, 15.4999f, 7.0049f)
                curveTo(15.4999f, 8.9379f, 13.9329f, 10.5049f, 11.9999f, 10.5049f)
                curveTo(10.0669f, 10.5049f, 8.4999f, 8.9379f, 8.4999f, 7.0049f)
                close()
                moveTo(22.0f, 16.0f)
                curveTo(22.0f, 17.3806f, 21.3005f, 18.5979f, 20.2367f, 19.3167f)
                lineTo(20.1f, 20.0f)
                horizontalLineTo(15.9f)
                lineTo(15.7633f, 19.3167f)
                curveTo(14.6995f, 18.5979f, 14.0f, 17.3806f, 14.0f, 16.0f)
                curveTo(14.0f, 13.7909f, 15.7909f, 12.0f, 18.0f, 12.0f)
                curveTo(20.2091f, 12.0f, 22.0f, 13.7909f, 22.0f, 16.0f)
                close()
                moveTo(16.1f, 21.0f)
                lineTo(16.2588f, 21.7942f)
                curveTo(16.3991f, 22.4953f, 17.0147f, 23.0f, 17.7297f, 23.0f)
                horizontalLineTo(18.2703f)
                curveTo(18.9853f, 23.0f, 19.6009f, 22.4953f, 19.7412f, 21.7942f)
                lineTo(19.9f, 21.0f)
                horizontalLineTo(16.1f)
                close()
            }
        }
        .build()
        return _personLightbulb!!
    }

private var _personLightbulb: ImageVector? = null
