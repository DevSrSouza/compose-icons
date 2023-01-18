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

public val FilledGroup.AlertOff: ImageVector
    get() {
        if (_alertOff != null) {
            return _alertOff!!
        }
        _alertOff = Builder(name = "AlertOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(5.2238f, 6.2846f)
                curveTo(4.7954f, 7.1849f, 4.541f, 8.1847f, 4.5045f, 9.2411f)
                lineTo(4.5001f, 9.491f)
                lineTo(4.5f, 13.5028f)
                lineTo(3.0851f, 16.6633f)
                curveTo(2.8707f, 17.1422f, 3.0852f, 17.7042f, 3.564f, 17.9186f)
                curveTo(3.6861f, 17.9733f, 3.8184f, 18.0015f, 3.9522f, 18.0015f)
                horizontalLineTo(16.9406f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(21.0016f, 17.0515f)
                curveTo(21.0016f, 17.2676f, 20.9295f, 17.4668f, 20.808f, 17.6264f)
                lineTo(7.0507f, 3.8688f)
                curveTo(8.3728f, 2.7071f, 10.1062f, 2.0039f, 12.0f, 2.0039f)
                curveTo(16.1421f, 2.0039f, 19.5f, 5.3618f, 19.5f, 9.5039f)
                verticalLineTo(13.5024f)
                lineTo(20.9183f, 16.6625f)
                curveTo(20.9732f, 16.7849f, 21.0016f, 16.9174f, 21.0016f, 17.0515f)
                close()
                moveTo(14.9583f, 19.003f)
                curveTo(14.7196f, 20.4211f, 13.486f, 21.5015f, 12.0f, 21.5015f)
                curveTo(10.514f, 21.5015f, 9.2804f, 20.4211f, 9.0417f, 19.003f)
                horizontalLineTo(14.9583f)
                close()
            }
        }
        .build()
        return _alertOff!!
    }

private var _alertOff: ImageVector? = null
