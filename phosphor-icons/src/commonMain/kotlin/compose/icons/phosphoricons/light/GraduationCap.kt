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

public val LightGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.8f, 90.7f)
                lineToRelative(-120.0f, -64.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-120.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 10.6f)
                lineTo(30.0f, 114.5f)
                verticalLineToRelative(51.0f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 2.8f, 8.3f)
                curveTo(40.6f, 184.2f, 70.4f, 218.0f, 128.0f, 218.0f)
                curveToRelative(21.9f, 0.0f, 39.8f, -4.9f, 54.0f, -11.5f)
                lineTo(182.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(194.0f, 200.0f)
                arcToRelative(106.8f, 106.8f, 0.0f, false, false, 29.2f, -26.2f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 2.8f, -8.3f)
                verticalLineToRelative(-51.0f)
                lineToRelative(24.8f, -13.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.6f)
                close()
                moveTo(128.0f, 206.0f)
                curveToRelative(-52.0f, 0.0f, -78.7f, -30.1f, -85.6f, -39.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.4f, -1.1f)
                lineTo(42.0f, 120.9f)
                lineToRelative(83.2f, 44.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(182.0f, 138.0f)
                verticalLineToRelative(55.1f)
                curveTo(168.5f, 200.3f, 150.7f, 206.0f, 128.0f, 206.0f)
                close()
                moveTo(214.0f, 165.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.4f, 1.1f)
                arcTo(90.7f, 90.7f, 0.0f, false, true, 194.0f, 185.5f)
                lineTo(194.0f, 131.6f)
                lineToRelative(20.0f, -10.7f)
                close()
                moveTo(217.2f, 105.6f)
                horizontalLineToRelative(-0.1f)
                lineTo(188.0f, 121.2f)
                lineTo(130.8f, 90.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.6f, 10.6f)
                lineTo(175.3f, 128.0f)
                lineTo(128.0f, 153.2f)
                lineTo(38.9f, 105.7f)
                horizontalLineToRelative(-0.1f)
                lineTo(20.8f, 96.0f)
                lineTo(128.0f, 38.8f)
                lineTo(235.3f, 96.0f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
