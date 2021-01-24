package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 32.0f)
                horizontalLineTo(312.0f)
                lineToRelative(-9.4f, -18.7f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 281.1f, 0.0f)
                horizontalLineTo(166.8f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, false, -21.4f, 13.3f)
                lineTo(136.0f, 32.0f)
                horizontalLineTo(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 48.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(53.2f, 467.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 47.9f, 45.0f)
                horizontalLineToRelative(245.8f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 47.9f, -45.0f)
                lineTo(416.0f, 128.0f)
                horizontalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
