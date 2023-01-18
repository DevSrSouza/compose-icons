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

public val ThinGroup.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) {
            return _stripeLogo!!
        }
        _stripeLogo = Builder(name = "StripeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.1f, 152.0f)
                curveToRelative(0.0f, 15.7f, -17.6f, 28.0f, -40.1f, 28.0f)
                reflectiveCurveToRelative(-40.1f, -12.3f, -40.1f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                curveToRelative(0.0f, 10.8f, 14.7f, 20.0f, 32.1f, 20.0f)
                reflectiveCurveToRelative(32.1f, -9.2f, 32.1f, -20.0f)
                curveToRelative(0.0f, -12.5f, -13.4f, -16.9f, -33.8f, -22.1f)
                curveToRelative(-17.9f, -4.5f, -36.4f, -9.3f, -36.4f, -25.9f)
                reflectiveCurveTo(106.3f, 76.0f, 128.0f, 76.0f)
                curveToRelative(15.7f, 0.0f, 29.2f, 6.4f, 35.0f, 16.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.5f, 5.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.4f, -1.5f)
                curveTo(151.6f, 88.8f, 140.9f, 84.0f, 128.0f, 84.0f)
                curveToRelative(-17.1f, 0.0f, -30.1f, 8.6f, -30.1f, 20.0f)
                curveToRelative(0.0f, 9.7f, 12.0f, 13.5f, 30.3f, 18.2f)
                reflectiveCurveTo(168.1f, 132.4f, 168.1f, 152.0f)
                close()
                moveTo(220.0f, 48.0f)
                lineTo(220.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 48.0f)
                close()
                moveTo(212.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
