package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Texture: ImageVector
    get() {
        if (_texture != null) {
            return _texture!!
        }
        _texture = Builder(name = "Texture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.88f, 3.0f)
                lineTo(3.0f, 11.88f)
                verticalLineToRelative(2.83f)
                lineTo(14.71f, 3.0f)
                close()
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(4.0f, -4.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                close()
                moveTo(19.51f, 3.08f)
                lineTo(3.08f, 19.51f)
                curveToRelative(0.09f, 0.34f, 0.27f, 0.65f, 0.51f, 0.9f)
                curveToRelative(0.25f, 0.24f, 0.56f, 0.42f, 0.9f, 0.51f)
                lineTo(20.93f, 4.49f)
                curveToRelative(-0.19f, -0.69f, -0.73f, -1.23f, -1.42f, -1.41f)
                close()
                moveTo(21.0f, 9.29f)
                lineTo(9.29f, 21.0f)
                horizontalLineToRelative(2.83f)
                lineTo(21.0f, 12.12f)
                close()
                moveTo(20.41f, 20.41f)
                curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.05f, -0.22f, 1.41f, -0.59f)
                close()
            }
        }
        .build()
        return _texture!!
    }

private var _texture: ImageVector? = null
