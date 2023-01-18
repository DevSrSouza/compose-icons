package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FileWord2Line: ImageVector
    get() {
        if (_fileWord2Line != null) {
            return _fileWord2Line!!
        }
        _fileWord2Line = Builder(name = "FileWord2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.859f, 2.877f)
                lineToRelative(12.57f, -1.795f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.571f, 0.495f)
                verticalLineToRelative(20.846f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.57f, 0.495f)
                lineTo(2.858f, 21.123f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.859f, -0.99f)
                verticalLineTo(3.867f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.859f, -0.99f)
                close()
                moveTo(4.0f, 4.735f)
                verticalLineToRelative(14.53f)
                lineToRelative(10.0f, 1.429f)
                verticalLineTo(3.306f)
                lineTo(4.0f, 4.735f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.01f, 5.0f)
                lineTo(9.0f, 11.0f)
                lineToRelative(2.0f, 1.989f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _fileWord2Line!!
    }

private var _fileWord2Line: ImageVector? = null
