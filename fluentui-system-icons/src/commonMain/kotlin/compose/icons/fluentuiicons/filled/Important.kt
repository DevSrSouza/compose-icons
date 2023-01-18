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

public val FilledGroup.Important: ImageVector
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
                curveTo(14.6705f, 12.4413f, 15.8757f, 8.827f, 15.8757f, 5.8773f)
                curveTo(15.8757f, 3.737f, 14.1407f, 2.002f, 12.0004f, 2.002f)
                close()
                moveTo(12.0011f, 17.001f)
                curveTo(10.6198f, 17.001f, 9.5f, 18.1208f, 9.5f, 19.5021f)
                curveTo(9.5f, 20.8834f, 10.6198f, 22.0032f, 12.0011f, 22.0032f)
                curveTo(13.3825f, 22.0032f, 14.5022f, 20.8834f, 14.5022f, 19.5021f)
                curveTo(14.5022f, 18.1208f, 13.3825f, 17.001f, 12.0011f, 17.001f)
                close()
            }
        }
        .build()
        return _important!!
    }

private var _important: ImageVector? = null
