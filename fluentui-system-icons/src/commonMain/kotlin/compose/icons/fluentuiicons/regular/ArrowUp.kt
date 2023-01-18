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

public val RegularGroup.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2089f, 10.7327f)
                curveTo(3.9232f, 11.0326f, 3.9348f, 11.5074f, 4.2347f, 11.7931f)
                curveTo(4.5346f, 12.0788f, 5.0093f, 12.0672f, 5.295f, 11.7673f)
                lineTo(11.2495f, 5.516f)
                verticalLineTo(20.25f)
                curveTo(11.2495f, 20.6642f, 11.5853f, 21.0f, 11.9995f, 21.0f)
                curveTo(12.4137f, 21.0f, 12.7495f, 20.6642f, 12.7495f, 20.25f)
                verticalLineTo(5.5156f)
                lineTo(18.7043f, 11.7673f)
                curveTo(18.99f, 12.0672f, 19.4648f, 12.0788f, 19.7647f, 11.7931f)
                curveTo(20.0646f, 11.5074f, 20.0762f, 11.0326f, 19.7905f, 10.7327f)
                lineTo(12.7238f, 3.3138f)
                curveTo(12.5627f, 3.1447f, 12.3573f, 3.0448f, 12.1438f, 3.0139f)
                curveTo(12.0971f, 3.0048f, 12.0489f, 3.0f, 11.9995f, 3.0f)
                curveTo(11.9498f, 3.0f, 11.9012f, 3.0048f, 11.8543f, 3.0141f)
                curveTo(11.6412f, 3.0452f, 11.4363f, 3.1451f, 11.2756f, 3.3138f)
                lineTo(4.2089f, 10.7327f)
                close()
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
