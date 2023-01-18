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

public val FilledGroup.RadioButton: ImageVector
    get() {
        if (_radioButton != null) {
            return _radioButton!!
        }
        _radioButton = Builder(name = "RadioButton", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.999f)
                curveTo(17.5237f, 1.999f, 22.0015f, 6.4769f, 22.0015f, 12.0006f)
                curveTo(22.0015f, 17.5243f, 17.5237f, 22.0021f, 12.0f, 22.0021f)
                curveTo(6.4763f, 22.0021f, 1.9984f, 17.5243f, 1.9984f, 12.0006f)
                curveTo(1.9984f, 6.4769f, 6.4763f, 1.999f, 12.0f, 1.999f)
                close()
                moveTo(12.0f, 3.499f)
                curveTo(7.3047f, 3.499f, 3.4984f, 7.3053f, 3.4984f, 12.0006f)
                curveTo(3.4984f, 16.6959f, 7.3047f, 20.5021f, 12.0f, 20.5021f)
                curveTo(16.6953f, 20.5021f, 20.5015f, 16.6959f, 20.5015f, 12.0006f)
                curveTo(20.5015f, 7.3053f, 16.6953f, 3.499f, 12.0f, 3.499f)
                close()
                moveTo(11.9966f, 5.999f)
                curveTo(15.3092f, 5.999f, 17.9947f, 8.6845f, 17.9947f, 11.9971f)
                curveTo(17.9947f, 15.3098f, 15.3092f, 17.9953f, 11.9966f, 17.9953f)
                curveTo(8.6839f, 17.9953f, 5.9984f, 15.3098f, 5.9984f, 11.9971f)
                curveTo(5.9984f, 8.6845f, 8.6839f, 5.999f, 11.9966f, 5.999f)
                close()
            }
        }
        .build()
        return _radioButton!!
    }

private var _radioButton: ImageVector? = null