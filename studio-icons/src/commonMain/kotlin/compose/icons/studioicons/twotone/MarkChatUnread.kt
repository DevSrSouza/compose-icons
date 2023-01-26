package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.MarkChatUnread: ImageVector
    get() {
        if (_markChatUnread != null) {
            return _markChatUnread!!
        }
        _markChatUnread = Builder(name = "MarkChatUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(7.9f)
                curveTo(19.68f, 7.96f, 19.34f, 8.0f, 19.0f, 8.0f)
                curveToRelative(-2.42f, 0.0f, -4.44f, -1.72f, -4.9f, -4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.9f)
                curveToRelative(0.74f, -0.15f, 1.42f, -0.48f, 2.0f, -0.92f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.1f)
                curveTo(14.04f, 2.32f, 14.0f, 2.66f, 14.0f, 3.0f)
                reflectiveCurveToRelative(0.04f, 0.68f, 0.1f, 1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(7.9f)
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
