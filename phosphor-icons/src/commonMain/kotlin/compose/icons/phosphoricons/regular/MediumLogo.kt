package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) {
            return _mediumLogo!!
        }
        _mediumLogo = Builder(name = "MediumLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 60.0f)
                curveTo(36.7f, 60.0f, 8.0f, 90.5f, 8.0f, 128.0f)
                reflectiveCurveToRelative(28.7f, 68.0f, 64.0f, 68.0f)
                reflectiveCurveToRelative(64.0f, -30.5f, 64.0f, -68.0f)
                reflectiveCurveTo(107.3f, 60.0f, 72.0f, 60.0f)
                close()
                moveTo(72.0f, 180.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -23.3f, -48.0f, -52.0f)
                reflectiveCurveTo(45.5f, 76.0f, 72.0f, 76.0f)
                reflectiveCurveToRelative(48.0f, 23.3f, 48.0f, 52.0f)
                reflectiveCurveTo(98.5f, 180.0f, 72.0f, 180.0f)
                close()
                moveTo(184.0f, 64.0f)
                curveToRelative(-5.7f, 0.0f, -16.4f, 2.8f, -24.3f, 21.3f)
                curveToRelative(-5.0f, 11.5f, -7.7f, 26.7f, -7.7f, 42.7f)
                reflectiveCurveToRelative(2.7f, 31.2f, 7.7f, 42.7f)
                curveToRelative(7.9f, 18.5f, 18.6f, 21.3f, 24.3f, 21.3f)
                reflectiveCurveToRelative(16.4f, -2.8f, 24.3f, -21.3f)
                curveToRelative(5.0f, -11.5f, 7.7f, -26.7f, 7.7f, -42.7f)
                reflectiveCurveToRelative(-2.7f, -31.2f, -7.7f, -42.7f)
                curveTo(200.4f, 66.8f, 189.7f, 64.0f, 184.0f, 64.0f)
                close()
                moveTo(184.0f, 176.0f)
                curveToRelative(-5.6f, 0.0f, -16.0f, -18.2f, -16.0f, -48.0f)
                reflectiveCurveToRelative(10.4f, -48.0f, 16.0f, -48.0f)
                reflectiveCurveToRelative(16.0f, 18.2f, 16.0f, 48.0f)
                reflectiveCurveTo(189.6f, 176.0f, 184.0f, 176.0f)
                close()
                moveTo(248.0f, 72.0f)
                lineTo(248.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(232.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
