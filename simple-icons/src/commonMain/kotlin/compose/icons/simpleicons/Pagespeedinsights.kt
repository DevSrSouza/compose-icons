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

public val SimpleIcons.Pagespeedinsights: ImageVector
    get() {
        if (_pagespeedinsights != null) {
            return _pagespeedinsights!!
        }
        _pagespeedinsights = Builder(name = "Pagespeedinsights", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.363f, 1.636f)
                lineTo(1.635f, 1.636f)
                curveTo(0.732f, 1.636f, 0.0f, 2.37f, 0.001f, 3.273f)
                lineTo(0.0f, 20.727f)
                verticalLineToRelative(0.003f)
                curveToRelative(0.0f, 0.903f, 0.733f, 1.634f, 1.635f, 1.634f)
                horizontalLineToRelative(20.73f)
                curveToRelative(0.904f, 0.0f, 1.635f, -0.734f, 1.635f, -1.637f)
                lineTo(24.0f, 3.273f)
                curveToRelative(0.016f, -0.89f, -0.76f, -1.64f, -1.637f, -1.637f)
                close()
                moveTo(3.979f, 2.886f)
                curveToRelative(0.492f, -0.507f, 1.279f, 0.28f, 0.77f, 0.772f)
                curveToRelative(-0.491f, 0.508f, -1.278f, -0.279f, -0.77f, -0.771f)
                close()
                moveTo(1.8f, 2.89f)
                curveToRelative(0.507f, -0.509f, 1.28f, 0.265f, 0.772f, 0.771f)
                curveToRelative(-0.493f, 0.502f, -1.274f, -0.28f, -0.772f, -0.771f)
                close()
                moveTo(23.5f, 20.728f)
                curveToRelative(0.012f, 0.611f, -0.524f, 1.148f, -1.137f, 1.136f)
                lineTo(1.635f, 21.864f)
                arcTo(1.137f, 1.137f, 0.0f, false, true, 0.5f, 20.727f)
                lineTo(0.501f, 4.91f)
                lineTo(23.5f, 4.91f)
                verticalLineToRelative(15.819f)
                close()
                moveTo(11.0f, 16.159f)
                lineToRelative(5.946f, -4.577f)
                curveToRelative(0.235f, -0.2f, 0.576f, 0.129f, 0.389f, 0.372f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-3.936f, 6.35f)
                arcToRelative(1.638f, 1.638f, 0.0f, false, true, -2.448f, 0.405f)
                curveToRelative(-0.785f, -0.668f, -0.811f, -1.835f, 0.05f, -2.548f)
                close()
                moveTo(15.763f, 15.409f)
                curveToRelative(0.09f, -0.168f, 2.002f, -3.181f, 2.06f, -3.35f)
                curveToRelative(2.056f, 1.813f, 3.029f, 4.382f, 2.898f, 7.026f)
                horizontalLineToRelative(-3.819f)
                curveToRelative(0.073f, -1.39f, -0.29f, -2.678f, -1.139f, -3.676f)
                close()
                moveTo(7.084f, 19.091f)
                lineTo(3.278f, 19.091f)
                curveToRelative(-0.357f, -7.022f, 7.148f, -11.735f, 13.39f, -7.92f)
                lineToRelative(-3.461f, 2.618f)
                curveToRelative(-3.3f, -0.762f, -6.364f, 1.71f, -6.123f, 5.302f)
                close()
            }
        }
        .build()
        return _pagespeedinsights!!
    }

private var _pagespeedinsights: ImageVector? = null
