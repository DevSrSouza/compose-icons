package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ShareForwardFill: ImageVector
    get() {
        if (_shareForwardFill != null) {
            return _shareForwardFill!!
        }
        _shareForwardFill = Builder(name = "ShareForwardFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(8.999f, 8.999f, 0.0f, false, false, -7.968f, 4.81f)
                arcTo(10.136f, 10.136f, 0.0f, false, true, 3.0f, 18.0f)
                curveTo(3.0f, 12.477f, 7.477f, 8.0f, 13.0f, 8.0f)
                verticalLineTo(3.0f)
                lineToRelative(10.0f, 8.0f)
                lineToRelative(-10.0f, 8.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _shareForwardFill!!
    }

private var _shareForwardFill: ImageVector? = null
