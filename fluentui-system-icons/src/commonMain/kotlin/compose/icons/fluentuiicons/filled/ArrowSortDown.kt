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

public val FilledGroup.ArrowSortDown: ImageVector
    get() {
        if (_arrowSortDown != null) {
            return _arrowSortDown!!
        }
        _arrowSortDown = Builder(name = "ArrowSortDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8834f, 4.0106f)
                lineTo(12.0f, 4.0039f)
                curveTo(12.5128f, 4.0039f, 12.9355f, 4.3899f, 12.9933f, 4.8873f)
                lineTo(13.0f, 5.0039f)
                lineTo(13.0f, 16.5877f)
                lineTo(15.2926f, 14.2939f)
                curveTo(15.6529f, 13.9333f, 16.2201f, 13.9053f, 16.6125f, 14.2101f)
                lineTo(16.7068f, 14.2933f)
                curveTo(17.0674f, 14.6536f, 17.0954f, 15.2208f, 16.7906f, 15.6132f)
                lineTo(16.7074f, 15.7075f)
                lineTo(12.7112f, 19.7075f)
                curveTo(12.3509f, 20.0681f, 11.7837f, 20.0961f, 11.3912f, 19.7913f)
                lineTo(11.297f, 19.7081f)
                lineTo(7.2932f, 15.7081f)
                curveTo(6.9025f, 15.3178f, 6.9022f, 14.6846f, 7.2926f, 14.2939f)
                curveTo(7.6529f, 13.9333f, 8.2201f, 13.9053f, 8.6125f, 14.2101f)
                lineTo(8.7068f, 14.2933f)
                lineTo(11.0f, 16.5837f)
                lineTo(11.0f, 5.0039f)
                curveTo(11.0f, 4.4911f, 11.386f, 4.0684f, 11.8834f, 4.0106f)
                lineTo(12.0f, 4.0039f)
                lineTo(11.8834f, 4.0106f)
                close()
            }
        }
        .build()
        return _arrowSortDown!!
    }

private var _arrowSortDown: ImageVector? = null
