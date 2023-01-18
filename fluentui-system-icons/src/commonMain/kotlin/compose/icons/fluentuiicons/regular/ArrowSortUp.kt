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

public val RegularGroup.ArrowSortUp: ImageVector
    get() {
        if (_arrowSortUp != null) {
            return _arrowSortUp!!
        }
        _arrowSortUp = Builder(name = "ArrowSortUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7196f, 8.7147f)
                lineTo(11.2144f, 4.2197f)
                curveTo(11.4805f, 3.9536f, 11.8968f, 3.9292f, 12.1904f, 4.1466f)
                lineTo(12.2745f, 4.2191f)
                lineTo(16.7794f, 8.7142f)
                curveTo(17.0726f, 9.0067f, 17.0731f, 9.4816f, 16.7805f, 9.7748f)
                curveTo(16.5145f, 10.0414f, 16.0979f, 10.066f, 15.8041f, 9.8485f)
                lineTo(15.7199f, 9.776f)
                lineTo(12.497f, 6.5591f)
                lineTo(12.4977f, 19.2549f)
                curveTo(12.4977f, 19.6346f, 12.2155f, 19.9484f, 11.8494f, 19.9981f)
                lineTo(11.7477f, 20.0049f)
                curveTo(11.368f, 20.0049f, 11.0542f, 19.7228f, 11.0045f, 19.3567f)
                lineTo(10.9977f, 19.2549f)
                lineTo(10.997f, 6.5571f)
                lineTo(7.7804f, 9.7754f)
                curveTo(7.5141f, 10.0416f, 7.0974f, 10.0659f, 6.8038f, 9.848f)
                lineTo(6.7197f, 9.7754f)
                curveTo(6.4534f, 9.5091f, 6.4292f, 9.0925f, 6.647f, 8.7989f)
                lineTo(6.7196f, 8.7147f)
                lineTo(11.2144f, 4.2197f)
                lineTo(6.7196f, 8.7147f)
                close()
            }
        }
        .build()
        return _arrowSortUp!!
    }

private var _arrowSortUp: ImageVector? = null
