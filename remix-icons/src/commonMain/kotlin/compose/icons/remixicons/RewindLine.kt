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

public val RemixIcons.RewindLine: ImageVector
    get() {
        if (_rewindLine != null) {
            return _rewindLine!!
        }
        _rewindLine = Builder(name = "RewindLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.667f)
                lineToRelative(9.223f, -6.149f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.777f, 0.416f)
                verticalLineToRelative(14.132f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.777f, 0.416f)
                lineTo(12.0f, 13.333f)
                verticalLineToRelative(5.733f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.777f, 0.416f)
                lineTo(0.624f, 12.416f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.832f)
                lineToRelative(10.599f, -7.066f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.777f, 0.416f)
                verticalLineToRelative(5.733f)
                close()
                moveTo(10.0f, 16.263f)
                lineTo(10.0f, 7.737f)
                lineTo(3.606f, 12.0f)
                lineTo(10.0f, 16.263f)
                close()
                moveTo(20.0f, 16.263f)
                lineTo(20.0f, 7.737f)
                lineTo(13.606f, 12.0f)
                lineTo(20.0f, 16.263f)
                close()
            }
        }
        .build()
        return _rewindLine!!
    }

private var _rewindLine: ImageVector? = null