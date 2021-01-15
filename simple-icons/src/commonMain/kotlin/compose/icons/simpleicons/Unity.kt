package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.533f)
                lineTo(21.374f, 0.0f)
                lineTo(11.57f, 2.555f)
                lineToRelative(-1.45f, 2.49f)
                lineToRelative(-2.945f, -0.022f)
                lineTo(0.0f, 12.0f)
                lineToRelative(7.176f, 6.978f)
                lineToRelative(2.943f, -0.023f)
                lineToRelative(1.454f, 2.49f)
                lineToRelative(9.8f, 2.554f)
                lineTo(24.0f, 14.47f)
                lineTo(22.508f, 12.0f)
                lineTo(24.0f, 9.533f)
                close()
                moveTo(10.356f, 5.445f)
                lineToRelative(7.499f, -1.874f)
                lineToRelative(-4.304f, 7.251f)
                lineTo(4.94f, 10.822f)
                lineToRelative(5.416f, -5.377f)
                close()
                moveTo(10.356f, 18.555f)
                lineTo(4.94f, 13.18f)
                horizontalLineToRelative(8.61f)
                lineToRelative(4.305f, 7.251f)
                lineToRelative(-7.5f, -1.874f)
                close()
                moveTo(19.954f, 19.251f)
                lineToRelative(-4.307f, -7.25f)
                lineToRelative(4.307f, -7.253f)
                lineTo(22.033f, 12.0f)
                lineToRelative(-2.08f, 7.25f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
