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

public val SharpGroup.NotificationImportant: ImageVector
    get() {
        if (_notificationImportant != null) {
            return _notificationImportant!!
        }
        _notificationImportant = Builder(name = "NotificationImportant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.89f, 1.99f, -1.99f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f)
                close()
                moveTo(19.0f, 17.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.35f, -2.36f, -6.15f, -5.5f, -6.83f)
                lineTo(13.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.67f)
                curveTo(7.36f, 4.85f, 5.0f, 7.65f, 5.0f, 11.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(13.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _notificationImportant!!
    }

private var _notificationImportant: ImageVector? = null
