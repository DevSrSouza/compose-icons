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

public val RegularGroup.PhotoFilter: ImageVector
    get() {
        if (_photoFilter != null) {
            return _photoFilter!!
        }
        _photoFilter = Builder(name = "PhotoFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.0f)
                curveTo(12.8843f, 2.0f, 15.7451f, 4.2416f, 16.6786f, 7.3211f)
                curveTo(19.7584f, 8.2549f, 22.0f, 11.1157f, 22.0f, 14.5f)
                curveTo(22.0f, 18.6421f, 18.6421f, 22.0f, 14.5f, 22.0f)
                curveTo(11.1157f, 22.0f, 8.2549f, 19.7584f, 7.3214f, 16.6789f)
                curveTo(4.2416f, 15.7451f, 2.0f, 12.8843f, 2.0f, 9.5f)
                curveTo(2.0f, 5.3579f, 5.3579f, 2.0f, 9.5f, 2.0f)
                close()
                moveTo(16.9858f, 9.0375f)
                lineTo(16.9961f, 9.2573f)
                lineTo(17.0f, 9.5f)
                curveTo(17.0f, 13.6421f, 13.6421f, 17.0f, 9.5f, 17.0f)
                curveTo(9.345f, 17.0f, 9.191f, 16.9953f, 9.0384f, 16.986f)
                curveTo(9.9825f, 19.0589f, 12.0729f, 20.5f, 14.5f, 20.5f)
                curveTo(17.8137f, 20.5f, 20.5f, 17.8137f, 20.5f, 14.5f)
                curveTo(20.5f, 12.0729f, 19.0589f, 9.9825f, 16.9858f, 9.0375f)
                close()
                moveTo(9.5f, 3.5f)
                curveTo(6.1863f, 3.5f, 3.5f, 6.1863f, 3.5f, 9.5f)
                curveTo(3.5f, 11.9271f, 4.9411f, 14.0175f, 7.0142f, 14.9625f)
                lineTo(7.0038f, 14.7427f)
                lineTo(7.0f, 14.5f)
                curveTo(7.0f, 10.3579f, 10.3579f, 7.0f, 14.5f, 7.0f)
                curveTo(14.655f, 7.0f, 14.8089f, 7.0047f, 14.9616f, 7.014f)
                curveTo(14.0175f, 4.9411f, 11.9271f, 3.5f, 9.5f, 3.5f)
                close()
            }
        }
        .build()
        return _photoFilter!!
    }

private var _photoFilter: ImageVector? = null
