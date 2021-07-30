package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MediaPodcast: ImageVector
    get() {
        if (_mediaPodcast != null) {
            return _mediaPodcast!!
        }
        _mediaPodcast = Builder(name = "MediaPodcast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6361f, 20.364f)
                curveTo(4.0074f, 18.7353f, 3.0f, 16.4853f, 3.0f, 14.0f)
                curveTo(3.0f, 9.0294f, 7.0294f, 5.0f, 12.0f, 5.0f)
                curveTo(16.9706f, 5.0f, 21.0f, 9.0294f, 21.0f, 14.0f)
                curveTo(21.0f, 16.4853f, 19.9926f, 18.7353f, 18.364f, 20.3639f)
                lineTo(19.7782f, 21.7782f)
                curveTo(21.7688f, 19.7875f, 23.0f, 17.0376f, 23.0f, 14.0f)
                curveTo(23.0f, 7.9249f, 18.0751f, 3.0f, 12.0f, 3.0f)
                curveTo(5.9249f, 3.0f, 1.0f, 7.9249f, 1.0f, 14.0f)
                curveTo(1.0f, 17.0376f, 2.2312f, 19.7876f, 4.2219f, 21.7782f)
                lineTo(5.6361f, 20.364f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9498f, 18.9497f)
                curveTo(18.2165f, 17.683f, 19.0f, 15.933f, 19.0f, 14.0f)
                curveTo(19.0f, 10.134f, 15.866f, 7.0f, 12.0f, 7.0f)
                curveTo(8.134f, 7.0f, 5.0f, 10.134f, 5.0f, 14.0f)
                curveTo(5.0f, 15.933f, 5.7835f, 17.6831f, 7.0503f, 18.9498f)
                lineTo(8.4645f, 17.5356f)
                curveTo(7.5597f, 16.6308f, 7.0f, 15.3807f, 7.0f, 14.0f)
                curveTo(7.0f, 11.2386f, 9.2386f, 9.0f, 12.0f, 9.0f)
                curveTo(14.7614f, 9.0f, 17.0f, 11.2386f, 17.0f, 14.0f)
                curveTo(17.0f, 15.3807f, 16.4404f, 16.6307f, 15.5356f, 17.5355f)
                lineTo(16.9498f, 18.9497f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1213f, 16.1213f)
                curveTo(14.6642f, 15.5784f, 15.0f, 14.8284f, 15.0f, 14.0f)
                curveTo(15.0f, 12.3431f, 13.6569f, 11.0f, 12.0f, 11.0f)
                curveTo(10.3431f, 11.0f, 9.0f, 12.3431f, 9.0f, 14.0f)
                curveTo(9.0f, 14.8285f, 9.3358f, 15.5785f, 9.8787f, 16.1214f)
                lineTo(11.293f, 14.7072f)
                curveTo(11.112f, 14.5262f, 11.0f, 14.2762f, 11.0f, 14.0f)
                curveTo(11.0f, 13.4477f, 11.4477f, 13.0f, 12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 13.4477f, 13.0f, 14.0f)
                curveTo(13.0f, 14.2761f, 12.8881f, 14.5261f, 12.7071f, 14.7071f)
                lineTo(14.1213f, 16.1213f)
                close()
            }
        }
        .build()
        return _mediaPodcast!!
    }

private var _mediaPodcast: ImageVector? = null
