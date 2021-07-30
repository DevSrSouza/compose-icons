package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Neovim: ImageVector
    get() {
        if (_neovim != null) {
            return _neovim!!
        }
        _neovim = Builder(name = "Neovim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.214f, 4.954f)
                verticalLineToRelative(13.615f)
                lineTo(7.655f, 24.0f)
                lineTo(7.655f, 10.314f)
                lineTo(3.312f, 3.845f)
                lineTo(2.214f, 4.954f)
                close()
                moveTo(7.213f, 22.934f)
                lineToRelative(-4.557f, -4.548f)
                lineTo(2.656f, 5.136f)
                lineToRelative(0.59f, -0.596f)
                lineToRelative(3.967f, 5.908f)
                verticalLineToRelative(12.485f)
                close()
                moveTo(21.786f, 18.477f)
                lineToRelative(-0.862f, 0.937f)
                lineToRelative(-4.24f, -6.376f)
                lineTo(16.684f, 0.0f)
                lineToRelative(5.068f, 5.092f)
                lineToRelative(0.034f, 13.385f)
                close()
                moveTo(7.431f, 0.001f)
                lineToRelative(12.998f, 19.835f)
                lineToRelative(-3.637f, 3.637f)
                lineTo(3.787f, 3.683f)
                lineTo(7.43f, 0.0f)
                close()
            }
        }
        .build()
        return _neovim!!
    }

private var _neovim: ImageVector? = null
