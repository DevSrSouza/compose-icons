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

public val SharpGroup.VideoChat: ImageVector
    get() {
        if (_videoChat != null) {
            return _videoChat!!
        }
        _videoChat = Builder(name = "VideoChat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(17.0f, 13.0f)
                lineToRelative(-2.0f, -1.99f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.99f)
                lineTo(17.0f, 7.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _videoChat!!
    }

private var _videoChat: ImageVector? = null
