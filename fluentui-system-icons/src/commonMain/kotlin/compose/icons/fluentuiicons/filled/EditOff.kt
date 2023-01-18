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

public val FilledGroup.EditOff: ImageVector
    get() {
        if (_editOff != null) {
            return _editOff!!
        }
        _editOff = Builder(name = "EditOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9999f, 15.0608f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(8.9393f, 10.0001f)
                lineTo(3.941f, 14.999f)
                curveTo(3.5347f, 15.4054f, 3.2491f, 15.9166f, 3.116f, 16.4756f)
                lineTo(2.0204f, 21.077f)
                curveTo(1.9601f, 21.3304f, 2.0355f, 21.5969f, 2.2197f, 21.7811f)
                curveTo(2.4039f, 21.9653f, 2.6704f, 22.0407f, 2.9237f, 21.9804f)
                lineTo(7.525f, 20.8848f)
                curveTo(8.0842f, 20.7517f, 8.5955f, 20.466f, 9.0019f, 20.0595f)
                lineTo(13.9999f, 15.0608f)
                close()
                moveTo(18.9995f, 10.0607f)
                lineTo(16.121f, 12.9396f)
                lineTo(11.0604f, 7.8789f)
                lineTo(13.9389f, 5.0f)
                lineTo(18.9995f, 10.0607f)
                close()
                moveTo(15.8911f, 3.0476f)
                curveTo(17.2885f, 1.65f, 19.5543f, 1.6499f, 20.9519f, 3.0475f)
                curveTo(22.3493f, 4.4448f, 22.3493f, 6.7105f, 20.952f, 8.108f)
                lineTo(20.0601f, 9.0f)
                lineTo(14.9995f, 3.9393f)
                lineTo(15.8911f, 3.0476f)
                close()
            }
        }
        .build()
        return _editOff!!
    }

private var _editOff: ImageVector? = null
