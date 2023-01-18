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

public val BoldGroup.Handbag: ImageVector
    get() {
        if (_handbag != null) {
            return _handbag!!
        }
        _handbag = Builder(name = "Handbag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.9f, 205.8f)
                lineToRelative(-14.2f, -128.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 208.8f, 60.0f)
                horizontalLineTo(178.6f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 77.4f, 60.0f)
                horizontalLineTo(47.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 27.3f, 77.8f)
                lineToRelative(-14.2f, 128.0f)
                arcTo(19.6f, 19.6f, 0.0f, false, false, 18.0f, 221.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 32.9f, 228.0f)
                horizontalLineTo(223.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.9f, -6.7f)
                arcTo(19.6f, 19.6f, 0.0f, false, false, 242.9f, 205.8f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.3f, 16.0f)
                horizontalLineTo(102.7f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(37.4f, 204.0f)
                lineTo(50.7f, 84.0f)
                horizontalLineTo(76.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(84.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(84.0f)
                horizontalLineToRelative(25.3f)
                lineToRelative(13.3f, 120.0f)
                close()
            }
        }
        .build()
        return _handbag!!
    }

private var _handbag: ImageVector? = null
