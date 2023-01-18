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

public val BoldGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 12.0f)
                curveTo(84.7f, 12.0f, 52.0f, 31.8f, 52.0f, 58.0f)
                lineTo(52.0f, 198.0f)
                curveToRelative(0.0f, 26.2f, 32.7f, 46.0f, 76.0f, 46.0f)
                reflectiveCurveToRelative(76.0f, -19.8f, 76.0f, -46.0f)
                lineTo(204.0f, 58.0f)
                curveTo(204.0f, 31.8f, 171.3f, 12.0f, 128.0f, 12.0f)
                close()
                moveTo(128.0f, 36.0f)
                curveToRelative(31.7f, 0.0f, 52.0f, 13.0f, 52.0f, 22.0f)
                reflectiveCurveToRelative(-20.3f, 22.0f, -52.0f, 22.0f)
                reflectiveCurveTo(76.0f, 67.0f, 76.0f, 58.0f)
                reflectiveCurveTo(96.3f, 36.0f, 128.0f, 36.0f)
                close()
                moveTo(128.0f, 220.0f)
                curveToRelative(-31.7f, 0.0f, -52.0f, -13.0f, -52.0f, -22.0f)
                lineTo(76.0f, 92.1f)
                curveToRelative(13.4f, 7.5f, 31.5f, 11.9f, 52.0f, 11.9f)
                reflectiveCurveToRelative(38.6f, -4.4f, 52.0f, -11.9f)
                lineTo(180.0f, 198.0f)
                curveTo(180.0f, 207.0f, 159.7f, 220.0f, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
