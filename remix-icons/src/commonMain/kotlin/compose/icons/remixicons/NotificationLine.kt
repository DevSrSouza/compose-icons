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

public val RemixIcons.NotificationLine: ImageVector
    get() {
        if (_notificationLine != null) {
            return _notificationLine!!
        }
        _notificationLine = Builder(name = "NotificationLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-6.969f)
                curveTo(19.0f, 7.148f, 15.866f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-7.0f, 3.148f, -7.0f, 7.031f)
                lineTo(5.0f, 18.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(4.97f, 0.0f, 9.0f, 4.043f, 9.0f, 9.031f)
                lineTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
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
        return _notificationLine!!
    }

private var _notificationLine: ImageVector? = null
