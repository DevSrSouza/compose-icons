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

public val RemixIcons.WindyLine: ImageVector
    get() {
        if (_windyLine != null) {
            return _windyLine!!
        }
        _windyLine = Builder(name = "WindyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -3.278f, 4.73f)
                lineToRelative(1.873f, -0.703f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 10.5f, 17.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -3.278f, 4.73f)
                lineToRelative(1.873f, -0.703f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 18.5f, 13.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.405f, -2.027f)
                lineToRelative(-1.873f, -0.702f)
                arcTo(3.501f, 3.501f, 0.0f, false, true, 17.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.5f, 9.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _windyLine!!
    }

private var _windyLine: ImageVector? = null
