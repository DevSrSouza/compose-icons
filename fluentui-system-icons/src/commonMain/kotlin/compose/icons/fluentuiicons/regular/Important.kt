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

public val RegularGroup.Important: ImageVector
    get() {
        if (_important != null) {
            return _important!!
        }
        _important = Builder(name = "Important", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 2.002f)
                curveTo(9.8601f, 2.002f, 8.125f, 3.737f, 8.125f, 5.8773f)
                curveTo(8.125f, 8.7961f, 9.3324f, 12.4289f, 9.9378f, 14.0759f)
                curveTo(10.2606f, 14.9542f, 11.097f, 15.4995f, 12.0025f, 15.4995f)
                curveTo(12.9057f, 15.4995f, 13.7409f, 14.957f, 14.0646f, 14.0809f)
                curveTo(14.6705f, 12.4412f, 15.8757f, 8.827f, 15.8757f, 5.8773f)
                curveTo(15.8757f, 3.737f, 14.1407f, 2.002f, 12.0004f, 2.002f)
                close()
                moveTo(9.625f, 5.8773f)
                curveTo(9.625f, 4.5654f, 10.6885f, 3.502f, 12.0004f, 3.502f)
                curveTo(13.3122f, 3.502f, 14.3757f, 4.5654f, 14.3757f, 5.8773f)
                curveTo(14.3757f, 8.5315f, 13.2639f, 11.9202f, 12.6576f, 13.561f)
                curveTo(12.5621f, 13.8194f, 12.3089f, 13.9995f, 12.0025f, 13.9995f)
                curveTo(11.6954f, 13.9995f, 11.4412f, 13.8184f, 11.3457f, 13.5585f)
                curveTo(10.7387f, 11.9069f, 9.625f, 8.5006f, 9.625f, 5.8773f)
                close()
                moveTo(12.0011f, 17.001f)
                curveTo(10.6198f, 17.001f, 9.5f, 18.1208f, 9.5f, 19.5021f)
                curveTo(9.5f, 20.8834f, 10.6198f, 22.0032f, 12.0011f, 22.0032f)
                curveTo(13.3825f, 22.0032f, 14.5022f, 20.8834f, 14.5022f, 19.5021f)
                curveTo(14.5022f, 18.1208f, 13.3825f, 17.001f, 12.0011f, 17.001f)
                close()
                moveTo(11.0f, 19.5021f)
                curveTo(11.0f, 18.9492f, 11.4482f, 18.501f, 12.0011f, 18.501f)
                curveTo(12.554f, 18.501f, 13.0022f, 18.9492f, 13.0022f, 19.5021f)
                curveTo(13.0022f, 20.055f, 12.554f, 20.5032f, 12.0011f, 20.5032f)
                curveTo(11.4482f, 20.5032f, 11.0f, 20.055f, 11.0f, 19.5021f)
                close()
            }
        }
        .build()
        return _important!!
    }

private var _important: ImageVector? = null
