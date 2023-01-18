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

public val FilledGroup.PhotoFilter: ImageVector
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
                moveTo(16.9984f, 9.5989f)
                lineTo(17.0f, 9.5f)
                curveTo(17.0f, 13.6089f, 13.6958f, 16.9461f, 9.5995f, 16.9994f)
                curveTo(10.5089f, 18.7801f, 12.362f, 20.0f, 14.5f, 20.0f)
                curveTo(17.5376f, 20.0f, 20.0f, 17.5376f, 20.0f, 14.5f)
                curveTo(20.0f, 12.362f, 18.7801f, 10.5089f, 16.9984f, 9.5989f)
                close()
                moveTo(9.5f, 4.0f)
                curveTo(6.4624f, 4.0f, 4.0f, 6.4624f, 4.0f, 9.5f)
                curveTo(4.0f, 11.638f, 5.2199f, 13.4911f, 7.0016f, 14.4011f)
                lineTo(7.0f, 14.5f)
                curveTo(7.0f, 10.3913f, 10.3039f, 7.0542f, 14.3999f, 7.0006f)
                curveTo(13.4911f, 5.2199f, 11.638f, 4.0f, 9.5f, 4.0f)
                close()
            }
        }
        .build()
        return _photoFilter!!
    }

private var _photoFilter: ImageVector? = null
