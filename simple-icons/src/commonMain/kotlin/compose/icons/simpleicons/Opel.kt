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

public val SimpleIcons.Opel: VectorAsset
    get() {
        if (_opel != null) {
            return _opel!!
        }
        _opel = VectorAssetBuilder(name = "Opel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.82f, 12.921f)
                lineToRelative(-2.256f, -0.143f)
                curveToRelative(0.021f, -0.256f, 0.031f, -0.516f, 0.031f, -0.777f)
                curveToRelative(0.0f, -5.302f, -4.298f, -9.6f, -9.6f, -9.6f)
                curveToRelative(-4.588f, 0.0f, -8.423f, 3.218f, -9.373f, 7.52f)
                horizontalLineTo(0.851f)
                curveToRelative(-0.116f, 0.0f, -0.22f, 0.055f, -0.285f, 0.141f)
                lineToRelative(-0.527f, 0.728f)
                curveTo(0.014f, 10.819f, 0.0f, 10.857f, 0.0f, 10.899f)
                curveToRelative(0.0f, 0.1f, 0.08f, 0.18f, 0.18f, 0.18f)
                lineToRelative(2.247f, 0.14f)
                curveTo(2.406f, 11.477f, 2.395f, 11.737f, 2.395f, 12.0f)
                curveToRelative(0.0f, 5.302f, 4.298f, 9.6f, 9.6f, 9.6f)
                curveToRelative(4.588f, 0.0f, 8.423f, -3.218f, 9.374f, -7.52f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.116f, 0.0f, 0.22f, -0.055f, 0.285f, -0.141f)
                lineToRelative(0.527f, -0.728f)
                curveTo(23.986f, 13.181f, 24.0f, 13.143f, 24.0f, 13.101f)
                curveTo(24.0f, 13.001f, 23.919f, 12.921f, 23.82f, 12.921f)
                close()
                moveTo(11.995f, 20.245f)
                curveToRelative(-4.507f, 0.0f, -8.245f, -3.738f, -8.245f, -8.245f)
                curveToRelative(0.0f, -0.234f, 0.011f, -0.467f, 0.031f, -0.696f)
                lineToRelative(6.899f, 0.43f)
                lineToRelative(-2.984f, 2.061f)
                curveToRelative(-0.04f, 0.028f, -0.067f, 0.075f, -0.067f, 0.128f)
                curveToRelative(0.0f, 0.086f, 0.07f, 0.156f, 0.156f, 0.156f)
                horizontalLineToRelative(12.183f)
                curveTo(19.031f, 17.601f, 15.785f, 20.245f, 11.995f, 20.245f)
                close()
                moveTo(20.21f, 12.692f)
                lineToRelative(-6.892f, -0.438f)
                lineToRelative(2.991f, -2.049f)
                curveToRelative(0.041f, -0.028f, 0.067f, -0.075f, 0.067f, -0.128f)
                curveToRelative(0.0f, -0.086f, -0.07f, -0.156f, -0.156f, -0.156f)
                horizontalLineTo(4.022f)
                curveToRelative(0.937f, -3.521f, 4.183f, -6.165f, 7.973f, -6.165f)
                curveToRelative(4.507f, 0.0f, 8.245f, 3.738f, 8.245f, 8.245f)
                curveTo(20.24f, 12.233f, 20.23f, 12.463f, 20.21f, 12.692f)
                close()
            }
        }
        .build()
        return _opel!!
    }

private var _opel: VectorAsset? = null
