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

public val ThinGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 76.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, false, -22.1f, 3.5f)
                arcTo(50.8f, 50.8f, 0.0f, false, false, 121.0f, 63.8f)
                lineToRelative(11.6f, -16.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.6f, -4.6f)
                lineTo(114.5f, 59.2f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, -31.6f, -7.0f)
                lineTo(79.4f, 32.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.8f, 1.4f)
                lineToRelative(3.5f, 19.8f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 47.8f, 71.0f)
                lineTo(31.3f, 59.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.0f, 5.6f)
                lineTo(43.2f, 77.5f)
                arcToRelative(52.7f, 52.7f, 0.0f, false, false, -7.0f, 31.5f)
                lineToRelative(-19.8f, 3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.7f, 8.0f)
                horizontalLineToRelative(0.7f)
                lineToRelative(19.8f, -3.5f)
                arcTo(52.5f, 52.5f, 0.0f, false, false, 46.0f, 134.6f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 76.0f, 220.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(44.7f, 111.7f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(43.7f, 43.7f, 0.0f, false, true, 7.3f, -32.7f)
                horizontalLineTo(52.0f)
                verticalLineToRelative(-0.2f)
                arcTo(43.4f, 43.4f, 0.0f, false, true, 80.2f, 60.7f)
                horizontalLineToRelative(0.2f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.1f, -0.1f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, true, 32.4f, 7.1f)
                lineToRelative(0.3f, 0.3f)
                lineToRelative(0.4f, 0.2f)
                arcToRelative(43.4f, 43.4f, 0.0f, false, true, 12.7f, 14.2f)
                arcToRelative(73.1f, 73.1f, 0.0f, false, false, -38.7f, 43.0f)
                arcTo(50.4f, 50.4f, 0.0f, false, false, 76.0f, 124.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, false, -23.4f, 6.1f)
                arcTo(43.9f, 43.9f, 0.0f, false, true, 44.7f, 111.7f)
                close()
                moveTo(156.0f, 212.0f)
                horizontalLineTo(76.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f)
                arcToRelative(43.3f, 43.3f, 0.0f, false, true, 9.5f, 1.1f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 84.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
