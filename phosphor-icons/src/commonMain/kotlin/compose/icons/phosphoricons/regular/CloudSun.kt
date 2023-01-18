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

public val RegularGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 72.0f)
                arcToRelative(78.8f, 78.8f, 0.0f, false, false, -20.2f, 2.7f)
                arcToRelative(58.9f, 58.9f, 0.0f, false, false, -9.4f, -11.5f)
                lineToRelative(9.4f, -13.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -1.9f, -11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.2f, 1.9f)
                lineTo(113.2f, 54.0f)
                arcToRelative(55.0f, 55.0f, 0.0f, false, false, -26.9f, -6.0f)
                lineTo(83.4f, 31.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.8f, 2.8f)
                lineToRelative(2.9f, 16.3f)
                arcTo(55.7f, 55.7f, 0.0f, false, false, 47.2f, 65.6f)
                lineTo(33.6f, 56.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.1f, 2.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 1.9f, 11.1f)
                lineTo(38.0f, 78.7f)
                arcToRelative(55.1f, 55.1f, 0.0f, false, false, -6.0f, 27.0f)
                lineToRelative(-16.3f, 2.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.4f, 15.9f)
                horizontalLineToRelative(1.4f)
                lineToRelative(16.3f, -2.9f)
                arcToRelative(52.3f, 52.3f, 0.0f, false, false, 5.9f, 12.4f)
                arcTo(51.9f, 51.9f, 0.0f, false, false, 76.0f, 224.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(48.6f, 111.1f)
                verticalLineToRelative(-0.4f)
                arcToRelative(39.6f, 39.6f, 0.0f, false, true, 6.5f, -29.5f)
                verticalLineTo(81.0f)
                horizontalLineToRelative(0.1f)
                arcTo(40.1f, 40.1f, 0.0f, false, true, 80.8f, 64.6f)
                horizontalLineToRelative(0.5f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, true, 29.1f, 6.3f)
                lineToRelative(0.5f, 0.3f)
                lineToRelative(0.4f, 0.3f)
                arcToRelative(37.4f, 37.4f, 0.0f, false, true, 9.3f, 9.3f)
                arcToRelative(76.6f, 76.6f, 0.0f, false, false, -35.6f, 40.0f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, false, -9.0f, -0.8f)
                arcToRelative(52.6f, 52.6f, 0.0f, false, false, -22.1f, 4.9f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 48.6f, 111.1f)
                close()
                moveTo(156.0f, 208.0f)
                horizontalLineTo(76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, true, 4.9f, 0.3f)
                arcTo(74.9f, 74.9f, 0.0f, false, false, 80.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
