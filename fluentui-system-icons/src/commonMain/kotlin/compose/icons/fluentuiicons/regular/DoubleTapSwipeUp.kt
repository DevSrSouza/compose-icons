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

public val RegularGroup.DoubleTapSwipeUp: ImageVector
    get() {
        if (_doubleTapSwipeUp != null) {
            return _doubleTapSwipeUp!!
        }
        _doubleTapSwipeUp = Builder(name = "DoubleTapSwipeUp", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5303f, 2.2197f)
                curveTo(12.2374f, 1.9268f, 11.7626f, 1.9268f, 11.4697f, 2.2197f)
                lineTo(7.9697f, 5.7197f)
                curveTo(7.6768f, 6.0126f, 7.6768f, 6.4874f, 7.9697f, 6.7803f)
                curveTo(8.2626f, 7.0732f, 8.7374f, 7.0732f, 9.0303f, 6.7803f)
                lineTo(11.25f, 4.5607f)
                verticalLineTo(15.25f)
                curveTo(11.25f, 15.6642f, 11.5858f, 16.0f, 12.0f, 16.0f)
                curveTo(12.4142f, 16.0f, 12.75f, 15.6642f, 12.75f, 15.25f)
                verticalLineTo(4.5607f)
                lineTo(14.9697f, 6.7803f)
                curveTo(15.2626f, 7.0732f, 15.7374f, 7.0732f, 16.0303f, 6.7803f)
                curveTo(16.3232f, 6.4874f, 16.3232f, 6.0126f, 16.0303f, 5.7197f)
                lineTo(12.5303f, 2.2197f)
                close()
                moveTo(5.0f, 14.9999f)
                curveTo(5.0f, 11.7382f, 7.2309f, 8.9975f, 10.25f, 8.2205f)
                verticalLineTo(9.7842f)
                curveTo(8.0704f, 10.5152f, 6.5f, 12.5742f, 6.5f, 14.9999f)
                curveTo(6.5f, 18.0375f, 8.9624f, 20.4999f, 12.0f, 20.4999f)
                curveTo(15.0376f, 20.4999f, 17.5f, 18.0375f, 17.5f, 14.9999f)
                curveTo(17.5f, 12.5742f, 15.9296f, 10.5152f, 13.75f, 9.7842f)
                verticalLineTo(8.2205f)
                curveTo(16.7691f, 8.9975f, 19.0f, 11.7382f, 19.0f, 14.9999f)
                curveTo(19.0f, 18.8659f, 15.866f, 21.9999f, 12.0f, 21.9999f)
                curveTo(8.134f, 21.9999f, 5.0f, 18.8659f, 5.0f, 14.9999f)
                close()
                moveTo(7.5f, 14.9999f)
                curveTo(7.5f, 13.1353f, 8.634f, 11.5356f, 10.25f, 10.8529f)
                verticalLineTo(12.5629f)
                curveTo(9.493f, 13.1075f, 9.0f, 13.9962f, 9.0f, 14.9999f)
                curveTo(9.0f, 16.6568f, 10.3431f, 17.9999f, 12.0f, 17.9999f)
                curveTo(13.6569f, 17.9999f, 15.0f, 16.6568f, 15.0f, 14.9999f)
                curveTo(15.0f, 13.9962f, 14.507f, 13.1075f, 13.75f, 12.5629f)
                verticalLineTo(10.8529f)
                curveTo(15.366f, 11.5356f, 16.5f, 13.1353f, 16.5f, 14.9999f)
                curveTo(16.5f, 17.4852f, 14.4853f, 19.4999f, 12.0f, 19.4999f)
                curveTo(9.5147f, 19.4999f, 7.5f, 17.4852f, 7.5f, 14.9999f)
                close()
            }
        }
        .build()
        return _doubleTapSwipeUp!!
    }

private var _doubleTapSwipeUp: ImageVector? = null
