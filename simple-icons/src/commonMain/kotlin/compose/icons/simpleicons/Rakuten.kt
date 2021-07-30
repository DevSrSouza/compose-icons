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

public val SimpleIcons.Rakuten: ImageVector
    get() {
        if (_rakuten != null) {
            return _rakuten!!
        }
        _rakuten = Builder(name = "Rakuten", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.277f, 21.3f)
                lineTo(3.939f, 24.0f)
                lineTo(0.722f, 21.3f)
                horizontalLineToRelative(22.555f)
                close()
                moveTo(7.6f, 19.276f)
                lineTo(3.939f, 19.276f)
                lineTo(3.939f, 0.0f)
                horizontalLineToRelative(6.052f)
                arcToRelative(6.653f, 6.653f, 0.0f, false, true, 6.65f, 6.646f)
                curveToRelative(0.0f, 2.234f, -1.108f, 4.204f, -2.799f, 5.418f)
                lineToRelative(5.418f, 7.211f)
                horizontalLineToRelative(-4.585f)
                lineToRelative(-4.486f, -5.979f)
                lineTo(7.6f, 13.296f)
                verticalLineToRelative(5.98f)
                close()
                moveTo(7.6f, 9.636f)
                horizontalLineToRelative(2.392f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, 2.989f, -2.989f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, -2.989f, -2.986f)
                lineTo(7.6f, 3.661f)
                verticalLineToRelative(5.975f)
                close()
            }
        }
        .build()
        return _rakuten!!
    }

private var _rakuten: ImageVector? = null
