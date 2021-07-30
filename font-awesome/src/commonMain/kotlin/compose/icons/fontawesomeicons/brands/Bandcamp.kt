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

public val BrandsGroup.Bandcamp: ImageVector
    get() {
        if (_bandcamp != null) {
            return _bandcamp!!
        }
        _bandcamp = Builder(name = "Bandcamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 504.0f, 256.0f, 504.0f)
                reflectiveCurveTo(504.0f, 393.0f, 504.0f, 256.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(304.2f, 334.1f)
                horizontalLineToRelative(-181.0f)
                lineTo(207.9f, 178.0f)
                horizontalLineToRelative(181.0f)
                close()
            }
        }
        .build()
        return _bandcamp!!
    }

private var _bandcamp: ImageVector? = null
