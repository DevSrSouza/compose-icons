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

public val BrandsGroup.Adn: ImageVector
    get() {
        if (_adn != null) {
            return _adn!!
        }
        _adn = Builder(name = "Adn", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 167.5f)
                lineToRelative(64.9f, 98.8f)
                lineTo(183.1f, 266.3f)
                lineToRelative(64.9f, -98.8f)
                close()
                moveTo(496.0f, 256.0f)
                curveToRelative(0.0f, 136.9f, -111.1f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(0.0f, 392.9f, 0.0f, 256.0f)
                reflectiveCurveTo(111.1f, 8.0f, 248.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.1f, 248.0f, 248.0f)
                close()
                moveTo(396.2f, 338.7f)
                lineTo(248.0f, 115.5f)
                lineTo(99.8f, 338.7f)
                horizontalLineToRelative(30.4f)
                lineToRelative(33.6f, -51.7f)
                horizontalLineToRelative(168.6f)
                lineToRelative(33.6f, 51.7f)
                horizontalLineToRelative(30.2f)
                close()
            }
        }
        .build()
        return _adn!!
    }

private var _adn: ImageVector? = null
