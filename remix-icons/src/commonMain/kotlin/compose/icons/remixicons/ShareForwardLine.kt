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

public val RemixIcons.ShareForwardLine: ImageVector
    get() {
        if (_shareForwardLine != null) {
            return _shareForwardLine!!
        }
        _shareForwardLine = Builder(name = "ShareForwardLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(8.999f, 8.999f, 0.0f, false, false, -7.968f, 4.81f)
                arcTo(10.136f, 10.136f, 0.0f, false, true, 3.0f, 18.0f)
                curveTo(3.0f, 12.477f, 7.477f, 8.0f, 13.0f, 8.0f)
                lineTo(13.0f, 2.5f)
                lineTo(23.5f, 11.0f)
                lineTo(13.0f, 19.5f)
                lineTo(13.0f, 14.0f)
                close()
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.308f)
                lineTo(20.321f, 11.0f)
                lineTo(15.0f, 6.692f)
                lineTo(15.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(7.982f, 7.982f, 0.0f, false, false, -6.057f, 2.773f)
                arcTo(10.988f, 10.988f, 0.0f, false, true, 11.0f, 12.0f)
                close()
            }
        }
        .build()
        return _shareForwardLine!!
    }

private var _shareForwardLine: ImageVector? = null
