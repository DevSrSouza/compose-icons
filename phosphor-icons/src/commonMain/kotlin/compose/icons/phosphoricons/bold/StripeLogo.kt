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

public val BoldGroup.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) {
            return _stripeLogo!!
        }
        _stripeLogo = Builder(name = "StripeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.1f, 152.0f)
                curveToRelative(0.0f, -6.7f, -11.6f, -10.2f, -27.8f, -14.3f)
                curveToRelative(-9.0f, -2.3f, -18.2f, -4.7f, -25.7f, -8.6f)
                curveToRelative(-13.8f, -7.3f, -16.7f, -17.7f, -16.7f, -25.1f)
                curveToRelative(0.0f, -20.5f, 19.8f, -36.0f, 46.1f, -36.0f)
                curveToRelative(18.6f, 0.0f, 34.7f, 7.9f, 42.0f, 20.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -4.5f, 16.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.4f, -4.5f)
                curveToRelative(-2.4f, -4.3f, -9.9f, -8.6f, -21.1f, -8.6f)
                reflectiveCurveToRelative(-22.1f, 4.8f, -22.1f, 12.0f)
                curveToRelative(0.0f, 4.2f, 15.2f, 8.1f, 24.3f, 10.4f)
                reflectiveCurveToRelative(19.8f, 5.1f, 28.1f, 9.7f)
                curveToRelative(14.7f, 8.1f, 17.8f, 19.7f, 17.8f, 27.9f)
                curveToRelative(0.0f, 20.2f, -21.1f, 36.0f, -48.1f, 36.0f)
                reflectiveCurveToRelative(-48.1f, -15.8f, -48.1f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                curveToRelative(0.0f, 2.2f, 2.0f, 4.8f, 5.2f, 7.0f)
                curveToRelative(4.8f, 3.2f, 11.7f, 5.0f, 18.9f, 5.0f)
                reflectiveCurveToRelative(14.1f, -1.8f, 18.9f, -5.0f)
                curveTo(150.1f, 156.8f, 152.1f, 154.2f, 152.1f, 152.0f)
                close()
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(208.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(204.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 204.0f)
                lineTo(204.0f, 204.0f)
                close()
            }
        }
        .build()
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
