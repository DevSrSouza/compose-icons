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

public val SimpleIcons.Myget: ImageVector
    get() {
        if (_myget != null) {
            return _myget!!
        }
        _myget = Builder(name = "Myget", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.96f, 0.0f)
                lineTo(1.1f, 4.34f)
                verticalLineToRelative(14.28f)
                lineTo(11.9f, 24.0f)
                lineToRelative(11.0f, -5.38f)
                lineTo(22.9f, 13.8f)
                horizontalLineToRelative(-3.2f)
                verticalLineToRelative(2.87f)
                lineToRelative(-7.8f, 3.83f)
                lineToRelative(-7.64f, -3.83f)
                lineTo(4.26f, 8.02f)
                lineToRelative(7.64f, 3.72f)
                lineToRelative(10.8f, -5.6f)
                close()
                moveTo(11.72f, 3.53f)
                lineTo(16.02f, 6.0f)
                lineToRelative(-4.15f, 2.17f)
                lineToRelative(-5.22f, -2.56f)
                close()
            }
        }
        .build()
        return _myget!!
    }

private var _myget: ImageVector? = null
