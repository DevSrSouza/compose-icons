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

public val RegularGroup.Autosum: ImageVector
    get() {
        if (_autosum != null) {
            return _autosum!!
        }
        _autosum = Builder(name = "Autosum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0595f, 4.4573f)
                curveTo(5.177f, 4.1801f, 5.4489f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 4.0f, 19.0f, 4.3358f, 19.0f, 4.75f)
                curveTo(19.0f, 5.1642f, 18.6642f, 5.5f, 18.25f, 5.5f)
                horizontalLineTo(7.5195f)
                lineTo(12.8799f, 11.039f)
                curveTo(13.1491f, 11.3173f, 13.1623f, 11.7547f, 12.9104f, 12.0487f)
                lineTo(7.3807f, 18.5f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 18.5f, 19.0f, 18.8358f, 19.0f, 19.25f)
                curveTo(19.0f, 19.6642f, 18.6642f, 20.0f, 18.25f, 20.0f)
                horizontalLineTo(5.75f)
                curveTo(5.4571f, 20.0f, 5.191f, 19.8295f, 5.0686f, 19.5634f)
                curveTo(4.9462f, 19.2973f, 4.99f, 18.9843f, 5.1806f, 18.7619f)
                lineTo(11.3269f, 11.5912f)
                lineTo(5.2111f, 5.2716f)
                curveTo(5.0017f, 5.0552f, 4.942f, 4.7345f, 5.0595f, 4.4573f)
                close()
            }
        }
        .build()
        return _autosum!!
    }

private var _autosum: ImageVector? = null
