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

public val RegularGroup.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.75f)
                curveTo(8.0f, 2.3358f, 8.3358f, 2.0f, 8.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 2.0f, 11.0f, 2.3358f, 11.0f, 2.75f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.25f)
                curveTo(12.6642f, 3.0f, 13.0f, 3.3358f, 13.0f, 3.75f)
                verticalLineTo(5.5346f)
                curveTo(13.0085f, 5.5351f, 13.0169f, 5.5358f, 13.0254f, 5.5366f)
                curveTo(15.1369f, 5.7359f, 17.0905f, 6.7407f, 18.4806f, 8.3425f)
                curveTo(19.8707f, 9.9442f, 20.5906f, 12.0197f, 20.4909f, 14.1382f)
                curveTo(20.3911f, 16.2567f, 19.4793f, 18.2554f, 17.9447f, 19.7193f)
                curveTo(17.6458f, 20.0045f, 17.3277f, 20.2652f, 16.9935f, 20.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 20.5f, 21.0f, 20.8358f, 21.0f, 21.25f)
                curveTo(21.0f, 21.6642f, 20.6642f, 22.0f, 20.25f, 22.0f)
                horizontalLineTo(12.2792f)
                curveTo(12.2694f, 22.0f, 12.2597f, 22.0001f, 12.25f, 22.0001f)
                curveTo(12.247f, 22.0001f, 12.2441f, 22.0f, 12.2411f, 22.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 22.0f, 3.0f, 21.6642f, 3.0f, 21.25f)
                curveTo(3.0f, 20.8358f, 3.3358f, 20.5f, 3.75f, 20.5f)
                horizontalLineTo(12.2769f)
                curveTo(14.0024f, 20.4931f, 15.6603f, 19.8256f, 16.9093f, 18.634f)
                curveTo(18.1649f, 17.4362f, 18.9109f, 15.8009f, 18.9925f, 14.0676f)
                curveTo(19.0742f, 12.3343f, 18.4851f, 10.6361f, 17.3478f, 9.3257f)
                curveTo(16.2358f, 8.0444f, 14.6832f, 7.23f, 13.0f, 7.0419f)
                verticalLineTo(12.25f)
                curveTo(13.0f, 12.6642f, 12.6642f, 13.0f, 12.25f, 13.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(14.0f)
                curveTo(11.5f, 15.1046f, 10.6046f, 16.0f, 9.5f, 16.0f)
                curveTo(8.3954f, 16.0f, 7.5f, 15.1046f, 7.5f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 13.0f, 6.0f, 12.6642f, 6.0f, 12.25f)
                verticalLineTo(3.75f)
                curveTo(6.0f, 3.3358f, 6.3358f, 3.0f, 6.75f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.75f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 14.2761f, 9.2239f, 14.5f, 9.5f, 14.5f)
                curveTo(9.7761f, 14.5f, 10.0f, 14.2761f, 10.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(7.5f, 11.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(5.75f, 17.5f)
                curveTo(5.3358f, 17.5f, 5.0f, 17.8358f, 5.0f, 18.25f)
                curveTo(5.0f, 18.6642f, 5.3358f, 19.0f, 5.75f, 19.0f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 19.0f, 14.0f, 18.6642f, 14.0f, 18.25f)
                curveTo(14.0f, 17.8358f, 13.6642f, 17.5f, 13.25f, 17.5f)
                horizontalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _microscope!!
    }

private var _microscope: ImageVector? = null
