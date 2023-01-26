package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.NotificationsPaused: ImageVector
    get() {
        if (_notificationsPaused != null) {
            return _notificationsPaused!!
        }
        _notificationsPaused = Builder(name = "NotificationsPaused", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(19.29f, 17.29f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f)
                lineTo(13.5f, 4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.68f)
                curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f)
                horizontalLineToRelative(13.17f)
                curveToRelative(0.9f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f)
                close()
                moveTo(14.5f, 9.33f)
                curveToRelative(0.0f, 0.31f, -0.11f, 0.6f, -0.3f, 0.84f)
                lineToRelative(-2.5f, 3.03f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.5f, 0.0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(-0.73f, 0.0f, -1.32f, -0.59f, -1.32f, -1.32f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.0f, -0.31f, 0.11f, -0.6f, 0.3f, -0.84f)
                lineToRelative(2.5f, -3.03f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(-0.5f, 0.0f, -0.9f, -0.4f, -0.9f, -0.9f)
                reflectiveCurveToRelative(0.4f, -0.9f, 0.9f, -0.9f)
                horizontalLineToRelative(2.78f)
                curveToRelative(0.73f, 0.0f, 1.32f, 0.59f, 1.32f, 1.33f)
                close()
            }
        }
        .build()
        return _notificationsPaused!!
    }

private var _notificationsPaused: ImageVector? = null
