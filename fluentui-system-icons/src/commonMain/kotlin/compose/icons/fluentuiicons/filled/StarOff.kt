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

public val FilledGroup.StarOff: ImageVector
    get() {
        if (_starOff != null) {
            return _starOff!!
        }
        _starOff = Builder(name = "StarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(7.0241f, 8.0848f)
                lineTo(3.1593f, 8.6464f)
                curveTo(2.052f, 8.8073f, 1.6099f, 10.1681f, 2.4111f, 10.9491f)
                lineTo(6.2263f, 14.668f)
                lineTo(5.3257f, 19.9192f)
                curveTo(5.1365f, 21.0221f, 6.2941f, 21.8631f, 7.2845f, 21.3424f)
                lineTo(12.0004f, 18.8631f)
                lineTo(16.7163f, 21.3424f)
                curveTo(17.7067f, 21.8631f, 18.8642f, 21.0221f, 18.675f, 19.9192f)
                lineTo(18.6371f, 19.6981f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(21.5896f, 10.9491f)
                lineTo(17.8127f, 14.6307f)
                lineTo(9.3011f, 6.1189f)
                lineTo(10.7898f, 3.1025f)
                curveTo(11.285f, 2.0991f, 12.7158f, 2.0991f, 13.211f, 3.1025f)
                lineTo(15.5689f, 7.8802f)
                lineTo(20.8414f, 8.6464f)
                curveTo(21.9487f, 8.8073f, 22.3909f, 10.168f, 21.5896f, 10.9491f)
                close()
            }
        }
        .build()
        return _starOff!!
    }

private var _starOff: ImageVector? = null
