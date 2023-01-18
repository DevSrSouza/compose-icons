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

public val RegularGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0028f, 3.748f)
                curveTo(17.0028f, 2.7815f, 16.2193f, 1.998f, 15.2528f, 1.998f)
                horizontalLineTo(8.75f)
                curveTo(7.7835f, 1.998f, 7.0f, 2.7815f, 7.0f, 3.748f)
                lineTo(7.0f, 5.7404f)
                lineTo(7.0f, 5.748f)
                lineTo(7.0f, 5.7556f)
                lineTo(7.0f, 8.742f)
                lineTo(7.0f, 8.7496f)
                lineTo(7.0f, 8.7572f)
                lineTo(7.0f, 11.9901f)
                lineTo(7.0f, 11.9977f)
                lineTo(7.0f, 12.0053f)
                lineTo(7.0f, 15.242f)
                curveTo(7.0f, 15.2446f, 7.0f, 15.2471f, 7.0f, 15.2496f)
                curveTo(7.0f, 15.2522f, 7.0f, 15.2547f, 7.0f, 15.2572f)
                lineTo(7.0f, 18.2421f)
                lineTo(7.0f, 18.2496f)
                lineTo(7.0f, 18.2572f)
                lineTo(7.0f, 20.2512f)
                curveTo(7.0f, 21.2177f, 7.7835f, 22.0012f, 8.75f, 22.0012f)
                horizontalLineTo(15.2528f)
                curveTo(16.2193f, 22.0012f, 17.0028f, 21.2177f, 17.0028f, 20.2512f)
                lineTo(17.0028f, 3.748f)
                close()
                moveTo(8.5f, 15.9996f)
                horizontalLineTo(12.2501f)
                curveTo(12.6643f, 15.9996f, 13.0001f, 15.6638f, 13.0001f, 15.2496f)
                curveTo(13.0001f, 14.8354f, 12.6643f, 14.4996f, 12.2501f, 14.4996f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 12.7477f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 12.7477f, 12.0f, 12.412f, 12.0f, 11.9977f)
                curveTo(12.0f, 11.5835f, 11.6642f, 11.2477f, 11.25f, 11.2477f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 9.4996f)
                horizontalLineTo(12.2501f)
                curveTo(12.6643f, 9.4996f, 13.0001f, 9.1638f, 13.0001f, 8.7496f)
                curveTo(13.0001f, 8.3354f, 12.6643f, 7.9996f, 12.2501f, 7.9996f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 6.498f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 6.498f, 12.0f, 6.1622f, 12.0f, 5.748f)
                curveTo(12.0f, 5.3338f, 11.6642f, 4.998f, 11.25f, 4.998f)
                horizontalLineTo(8.5f)
                verticalLineTo(3.748f)
                curveTo(8.5f, 3.61f, 8.612f, 3.498f, 8.75f, 3.498f)
                lineTo(15.2528f, 3.498f)
                curveTo(15.3909f, 3.498f, 15.5028f, 3.61f, 15.5028f, 3.748f)
                lineTo(15.5028f, 20.2512f)
                curveTo(15.5028f, 20.3893f, 15.3909f, 20.5012f, 15.2528f, 20.5012f)
                horizontalLineTo(8.75f)
                curveTo(8.612f, 20.5012f, 8.5f, 20.3893f, 8.5f, 20.2512f)
                lineTo(8.5f, 18.9996f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 18.9996f, 12.0f, 18.6638f, 12.0f, 18.2496f)
                curveTo(12.0f, 17.8354f, 11.6642f, 17.4996f, 11.25f, 17.4996f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 15.9996f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
