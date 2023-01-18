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

public val FilledGroup.RibbonOff: ImageVector
    get() {
        if (_ribbonOff != null) {
            return _ribbonOff!!
        }
        _ribbonOff = Builder(name = "RibbonOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.454f, 6.5147f)
                curveTo(5.1606f, 7.2871f, 5.0f, 8.1248f, 5.0f, 9.0f)
                curveTo(5.0f, 12.866f, 8.134f, 16.0f, 12.0f, 16.0f)
                curveTo(12.8752f, 16.0f, 13.7128f, 15.8394f, 14.4851f, 15.546f)
                lineTo(15.2509f, 16.3119f)
                curveTo(14.2576f, 16.7542f, 13.1575f, 17.0f, 12.0f, 17.0f)
                curveTo(10.1084f, 17.0f, 8.3702f, 16.3435f, 7.0007f, 15.2459f)
                lineTo(7.0025f, 21.2451f)
                curveTo(7.0025f, 21.8529f, 7.6875f, 22.2082f, 8.1844f, 21.8583f)
                lineTo(12.0008f, 19.1706f)
                lineTo(15.8192f, 21.8584f)
                curveTo(16.3161f, 22.2082f, 17.0009f, 21.8528f, 17.0009f, 21.2451f)
                lineTo(17.0013f, 18.0622f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(5.454f, 6.5147f)
                close()
                moveTo(7.1421f, 3.9601f)
                lineTo(17.0398f, 13.858f)
                curveTo(18.2535f, 12.5992f, 19.0f, 10.8868f, 19.0f, 9.0f)
                curveTo(19.0f, 5.134f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1133f, 2.0f, 8.4009f, 2.7464f, 7.1421f, 3.9601f)
                close()
            }
        }
        .build()
        return _ribbonOff!!
    }

private var _ribbonOff: ImageVector? = null
