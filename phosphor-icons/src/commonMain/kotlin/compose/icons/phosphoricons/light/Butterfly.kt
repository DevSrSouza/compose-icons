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

public val LightGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.8f, 51.6f)
                curveTo(224.9f, 45.2f, 217.5f, 42.0f, 208.0f, 42.0f)
                curveToRelative(-16.2f, 0.0f, -37.0f, 11.1f, -55.8f, 29.7f)
                arcTo(133.5f, 133.5f, 0.0f, false, false, 134.0f, 93.9f)
                lineTo(134.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 93.9f)
                arcToRelative(133.5f, 133.5f, 0.0f, false, false, -18.2f, -22.2f)
                curveTo(85.0f, 53.1f, 64.2f, 42.0f, 48.0f, 42.0f)
                curveToRelative(-9.5f, 0.0f, -16.9f, 3.2f, -21.8f, 9.6f)
                reflectiveCurveToRelative(-7.8f, 17.7f, -6.8f, 32.5f)
                curveToRelative(0.9f, 12.8f, 4.1f, 26.7f, 6.8f, 37.4f)
                curveToRelative(6.0f, 24.2f, 19.8f, 32.7f, 30.6f, 35.6f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 128.0f, 201.6f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 71.2f, -44.5f)
                curveToRelative(10.8f, -2.9f, 24.6f, -11.4f, 30.6f, -35.6f)
                curveTo(236.4f, 95.3f, 241.5f, 66.5f, 229.8f, 51.6f)
                close()
                moveTo(92.0f, 210.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -19.6f, -52.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.6f, -0.5f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, true, 15.7f, -6.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -1.4f, -11.9f)
                arcToRelative(41.5f, 41.5f, 0.0f, false, false, -20.6f, 8.1f)
                curveToRelative(-8.9f, 0.0f, -22.9f, -4.1f, -28.9f, -27.9f)
                curveTo(34.6f, 105.6f, 26.0f, 71.3f, 35.6f, 59.0f)
                curveToRelative(2.6f, -3.4f, 6.7f, -5.0f, 12.4f, -5.0f)
                curveToRelative(12.7f, 0.0f, 31.3f, 10.3f, 47.4f, 26.3f)
                reflectiveCurveTo(122.0f, 114.8f, 122.0f, 128.0f)
                verticalLineToRelative(52.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 92.0f, 210.0f)
                close()
                moveTo(218.2f, 118.5f)
                curveToRelative(-6.0f, 23.8f, -20.0f, 27.9f, -28.9f, 27.9f)
                arcToRelative(41.5f, 41.5f, 0.0f, false, false, -20.6f, -8.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -1.4f, 11.9f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, true, 15.7f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.6f, 0.5f)
                arcTo(30.0f, 30.0f, 0.0f, true, true, 134.0f, 180.0f)
                lineTo(134.0f, 128.0f)
                curveToRelative(0.0f, -13.2f, 10.2f, -31.5f, 26.6f, -47.7f)
                reflectiveCurveTo(195.3f, 54.0f, 208.0f, 54.0f)
                curveToRelative(5.7f, 0.0f, 9.8f, 1.6f, 12.4f, 5.0f)
                curveTo(230.0f, 71.3f, 221.4f, 105.6f, 218.2f, 118.5f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
