package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Vk: VectorAsset
    get() {
        if (_vk != null) {
            return _vk!!
        }
        _vk = VectorAssetBuilder(name = "Vk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.684f, 0.0f)
                lineTo(8.316f, 0.0f)
                curveTo(1.592f, 0.0f, 0.0f, 1.592f, 0.0f, 8.316f)
                verticalLineToRelative(7.368f)
                curveTo(0.0f, 22.408f, 1.592f, 24.0f, 8.316f, 24.0f)
                horizontalLineToRelative(7.368f)
                curveTo(22.408f, 24.0f, 24.0f, 22.408f, 24.0f, 15.684f)
                lineTo(24.0f, 8.316f)
                curveTo(24.0f, 1.592f, 22.391f, 0.0f, 15.684f, 0.0f)
                close()
                moveTo(19.376f, 17.123f)
                horizontalLineToRelative(-1.744f)
                curveToRelative(-0.66f, 0.0f, -0.864f, -0.525f, -2.05f, -1.727f)
                curveToRelative(-1.033f, -1.0f, -1.49f, -1.135f, -1.744f, -1.135f)
                curveToRelative(-0.356f, 0.0f, -0.458f, 0.102f, -0.458f, 0.593f)
                verticalLineToRelative(1.575f)
                curveToRelative(0.0f, 0.424f, -0.135f, 0.678f, -1.253f, 0.678f)
                curveToRelative(-1.846f, 0.0f, -3.896f, -1.118f, -5.335f, -3.202f)
                curveTo(4.624f, 10.857f, 4.03f, 8.57f, 4.03f, 8.096f)
                curveToRelative(0.0f, -0.254f, 0.102f, -0.491f, 0.593f, -0.491f)
                horizontalLineToRelative(1.744f)
                curveToRelative(0.44f, 0.0f, 0.61f, 0.203f, 0.78f, 0.677f)
                curveToRelative(0.863f, 2.49f, 2.303f, 4.675f, 2.896f, 4.675f)
                curveToRelative(0.22f, 0.0f, 0.322f, -0.102f, 0.322f, -0.66f)
                lineTo(10.365f, 9.721f)
                curveToRelative(-0.068f, -1.186f, -0.695f, -1.287f, -0.695f, -1.71f)
                curveToRelative(0.0f, -0.204f, 0.17f, -0.407f, 0.44f, -0.407f)
                horizontalLineToRelative(2.744f)
                curveToRelative(0.373f, 0.0f, 0.508f, 0.203f, 0.508f, 0.643f)
                verticalLineToRelative(3.473f)
                curveToRelative(0.0f, 0.372f, 0.17f, 0.508f, 0.271f, 0.508f)
                curveToRelative(0.22f, 0.0f, 0.407f, -0.136f, 0.813f, -0.542f)
                curveToRelative(1.254f, -1.406f, 2.151f, -3.574f, 2.151f, -3.574f)
                curveToRelative(0.119f, -0.254f, 0.322f, -0.491f, 0.763f, -0.491f)
                horizontalLineToRelative(1.744f)
                curveToRelative(0.525f, 0.0f, 0.644f, 0.27f, 0.525f, 0.643f)
                curveToRelative(-0.22f, 1.017f, -2.354f, 4.031f, -2.354f, 4.031f)
                curveToRelative(-0.186f, 0.305f, -0.254f, 0.44f, 0.0f, 0.78f)
                curveToRelative(0.186f, 0.254f, 0.796f, 0.779f, 1.203f, 1.253f)
                curveToRelative(0.745f, 0.847f, 1.32f, 1.558f, 1.473f, 2.05f)
                curveToRelative(0.17f, 0.49f, -0.085f, 0.744f, -0.576f, 0.744f)
                close()
            }
        }
        .build()
        return _vk!!
    }

private var _vk: VectorAsset? = null
