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

public val SharpGroup.MarkChatRead: ImageVector
    get() {
        if (_markChatRead != null) {
            return _markChatRead!!
        }
        _markChatRead = Builder(name = "MarkChatRead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.03f, 17.5f)
                curveTo(12.01f, 17.67f, 12.0f, 17.83f, 12.0f, 18.0f)
                verticalLineToRelative(0.0f)
                horizontalLineTo(6.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(8.68f)
                curveTo(21.09f, 10.25f, 20.08f, 10.0f, 19.0f, 10.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f)
                curveTo(12.0f, 17.17f, 12.01f, 17.33f, 12.03f, 17.5f)
                close()
                moveTo(23.0f, 14.34f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(17.34f, 20.0f)
                lineTo(23.0f, 14.34f)
                close()
            }
        }
        .build()
        return _markChatRead!!
    }

private var _markChatRead: ImageVector? = null
