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

public val SimpleIcons.Confluence: ImageVector
    get() {
        if (_confluence != null) {
            return _confluence!!
        }
        _confluence = Builder(name = "Confluence", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.87f, 18.257f)
                curveToRelative(-0.248f, 0.382f, -0.53f, 0.875f, -0.763f, 1.245f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, 0.255f, 1.04f)
                lineToRelative(4.965f, 3.054f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, 1.058f, -0.26f)
                curveToRelative(0.199f, -0.332f, 0.454f, -0.763f, 0.733f, -1.221f)
                curveToRelative(1.967f, -3.247f, 3.945f, -2.853f, 7.508f, -1.146f)
                lineToRelative(4.957f, 2.337f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, 1.028f, -0.382f)
                lineToRelative(2.364f, -5.346f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, -0.382f, -1.0f)
                arcToRelative(599.851f, 599.851f, 0.0f, false, true, -4.965f, -2.361f)
                curveTo(10.911f, 10.97f, 5.224f, 11.185f, 0.87f, 18.257f)
                close()
                moveTo(23.131f, 5.743f)
                curveToRelative(0.249f, -0.405f, 0.531f, -0.875f, 0.764f, -1.25f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, -0.256f, -1.034f)
                lineTo(18.675f, 0.404f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, -1.058f, 0.26f)
                curveToRelative(-0.195f, 0.335f, -0.451f, 0.763f, -0.734f, 1.225f)
                curveToRelative(-1.966f, 3.246f, -3.945f, 2.85f, -7.508f, 1.146f)
                lineTo(4.437f, 0.694f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, -1.027f, 0.382f)
                lineTo(1.046f, 6.422f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, 0.382f, 1.0f)
                curveToRelative(1.039f, 0.49f, 3.105f, 1.467f, 4.965f, 2.361f)
                curveToRelative(6.698f, 3.246f, 12.392f, 3.029f, 16.738f, -4.04f)
                close()
            }
        }
        .build()
        return _confluence!!
    }

private var _confluence: ImageVector? = null
