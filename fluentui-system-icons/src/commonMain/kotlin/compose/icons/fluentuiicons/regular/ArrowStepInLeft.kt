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

public val RegularGroup.ArrowStepInLeft: ImageVector
    get() {
        if (_arrowStepInLeft != null) {
            return _arrowStepInLeft!!
        }
        _arrowStepInLeft = Builder(name = "ArrowStepInLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2945f, 16.2342f)
                curveTo(15.5793f, 16.5349f, 15.5665f, 17.0096f, 15.2658f, 17.2945f)
                curveTo(14.9651f, 17.5793f, 14.4904f, 17.5665f, 14.2055f, 17.2658f)
                lineTo(9.7055f, 12.5158f)
                curveTo(9.4315f, 12.2265f, 9.4315f, 11.7735f, 9.7055f, 11.4842f)
                lineTo(14.2055f, 6.7342f)
                curveTo(14.4904f, 6.4335f, 14.9651f, 6.4207f, 15.2658f, 6.7055f)
                curveTo(15.5665f, 6.9904f, 15.5793f, 7.4651f, 15.2945f, 7.7658f)
                lineTo(11.9936f, 11.25f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 11.25f, 22.0f, 11.5858f, 22.0f, 12.0f)
                curveTo(22.0f, 12.4142f, 21.6642f, 12.75f, 21.25f, 12.75f)
                horizontalLineTo(11.9937f)
                lineTo(15.2945f, 16.2342f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 10.3431f, 3.3431f, 9.0f, 5.0f, 9.0f)
                curveTo(6.6568f, 9.0f, 8.0f, 10.3431f, 8.0f, 12.0f)
                curveTo(8.0f, 13.6569f, 6.6568f, 15.0f, 5.0f, 15.0f)
                curveTo(3.3431f, 15.0f, 2.0f, 13.6569f, 2.0f, 12.0f)
                close()
                moveTo(3.5f, 12.0f)
                curveTo(3.5f, 12.8284f, 4.1716f, 13.5f, 5.0f, 13.5f)
                curveTo(5.8284f, 13.5f, 6.5f, 12.8284f, 6.5f, 12.0f)
                curveTo(6.5f, 11.1716f, 5.8284f, 10.5f, 5.0f, 10.5f)
                curveTo(4.1716f, 10.5f, 3.5f, 11.1716f, 3.5f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowStepInLeft!!
    }

private var _arrowStepInLeft: ImageVector? = null
