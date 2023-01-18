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

public val BoldGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.8f, 85.5f)
                lineToRelative(-116.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.6f, 0.0f)
                lineToRelative(-116.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 21.0f)
                lineTo(20.0f, 114.1f)
                verticalLineToRelative(51.1f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, 4.7f, 12.9f)
                curveTo(33.8f, 188.9f, 68.2f, 224.0f, 128.0f, 224.0f)
                arcToRelative(138.8f, 138.8f, 0.0f, false, false, 46.0f, -7.6f)
                lineTo(174.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(198.0f, 205.5f)
                arcToRelative(132.2f, 132.2f, 0.0f, false, false, 33.3f, -27.4f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, 4.7f, -12.9f)
                lineTo(236.0f, 114.1f)
                lineToRelative(13.8f, -7.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -21.0f)
                close()
                moveTo(128.0f, 45.7f)
                lineTo(219.2f, 96.0f)
                lineToRelative(-0.9f, 0.5f)
                horizontalLineToRelative(-0.1f)
                lineTo(186.0f, 114.3f)
                lineTo(133.8f, 85.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -11.6f, 21.0f)
                lineToRelative(39.0f, 21.5f)
                lineTo(128.0f, 146.3f)
                lineTo(37.8f, 96.5f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.9f, -0.5f)
                close()
                moveTo(128.0f, 200.0f)
                curveToRelative(-47.6f, 0.0f, -75.3f, -26.4f, -84.0f, -36.3f)
                lineTo(44.0f, 127.4f)
                lineToRelative(78.2f, 43.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.6f, 0.0f)
                lineTo(174.0f, 148.3f)
                verticalLineToRelative(42.5f)
                arcTo(116.7f, 116.7f, 0.0f, false, true, 128.0f, 200.0f)
                close()
                moveTo(212.0f, 163.7f)
                arcToRelative(99.8f, 99.8f, 0.0f, false, true, -14.0f, 13.0f)
                lineTo(198.0f, 135.1f)
                lineToRelative(14.0f, -7.7f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
