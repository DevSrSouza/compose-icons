package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.NotificationsCircleSharp: ImageVector
    get() {
        if (_notificationsCircleSharp != null) {
            return _notificationsCircleSharp!!
        }
        _notificationsCircleSharp = Builder(name = "NotificationsCircleSharp", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(295.68f, 351.43f)
                curveToRelative(0.0f, 0.19f, 0.0f, 0.38f, 0.0f, 0.57f)
                horizontalLineTo(296.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(256.0f, 384.0f)
                curveToRelative(-22.48f, 0.0f, -40.0f, -10.25f, -40.0f, -32.0f)
                horizontalLineToRelative(80.0f)
                curveTo(295.7f, 373.37f, 278.29f, 384.0f, 256.0f, 384.0f)
                close()
                moveTo(368.0f, 336.0f)
                lineTo(144.0f, 336.0f)
                lineTo(144.0f, 308.0f)
                lineToRelative(28.0f, -36.0f)
                lineTo(172.0f, 239.7f)
                curveToRelative(0.0f, -40.41f, 15.82f, -75.35f, 56.0f, -84.27f)
                lineTo(232.0f, 128.0f)
                horizontalLineToRelative(48.0f)
                lineToRelative(4.0f, 27.43f)
                curveToRelative(40.0f, 8.92f, 56.0f, 44.0f, 56.0f, 84.27f)
                lineTo(340.0f, 272.0f)
                lineToRelative(28.0f, 36.0f)
                close()
            }
        }
        .build()
        return _notificationsCircleSharp!!
    }

private var _notificationsCircleSharp: ImageVector? = null
