package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 209.6f)
                arcToRelative(119.4f, 119.4f, 0.0f, false, false, 16.0f, -8.5f)
                lineTo(196.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(120.9f, 92.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 3.3f, 10.9f)
                lineTo(171.0f, 128.0f)
                lineToRelative(17.0f, -9.1f)
                lineToRelative(-56.2f, -30.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 120.9f, 92.2f)
                close()
                moveTo(251.8f, 88.9f)
                lineTo(131.8f, 24.9f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -7.6f, 0.0f)
                lineToRelative(-120.0f, 64.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 14.2f)
                lineTo(28.0f, 115.7f)
                verticalLineToRelative(49.8f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 3.2f, 9.5f)
                curveToRelative(7.9f, 10.6f, 38.3f, 45.0f, 96.8f, 45.0f)
                arcToRelative(128.7f, 128.7f, 0.0f, false, false, 52.0f, -10.5f)
                lineTo(180.0f, 132.8f)
                lineToRelative(-9.0f, -4.8f)
                lineToRelative(-43.0f, 22.9f)
                lineToRelative(-88.2f, -47.0f)
                horizontalLineToRelative(0.0f)
                lineTo(25.0f, 96.0f)
                lineTo(128.0f, 41.1f)
                lineTo(231.0f, 96.0f)
                lineToRelative(-14.8f, 7.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-28.2f, 15.0f)
                lineToRelative(3.8f, 2.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 3.2f, 3.3f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 1.0f, 3.8f)
                verticalLineToRelative(73.1f)
                arcTo(111.8f, 111.8f, 0.0f, false, false, 224.8f, 175.0f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 3.2f, -9.5f)
                lineTo(228.0f, 115.7f)
                lineToRelative(23.8f, -12.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -14.2f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
