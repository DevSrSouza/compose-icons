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

public val LightGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.7f, 53.4f)
                curveTo(173.7f, 30.2f, 153.0f, 18.0f, 128.0f, 18.0f)
                reflectiveCurveTo(82.3f, 30.2f, 68.3f, 53.4f)
                curveTo(56.5f, 72.9f, 50.0f, 99.4f, 50.0f, 128.0f)
                reflectiveCurveToRelative(6.5f, 55.1f, 18.3f, 74.6f)
                curveTo(82.3f, 225.8f, 103.0f, 238.0f, 128.0f, 238.0f)
                reflectiveCurveToRelative(45.7f, -12.2f, 59.7f, -35.4f)
                curveToRelative(11.8f, -19.5f, 18.3f, -46.0f, 18.3f, -74.6f)
                reflectiveCurveTo(199.5f, 72.9f, 187.7f, 53.4f)
                close()
                moveTo(128.0f, 226.0f)
                curveToRelative(-45.6f, 0.0f, -66.0f, -49.2f, -66.0f, -98.0f)
                reflectiveCurveToRelative(20.4f, -98.0f, 66.0f, -98.0f)
                reflectiveCurveToRelative(66.0f, 49.2f, 66.0f, 98.0f)
                reflectiveCurveTo(173.6f, 226.0f, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
