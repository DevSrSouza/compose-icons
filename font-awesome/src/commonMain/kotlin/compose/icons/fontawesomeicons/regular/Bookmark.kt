package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 0.0f)
                horizontalLineToRelative(-288.0f)
                curveTo(21.49f, 0.0f, 0.0f, 21.49f, 0.0f, 48.0f)
                verticalLineToRelative(431.9f)
                curveToRelative(0.0f, 24.7f, 26.79f, 40.08f, 48.12f, 27.64f)
                lineTo(192.0f, 423.6f)
                lineToRelative(143.9f, 83.93f)
                curveTo(357.2f, 519.1f, 384.0f, 504.6f, 384.0f, 479.9f)
                verticalLineTo(48.0f)
                curveTo(384.0f, 21.49f, 362.5f, 0.0f, 336.0f, 0.0f)
                close()
                moveTo(336.0f, 452.0f)
                lineTo(192.0f, 368.0f)
                lineToRelative(-144.0f, 84.0f)
                verticalLineTo(54.0f)
                curveTo(48.0f, 50.63f, 50.63f, 48.0f, 53.1f, 48.0f)
                horizontalLineToRelative(276.0f)
                curveTo(333.4f, 48.0f, 336.0f, 50.63f, 336.0f, 54.0f)
                verticalLineTo(452.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
