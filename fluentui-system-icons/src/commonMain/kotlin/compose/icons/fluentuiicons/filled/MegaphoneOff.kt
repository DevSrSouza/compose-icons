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

public val FilledGroup.MegaphoneOff: ImageVector
    get() {
        if (_megaphoneOff != null) {
            return _megaphoneOff!!
        }
        _megaphoneOff = Builder(name = "MegaphoneOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(6.7255f, 7.7862f)
                lineTo(3.6091f, 8.7123f)
                curveTo(2.6546f, 8.9959f, 2.0f, 9.8733f, 2.0f, 10.8691f)
                verticalLineTo(13.131f)
                curveTo(2.0f, 14.1267f, 2.6545f, 15.004f, 3.6089f, 15.2877f)
                lineTo(5.999f, 15.9984f)
                lineTo(6.0f, 16.4992f)
                lineTo(6.0049f, 16.6988f)
                curveTo(6.1089f, 18.8152f, 7.8578f, 20.4992f, 10.0f, 20.4992f)
                curveTo(11.5584f, 20.4992f, 12.9378f, 19.6005f, 13.595f, 18.2555f)
                lineTo(18.7179f, 19.7789f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(7.499f, 16.4444f)
                lineTo(12.1238f, 17.8197f)
                curveTo(11.6783f, 18.535f, 10.8852f, 18.9992f, 10.0f, 18.9992f)
                curveTo(8.6193f, 18.9992f, 7.5f, 17.8799f, 7.5f, 16.4992f)
                lineTo(7.499f, 16.4444f)
                close()
                moveTo(22.0f, 17.7384f)
                curveTo(22.0f, 18.0564f, 21.934f, 18.3591f, 21.815f, 18.6333f)
                lineTo(9.9962f, 6.8143f)
                lineTo(19.1091f, 4.1062f)
                curveTo(20.3002f, 3.7522f, 21.5528f, 4.4309f, 21.9068f, 5.6221f)
                curveTo(21.9686f, 5.8301f, 22.0f, 6.046f, 22.0f, 6.263f)
                verticalLineTo(17.7384f)
                close()
            }
        }
        .build()
        return _megaphoneOff!!
    }

private var _megaphoneOff: ImageVector? = null
