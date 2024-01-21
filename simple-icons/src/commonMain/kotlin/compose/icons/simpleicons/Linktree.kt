package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Linktree: ImageVector
    get() {
        if (_linktree != null) {
            return _linktree!!
        }
        _linktree = Builder(name = "Linktree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.7364f, 5.8525f)
                lineToRelative(4.0047f, -4.1167f)
                lineToRelative(2.3248f, 2.3808f)
                lineToRelative(-4.2006f, 4.0047f)
                horizontalLineToRelative(5.9085f)
                verticalLineToRelative(3.3047f)
                horizontalLineToRelative(-5.9365f)
                lineToRelative(4.2287f, 4.1077f)
                lineToRelative(-2.3248f, 2.3338f)
                lineTo(12.0005f, 12.099f)
                lineToRelative(-5.7405f, 5.7685f)
                lineToRelative(-2.3248f, -2.3248f)
                lineToRelative(4.2286f, -4.1077f)
                horizontalLineToRelative(-5.9375f)
                lineTo(2.2263f, 8.1213f)
                horizontalLineToRelative(5.9085f)
                lineTo(3.9342f, 4.1167f)
                lineToRelative(2.3248f, -2.3808f)
                lineToRelative(4.0047f, 4.1167f)
                lineTo(10.2637f, 0.0f)
                horizontalLineToRelative(3.4727f)
                close()
                moveTo(10.2636f, 16.1586f)
                horizontalLineToRelative(3.4727f)
                lineTo(13.7364f, 24.0f)
                horizontalLineToRelative(-3.4727f)
                close()
            }
        }
        .build()
        return _linktree!!
    }

private var _linktree: ImageVector? = null
