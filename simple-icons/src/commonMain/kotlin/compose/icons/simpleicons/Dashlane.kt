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

public val SimpleIcons.Dashlane: ImageVector
    get() {
        if (_dashlane != null) {
            return _dashlane!!
        }
        _dashlane = Builder(name = "Dashlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.89f, 7.719f)
                curveToRelative(0.0f, -0.149f, -0.149f, -0.298f, -0.357f, -0.357f)
                lineToRelative(-2.502f, -0.922f)
                curveToRelative(-0.417f, -0.179f, -0.893f, 0.03f, -0.893f, 0.328f)
                lineTo(17.137f, 17.25f)
                curveToRelative(0.0f, 0.149f, 0.149f, 0.327f, 0.298f, 0.387f)
                lineToRelative(2.561f, 0.922f)
                curveToRelative(0.387f, 0.149f, 0.894f, -0.06f, 0.894f, -0.387f)
                close()
                moveTo(16.214f, 4.056f)
                curveToRelative(0.0f, -0.149f, -0.149f, -0.298f, -0.358f, -0.357f)
                lineToRelative(-2.501f, -0.922f)
                curveToRelative(-0.417f, -0.179f, -0.894f, 0.03f, -0.894f, 0.328f)
                verticalLineToRelative(6.372f)
                curveToRelative(0.0f, 0.149f, 0.149f, 0.327f, 0.298f, 0.387f)
                lineToRelative(2.561f, 0.922f)
                curveToRelative(0.387f, 0.149f, 0.894f, -0.06f, 0.894f, -0.387f)
                close()
                moveTo(16.214f, 15.522f)
                curveToRelative(0.0f, -0.149f, -0.149f, -0.298f, -0.358f, -0.357f)
                lineToRelative(-2.501f, -0.922f)
                curveToRelative(-0.417f, -0.179f, -0.894f, 0.03f, -0.894f, 0.328f)
                verticalLineToRelative(6.372f)
                curveToRelative(0.0f, 0.149f, 0.149f, 0.327f, 0.298f, 0.387f)
                lineToRelative(2.561f, 0.922f)
                curveToRelative(0.387f, 0.149f, 0.894f, -0.059f, 0.894f, -0.387f)
                close()
                moveTo(11.538f, 16.803f)
                curveToRelative(0.0f, -0.149f, -0.149f, -0.298f, -0.357f, -0.358f)
                lineToRelative(-2.501f, -0.922f)
                curveToRelative(-0.419f, -0.179f, -0.894f, 0.03f, -0.894f, 0.328f)
                verticalLineToRelative(6.79f)
                curveToRelative(0.0f, 0.149f, 0.149f, 0.328f, 0.298f, 0.387f)
                lineToRelative(2.561f, 0.922f)
                curveToRelative(0.387f, 0.149f, 0.894f, -0.06f, 0.894f, -0.387f)
                close()
                moveTo(11.538f, 1.345f)
                curveToRelative(0.0f, -0.149f, -0.149f, -0.298f, -0.357f, -0.357f)
                lineTo(8.679f, 0.066f)
                curveToRelative(-0.419f, -0.179f, -0.894f, 0.03f, -0.894f, 0.328f)
                verticalLineToRelative(6.79f)
                curveToRelative(0.0f, 0.149f, 0.149f, 0.328f, 0.298f, 0.387f)
                lineToRelative(2.561f, 0.922f)
                curveToRelative(0.387f, 0.149f, 0.894f, -0.059f, 0.894f, -0.387f)
                close()
                moveTo(6.863f, 1.614f)
                curveToRelative(0.0f, -0.149f, -0.149f, -0.298f, -0.357f, -0.358f)
                lineTo(4.004f, 0.334f)
                curveTo(3.587f, 0.155f, 3.11f, 0.364f, 3.11f, 0.662f)
                verticalLineToRelative(21.741f)
                curveToRelative(0.0f, 0.149f, 0.149f, 0.327f, 0.298f, 0.387f)
                lineToRelative(2.561f, 0.922f)
                curveToRelative(0.387f, 0.149f, 0.894f, -0.06f, 0.894f, -0.387f)
                close()
            }
        }
        .build()
        return _dashlane!!
    }

private var _dashlane: ImageVector? = null
