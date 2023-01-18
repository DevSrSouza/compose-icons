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

public val RemixIcons.Music2Fill: ImageVector
    get() {
        if (_music2Fill != null) {
            return _music2Fill!!
        }
        _music2Fill = Builder(name = "Music2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.0f, -3.465f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.0f, -3.465f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _music2Fill!!
    }

private var _music2Fill: ImageVector? = null
