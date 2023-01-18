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

public val RegularGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7327f, 19.7905f)
                curveTo(11.0326f, 20.0762f, 11.5074f, 20.0646f, 11.7931f, 19.7647f)
                curveTo(12.0788f, 19.4648f, 12.0672f, 18.99f, 11.7673f, 18.7043f)
                lineTo(5.5159f, 12.7497f)
                lineTo(20.25f, 12.7497f)
                curveTo(20.6642f, 12.7497f, 21.0f, 12.4139f, 21.0f, 11.9997f)
                curveTo(21.0f, 11.5855f, 20.6642f, 11.2497f, 20.25f, 11.2497f)
                lineTo(5.5158f, 11.2497f)
                lineTo(11.7673f, 5.295f)
                curveTo(12.0672f, 5.0093f, 12.0787f, 4.5346f, 11.7931f, 4.2347f)
                curveTo(11.5074f, 3.9348f, 11.0326f, 3.9232f, 10.7327f, 4.2089f)
                lineTo(3.3138f, 11.2756f)
                curveTo(3.1449f, 11.4365f, 3.0449f, 11.6417f, 3.0139f, 11.8551f)
                curveTo(3.0048f, 11.9019f, 3.0f, 11.9503f, 3.0f, 11.9997f)
                curveTo(3.0f, 12.0493f, 3.0048f, 12.0977f, 3.014f, 12.1446f)
                curveTo(3.045f, 12.3579f, 3.145f, 12.563f, 3.3138f, 12.7238f)
                lineTo(10.7327f, 19.7905f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
