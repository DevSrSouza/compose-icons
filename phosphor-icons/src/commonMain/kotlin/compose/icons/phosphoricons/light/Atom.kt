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

public val LightGroup.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(name = "Atom", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.6f, 128.0f)
                arcToRelative(197.3f, 197.3f, 0.0f, false, false, 19.9f, -33.5f)
                curveToRelative(10.7f, -23.8f, 11.0f, -42.6f, 0.8f, -52.8f)
                reflectiveCurveToRelative(-29.0f, -9.9f, -52.8f, 0.8f)
                arcTo(197.3f, 197.3f, 0.0f, false, false, 128.0f, 62.4f)
                arcTo(197.3f, 197.3f, 0.0f, false, false, 94.5f, 42.5f)
                curveToRelative(-23.8f, -10.7f, -42.6f, -11.0f, -52.8f, -0.8f)
                reflectiveCurveToRelative(-9.9f, 29.0f, 0.8f, 52.8f)
                arcTo(197.3f, 197.3f, 0.0f, false, false, 62.4f, 128.0f)
                arcToRelative(197.3f, 197.3f, 0.0f, false, false, -19.9f, 33.5f)
                curveToRelative(-10.7f, 23.8f, -11.0f, 42.6f, -0.8f, 52.8f)
                curveToRelative(5.0f, 4.9f, 12.0f, 7.4f, 20.6f, 7.4f)
                reflectiveCurveToRelative(20.0f, -2.7f, 32.2f, -8.2f)
                arcTo(197.3f, 197.3f, 0.0f, false, false, 128.0f, 193.6f)
                arcToRelative(197.3f, 197.3f, 0.0f, false, false, 33.5f, 19.9f)
                curveToRelative(12.2f, 5.5f, 23.1f, 8.2f, 32.2f, 8.2f)
                reflectiveCurveToRelative(15.6f, -2.5f, 20.6f, -7.4f)
                curveToRelative(10.2f, -10.2f, 9.9f, -29.0f, -0.8f, -52.8f)
                arcTo(197.3f, 197.3f, 0.0f, false, false, 193.6f, 128.0f)
                close()
                moveTo(205.8f, 50.2f)
                curveToRelative(6.2f, 6.3f, 5.0f, 21.0f, -3.3f, 39.3f)
                arcTo(173.4f, 173.4f, 0.0f, false, true, 186.0f, 118.0f)
                arcToRelative(309.6f, 309.6f, 0.0f, false, false, -22.6f, -25.4f)
                arcTo(309.6f, 309.6f, 0.0f, false, false, 138.0f, 70.0f)
                curveTo(169.6f, 47.9f, 196.5f, 41.0f, 205.8f, 50.2f)
                close()
                moveTo(178.7f, 128.0f)
                arcToRelative(308.0f, 308.0f, 0.0f, false, true, -23.8f, 26.9f)
                arcTo(312.9f, 312.9f, 0.0f, false, true, 128.0f, 178.7f)
                arcToRelative(312.9f, 312.9f, 0.0f, false, true, -26.9f, -23.8f)
                arcTo(308.0f, 308.0f, 0.0f, false, true, 77.3f, 128.0f)
                arcToRelative(308.0f, 308.0f, 0.0f, false, true, 23.8f, -26.9f)
                arcTo(312.9f, 312.9f, 0.0f, false, true, 128.0f, 77.3f)
                arcToRelative(312.9f, 312.9f, 0.0f, false, true, 26.9f, 23.8f)
                arcTo(308.0f, 308.0f, 0.0f, false, true, 178.7f, 128.0f)
                close()
                moveTo(53.5f, 89.5f)
                curveToRelative(-8.3f, -18.3f, -9.5f, -33.0f, -3.3f, -39.3f)
                curveToRelative(2.7f, -2.7f, 6.8f, -4.0f, 12.1f, -4.0f)
                curveToRelative(13.1f, 0.0f, 33.2f, 8.0f, 55.7f, 23.7f)
                arcTo(331.0f, 331.0f, 0.0f, false, false, 92.6f, 92.6f)
                arcTo(309.6f, 309.6f, 0.0f, false, false, 70.0f, 118.0f)
                arcTo(173.4f, 173.4f, 0.0f, false, true, 53.5f, 89.5f)
                close()
                moveTo(50.2f, 205.8f)
                curveToRelative(-6.2f, -6.3f, -5.0f, -21.0f, 3.3f, -39.3f)
                arcTo(173.4f, 173.4f, 0.0f, false, true, 70.0f, 138.0f)
                arcToRelative(309.6f, 309.6f, 0.0f, false, false, 22.6f, 25.4f)
                arcTo(309.6f, 309.6f, 0.0f, false, false, 118.0f, 186.0f)
                curveTo(86.4f, 208.1f, 59.5f, 215.0f, 50.2f, 205.8f)
                close()
                moveTo(205.8f, 205.8f)
                curveToRelative(-2.7f, 2.7f, -6.8f, 4.0f, -12.1f, 4.0f)
                curveToRelative(-13.1f, 0.0f, -33.2f, -8.0f, -55.7f, -23.7f)
                arcToRelative(331.0f, 331.0f, 0.0f, false, false, 25.4f, -22.7f)
                arcTo(309.6f, 309.6f, 0.0f, false, false, 186.0f, 138.0f)
                arcToRelative(173.4f, 173.4f, 0.0f, false, true, 16.5f, 28.5f)
                curveTo(210.8f, 184.8f, 212.0f, 199.5f, 205.8f, 205.8f)
                close()
                moveTo(138.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 128.0f)
                close()
            }
        }
        .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
