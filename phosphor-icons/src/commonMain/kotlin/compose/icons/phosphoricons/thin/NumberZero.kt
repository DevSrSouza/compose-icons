package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 54.4f)
                curveTo(172.3f, 31.9f, 152.3f, 20.0f, 128.0f, 20.0f)
                reflectiveCurveTo(83.7f, 31.9f, 70.0f, 54.4f)
                curveTo(58.4f, 73.6f, 52.0f, 99.7f, 52.0f, 128.0f)
                reflectiveCurveToRelative(6.4f, 54.4f, 18.0f, 73.6f)
                curveToRelative(13.7f, 22.5f, 33.7f, 34.4f, 58.0f, 34.4f)
                reflectiveCurveToRelative(44.3f, -11.9f, 58.0f, -34.4f)
                curveToRelative(11.6f, -19.2f, 18.0f, -45.3f, 18.0f, -73.6f)
                reflectiveCurveTo(197.6f, 73.6f, 186.0f, 54.4f)
                close()
                moveTo(128.0f, 228.0f)
                curveToRelative(-47.0f, 0.0f, -68.0f, -50.2f, -68.0f, -100.0f)
                reflectiveCurveTo(81.0f, 28.0f, 128.0f, 28.0f)
                reflectiveCurveToRelative(68.0f, 50.2f, 68.0f, 100.0f)
                reflectiveCurveTo(175.0f, 228.0f, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
