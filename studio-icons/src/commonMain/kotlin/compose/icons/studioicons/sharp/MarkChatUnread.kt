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

public val SharpGroup.MarkChatUnread: ImageVector
    get() {
        if (_markChatUnread != null) {
            return _markChatUnread!!
        }
        _markChatUnread = Builder(name = "MarkChatUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.98f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(12.1f)
                curveTo(14.04f, 2.32f, 14.0f, 2.66f, 14.0f, 3.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveTo(20.13f, 8.0f, 21.16f, 7.61f, 22.0f, 6.98f)
                close()
                moveTo(16.0f, 3.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(16.0f, 1.34f, 16.0f, 3.0f)
                close()
            }
        }
        .build()
        return _markChatUnread!!
    }

private var _markChatUnread: ImageVector? = null
