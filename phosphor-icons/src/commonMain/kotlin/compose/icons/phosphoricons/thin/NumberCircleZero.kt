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

public val ThinGroup.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) {
            return _numberCircleZero!!
        }
        _numberCircleZero = Builder(name = "NumberCircleZero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                curveToRelative(-11.6f, 0.0f, -21.2f, 5.9f, -27.7f, 17.0f)
                curveToRelative(-5.4f, 9.2f, -8.3f, 21.6f, -8.3f, 35.0f)
                reflectiveCurveToRelative(2.9f, 25.8f, 8.3f, 35.0f)
                curveToRelative(6.5f, 11.1f, 16.1f, 17.0f, 27.7f, 17.0f)
                reflectiveCurveToRelative(21.2f, -5.9f, 27.7f, -17.0f)
                curveToRelative(5.4f, -9.2f, 8.3f, -21.6f, 8.3f, -35.0f)
                reflectiveCurveToRelative(-2.9f, -25.8f, -8.3f, -35.0f)
                curveTo(149.2f, 81.9f, 139.6f, 76.0f, 128.0f, 76.0f)
                close()
                moveTo(128.0f, 172.0f)
                curveToRelative(-19.3f, 0.0f, -28.0f, -22.1f, -28.0f, -44.0f)
                reflectiveCurveToRelative(8.7f, -44.0f, 28.0f, -44.0f)
                reflectiveCurveToRelative(28.0f, 22.1f, 28.0f, 44.0f)
                reflectiveCurveTo(147.3f, 172.0f, 128.0f, 172.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null