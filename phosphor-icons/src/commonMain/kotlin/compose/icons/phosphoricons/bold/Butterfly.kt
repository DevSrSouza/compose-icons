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

public val BoldGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.6f, 47.9f)
                curveTo(230.3f, 42.5f, 222.3f, 36.0f, 208.0f, 36.0f)
                curveToRelative(-17.7f, 0.0f, -40.2f, 11.8f, -60.0f, 31.5f)
                curveToRelative(-2.9f, 2.8f, -5.5f, 5.6f, -8.0f, 8.5f)
                lineTo(140.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 76.0f)
                curveToRelative(-2.5f, -2.9f, -5.1f, -5.7f, -8.0f, -8.5f)
                curveTo(88.2f, 47.8f, 65.7f, 36.0f, 48.0f, 36.0f)
                curveToRelative(-14.3f, 0.0f, -22.3f, 6.5f, -26.6f, 11.9f)
                curveToRelative(-13.2f, 16.9f, -8.3f, 46.0f, -1.0f, 75.0f)
                curveToRelative(5.5f, 22.2f, 17.0f, 32.7f, 27.8f, 37.5f)
                arcTo(47.5f, 47.5f, 0.0f, false, false, 44.0f, 180.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 84.0f, 31.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 79.8f, -51.3f)
                curveToRelative(10.8f, -4.8f, 22.3f, -15.3f, 27.8f, -37.5f)
                curveTo(242.9f, 93.9f, 247.8f, 64.8f, 234.6f, 47.9f)
                close()
                moveTo(92.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -2.7f, -47.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.6f, -13.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.2f, -10.6f)
                arcToRelative(46.9f, 46.9f, 0.0f, false, false, -21.8f, 8.1f)
                curveToRelative(-7.8f, -0.7f, -16.8f, -5.7f, -21.3f, -23.3f)
                curveToRelative(-7.3f, -29.5f, -8.4f, -47.8f, -3.2f, -54.4f)
                curveToRelative(0.6f, -0.8f, 2.0f, -2.7f, 7.6f, -2.7f)
                curveToRelative(11.0f, 0.0f, 28.4f, 9.9f, 43.1f, 24.5f)
                reflectiveCurveTo(116.0f, 116.6f, 116.0f, 128.0f)
                verticalLineToRelative(52.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 92.0f, 204.0f)
                close()
                moveTo(212.4f, 117.1f)
                curveToRelative(-4.5f, 17.6f, -13.5f, 22.6f, -21.3f, 23.3f)
                arcToRelative(46.9f, 46.9f, 0.0f, false, false, -21.8f, -8.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -2.6f, 23.8f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 140.0f, 180.0f)
                lineTo(140.0f, 128.0f)
                curveToRelative(0.0f, -11.4f, 9.8f, -28.5f, 24.9f, -43.5f)
                reflectiveCurveTo(197.0f, 60.0f, 208.0f, 60.0f)
                curveToRelative(5.6f, 0.0f, 7.0f, 1.9f, 7.6f, 2.7f)
                curveTo(220.8f, 69.3f, 219.7f, 87.6f, 212.4f, 117.1f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
