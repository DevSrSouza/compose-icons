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

public val FilledGroup.LiveOff: ImageVector
    get() {
        if (_liveOff != null) {
            return _liveOff!!
        }
        _liveOff = Builder(name = "LiveOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(4.4224f, 5.4831f)
                curveTo(1.0302f, 9.4128f, 1.1989f, 15.3549f, 4.9285f, 19.0845f)
                curveTo(5.319f, 19.475f, 5.9522f, 19.475f, 6.3427f, 19.0845f)
                curveTo(6.7332f, 18.6939f, 6.7332f, 18.0608f, 6.3427f, 17.6703f)
                curveTo(3.3946f, 14.7222f, 3.2275f, 10.0461f, 5.8415f, 6.9022f)
                lineTo(7.3619f, 8.4227f)
                curveTo(5.5994f, 10.743f, 5.7771f, 14.0666f, 7.8951f, 16.1846f)
                curveTo(8.2856f, 16.5751f, 8.9188f, 16.5751f, 9.3093f, 16.1846f)
                curveTo(9.6999f, 15.7941f, 9.6999f, 15.1609f, 9.3093f, 14.7704f)
                curveTo(7.9744f, 13.4355f, 7.8035f, 11.3774f, 8.7965f, 9.8573f)
                lineTo(10.6322f, 11.693f)
                curveTo(10.599f, 11.8169f, 10.5814f, 11.9471f, 10.5814f, 12.0815f)
                curveTo(10.5814f, 12.9099f, 11.253f, 13.5815f, 12.0814f, 13.5815f)
                curveTo(12.2157f, 13.5815f, 12.3459f, 13.5638f, 12.4698f, 13.5307f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(19.0278f, 15.8461f)
                lineTo(20.4894f, 17.3077f)
                curveTo(22.9034f, 13.4465f, 22.4317f, 8.2961f, 19.0742f, 4.9387f)
                curveTo(18.6837f, 4.5482f, 18.0506f, 4.5482f, 17.66f, 4.9387f)
                curveTo(17.2695f, 5.3292f, 17.2695f, 5.9624f, 17.66f, 6.3529f)
                curveTo(20.231f, 8.9239f, 20.687f, 12.809f, 19.0278f, 15.8461f)
                close()
                moveTo(15.9297f, 12.748f)
                lineTo(17.5209f, 14.3392f)
                curveTo(18.4501f, 12.1783f, 18.0323f, 9.5767f, 16.2676f, 7.8121f)
                curveTo(15.8771f, 7.4215f, 15.244f, 7.4215f, 14.8534f, 7.8121f)
                curveTo(14.4629f, 8.2026f, 14.4629f, 8.8357f, 14.8534f, 9.2263f)
                curveTo(15.8105f, 10.1834f, 16.1693f, 11.5122f, 15.9297f, 12.748f)
                close()
            }
        }
        .build()
        return _liveOff!!
    }

private var _liveOff: ImageVector? = null
