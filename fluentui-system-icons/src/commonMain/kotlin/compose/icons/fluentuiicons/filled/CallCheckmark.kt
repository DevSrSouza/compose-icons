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

public val FilledGroup.CallCheckmark: ImageVector
    get() {
        if (_callCheckmark != null) {
            return _callCheckmark!!
        }
        _callCheckmark = Builder(name = "CallCheckmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7802f, 3.2803f)
                curveTo(22.0731f, 2.9874f, 22.0731f, 2.5126f, 21.7802f, 2.2197f)
                curveTo(21.4873f, 1.9268f, 21.0124f, 1.9268f, 20.7195f, 2.2197f)
                lineTo(14.9999f, 7.9393f)
                lineTo(13.1303f, 6.0697f)
                curveTo(12.8374f, 5.7768f, 12.3625f, 5.7768f, 12.0696f, 6.0697f)
                curveTo(11.7767f, 6.3626f, 11.7767f, 6.8374f, 12.0696f, 7.1303f)
                lineTo(14.4696f, 9.5303f)
                curveTo(14.6103f, 9.671f, 14.801f, 9.75f, 14.9999f, 9.75f)
                curveTo(15.1989f, 9.75f, 15.3896f, 9.671f, 15.5303f, 9.5303f)
                lineTo(21.7802f, 3.2803f)
                close()
                moveTo(6.8482f, 2.0952f)
                lineTo(5.7716f, 2.4392f)
                curveTo(4.7041f, 2.7803f, 3.8866f, 3.6948f, 3.6226f, 4.8431f)
                curveTo(2.9952f, 7.5721f, 3.748f, 10.8947f, 5.8808f, 14.8109f)
                curveTo(8.0106f, 18.7214f, 10.3449f, 21.0726f, 12.8838f, 21.8645f)
                curveTo(13.9592f, 22.2f, 15.1217f, 21.9036f, 15.9356f, 21.0865f)
                lineTo(16.7534f, 20.2655f)
                curveTo(17.5164f, 19.4995f, 17.627f, 18.2532f, 17.0121f, 17.3498f)
                lineTo(15.7797f, 15.5392f)
                curveTo(15.2507f, 14.762f, 14.3115f, 14.4315f, 13.4491f, 14.7191f)
                lineTo(11.1739f, 15.4778f)
                curveTo(10.266f, 14.7907f, 9.509f, 13.9259f, 8.9029f, 12.8834f)
                curveTo(8.2967f, 11.8409f, 7.9352f, 10.7819f, 7.8183f, 9.7064f)
                lineTo(9.7126f, 7.9084f)
                curveTo(10.3934f, 7.2623f, 10.6013f, 6.2234f, 10.2266f, 5.3399f)
                lineTo(9.3669f, 3.3126f)
                curveTo(8.9349f, 2.2938f, 7.857f, 1.7729f, 6.8482f, 2.0952f)
                close()
            }
        }
        .build()
        return _callCheckmark!!
    }

private var _callCheckmark: ImageVector? = null
