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

public val RegularGroup.RibbonOff: ImageVector
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
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                lineTo(21.7801f, 20.7198f)
                curveTo(22.073f, 21.0127f, 22.073f, 21.4876f, 21.7801f, 21.7805f)
                curveTo(21.4872f, 22.0734f, 21.0123f, 22.0734f, 20.7194f, 21.7805f)
                lineTo(16.9998f, 18.0608f)
                lineTo(16.9992f, 21.2502f)
                curveTo(16.9992f, 21.8221f, 16.3926f, 22.1706f, 15.907f, 21.918f)
                lineTo(15.8175f, 21.8635f)
                lineTo(11.9991f, 19.1757f)
                lineTo(8.1826f, 21.8634f)
                curveTo(7.715f, 22.1927f, 7.0807f, 21.8973f, 7.0077f, 21.3547f)
                lineTo(7.0008f, 21.2502f)
                lineTo(6.9994f, 13.8983f)
                curveTo(5.7626f, 12.6359f, 5.0f, 10.907f, 5.0f, 9.0f)
                curveTo(5.0f, 8.1248f, 5.1606f, 7.2871f, 5.454f, 6.5147f)
                close()
                moveTo(15.4993f, 16.5603f)
                lineTo(14.4851f, 15.546f)
                curveTo(13.7128f, 15.8394f, 12.8752f, 16.0f, 12.0f, 16.0f)
                curveTo(10.7252f, 16.0f, 9.5301f, 15.6592f, 8.5006f, 15.0639f)
                lineTo(8.5008f, 19.8047f)
                lineTo(11.5671f, 17.6453f)
                curveTo(11.7937f, 17.4857f, 12.0866f, 17.4657f, 12.3298f, 17.5853f)
                lineTo(12.4306f, 17.6452f)
                lineTo(15.4992f, 19.8051f)
                lineTo(15.4993f, 16.5603f)
                close()
                moveTo(13.2876f, 14.3485f)
                lineTo(6.6516f, 7.7123f)
                curveTo(6.5525f, 8.1254f, 6.5f, 8.5566f, 6.5f, 9.0f)
                curveTo(6.5f, 12.0376f, 8.9624f, 14.5f, 12.0f, 14.5f)
                curveTo(12.4434f, 14.5f, 12.8746f, 14.4475f, 13.2876f, 14.3485f)
                close()
                moveTo(17.5f, 9.0f)
                curveTo(17.5f, 10.4726f, 16.9213f, 11.8099f, 15.9789f, 12.7971f)
                lineTo(17.0398f, 13.858f)
                curveTo(18.2535f, 12.5992f, 19.0f, 10.8868f, 19.0f, 9.0f)
                curveTo(19.0f, 5.134f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1133f, 2.0f, 8.4009f, 2.7464f, 7.1421f, 3.9601f)
                lineTo(8.2029f, 5.021f)
                curveTo(9.1901f, 4.0787f, 10.5275f, 3.5f, 12.0f, 3.5f)
                curveTo(15.0376f, 3.5f, 17.5f, 5.9624f, 17.5f, 9.0f)
                close()
            }
        }
        .build()
        return _ribbonOff!!
    }

private var _ribbonOff: ImageVector? = null
