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

public val RegularGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.8f, 88.9f)
                lineToRelative(-120.0f, -64.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -7.6f, 0.0f)
                lineToRelative(-120.0f, 64.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 14.2f)
                lineTo(28.0f, 115.7f)
                verticalLineToRelative(49.8f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 3.2f, 9.5f)
                curveToRelative(7.9f, 10.6f, 38.3f, 45.0f, 96.8f, 45.0f)
                arcToRelative(128.7f, 128.7f, 0.0f, false, false, 52.0f, -10.5f)
                lineTo(180.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(196.0f, 201.1f)
                arcTo(111.8f, 111.8f, 0.0f, false, false, 224.8f, 175.0f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 3.2f, -9.5f)
                lineTo(228.0f, 115.7f)
                lineToRelative(23.8f, -12.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -14.2f)
                close()
                moveTo(128.0f, 204.0f)
                curveToRelative(-51.1f, 0.0f, -77.2f, -29.5f, -84.0f, -38.5f)
                lineTo(44.0f, 124.3f)
                lineToRelative(80.2f, 42.8f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 7.6f, 0.0f)
                lineTo(180.0f, 141.3f)
                verticalLineToRelative(50.5f)
                curveTo(166.9f, 198.7f, 149.7f, 204.0f, 128.0f, 204.0f)
                close()
                moveTo(212.0f, 165.4f)
                arcToRelative(85.8f, 85.8f, 0.0f, false, true, -16.0f, 16.1f)
                lineTo(196.0f, 132.8f)
                lineToRelative(16.0f, -8.5f)
                close()
                moveTo(216.2f, 103.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-28.2f, 15.0f)
                lineToRelative(-56.2f, -30.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, false, -7.6f, 14.2f)
                lineTo(171.0f, 128.0f)
                lineToRelative(-43.0f, 22.9f)
                lineToRelative(-88.2f, -47.0f)
                horizontalLineToRelative(0.0f)
                lineTo(25.0f, 96.0f)
                lineTo(128.0f, 41.1f)
                lineTo(231.0f, 96.0f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
