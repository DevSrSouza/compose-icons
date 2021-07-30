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

public val BrandsGroup.Servicestack: ImageVector
    get() {
        if (_servicestack != null) {
            return _servicestack!!
        }
        _servicestack = Builder(name = "Servicestack", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 216.0f)
                curveToRelative(81.7f, 10.2f, 273.7f, 102.3f, 304.0f, 232.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(99.5f, -8.1f, 184.5f, -137.0f, 88.0f, -232.0f)
                close()
                moveTo(120.0f, 64.0f)
                curveToRelative(32.3f, 35.6f, 47.7f, 83.9f, 46.4f, 133.6f)
                curveTo(249.3f, 231.3f, 373.7f, 321.3f, 400.0f, 448.0f)
                horizontalLineToRelative(96.0f)
                curveTo(455.3f, 231.9f, 222.8f, 79.5f, 120.0f, 64.0f)
                close()
            }
        }
        .build()
        return _servicestack!!
    }

private var _servicestack: ImageVector? = null
