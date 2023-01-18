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

public val RegularGroup.ArrowSort: ImageVector
    get() {
        if (_arrowSort != null) {
            return _arrowSort!!
        }
        _arrowSort = Builder(name = "ArrowSort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2509f, 4.0f)
                lineTo(17.1491f, 4.0068f)
                curveTo(16.783f, 4.0565f, 16.5009f, 4.3703f, 16.5009f, 4.75f)
                lineTo(16.5f, 17.442f)
                lineTo(13.2801f, 14.2244f)
                lineTo(13.196f, 14.1518f)
                curveTo(12.9023f, 13.9341f, 12.4856f, 13.9585f, 12.2194f, 14.2248f)
                curveTo(11.9267f, 14.5179f, 11.9269f, 14.9927f, 12.2199f, 15.2855f)
                lineTo(16.7237f, 19.7855f)
                lineTo(16.8078f, 19.8581f)
                curveTo(17.1015f, 20.0758f, 17.5182f, 20.0514f, 17.7843f, 19.7851f)
                lineTo(22.2806f, 15.2851f)
                lineTo(22.3531f, 15.2009f)
                curveTo(22.5709f, 14.9072f, 22.5465f, 14.4905f, 22.2801f, 14.2244f)
                lineTo(22.196f, 14.1518f)
                curveTo(21.9023f, 13.9341f, 21.4856f, 13.9585f, 21.2194f, 14.2248f)
                lineTo(18.0f, 17.446f)
                lineTo(18.0009f, 4.75f)
                lineTo(17.994f, 4.6482f)
                curveTo(17.9444f, 4.2821f, 17.6306f, 4.0f, 17.2509f, 4.0f)
                close()
                moveTo(6.2144f, 4.2197f)
                lineTo(1.7197f, 8.7147f)
                lineTo(1.647f, 8.7989f)
                curveTo(1.4292f, 9.0925f, 1.4534f, 9.5091f, 1.7197f, 9.7754f)
                lineTo(1.8038f, 9.848f)
                curveTo(2.0974f, 10.0659f, 2.5141f, 10.0416f, 2.7803f, 9.7754f)
                lineTo(5.997f, 6.5571f)
                lineTo(5.9977f, 19.2549f)
                lineTo(6.0045f, 19.3567f)
                curveTo(6.0542f, 19.7228f, 6.368f, 20.0049f, 6.7477f, 20.0049f)
                lineTo(6.8494f, 19.9981f)
                curveTo(7.2155f, 19.9484f, 7.4977f, 19.6346f, 7.4977f, 19.2549f)
                lineTo(7.497f, 6.5591f)
                lineTo(10.7199f, 9.776f)
                lineTo(10.8041f, 9.8485f)
                curveTo(11.0979f, 10.066f, 11.5145f, 10.0414f, 11.7805f, 9.7748f)
                curveTo(12.0731f, 9.4816f, 12.0726f, 9.0067f, 11.7794f, 8.7142f)
                lineTo(7.2745f, 4.2191f)
                lineTo(7.1904f, 4.1466f)
                curveTo(6.8968f, 3.9292f, 6.4805f, 3.9536f, 6.2144f, 4.2197f)
                close()
            }
        }
        .build()
        return _arrowSort!!
    }

private var _arrowSort: ImageVector? = null
