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

public val SimpleIcons.Dropbox: ImageVector
    get() {
        if (_dropbox != null) {
            return _dropbox!!
        }
        _dropbox = Builder(name = "Dropbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.807f)
                lineTo(0.0f, 5.629f)
                lineToRelative(6.0f, 3.822f)
                lineToRelative(6.001f, -3.822f)
                lineTo(6.0f, 1.807f)
                close()
                moveTo(18.0f, 1.807f)
                lineToRelative(-6.0f, 3.822f)
                lineToRelative(6.0f, 3.822f)
                lineToRelative(6.0f, -3.822f)
                lineToRelative(-6.0f, -3.822f)
                close()
                moveTo(0.0f, 13.274f)
                lineToRelative(6.0f, 3.822f)
                lineToRelative(6.001f, -3.822f)
                lineTo(6.0f, 9.452f)
                lineToRelative(-6.0f, 3.822f)
                close()
                moveTo(18.0f, 9.452f)
                lineToRelative(-6.0f, 3.822f)
                lineToRelative(6.0f, 3.822f)
                lineToRelative(6.0f, -3.822f)
                lineToRelative(-6.0f, -3.822f)
                close()
                moveTo(6.0f, 18.371f)
                lineToRelative(6.001f, 3.822f)
                lineToRelative(6.0f, -3.822f)
                lineToRelative(-6.0f, -3.822f)
                lineTo(6.0f, 18.371f)
                close()
            }
        }
        .build()
        return _dropbox!!
    }

private var _dropbox: ImageVector? = null
