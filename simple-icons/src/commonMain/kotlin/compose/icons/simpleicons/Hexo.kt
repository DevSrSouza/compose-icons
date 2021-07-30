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

public val SimpleIcons.Hexo: ImageVector
    get() {
        if (_hexo != null) {
            return _hexo!!
        }
        _hexo = Builder(name = "Hexo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.02f, 0.0f)
                lineTo(1.596f, 6.02f)
                lineToRelative(-0.02f, 12.0f)
                lineTo(11.978f, 24.0f)
                lineToRelative(10.426f, -6.02f)
                lineToRelative(0.02f, -12.0f)
                close()
                moveTo(16.848f, 17.14f)
                lineToRelative(-0.96f, 0.558f)
                lineToRelative(-0.969f, -0.574f)
                lineTo(14.919f, 12.99f)
                lineTo(9.081f, 12.99f)
                verticalLineToRelative(4.15f)
                lineToRelative(-0.96f, 0.558f)
                lineToRelative(-0.969f, -0.574f)
                lineTo(7.152f, 6.854f)
                lineToRelative(0.964f, -0.552f)
                lineToRelative(0.965f, 0.563f)
                verticalLineToRelative(4.145f)
                horizontalLineToRelative(5.838f)
                lineTo(14.919f, 6.86f)
                lineToRelative(0.965f, -0.552f)
                lineToRelative(0.964f, 0.563f)
                close()
            }
        }
        .build()
        return _hexo!!
    }

private var _hexo: ImageVector? = null
