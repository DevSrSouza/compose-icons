package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Neovim: VectorAsset
    get() {
        if (_neovim != null) {
            return _neovim!!
        }
        _neovim = VectorAssetBuilder(name = "Neovim", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.902f, 4.998f)
                lineToRelative(3.864f, 5.754f)
                verticalLineToRelative(12.151f)
                lineToRelative(-4.207f, -4.198f)
                verticalLineTo(5.344f)
                lineTo(2.902f, 4.998f)
                moveTo(2.97f, 4.287f)
                lineTo(2.107f, 5.158f)
                verticalLineToRelative(13.734f)
                lineToRelative(5.112f, 5.101f)
                verticalLineToRelative(-13.38f)
                lineTo(2.97f, 4.287f)
                lineTo(2.97f, 4.287f)
                close()
                moveTo(21.858f, 5.207f)
                lineTo(16.676f, 0.0f)
                verticalLineToRelative(13.331f)
                lineToRelative(4.335f, 6.519f)
                curveToRelative(0.0f, 0.0f, 0.882f, -0.957f, 0.882f, -0.957f)
                lineTo(21.858f, 5.207f)
                close()
                moveTo(7.215f, 0.001f)
                lineToRelative(13.29f, 20.28f)
                lineTo(16.786f, 24.0f)
                lineTo(3.489f, 3.765f)
                lineTo(7.215f, 0.001f)
                close()
            }
        }
        .build()
        return _neovim!!
    }

private var _neovim: VectorAsset? = null
