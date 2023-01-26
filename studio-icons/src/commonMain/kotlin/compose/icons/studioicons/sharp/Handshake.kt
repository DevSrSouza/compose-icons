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

public val SharpGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.59f, 5.95f)
                lineToRelative(-7.05f, 7.04f)
                lineTo(0.7f, 10.3f)
                lineToRelative(8.55f, -8.55f)
                lineToRelative(7.95f, 7.95f)
                lineToRelative(-1.42f, 1.42f)
                lineTo(10.59f, 5.95f)
                close()
                moveTo(23.24f, 10.24f)
                lineToRelative(-8.49f, -8.49f)
                lineToRelative(-2.06f, 2.06f)
                lineToRelative(5.9f, 5.88f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-5.17f, -5.17f)
                lineToRelative(-6.27f, 6.27f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(5.32f, -5.32f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5.32f, 5.32f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(5.32f, -5.32f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5.32f, 5.32f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.32f, -5.32f)
                lineToRelative(0.71f, 0.71f)
                lineTo(10.68f, 20.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(23.24f, 10.24f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
