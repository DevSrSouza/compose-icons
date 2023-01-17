package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Cubes: ImageVector
    get() {
        if (_cubes != null) {
            return _cubes!!
        }
        _cubes = Builder(name = "Cubes", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.8f, 48.6f)
                lineToRelative(78.4f, 29.7f)
                lineTo(288.0f, 109.5f)
                lineTo(206.8f, 78.3f)
                lineToRelative(78.4f, -29.7f)
                curveToRelative(1.8f, -0.7f, 3.8f, -0.7f, 5.7f, 0.0f)
                close()
                moveTo(136.0f, 92.5f)
                lineTo(136.0f, 204.7f)
                curveToRelative(-1.3f, 0.4f, -2.6f, 0.8f, -3.9f, 1.3f)
                lineToRelative(-96.0f, 36.4f)
                curveTo(14.4f, 250.6f, 0.0f, 271.5f, 0.0f, 294.7f)
                lineTo(0.0f, 413.9f)
                curveToRelative(0.0f, 22.2f, 13.1f, 42.3f, 33.5f, 51.3f)
                lineToRelative(96.0f, 42.2f)
                curveToRelative(14.4f, 6.3f, 30.7f, 6.3f, 45.1f, 0.0f)
                lineTo(288.0f, 457.5f)
                lineToRelative(113.5f, 49.9f)
                curveToRelative(14.4f, 6.3f, 30.7f, 6.3f, 45.1f, 0.0f)
                lineToRelative(96.0f, -42.2f)
                curveToRelative(20.3f, -8.9f, 33.5f, -29.1f, 33.5f, -51.3f)
                lineTo(576.1f, 294.7f)
                curveToRelative(0.0f, -23.3f, -14.4f, -44.1f, -36.1f, -52.4f)
                lineToRelative(-96.0f, -36.4f)
                curveToRelative(-1.3f, -0.5f, -2.6f, -0.9f, -3.9f, -1.3f)
                lineTo(440.1f, 92.5f)
                curveToRelative(0.0f, -23.3f, -14.4f, -44.1f, -36.1f, -52.4f)
                lineToRelative(-96.0f, -36.4f)
                curveToRelative(-12.8f, -4.8f, -26.9f, -4.8f, -39.7f, 0.0f)
                lineToRelative(-96.0f, 36.4f)
                curveTo(150.4f, 48.4f, 136.0f, 69.3f, 136.0f, 92.5f)
                close()
                moveTo(392.0f, 210.6f)
                lineToRelative(-82.4f, 31.2f)
                lineTo(309.6f, 152.6f)
                lineTo(392.0f, 121.0f)
                verticalLineToRelative(89.6f)
                close()
                moveTo(154.8f, 250.9f)
                lineToRelative(78.4f, 29.7f)
                lineTo(152.0f, 311.7f)
                lineTo(70.8f, 280.6f)
                lineToRelative(78.4f, -29.7f)
                curveToRelative(1.8f, -0.7f, 3.8f, -0.7f, 5.7f, 0.0f)
                close()
                moveTo(173.6f, 455.3f)
                lineTo(173.6f, 354.8f)
                lineTo(256.0f, 323.2f)
                verticalLineToRelative(95.9f)
                lineToRelative(-82.4f, 36.2f)
                close()
                moveTo(421.2f, 250.9f)
                curveToRelative(1.8f, -0.7f, 3.8f, -0.7f, 5.7f, 0.0f)
                lineToRelative(78.4f, 29.7f)
                lineTo(424.0f, 311.7f)
                lineToRelative(-81.2f, -31.1f)
                lineToRelative(78.4f, -29.7f)
                close()
                moveTo(523.2f, 421.2f)
                lineToRelative(-77.6f, 34.1f)
                lineTo(445.6f, 354.8f)
                lineTo(528.0f, 323.2f)
                verticalLineToRelative(90.7f)
                curveToRelative(0.0f, 3.2f, -1.9f, 6.0f, -4.8f, 7.3f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
