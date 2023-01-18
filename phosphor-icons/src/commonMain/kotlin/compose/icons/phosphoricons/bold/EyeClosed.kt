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

public val BoldGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.4f, 160.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.4f, 18.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -10.4f, -6.0f)
                lineToRelative(-16.3f, -28.2f)
                arcToRelative(126.0f, 126.0f, 0.0f, false, true, -29.4f, 13.5f)
                lineToRelative(5.2f, 29.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.7f, 13.9f)
                lineToRelative(-2.1f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.8f, -9.9f)
                lineTo(144.4f, 163.0f)
                arcToRelative(123.5f, 123.5f, 0.0f, false, true, -16.4f, 1.0f)
                arcToRelative(146.3f, 146.3f, 0.0f, false, true, -16.5f, -1.0f)
                lineToRelative(-5.1f, 28.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.8f, 9.9f)
                lineToRelative(-2.1f, -0.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.7f, -13.9f)
                lineTo(88.0f, 158.1f)
                arcToRelative(125.3f, 125.3f, 0.0f, false, true, -29.3f, -13.5f)
                lineTo(42.3f, 173.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.4f, 6.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -6.0f, -1.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 21.5f, 161.0f)
                lineToRelative(17.9f, -31.0f)
                arcToRelative(142.4f, 142.4f, 0.0f, false, true, -16.7f, -17.6f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 41.3f, 97.3f)
                curveTo(57.1f, 116.8f, 84.9f, 140.0f, 128.0f, 140.0f)
                reflectiveCurveToRelative(70.9f, -23.2f, 86.7f, -42.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 18.6f, 15.1f)
                arcToRelative(150.3f, 150.3f, 0.0f, false, true, -16.7f, 17.7f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
