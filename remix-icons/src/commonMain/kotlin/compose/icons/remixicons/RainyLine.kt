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

public val RemixIcons.RainyLine: ImageVector
    get() {
        if (_rainyLine != null) {
            return _rainyLine!!
        }
        _rainyLine = Builder(name = "RainyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.157f, -7.37f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 8.0f, 15.917f)
                verticalLineToRelative(2.022f)
                arcTo(8.001f, 8.001f, 0.0f, false, true, 9.0f, 2.0f)
                arcToRelative(7.998f, 7.998f, 0.0f, false, true, 6.98f, 4.087f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 17.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(10.232f, 18.732f)
                lineTo(12.0f, 16.964f)
                lineToRelative(1.768f, 1.768f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.536f, 0.0f)
                close()
            }
        }
        .build()
        return _rainyLine!!
    }

private var _rainyLine: ImageVector? = null
