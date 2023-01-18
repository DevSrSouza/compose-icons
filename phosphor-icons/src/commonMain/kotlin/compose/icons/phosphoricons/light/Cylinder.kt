package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 18.0f)
                curveTo(88.7f, 18.0f, 58.0f, 35.6f, 58.0f, 58.0f)
                lineTo(58.0f, 198.0f)
                curveToRelative(0.0f, 22.4f, 30.7f, 40.0f, 70.0f, 40.0f)
                reflectiveCurveToRelative(70.0f, -17.6f, 70.0f, -40.0f)
                lineTo(198.0f, 58.0f)
                curveTo(198.0f, 35.6f, 167.3f, 18.0f, 128.0f, 18.0f)
                close()
                moveTo(85.6f, 39.3f)
                curveToRelative(11.2f, -6.0f, 26.3f, -9.3f, 42.4f, -9.3f)
                reflectiveCurveToRelative(31.2f, 3.3f, 42.4f, 9.3f)
                reflectiveCurveTo(186.0f, 51.3f, 186.0f, 58.0f)
                reflectiveCurveToRelative(-5.7f, 13.5f, -15.6f, 18.7f)
                reflectiveCurveTo(144.1f, 86.0f, 128.0f, 86.0f)
                reflectiveCurveToRelative(-31.2f, -3.3f, -42.4f, -9.3f)
                reflectiveCurveTo(70.0f, 64.7f, 70.0f, 58.0f)
                reflectiveCurveTo(75.7f, 44.5f, 85.6f, 39.3f)
                close()
                moveTo(170.4f, 216.7f)
                curveToRelative(-11.2f, 6.0f, -26.3f, 9.3f, -42.4f, 9.3f)
                reflectiveCurveToRelative(-31.2f, -3.3f, -42.4f, -9.3f)
                reflectiveCurveTo(70.0f, 204.7f, 70.0f, 198.0f)
                lineTo(70.0f, 80.7f)
                curveTo(82.5f, 91.2f, 103.6f, 98.0f, 128.0f, 98.0f)
                reflectiveCurveToRelative(45.5f, -6.8f, 58.0f, -17.3f)
                lineTo(186.0f, 198.0f)
                curveTo(186.0f, 204.7f, 180.3f, 211.5f, 170.4f, 216.7f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
