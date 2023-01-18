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

public val BoldGroup.Vignette: ImageVector
    get() {
        if (_vignette != null) {
            return _vignette!!
        }
        _vignette = Builder(name = "Vignette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(81.4f, 166.0f)
                curveToRelative(12.6f, 9.0f, 29.2f, 14.0f, 46.6f, 14.0f)
                reflectiveCurveToRelative(34.0f, -5.0f, 46.6f, -14.0f)
                reflectiveCurveTo(196.0f, 142.5f, 196.0f, 128.0f)
                reflectiveCurveToRelative(-7.8f, -28.3f, -21.4f, -38.0f)
                reflectiveCurveTo(145.4f, 76.0f, 128.0f, 76.0f)
                reflectiveCurveTo(94.0f, 81.0f, 81.4f, 90.0f)
                reflectiveCurveTo(60.0f, 113.5f, 60.0f, 128.0f)
                reflectiveCurveTo(67.8f, 156.3f, 81.4f, 166.0f)
                close()
                moveTo(128.0f, 100.0f)
                curveToRelative(23.9f, 0.0f, 44.0f, 12.8f, 44.0f, 28.0f)
                reflectiveCurveToRelative(-20.1f, 28.0f, -44.0f, 28.0f)
                reflectiveCurveToRelative(-44.0f, -12.8f, -44.0f, -28.0f)
                reflectiveCurveTo(104.1f, 100.0f, 128.0f, 100.0f)
                close()
            }
        }
        .build()
        return _vignette!!
    }

private var _vignette: ImageVector? = null
