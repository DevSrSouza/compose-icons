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

public val TwotoneGroup.MarkChatRead: ImageVector
    get() {
        if (_markChatRead != null) {
            return _markChatRead!!
        }
        _markChatRead = Builder(name = "MarkChatRead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveToRelative(0.34f, 0.0f, 0.67f, 0.03f, 1.0f, 0.08f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(8.08f)
                curveTo(12.57f, 12.61f, 15.47f, 10.0f, 19.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.34f, 20.0f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineTo(23.0f, 14.34f)
                lineTo(17.34f, 20.0f)
                close()
                moveTo(12.08f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(6.08f)
                curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.14f, 0.02f, -0.27f, 0.03f, -0.4f)
                curveTo(12.01f, 17.4f, 12.0f, 17.2f, 12.0f, 17.0f)
                curveTo(12.0f, 16.66f, 12.03f, 16.33f, 12.08f, 16.0f)
                close()
            }
        }
        .build()
        return _markChatRead!!
    }

private var _markChatRead: ImageVector? = null
