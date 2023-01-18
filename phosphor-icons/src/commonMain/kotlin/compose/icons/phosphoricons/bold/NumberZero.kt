package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.8f, 50.3f)
                curveTo(177.6f, 25.2f, 155.2f, 12.0f, 128.0f, 12.0f)
                reflectiveCurveTo(78.4f, 25.2f, 63.2f, 50.3f)
                curveTo(50.8f, 70.7f, 44.0f, 98.3f, 44.0f, 128.0f)
                reflectiveCurveToRelative(6.8f, 57.3f, 19.2f, 77.7f)
                curveTo(78.4f, 230.8f, 100.8f, 244.0f, 128.0f, 244.0f)
                reflectiveCurveToRelative(49.6f, -13.2f, 64.8f, -38.3f)
                curveToRelative(12.4f, -20.4f, 19.2f, -48.0f, 19.2f, -77.7f)
                reflectiveCurveTo(205.2f, 70.7f, 192.8f, 50.3f)
                close()
                moveTo(128.0f, 220.0f)
                curveToRelative(-41.4f, 0.0f, -60.0f, -46.2f, -60.0f, -92.0f)
                reflectiveCurveToRelative(18.6f, -92.0f, 60.0f, -92.0f)
                reflectiveCurveToRelative(60.0f, 46.2f, 60.0f, 92.0f)
                reflectiveCurveTo(169.4f, 220.0f, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
