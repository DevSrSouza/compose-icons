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

public val RemixIcons.RssFill: ImageVector
    get() {
        if (_rssFill != null) {
            return _rssFill!!
        }
        _rssFill = Builder(name = "RssFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveToRelative(9.941f, 0.0f, 18.0f, 8.059f, 18.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -8.284f, -6.716f, -15.0f, -15.0f, -15.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(3.0f, 10.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _rssFill!!
    }

private var _rssFill: ImageVector? = null