package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.NotificationsOutline: ImageVector
    get() {
        if (_notificationsOutline != null) {
            return _notificationsOutline!!
        }
        _notificationsOutline = Builder(name = "NotificationsOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(427.68f, 351.43f)
                curveTo(402.0f, 320.0f, 383.87f, 304.0f, 383.87f, 217.35f)
                curveTo(383.87f, 138.0f, 343.35f, 109.73f, 310.0f, 96.0f)
                curveToRelative(-4.43f, -1.82f, -8.6f, -6.0f, -9.95f, -10.55f)
                curveTo(294.2f, 65.54f, 277.8f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(217.79f, 65.55f, 212.0f, 85.47f)
                curveToRelative(-1.35f, 4.6f, -5.52f, 8.71f, -9.95f, 10.53f)
                curveToRelative(-33.39f, 13.75f, -73.87f, 41.92f, -73.87f, 121.35f)
                curveTo(128.13f, 304.0f, 110.0f, 320.0f, 84.32f, 351.43f)
                curveTo(73.68f, 364.45f, 83.0f, 384.0f, 101.61f, 384.0f)
                horizontalLineTo(410.49f)
                curveTo(429.0f, 384.0f, 438.26f, 364.39f, 427.68f, 351.43f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 384.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                verticalLineTo(384.0f)
            }
        }
        .build()
        return _notificationsOutline!!
    }

private var _notificationsOutline: ImageVector? = null
