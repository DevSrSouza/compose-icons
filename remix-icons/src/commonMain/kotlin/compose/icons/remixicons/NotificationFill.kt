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

public val RemixIcons.NotificationFill: ImageVector
    get() {
        if (_notificationFill != null) {
            return _notificationFill!!
        }
        _notificationFill = Builder(name = "NotificationFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(4.97f, 0.0f, 9.0f, 4.043f, 9.0f, 9.031f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-8.969f)
                curveTo(3.0f, 6.043f, 7.03f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _notificationFill!!
    }

private var _notificationFill: ImageVector? = null
