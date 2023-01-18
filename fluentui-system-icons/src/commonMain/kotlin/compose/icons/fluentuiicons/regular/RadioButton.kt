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

public val RegularGroup.RadioButton: ImageVector
    get() {
        if (_radioButton != null) {
            return _radioButton!!
        }
        _radioButton = Builder(name = "RadioButton", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0021f)
                curveTo(17.5237f, 22.0021f, 22.0015f, 17.5243f, 22.0015f, 12.0006f)
                curveTo(22.0015f, 6.4769f, 17.5237f, 1.999f, 12.0f, 1.999f)
                curveTo(6.4763f, 1.999f, 1.9984f, 6.4769f, 1.9984f, 12.0006f)
                curveTo(1.9984f, 17.5243f, 6.4763f, 22.0021f, 12.0f, 22.0021f)
                close()
                moveTo(12.0f, 20.5021f)
                curveTo(7.3047f, 20.5021f, 3.4984f, 16.6959f, 3.4984f, 12.0006f)
                curveTo(3.4984f, 7.3053f, 7.3047f, 3.499f, 12.0f, 3.499f)
                curveTo(16.6953f, 3.499f, 20.5015f, 7.3053f, 20.5015f, 12.0006f)
                curveTo(20.5015f, 16.6959f, 16.6953f, 20.5021f, 12.0f, 20.5021f)
                close()
            }
        }
        .build()
        return _radioButton!!
    }

private var _radioButton: ImageVector? = null
