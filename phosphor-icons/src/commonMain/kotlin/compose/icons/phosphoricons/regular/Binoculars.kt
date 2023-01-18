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

public val RegularGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.2f, 151.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, false, -2.4f, -5.5f)
                lineTo(193.3f, 51.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.7f, -2.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.3f, 0.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 144.0f, 55.0f)
                verticalLineTo(84.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(55.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.3f, -5.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.3f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.7f, 2.4f)
                lineTo(21.2f, 146.4f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, false, -2.4f, 5.5f)
                horizontalLineToRelative(0.0f)
                arcTo(47.4f, 47.4f, 0.0f, false, false, 16.0f, 168.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 96.0f, 0.0f)
                verticalLineTo(100.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 96.0f, 0.0f)
                arcTo(47.4f, 47.4f, 0.0f, false, false, 237.2f, 151.9f)
                close()
                moveTo(76.7f, 59.8f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 96.0f, 58.7f)
                verticalLineToRelative(73.6f)
                arcTo(47.4f, 47.4f, 0.0f, false, false, 64.0f, 120.0f)
                arcToRelative(48.2f, 48.2f, 0.0f, false, false, -14.8f, 2.3f)
                close()
                moveTo(64.0f, 200.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -30.1f, -42.8f)
                lineToRelative(1.8f, -4.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 64.0f, 200.0f)
                close()
                moveTo(160.0f, 58.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 19.3f, 1.1f)
                lineToRelative(27.5f, 62.5f)
                arcTo(48.2f, 48.2f, 0.0f, false, false, 192.0f, 120.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, false, -32.0f, 12.3f)
                close()
                moveTo(192.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 28.3f, -46.8f)
                lineToRelative(1.8f, 4.0f)
                arcTo(31.9f, 31.9f, 0.0f, false, true, 192.0f, 200.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
