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

public val RegularGroup.DoubleTapSwipeDown: ImageVector
    get() {
        if (_doubleTapSwipeDown != null) {
            return _doubleTapSwipeDown!!
        }
        _doubleTapSwipeDown = Builder(name = "DoubleTapSwipeDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5303f, 21.7803f)
                curveTo(12.2374f, 22.0732f, 11.7626f, 22.0732f, 11.4697f, 21.7803f)
                lineTo(7.9697f, 18.2803f)
                curveTo(7.6768f, 17.9874f, 7.6768f, 17.5126f, 7.9697f, 17.2197f)
                curveTo(8.2626f, 16.9268f, 8.7374f, 16.9268f, 9.0303f, 17.2197f)
                lineTo(11.25f, 19.4393f)
                verticalLineTo(8.75f)
                curveTo(11.25f, 8.3358f, 11.5858f, 8.0f, 12.0f, 8.0f)
                curveTo(12.4142f, 8.0f, 12.75f, 8.3358f, 12.75f, 8.75f)
                verticalLineTo(19.4393f)
                lineTo(14.9697f, 17.2197f)
                curveTo(15.2626f, 16.9268f, 15.7374f, 16.9268f, 16.0303f, 17.2197f)
                curveTo(16.3232f, 17.5126f, 16.3232f, 17.9874f, 16.0303f, 18.2803f)
                lineTo(12.5303f, 21.7803f)
                close()
                moveTo(5.0f, 9.0001f)
                curveTo(5.0f, 12.2618f, 7.2309f, 15.0025f, 10.25f, 15.7796f)
                verticalLineTo(14.2158f)
                curveTo(8.0704f, 13.4848f, 6.5f, 11.4259f, 6.5f, 9.0001f)
                curveTo(6.5f, 5.9625f, 8.9624f, 3.5001f, 12.0f, 3.5001f)
                curveTo(15.0376f, 3.5001f, 17.5f, 5.9625f, 17.5f, 9.0001f)
                curveTo(17.5f, 11.4259f, 15.9296f, 13.4848f, 13.75f, 14.2158f)
                verticalLineTo(15.7796f)
                curveTo(16.7691f, 15.0025f, 19.0f, 12.2618f, 19.0f, 9.0001f)
                curveTo(19.0f, 5.1341f, 15.866f, 2.0001f, 12.0f, 2.0001f)
                curveTo(8.134f, 2.0001f, 5.0f, 5.1341f, 5.0f, 9.0001f)
                close()
                moveTo(7.5f, 9.0001f)
                curveTo(7.5f, 10.8647f, 8.634f, 12.4644f, 10.25f, 13.1471f)
                verticalLineTo(11.4371f)
                curveTo(9.493f, 10.8925f, 9.0f, 10.0039f, 9.0f, 9.0001f)
                curveTo(9.0f, 7.3432f, 10.3431f, 6.0001f, 12.0f, 6.0001f)
                curveTo(13.6569f, 6.0001f, 15.0f, 7.3432f, 15.0f, 9.0001f)
                curveTo(15.0f, 10.0039f, 14.507f, 10.8925f, 13.75f, 11.4371f)
                verticalLineTo(13.1471f)
                curveTo(15.366f, 12.4644f, 16.5f, 10.8647f, 16.5f, 9.0001f)
                curveTo(16.5f, 6.5148f, 14.4853f, 4.5001f, 12.0f, 4.5001f)
                curveTo(9.5147f, 4.5001f, 7.5f, 6.5148f, 7.5f, 9.0001f)
                close()
            }
        }
        .build()
        return _doubleTapSwipeDown!!
    }

private var _doubleTapSwipeDown: ImageVector? = null
