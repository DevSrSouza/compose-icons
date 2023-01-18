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

public val BoldGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.8f, 52.6f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -7.6f, 0.0f)
                lineTo(28.4f, 52.5f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, 0.2f)
                lineToRelative(-0.6f, 0.3f)
                lineToRelative(-0.7f, 0.3f)
                lineToRelative(-0.4f, 0.2f)
                lineToRelative(-0.6f, 0.4f)
                lineToRelative(-0.3f, 0.2f)
                lineToRelative(-0.6f, 0.4f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.2f, 0.2f)
                lineToRelative(-0.7f, 0.6f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                lineToRelative(-0.7f, 0.8f)
                lineToRelative(-0.2f, 0.3f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, -0.4f, 0.6f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-0.3f, 0.5f)
                curveToRelative(-0.1f, 0.2f, -0.2f, 0.3f, -0.2f, 0.4f)
                lineToRelative(-0.3f, 0.6f)
                lineToRelative(-0.2f, 0.4f)
                lineToRelative(-0.3f, 0.9f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.1f, 0.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.2f, 0.7f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.3f, -0.1f, 0.4f)
                reflectiveCurveToRelative(-0.1f, 0.5f, -0.1f, 0.7f)
                verticalLineToRelative(0.4f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(44.0f, 80.6f)
                lineToRelative(23.7f, 8.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, false, 18.1f, 84.7f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, -41.6f, 36.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.1f, 13.2f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, 127.4f, 0.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.1f, 5.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.5f, -1.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 3.5f, -16.7f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, -41.6f, -36.1f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, false, 18.1f, -84.7f)
                lineToRelative(39.5f, -13.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -22.8f)
                close()
                moveTo(128.0f, 44.6f)
                lineTo(186.1f, 64.0f)
                lineToRelative(-20.8f, 6.9f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 83.4f)
                lineTo(90.7f, 70.9f)
                horizontalLineToRelative(0.0f)
                lineTo(69.9f, 64.0f)
                close()
                moveTo(172.0f, 120.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, true, 90.9f, 96.3f)
                lineToRelative(33.3f, 11.1f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 7.6f, 0.0f)
                lineToRelative(33.3f, -11.1f)
                arcTo(43.7f, 43.7f, 0.0f, false, true, 172.0f, 120.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
