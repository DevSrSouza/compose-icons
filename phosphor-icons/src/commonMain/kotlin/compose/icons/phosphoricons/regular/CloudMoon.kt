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

public val RegularGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 72.0f)
                arcToRelative(85.2f, 85.2f, 0.0f, false, false, -12.4f, 1.0f)
                arcTo(71.8f, 71.8f, 0.0f, false, false, 88.2f, 9.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, 9.6f)
                arcTo(58.6f, 58.6f, 0.0f, false, true, 80.0f, 32.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 24.0f, 88.0f)
                arcToRelative(58.6f, 58.6f, 0.0f, false, true, -12.6f, -1.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, 9.6f)
                arcToRelative(71.9f, 71.9f, 0.0f, false, false, 32.3f, 45.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 76.0f, 224.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(21.4f, 104.0f)
                horizontalLineTo(24.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 96.0f, 32.0f)
                verticalLineTo(29.3f)
                arcToRelative(55.6f, 55.6f, 0.0f, false, true, 31.9f, 48.1f)
                arcTo(76.3f, 76.3f, 0.0f, false, false, 85.0f, 120.8f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, false, -9.0f, -0.8f)
                arcToRelative(51.8f, 51.8f, 0.0f, false, false, -30.0f, 9.6f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 21.4f, 104.0f)
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
