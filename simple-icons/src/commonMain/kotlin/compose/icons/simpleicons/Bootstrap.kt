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

public val SimpleIcons.Bootstrap: VectorAsset
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = VectorAssetBuilder(name = "Bootstrap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.793f, 0.006f, 0.006f, 1.793f, 0.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.2f, 1.8f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.2f, 0.0f, 4.0f, -1.8f, 4.0f, -4.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.2f, -1.8f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(17.813f, 16.855f)
                curveToRelative(-0.2f, 0.482f, -0.517f, 0.907f, -0.923f, 1.234f)
                curveToRelative(-0.42f, 0.34f, -0.952f, 0.62f, -1.607f, 0.82f)
                curveToRelative(-0.654f, 0.203f, -1.432f, 0.305f, -2.333f, 0.305f)
                lineTo(6.518f, 19.214f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(6.802f)
                curveToRelative(1.258f, 0.0f, 2.266f, 0.283f, 3.02f, 0.86f)
                curveToRelative(0.76f, 0.58f, 1.138f, 1.444f, 1.138f, 2.61f)
                curveToRelative(0.0f, 0.705f, -0.172f, 1.31f, -0.518f, 1.81f)
                curveToRelative(-0.344f, 0.497f, -0.84f, 0.886f, -1.48f, 1.156f)
                verticalLineToRelative(0.046f)
                curveToRelative(0.854f, 0.18f, 1.515f, 0.585f, 1.95f, 1.215f)
                reflectiveCurveToRelative(0.658f, 1.426f, 0.658f, 2.387f)
                curveToRelative(0.0f, 0.538f, -0.104f, 1.05f, -0.3f, 1.528f)
                lineToRelative(0.025f, 0.027f)
                close()
                moveTo(15.037f, 13.405f)
                curveToRelative(-0.41f, -0.375f, -0.986f, -0.558f, -1.73f, -0.558f)
                lineTo(8.985f, 12.847f)
                verticalLineToRelative(4.368f)
                horizontalLineToRelative(4.334f)
                curveToRelative(0.74f, 0.0f, 1.32f, -0.192f, 1.73f, -0.58f)
                curveToRelative(0.41f, -0.385f, 0.62f, -0.934f, 0.62f, -1.64f)
                curveToRelative(-0.007f, -0.69f, -0.21f, -1.224f, -0.62f, -1.59f)
                horizontalLineToRelative(-0.017f)
                close()
                moveTo(14.437f, 10.582f)
                curveToRelative(0.396f, -0.336f, 0.59f, -0.817f, 0.59f, -1.444f)
                curveToRelative(0.0f, -0.704f, -0.175f, -1.204f, -0.53f, -1.49f)
                curveToRelative(-0.352f, -0.285f, -0.86f, -0.433f, -1.528f, -0.433f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.863f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.583f, 0.0f, 1.08f, -0.17f, 1.464f, -0.496f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: VectorAsset? = null
