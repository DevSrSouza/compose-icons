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

public val LightGroup.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) {
            return _stripeLogo!!
        }
        _stripeLogo = Builder(name = "StripeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.1f, 152.0f)
                curveToRelative(0.0f, 16.8f, -18.5f, 30.0f, -42.1f, 30.0f)
                reflectiveCurveToRelative(-42.1f, -13.2f, -42.1f, -30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(0.0f, 9.8f, 13.8f, 18.0f, 30.1f, 18.0f)
                reflectiveCurveToRelative(30.1f, -8.2f, 30.1f, -18.0f)
                reflectiveCurveToRelative(-12.8f, -15.1f, -32.3f, -20.1f)
                curveToRelative(-17.8f, -4.6f, -37.9f, -9.7f, -37.9f, -27.9f)
                reflectiveCurveTo(105.2f, 74.0f, 128.0f, 74.0f)
                curveToRelative(16.5f, 0.0f, 30.5f, 6.8f, 36.8f, 17.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.5f, 5.9f)
                curveTo(150.3f, 90.6f, 140.0f, 86.0f, 128.0f, 86.0f)
                curveToRelative(-15.7f, 0.0f, -28.1f, 7.9f, -28.1f, 18.0f)
                curveToRelative(0.0f, 8.3f, 11.4f, 11.8f, 28.8f, 16.2f)
                reflectiveCurveTo(170.1f, 130.8f, 170.1f, 152.0f)
                close()
                moveTo(222.0f, 48.0f)
                lineTo(222.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(34.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 34.0f)
                lineTo(208.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f)
                close()
                moveTo(210.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(46.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(208.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
