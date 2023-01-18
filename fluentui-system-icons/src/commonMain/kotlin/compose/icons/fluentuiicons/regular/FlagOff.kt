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

public val RegularGroup.FlagOff: ImageVector
    get() {
        if (_flagOff != null) {
            return _flagOff!!
        }
        _flagOff = Builder(name = "FlagOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5001f, 2.5009f)
                lineTo(20.5001f, 20.5009f)
                curveTo(20.793f, 20.7938f, 20.793f, 21.2687f, 20.5001f, 21.5616f)
                curveTo(20.2072f, 21.8545f, 19.7323f, 21.8545f, 19.4394f, 21.5616f)
                lineTo(14.3767f, 16.4992f)
                lineTo(4.5001f, 16.5005f)
                verticalLineTo(21.2503f)
                curveTo(4.5001f, 21.63f, 4.2179f, 21.9438f, 3.8518f, 21.9935f)
                lineTo(3.7501f, 22.0003f)
                curveTo(3.3704f, 22.0003f, 3.0566f, 21.7182f, 3.0069f, 21.3521f)
                lineTo(3.0001f, 21.2503f)
                lineTo(2.9997f, 5.1223f)
                lineTo(1.4394f, 3.5616f)
                curveTo(1.1465f, 3.2687f, 1.1465f, 2.7938f, 1.4394f, 2.5009f)
                curveTo(1.7323f, 2.208f, 2.2072f, 2.208f, 2.5001f, 2.5009f)
                close()
                moveTo(5.1171f, 2.9979f)
                lineTo(20.2542f, 2.9985f)
                curveTo(20.8722f, 2.9985f, 21.225f, 3.7041f, 20.8541f, 4.1985f)
                lineTo(16.6898f, 9.7497f)
                lineTo(20.8541f, 15.3009f)
                curveTo(21.225f, 15.7953f, 20.8722f, 16.5009f, 20.2542f, 16.5009f)
                lineTo(18.6201f, 16.4999f)
                lineTo(17.1201f, 14.9999f)
                lineTo(18.754f, 15.0009f)
                lineTo(15.1523f, 10.1998f)
                curveTo(14.9522f, 9.9331f, 14.9522f, 9.5663f, 15.1523f, 9.2996f)
                lineTo(18.754f, 4.4985f)
                lineTo(6.6171f, 4.4979f)
                lineTo(5.1171f, 2.9979f)
                close()
                moveTo(4.4997f, 6.6223f)
                lineTo(4.5001f, 15.0009f)
                lineTo(12.8767f, 14.9993f)
                lineTo(4.4997f, 6.6223f)
                close()
            }
        }
        .build()
        return _flagOff!!
    }

private var _flagOff: ImageVector? = null
