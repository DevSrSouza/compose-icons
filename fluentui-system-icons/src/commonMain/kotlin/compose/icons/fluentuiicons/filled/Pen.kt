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

public val FilledGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8911f, 3.0476f)
                curveTo(17.2885f, 1.65f, 19.5543f, 1.6499f, 20.9519f, 3.0475f)
                curveTo(22.3493f, 4.4449f, 22.3493f, 6.7105f, 20.952f, 8.108f)
                lineTo(20.0606f, 8.9995f)
                curveTo(21.3252f, 10.2691f, 21.3236f, 12.3234f, 20.0559f, 13.5911f)
                lineTo(18.2725f, 15.3745f)
                curveTo(17.9796f, 15.6674f, 17.5048f, 15.6674f, 17.2119f, 15.3745f)
                curveTo(16.919f, 15.0816f, 16.919f, 14.6067f, 17.2119f, 14.3138f)
                lineTo(18.9953f, 12.5304f)
                curveTo(19.6771f, 11.8486f, 19.6787f, 10.744f, 19.0f, 10.0602f)
                lineTo(9.0019f, 20.0595f)
                curveTo(8.5955f, 20.466f, 8.0842f, 20.7517f, 7.525f, 20.8848f)
                lineTo(2.9237f, 21.9804f)
                curveTo(2.6704f, 22.0407f, 2.4039f, 21.9653f, 2.2197f, 21.7811f)
                curveTo(2.0355f, 21.5969f, 1.9601f, 21.3304f, 2.0204f, 21.0771f)
                lineTo(3.116f, 16.4756f)
                curveTo(3.2491f, 15.9166f, 3.5347f, 15.4054f, 3.941f, 14.999f)
                lineTo(15.8911f, 3.0476f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
