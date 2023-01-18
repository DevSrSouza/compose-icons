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

public val RegularGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 120.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(49.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -5.7f, -12.3f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, -13.2f, -3.5f)
                lineTo(45.1f, 62.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 78.7f)
                verticalLineTo(120.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(41.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.1f, 15.8f)
                lineToRelative(160.0f, 29.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.9f, 0.2f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 10.3f, -3.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 5.7f, -12.3f)
                verticalLineTo(136.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(48.0f, 78.7f)
                lineTo(208.0f, 49.6f)
                verticalLineTo(120.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(208.0f, 206.4f)
                horizontalLineToRelative(0.0f)
                lineTo(48.0f, 177.3f)
                verticalLineTo(136.0f)
                horizontalLineTo(208.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
