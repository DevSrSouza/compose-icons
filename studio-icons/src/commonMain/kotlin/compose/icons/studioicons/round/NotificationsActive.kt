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

public val RoundGroup.NotificationsActive: ImageVector
    get() {
        if (_notificationsActive != null) {
            return _notificationsActive!!
        }
        _notificationsActive = Builder(name = "NotificationsActive", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f)
                lineTo(13.5f, 4.0f)
                curveToRelative(0.0f, -0.83f, -0.68f, -1.5f, -1.51f, -1.5f)
                reflectiveCurveTo(10.5f, 3.17f, 10.5f, 4.0f)
                verticalLineToRelative(0.68f)
                curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(-1.3f, 1.29f)
                curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f)
                horizontalLineToRelative(13.17f)
                curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f)
                lineTo(18.0f, 16.0f)
                close()
                moveTo(11.99f, 22.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(6.77f, 4.73f)
                curveToRelative(0.42f, -0.38f, 0.43f, -1.03f, 0.03f, -1.43f)
                curveToRelative(-0.38f, -0.38f, -1.0f, -0.39f, -1.39f, -0.02f)
                curveTo(3.7f, 4.84f, 2.52f, 6.96f, 2.14f, 9.34f)
                curveToRelative(-0.09f, 0.61f, 0.38f, 1.16f, 1.0f, 1.16f)
                curveToRelative(0.48f, 0.0f, 0.9f, -0.35f, 0.98f, -0.83f)
                curveToRelative(0.3f, -1.94f, 1.26f, -3.67f, 2.65f, -4.94f)
                close()
                moveTo(18.6f, 3.28f)
                curveToRelative(-0.4f, -0.37f, -1.02f, -0.36f, -1.4f, 0.02f)
                curveToRelative(-0.4f, 0.4f, -0.38f, 1.04f, 0.03f, 1.42f)
                curveToRelative(1.38f, 1.27f, 2.35f, 3.0f, 2.65f, 4.94f)
                curveToRelative(0.07f, 0.48f, 0.49f, 0.83f, 0.98f, 0.83f)
                curveToRelative(0.61f, 0.0f, 1.09f, -0.55f, 0.99f, -1.16f)
                curveToRelative(-0.38f, -2.37f, -1.55f, -4.48f, -3.25f, -6.05f)
                close()
            }
        }
        .build()
        return _notificationsActive!!
    }

private var _notificationsActive: ImageVector? = null
