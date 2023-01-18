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

public val RemixIcons.LoaderLine: ImageVector
    get() {
        if (_loaderLine != null) {
            return _loaderLine!!
        }
        _loaderLine = Builder(name = "LoaderLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(20.66f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.366f, 1.366f)
                lineToRelative(-2.598f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.732f)
                lineToRelative(2.598f, -1.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.66f, 7.0f)
                close()
                moveTo(7.67f, 14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.366f, 1.366f)
                lineToRelative(-2.598f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.732f)
                lineToRelative(2.598f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.366f, 0.366f)
                close()
                moveTo(20.66f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.366f, 0.366f)
                lineToRelative(-2.598f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.732f)
                lineToRelative(2.598f, 1.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.66f, 17.0f)
                close()
                moveTo(7.67f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.366f, 0.366f)
                lineToRelative(-2.598f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.732f)
                lineToRelative(2.598f, 1.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.67f, 9.5f)
                close()
            }
        }
        .build()
        return _loaderLine!!
    }

private var _loaderLine: ImageVector? = null
