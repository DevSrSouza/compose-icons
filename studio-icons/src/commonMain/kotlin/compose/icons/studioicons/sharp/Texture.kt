package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Texture: ImageVector
    get() {
        if (_texture != null) {
            return _texture!!
        }
        _texture = Builder(name = "Texture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.66f, 3.0f)
                lineTo(3.07f, 19.59f)
                lineTo(3.07f, 21.0f)
                horizontalLineToRelative(1.41f)
                lineTo(21.07f, 4.42f)
                lineTo(21.07f, 3.0f)
                close()
                moveTo(11.95f, 3.0f)
                lineToRelative(-8.88f, 8.88f)
                verticalLineToRelative(2.83f)
                lineTo(14.78f, 3.0f)
                close()
                moveTo(3.07f, 3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(21.07f, 21.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
                moveTo(12.19f, 21.0f)
                lineToRelative(8.88f, -8.88f)
                lineTo(21.07f, 9.29f)
                lineTo(9.36f, 21.0f)
                close()
            }
        }
        .build()
        return _texture!!
    }

private var _texture: ImageVector? = null
