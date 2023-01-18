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

public val RegularGroup.ShieldTask: ImageVector
    get() {
        if (_shieldTask != null) {
            return _shieldTask!!
        }
        _shieldTask = Builder(name = "ShieldTask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7568f, 9.3029f)
                curveTo(17.0621f, 9.023f, 17.0828f, 8.5485f, 16.8029f, 8.2432f)
                curveTo(16.523f, 7.9379f, 16.0485f, 7.9173f, 15.7432f, 8.1971f)
                lineTo(10.2726f, 13.2119f)
                lineTo(8.2803f, 11.2197f)
                curveTo(7.9874f, 10.9268f, 7.5126f, 10.9268f, 7.2197f, 11.2197f)
                curveTo(6.9268f, 11.5126f, 6.9268f, 11.9874f, 7.2197f, 12.2803f)
                lineTo(9.7197f, 14.7803f)
                curveTo(10.0036f, 15.0643f, 10.4608f, 15.0742f, 10.7568f, 14.8029f)
                lineTo(16.7568f, 9.3029f)
                close()
                moveTo(20.25f, 5.0f)
                curveTo(17.5866f, 5.0f, 14.992f, 4.0565f, 12.45f, 2.15f)
                curveTo(12.1833f, 1.95f, 11.8167f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.0565f, 6.4134f, 5.0f, 3.75f, 5.0f)
                curveTo(3.3358f, 5.0f, 3.0f, 5.3358f, 3.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.0012f, 5.9576f, 19.6757f, 11.7251f, 21.9478f)
                curveTo(11.9018f, 22.0174f, 12.0982f, 22.0174f, 12.2749f, 21.9478f)
                curveTo(18.0424f, 19.6757f, 21.0f, 16.0012f, 21.0f, 11.0f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 5.3358f, 20.6642f, 5.0f, 20.25f, 5.0f)
                close()
                moveTo(4.5f, 6.4779f)
                curveTo(7.0774f, 6.3259f, 9.5808f, 5.3883f, 12.0f, 3.6778f)
                curveTo(14.4192f, 5.3883f, 16.9227f, 6.3259f, 19.5f, 6.4779f)
                verticalLineTo(11.0f)
                curveTo(19.5f, 15.2556f, 17.0466f, 18.3789f, 12.0f, 20.4419f)
                curveTo(6.9534f, 18.3789f, 4.5f, 15.2556f, 4.5f, 11.0f)
                verticalLineTo(6.4779f)
                close()
            }
        }
        .build()
        return _shieldTask!!
    }

private var _shieldTask: ImageVector? = null
