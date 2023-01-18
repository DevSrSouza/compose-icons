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

public val RemixIcons.DeleteBackFill: ImageVector
    get() {
        if (_deleteBackFill != null) {
            return _deleteBackFill!!
        }
        _deleteBackFill = Builder(name = "DeleteBackFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.535f, 3.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(6.535f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.832f, -0.445f)
                lineToRelative(-5.333f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.11f)
                lineToRelative(5.333f, -8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.535f, 3.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _deleteBackFill!!
    }

private var _deleteBackFill: ImageVector? = null
