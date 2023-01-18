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

public val IonIcons.NotificationsSharp: ImageVector
    get() {
        if (_notificationsSharp != null) {
            return _notificationsSharp!!
        }
        _notificationsSharp = Builder(name = "NotificationsSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, 73.3f, -48.0f)
                horizontalLineTo(182.7f)
                arcTo(80.09f, 80.09f, 0.0f, false, false, 256.0f, 480.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 288.0f)
                verticalLineTo(227.47f)
                curveTo(400.0f, 157.0f, 372.64f, 95.61f, 304.0f, 80.0f)
                lineToRelative(-8.0f, -48.0f)
                horizontalLineTo(216.0f)
                lineToRelative(-8.0f, 48.0f)
                curveToRelative(-68.88f, 15.61f, -96.0f, 76.76f, -96.0f, 147.47f)
                verticalLineTo(288.0f)
                lineTo(64.0f, 352.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(352.0f)
                close()
            }
        }
        .build()
        return _notificationsSharp!!
    }

private var _notificationsSharp: ImageVector? = null
