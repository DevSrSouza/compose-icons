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

public val ThinGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.9f, 92.5f)
                lineToRelative(-120.0f, -64.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -3.8f, 0.0f)
                lineToRelative(-120.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 7.0f)
                lineTo(32.0f, 113.3f)
                verticalLineToRelative(52.2f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 2.4f, 7.1f)
                curveTo(42.0f, 182.8f, 71.4f, 216.0f, 128.0f, 216.0f)
                curveToRelative(23.1f, 0.0f, 41.6f, -5.5f, 56.0f, -12.7f)
                lineTo(184.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(192.0f, 198.8f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 29.6f, -26.2f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 2.4f, -7.1f)
                lineTo(224.0f, 113.3f)
                lineToRelative(25.9f, -13.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(128.0f, 208.0f)
                curveToRelative(-52.9f, 0.0f, -80.1f, -30.7f, -87.2f, -40.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.8f, -2.3f)
                lineTo(40.0f, 117.6f)
                lineToRelative(86.1f, 45.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.8f, 0.0f)
                lineTo(184.0f, 134.7f)
                verticalLineToRelative(59.5f)
                curveTo(170.1f, 201.9f, 151.6f, 208.0f, 128.0f, 208.0f)
                close()
                moveTo(216.0f, 165.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.8f, 2.3f)
                arcTo(95.9f, 95.9f, 0.0f, false, true, 192.0f, 189.4f)
                verticalLineToRelative(-59.0f)
                lineToRelative(24.0f, -12.8f)
                close()
                moveTo(188.0f, 123.5f)
                lineTo(129.9f, 92.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.8f, 7.0f)
                lineTo(179.5f, 128.0f)
                lineTo(128.0f, 155.5f)
                lineTo(16.5f, 96.0f)
                lineTo(128.0f, 36.5f)
                lineTo(239.5f, 96.0f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
