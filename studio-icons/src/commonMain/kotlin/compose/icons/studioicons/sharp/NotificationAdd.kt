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

public val SharpGroup.NotificationAdd: ImageVector
    get() {
        if (_notificationAdd != null) {
            return _notificationAdd!!
        }
        _notificationAdd = Builder(name = "NotificationAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(10.0f, 21.1f, 10.0f, 20.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveToRelative(0.0f, 2.61f, 1.67f, 4.83f, 4.0f, 5.66f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f)
                verticalLineTo(2.0f)
                lineToRelative(3.0f, 0.0f)
                verticalLineToRelative(2.2f)
                curveToRelative(0.71f, 0.18f, 1.36f, 0.49f, 1.95f, 0.9f)
                curveTo(14.54f, 6.14f, 14.0f, 7.51f, 14.0f, 9.0f)
                close()
                moveTo(24.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _notificationAdd!!
    }

private var _notificationAdd: ImageVector? = null
