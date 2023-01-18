package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.NotificationsOffOutline: ImageVector
    get() {
        if (_notificationsOffOutline != null) {
            return _notificationsOffOutline!!
        }
        _notificationsOffOutline = Builder(name = "NotificationsOffOutline", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.51f, 204.59f)
                quadToRelative(-0.37f, 6.15f, -0.37f, 12.76f)
                curveTo(128.14f, 304.0f, 110.0f, 320.0f, 84.33f, 351.43f)
                curveTo(73.69f, 364.45f, 83.0f, 384.0f, 101.62f, 384.0f)
                horizontalLineTo(320.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(414.5f, 335.3f)
                curveToRelative(-18.48f, -23.45f, -30.62f, -47.05f, -30.62f, -118.0f)
                curveTo(383.88f, 138.0f, 343.36f, 109.73f, 310.0f, 96.0f)
                curveToRelative(-4.43f, -1.82f, -8.6f, -6.0f, -9.95f, -10.55f)
                curveTo(294.21f, 65.54f, 277.82f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(217.8f, 65.55f, 212.0f, 85.47f)
                curveToRelative(-1.35f, 4.6f, -5.52f, 8.71f, -10.0f, 10.53f)
                arcToRelative(149.57f, 149.57f, 0.0f, false, false, -18.0f, 8.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 384.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                verticalLineTo(384.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 448.0f)
                lineTo(64.0f, 64.0f)
            }
        }
        .build()
        return _notificationsOffOutline!!
    }

private var _notificationsOffOutline: ImageVector? = null
