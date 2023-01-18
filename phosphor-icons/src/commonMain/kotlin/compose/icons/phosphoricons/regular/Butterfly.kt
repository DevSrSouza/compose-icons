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

public val RegularGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 50.4f)
                curveTo(227.7f, 45.6f, 220.7f, 40.0f, 208.0f, 40.0f)
                curveToRelative(-16.7f, 0.0f, -38.1f, 11.3f, -57.2f, 30.3f)
                arcTo(144.2f, 144.2f, 0.0f, false, false, 136.0f, 87.5f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 87.5f)
                arcToRelative(144.2f, 144.2f, 0.0f, false, false, -14.8f, -17.2f)
                curveTo(86.1f, 51.3f, 64.7f, 40.0f, 48.0f, 40.0f)
                curveToRelative(-12.7f, 0.0f, -19.7f, 5.6f, -23.4f, 10.4f)
                curveToRelative(-6.8f, 8.7f, -12.2f, 24.1f, -0.4f, 71.5f)
                curveToRelative(5.9f, 23.4f, 18.7f, 32.7f, 29.5f, 36.3f)
                arcTo(44.8f, 44.8f, 0.0f, false, false, 48.0f, 180.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 80.0f, 25.3f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 208.0f, 180.0f)
                arcToRelative(44.8f, 44.8f, 0.0f, false, false, -5.7f, -21.8f)
                curveToRelative(10.8f, -3.6f, 23.6f, -12.9f, 29.5f, -36.3f)
                curveTo(238.4f, 95.3f, 243.6f, 66.0f, 231.4f, 50.4f)
                close()
                moveTo(92.0f, 208.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -18.3f, -49.2f)
                lineToRelative(0.7f, -0.6f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 14.5f, -6.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.1f, -8.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.9f, -7.0f)
                arcToRelative(42.9f, 42.9f, 0.0f, false, false, -21.0f, 8.1f)
                curveToRelative(-8.4f, -0.2f, -20.9f, -4.5f, -26.3f, -26.3f)
                curveToRelative(-2.9f, -11.5f, -11.6f, -46.3f, -2.6f, -57.9f)
                curveTo(38.6f, 58.4f, 41.3f, 56.0f, 48.0f, 56.0f)
                curveToRelative(26.9f, 0.0f, 72.0f, 45.1f, 72.0f, 72.0f)
                verticalLineToRelative(52.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 92.0f, 208.0f)
                close()
                moveTo(216.2f, 118.1f)
                curveToRelative(-5.4f, 21.8f, -17.9f, 26.1f, -26.3f, 26.3f)
                arcToRelative(42.9f, 42.9f, 0.0f, false, false, -21.0f, -8.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.9f, 7.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.1f, 8.9f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 14.5f, 6.0f)
                lineToRelative(0.7f, 0.6f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 136.0f, 180.0f)
                lineTo(136.0f, 128.0f)
                curveToRelative(0.0f, -26.9f, 45.1f, -72.0f, 72.0f, -72.0f)
                curveToRelative(6.7f, 0.0f, 9.4f, 2.4f, 10.8f, 4.2f)
                curveTo(227.8f, 71.8f, 219.1f, 106.6f, 216.2f, 118.1f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
