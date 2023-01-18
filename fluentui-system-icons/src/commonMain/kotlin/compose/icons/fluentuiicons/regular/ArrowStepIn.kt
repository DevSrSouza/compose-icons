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

public val RegularGroup.ArrowStepIn: ImageVector
    get() {
        if (_arrowStepIn != null) {
            return _arrowStepIn!!
        }
        _arrowStepIn = Builder(name = "ArrowStepIn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.4142f, 2.0f, 12.75f, 2.3358f, 12.75f, 2.75f)
                verticalLineTo(12.0064f)
                lineTo(16.2342f, 8.7055f)
                curveTo(16.5349f, 8.4207f, 17.0096f, 8.4335f, 17.2945f, 8.7342f)
                curveTo(17.5793f, 9.0349f, 17.5665f, 9.5096f, 17.2658f, 9.7945f)
                lineTo(12.5158f, 14.2945f)
                curveTo(12.2265f, 14.5685f, 11.7735f, 14.5685f, 11.4842f, 14.2945f)
                lineTo(6.7342f, 9.7945f)
                curveTo(6.4335f, 9.5096f, 6.4207f, 9.0349f, 6.7055f, 8.7342f)
                curveTo(6.9904f, 8.4335f, 7.4651f, 8.4207f, 7.7658f, 8.7055f)
                lineTo(11.25f, 12.0063f)
                verticalLineTo(2.75f)
                curveTo(11.25f, 2.3358f, 11.5858f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(13.6569f, 22.0f, 15.0f, 20.6569f, 15.0f, 19.0f)
                curveTo(15.0f, 17.3431f, 13.6569f, 16.0f, 12.0f, 16.0f)
                curveTo(10.3431f, 16.0f, 9.0f, 17.3431f, 9.0f, 19.0f)
                curveTo(9.0f, 20.6569f, 10.3431f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.5f)
                curveTo(11.1716f, 20.5f, 10.5f, 19.8284f, 10.5f, 19.0f)
                curveTo(10.5f, 18.1716f, 11.1716f, 17.5f, 12.0f, 17.5f)
                curveTo(12.8284f, 17.5f, 13.5f, 18.1716f, 13.5f, 19.0f)
                curveTo(13.5f, 19.8284f, 12.8284f, 20.5f, 12.0f, 20.5f)
                close()
            }
        }
        .build()
        return _arrowStepIn!!
    }

private var _arrowStepIn: ImageVector? = null
