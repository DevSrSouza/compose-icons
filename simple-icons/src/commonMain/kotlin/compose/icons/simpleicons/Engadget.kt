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

public val SimpleIcons.Engadget: ImageVector
    get() {
        if (_engadget != null) {
            return _engadget!!
        }
        _engadget = Builder(name = "Engadget", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.067f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 4.0f, 3.866f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-4.0f)
                lineTo(4.0f, 19.933f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(15.733f)
                arcTo(4.231f, 4.231f, 0.0f, false, false, 24.0f, 12.067f)
                lineTo(24.0f, 4.333f)
                arcTo(4.483f, 4.483f, 0.0f, false, false, 19.733f, 0.067f)
                lineTo(4.0f, 0.067f)
                arcToRelative(4.346f, 4.346f, 0.0f, false, false, -4.0f, 4.266f)
                close()
                moveTo(20.0f, 11.933f)
                lineTo(4.0f, 11.933f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _engadget!!
    }

private var _engadget: ImageVector? = null
