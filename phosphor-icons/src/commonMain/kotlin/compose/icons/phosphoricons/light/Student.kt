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

public val LightGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 58.3f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -3.8f, 0.0f)
                lineToRelative(-95.9f, 32.0f)
                horizontalLineTo(30.0f)
                lineToRelative(-0.7f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.7f, 0.4f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                lineToRelative(-0.7f, 0.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.5f, 0.6f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                lineToRelative(-0.4f, 0.7f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.1f, 0.2f)
                lineToRelative(-0.3f, 0.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.2f, 0.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.1f, 0.9f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(72.3f)
                lineTo(76.7f, 85.2f)
                arcTo(61.4f, 61.4f, 0.0f, false, false, 66.0f, 120.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 32.7f, 54.6f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, false, -49.5f, 38.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.1f, 6.6f)
                arcToRelative(81.9f, 81.9f, 0.0f, false, true, 137.4f, 0.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 5.1f, 2.7f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.2f, -1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.8f, -8.3f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, false, -49.5f, -38.1f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 190.0f, 120.0f)
                arcToRelative(61.4f, 61.4f, 0.0f, false, false, -10.7f, -34.8f)
                lineToRelative(46.6f, -15.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.4f)
                close()
                moveTo(178.0f, 120.0f)
                arcTo(50.0f, 50.0f, 0.0f, true, true, 88.6f, 89.2f)
                lineToRelative(37.5f, 12.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 3.8f, 0.0f)
                lineToRelative(37.5f, -12.5f)
                arcTo(50.4f, 50.4f, 0.0f, false, true, 178.0f, 120.0f)
                close()
                moveTo(167.3f, 76.6f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 89.7f)
                lineTo(88.7f, 76.6f)
                horizontalLineToRelative(0.0f)
                lineTo(51.0f, 64.0f)
                lineToRelative(77.0f, -25.7f)
                lineTo(205.0f, 64.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
