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

public val SimpleIcons.Crayon: ImageVector
    get() {
        if (_crayon != null) {
            return _crayon!!
        }
        _crayon = Builder(name = "Crayon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9485f, 16.5624f)
                curveTo(3.1842f, 17.7981f, 4.8f, 18.4159f, 6.416f, 18.4159f)
                curveToRelative(1.6158f, 0.0f, 3.2317f, -0.6179f, 4.4673f, -1.8535f)
                lineToRelative(5.798f, -5.798f)
                lineToRelative(-1.4257f, -1.4258f)
                lineToRelative(-5.798f, 5.7505f)
                curveToRelative(-1.6634f, 1.6634f, -4.3723f, 1.6634f, -6.0832f, 0.0f)
                lineToRelative(-0.095f, -0.095f)
                curveToRelative(-1.6635f, -1.6634f, -1.6635f, -4.3723f, 0.0f, -6.0832f)
                lineToRelative(0.095f, -0.095f)
                curveToRelative(1.6633f, -1.6635f, 4.3723f, -1.6635f, 6.0832f, 0.0f)
                lineToRelative(0.4752f, 0.5227f)
                lineToRelative(1.4258f, -1.4258f)
                lineToRelative(-0.4753f, -0.5227f)
                curveToRelative(-2.4713f, -2.4713f, -6.5109f, -2.4713f, -8.9822f, 0.0f)
                lineToRelative(-0.0475f, 0.1425f)
                curveToRelative(-2.4713f, 2.4713f, -2.4713f, 6.511f, 0.0f, 8.9823f)
                close()
                moveTo(22.0041f, 7.4376f)
                curveToRelative(-1.2357f, -1.2357f, -2.8515f, -1.8535f, -4.4674f, -1.8535f)
                curveToRelative(-1.6158f, 0.0f, -3.2317f, 0.6179f, -4.4673f, 1.8535f)
                lineToRelative(-5.798f, 5.798f)
                lineToRelative(1.4257f, 1.4258f)
                lineToRelative(5.798f, -5.7505f)
                curveToRelative(1.6634f, -1.6634f, 4.3723f, -1.6634f, 6.0832f, 0.0f)
                lineToRelative(0.095f, 0.095f)
                curveToRelative(1.6634f, 1.6634f, 1.6634f, 4.3723f, 0.0f, 6.0832f)
                lineToRelative(-0.095f, 0.095f)
                curveToRelative(-1.6633f, 1.6635f, -4.3723f, 1.6635f, -6.0832f, 0.0f)
                lineToRelative(-0.4752f, -0.4752f)
                lineToRelative(-1.4258f, 1.4258f)
                lineToRelative(0.4753f, 0.4752f)
                curveToRelative(2.4713f, 2.4713f, 6.5109f, 2.4713f, 8.9822f, 0.0f)
                lineToRelative(0.095f, -0.095f)
                curveToRelative(2.4713f, -2.4713f, 2.4713f, -6.511f, 0.0f, -8.9823f)
                curveToRelative(-0.0475f, 0.0f, -0.1425f, -0.095f, -0.1425f, -0.095f)
                close()
            }
        }
        .build()
        return _crayon!!
    }

private var _crayon: ImageVector? = null
