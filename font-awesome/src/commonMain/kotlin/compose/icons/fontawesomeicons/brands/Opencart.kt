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

public val BrandsGroup.Opencart: ImageVector
    get() {
        if (_opencart != null) {
            return _opencart!!
        }
        _opencart = Builder(name = "Opencart", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(423.3f, 440.7f)
                curveToRelative(0.0f, 25.3f, -20.3f, 45.6f, -45.6f, 45.6f)
                reflectiveCurveToRelative(-45.8f, -20.3f, -45.8f, -45.6f)
                reflectiveCurveToRelative(20.6f, -45.8f, 45.8f, -45.8f)
                curveToRelative(25.4f, 0.0f, 45.6f, 20.5f, 45.6f, 45.8f)
                close()
                moveTo(169.4f, 394.9f)
                curveToRelative(-25.3f, 0.0f, -45.6f, 20.6f, -45.6f, 45.8f)
                reflectiveCurveToRelative(20.3f, 45.6f, 45.6f, 45.6f)
                reflectiveCurveToRelative(45.8f, -20.3f, 45.8f, -45.6f)
                reflectiveCurveToRelative(-20.5f, -45.8f, -45.8f, -45.8f)
                close()
                moveTo(461.1f, 124.9f)
                curveTo(158.9f, 124.9f, 81.9f, 112.1f, 0.0f, 25.7f)
                curveToRelative(34.4f, 51.7f, 53.3f, 148.9f, 373.1f, 144.2f)
                curveToRelative(333.3f, -5.0f, 130.0f, 86.1f, 70.8f, 188.9f)
                curveToRelative(186.7f, -166.7f, 319.4f, -233.9f, 17.2f, -233.9f)
                close()
            }
        }
        .build()
        return _opencart!!
    }

private var _opencart: ImageVector? = null
