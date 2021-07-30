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

public val SimpleIcons.Linuxfoundation: ImageVector
    get() {
        if (_linuxfoundation != null) {
            return _linuxfoundation!!
        }
        _linuxfoundation = Builder(name = "Linuxfoundation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8f, 19.2f)
                horizontalLineToRelative(9.6f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(9.6f)
                horizontalLineToRelative(4.8f)
                verticalLineToRelative(9.6f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(7.2f)
                horizontalLineToRelative(4.8f)
                verticalLineTo(4.822f)
                horizontalLineToRelative(14.4f)
                verticalLineTo(19.2f)
                horizontalLineToRelative(-2.4f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _linuxfoundation!!
    }

private var _linuxfoundation: ImageVector? = null
