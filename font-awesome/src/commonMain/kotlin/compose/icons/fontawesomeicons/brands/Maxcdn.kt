package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Maxcdn: ImageVector
    get() {
        if (_maxcdn != null) {
            return _maxcdn!!
        }
        _maxcdn = Builder(name = "Maxcdn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(461.1f, 442.7f)
                horizontalLineToRelative(-97.4f)
                lineTo(415.6f, 200.0f)
                curveToRelative(2.3f, -10.2f, 0.9f, -19.5f, -4.4f, -25.7f)
                curveToRelative(-5.0f, -6.1f, -13.7f, -9.6f, -24.2f, -9.6f)
                horizontalLineToRelative(-49.3f)
                lineToRelative(-59.5f, 278.0f)
                horizontalLineToRelative(-97.4f)
                lineToRelative(59.5f, -278.0f)
                horizontalLineToRelative(-83.4f)
                lineToRelative(-59.5f, 278.0f)
                horizontalLineTo(0.0f)
                lineToRelative(59.5f, -278.0f)
                lineToRelative(-44.6f, -95.4f)
                horizontalLineTo(387.0f)
                curveToRelative(39.4f, 0.0f, 75.3f, 16.3f, 98.3f, 44.9f)
                curveToRelative(23.3f, 28.6f, 31.8f, 67.4f, 23.6f, 105.9f)
                lineToRelative(-47.8f, 222.6f)
                close()
            }
        }
        .build()
        return _maxcdn!!
    }

private var _maxcdn: ImageVector? = null
