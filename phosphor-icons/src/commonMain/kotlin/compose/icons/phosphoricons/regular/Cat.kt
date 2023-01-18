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

public val RegularGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 140.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 128.0f)
                close()
                moveTo(232.0f, 51.3f)
                lineTo(232.0f, 136.0f)
                curveToRelative(0.0f, 52.9f, -46.7f, 96.0f, -104.0f, 96.0f)
                reflectiveCurveTo(24.0f, 188.9f, 24.0f, 136.0f)
                lineTo(24.0f, 51.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 51.3f, 40.0f)
                lineTo(68.5f, 57.2f)
                arcTo(106.2f, 106.2f, 0.0f, false, true, 92.8f, 45.7f)
                lineToRelative(1.6f, -0.5f)
                arcToRelative(111.2f, 111.2f, 0.0f, false, true, 67.2f, 0.0f)
                lineToRelative(1.6f, 0.5f)
                arcToRelative(106.2f, 106.2f, 0.0f, false, true, 24.3f, 11.5f)
                lineTo(204.7f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 51.3f)
                close()
                moveTo(216.0f, 51.3f)
                lineTo(194.1f, 73.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -10.5f, 0.7f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 168.0f, 64.8f)
                lineTo(168.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(152.0f, 59.1f)
                arcToRelative(95.7f, 95.7f, 0.0f, false, false, -16.0f, -2.8f)
                lineTo(136.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 56.3f)
                arcToRelative(95.7f, 95.7f, 0.0f, false, false, -16.0f, 2.8f)
                lineTo(104.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(88.0f, 64.8f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 72.4f, 74.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -10.5f, -0.7f)
                lineTo(40.0f, 51.3f)
                lineTo(40.0f, 136.0f)
                curveToRelative(0.0f, 41.7f, 35.2f, 76.0f, 80.0f, 79.7f)
                lineTo(120.0f, 195.3f)
                lineToRelative(-13.7f, -13.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(128.0f, 180.7f)
                lineToRelative(10.3f, -10.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(136.0f, 195.3f)
                verticalLineToRelative(20.4f)
                curveToRelative(44.8f, -3.7f, 80.0f, -38.0f, 80.0f, -79.7f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
