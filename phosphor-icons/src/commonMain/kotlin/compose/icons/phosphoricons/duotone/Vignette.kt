package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Vignette: ImageVector
    get() {
        if (_vignette != null) {
            return _vignette!!
        }
        _vignette = Builder(name = "Vignette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(128.0f, 176.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -21.5f, -64.0f, -48.0f)
                reflectiveCurveToRelative(28.7f, -48.0f, 64.0f, -48.0f)
                reflectiveCurveToRelative(64.0f, 21.5f, 64.0f, 48.0f)
                reflectiveCurveTo(163.3f, 176.0f, 128.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                lineTo(216.0f, 200.0f)
                close()
                moveTo(178.1f, 87.7f)
                curveTo(164.6f, 77.6f, 146.8f, 72.0f, 128.0f, 72.0f)
                reflectiveCurveTo(91.4f, 77.6f, 77.9f, 87.7f)
                reflectiveCurveTo(56.0f, 112.6f, 56.0f, 128.0f)
                reflectiveCurveToRelative(7.8f, 29.7f, 21.9f, 40.3f)
                reflectiveCurveTo(109.2f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(36.6f, -5.6f, 50.1f, -15.7f)
                reflectiveCurveTo(200.0f, 143.4f, 200.0f, 128.0f)
                reflectiveCurveTo(192.2f, 98.3f, 178.1f, 87.7f)
                close()
                moveTo(128.0f, 168.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -17.9f, -56.0f, -40.0f)
                reflectiveCurveToRelative(25.1f, -40.0f, 56.0f, -40.0f)
                reflectiveCurveToRelative(56.0f, 17.9f, 56.0f, 40.0f)
                reflectiveCurveTo(158.9f, 168.0f, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return _vignette!!
    }

private var _vignette: ImageVector? = null
