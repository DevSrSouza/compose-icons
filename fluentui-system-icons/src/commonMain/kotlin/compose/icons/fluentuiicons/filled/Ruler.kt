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

public val FilledGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2528f, 1.998f)
                curveTo(16.2193f, 1.998f, 17.0028f, 2.7815f, 17.0028f, 3.748f)
                lineTo(17.0028f, 20.2512f)
                curveTo(17.0028f, 21.2177f, 16.2193f, 22.0012f, 15.2528f, 22.0012f)
                horizontalLineTo(8.75f)
                curveTo(7.7835f, 22.0012f, 7.0f, 21.2177f, 7.0f, 20.2512f)
                verticalLineTo(3.748f)
                curveTo(7.0f, 2.7815f, 7.7835f, 1.998f, 8.75f, 1.998f)
                horizontalLineTo(15.2528f)
                close()
                moveTo(12.2501f, 7.9996f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.4996f)
                horizontalLineTo(12.2501f)
                curveTo(12.6643f, 9.4996f, 13.0001f, 9.1638f, 13.0001f, 8.7496f)
                curveTo(13.0001f, 8.3354f, 12.6643f, 7.9996f, 12.2501f, 7.9996f)
                close()
                moveTo(10.327f, 11.2477f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 12.7477f)
                horizontalLineTo(10.327f)
                curveTo(10.7412f, 12.7477f, 11.077f, 12.412f, 11.077f, 11.9977f)
                curveTo(11.077f, 11.5835f, 10.7412f, 11.2477f, 10.327f, 11.2477f)
                close()
                moveTo(12.2501f, 14.4996f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.9996f)
                horizontalLineTo(12.2501f)
                curveTo(12.6643f, 15.9996f, 13.0001f, 15.6638f, 13.0001f, 15.2496f)
                curveTo(13.0001f, 14.8354f, 12.6643f, 14.4996f, 12.2501f, 14.4996f)
                close()
                moveTo(10.327f, 17.4996f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 18.9996f)
                horizontalLineTo(10.327f)
                curveTo(10.7412f, 18.9996f, 11.077f, 18.6638f, 11.077f, 18.2496f)
                curveTo(11.077f, 17.8354f, 10.7412f, 17.4996f, 10.327f, 17.4996f)
                close()
                moveTo(10.327f, 4.998f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.498f)
                horizontalLineTo(10.327f)
                curveTo(10.7412f, 6.498f, 11.077f, 6.1622f, 11.077f, 5.748f)
                curveTo(11.077f, 5.3338f, 10.7412f, 4.998f, 10.327f, 4.998f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
