package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NotificationsOff: ImageVector
    get() {
        if (_notificationsOff != null) {
            return _notificationsOff!!
        }
        _notificationsOff = Builder(name = "NotificationsOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.69f)
                lineTo(7.84f, 6.14f)
                lineTo(5.27f, 3.49f)
                lineTo(4.0f, 4.76f)
                lineToRelative(2.8f, 2.8f)
                verticalLineToRelative(0.01f)
                curveToRelative(-0.52f, 0.99f, -0.8f, 2.16f, -0.8f, 3.42f)
                verticalLineToRelative(5.0f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(13.73f)
                lineToRelative(2.0f, 2.0f)
                lineTo(21.0f, 19.72f)
                lineToRelative(-1.0f, -1.03f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(18.0f, 14.68f)
                lineTo(18.0f, 11.0f)
                curveToRelative(0.0f, -3.08f, -1.64f, -5.64f, -4.5f, -6.32f)
                lineTo(13.5f, 4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.68f)
                curveToRelative(-0.15f, 0.03f, -0.29f, 0.08f, -0.42f, 0.12f)
                curveToRelative(-0.1f, 0.03f, -0.2f, 0.07f, -0.3f, 0.11f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.01f, 0.0f, -0.01f, 0.0f, -0.02f, 0.01f)
                curveToRelative(-0.23f, 0.09f, -0.46f, 0.2f, -0.68f, 0.31f)
                curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.01f)
                lineTo(18.0f, 14.68f)
                close()
            }
        }
        .build()
        return _notificationsOff!!
    }

private var _notificationsOff: ImageVector? = null
