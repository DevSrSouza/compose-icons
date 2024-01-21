package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Paperclip24: ImageVector
    get() {
        if (_paperclip24 != null) {
            return _paperclip24!!
        }
        _paperclip24 = Builder(name = "Paperclip24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.187f, 3.588f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -3.889f, 0.0f)
                lineTo(5.575f, 13.31f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.364f, 6.364f)
                lineToRelative(8.662f, -8.662f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 1.06f)
                lineTo(13.0f, 20.735f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.485f, -8.485f)
                lineToRelative(9.723f, -9.723f)
                arcToRelative(4.247f, 4.247f, 0.0f, false, true, 4.124f, -1.139f)
                arcToRelative(4.247f, 4.247f, 0.0f, false, true, 3.025f, 3.025f)
                arcToRelative(4.247f, 4.247f, 0.0f, false, true, -1.139f, 4.124f)
                lineToRelative(-9.193f, 9.193f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -1.858f, 0.779f)
                arcToRelative(2.626f, 2.626f, 0.0f, false, true, -1.854f, -0.779f)
                curveToRelative(-0.196f, -0.196f, -0.338f, -0.47f, -0.43f, -0.726f)
                arcToRelative(2.822f, 2.822f, 0.0f, false, true, -0.168f, -0.946f)
                curveToRelative(0.0f, -0.7f, 0.284f, -1.373f, 0.775f, -1.864f)
                lineToRelative(8.132f, -8.131f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.275f, 0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.215f, 0.734f)
                lineToRelative(-8.131f, 8.132f)
                arcToRelative(1.148f, 1.148f, 0.0f, false, false, -0.336f, 0.803f)
                curveToRelative(0.003f, 0.204f, 0.053f, 0.405f, 0.146f, 0.587f)
                curveToRelative(0.01f, 0.018f, 0.018f, 0.028f, 0.02f, 0.032f)
                curveToRelative(0.22f, 0.215f, 0.501f, 0.332f, 0.786f, 0.332f)
                curveToRelative(0.29f, 0.0f, 0.58f, -0.121f, 0.798f, -0.34f)
                lineToRelative(9.192f, -9.192f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -3.89f)
                close()
            }
        }
        .build()
        return _paperclip24!!
    }

private var _paperclip24: ImageVector? = null
