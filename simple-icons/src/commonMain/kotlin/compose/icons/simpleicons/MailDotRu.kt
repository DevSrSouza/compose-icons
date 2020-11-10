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

public val SimpleIcons.MailDotRu: VectorAsset
    get() {
        if (_mailDotRu != null) {
            return _mailDotRu!!
        }
        _mailDotRu = VectorAssetBuilder(name = "MailDotRu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.585f, 5.267f)
                curveToRelative(1.834f, 0.0f, 3.558f, 0.811f, 4.824f, 2.08f)
                verticalLineToRelative(0.004f)
                curveToRelative(0.0f, -0.609f, 0.41f, -1.068f, 0.979f, -1.068f)
                horizontalLineToRelative(0.145f)
                curveToRelative(0.891f, 0.0f, 1.073f, 0.842f, 1.073f, 1.109f)
                lineToRelative(0.005f, 9.475f)
                curveToRelative(-0.063f, 0.621f, 0.64f, 0.941f, 1.029f, 0.543f)
                curveToRelative(1.521f, -1.564f, 3.342f, -8.038f, -0.946f, -11.79f)
                curveToRelative(-3.996f, -3.497f, -9.357f, -2.921f, -12.209f, -0.955f)
                curveToRelative(-3.031f, 2.091f, -4.971f, 6.718f, -3.086f, 11.064f)
                curveToRelative(2.054f, 4.74f, 7.931f, 6.152f, 11.424f, 4.744f)
                curveToRelative(1.769f, -0.715f, 2.586f, 1.676f, 0.749f, 2.457f)
                curveToRelative(-2.776f, 1.184f, -10.502f, 1.064f, -14.11f, -5.188f)
                curveTo(-0.977f, 13.521f, -0.847f, 6.093f, 5.62f, 2.245f)
                curveTo(10.567f, -0.698f, 17.09f, 0.117f, 21.022f, 4.224f)
                curveToRelative(4.111f, 4.294f, 3.872f, 12.334f, -0.139f, 15.461f)
                curveToRelative(-1.816f, 1.42f, -4.516f, 0.037f, -4.498f, -2.031f)
                lineToRelative(-0.019f, -0.678f)
                curveToRelative(-1.265f, 1.256f, -2.948f, 1.988f, -4.782f, 1.988f)
                curveToRelative(-3.625f, 0.0f, -6.813f, -3.189f, -6.813f, -6.812f)
                curveToRelative(0.0f, -3.659f, 3.189f, -6.885f, 6.814f, -6.885f)
                close()
                moveTo(16.146f, 11.89f)
                curveToRelative(-0.137f, -2.653f, -2.106f, -4.249f, -4.484f, -4.249f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-2.745f, 0.0f, -4.268f, 2.159f, -4.268f, 4.61f)
                curveToRelative(0.0f, 2.747f, 1.842f, 4.481f, 4.256f, 4.481f)
                curveToRelative(2.693f, 0.0f, 4.464f, -1.973f, 4.592f, -4.306f)
                lineToRelative(-0.006f, -0.536f)
                close()
            }
        }
        .build()
        return _mailDotRu!!
    }

private var _mailDotRu: VectorAsset? = null
