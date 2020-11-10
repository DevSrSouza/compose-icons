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

public val SimpleIcons.TMobile: VectorAsset
    get() {
        if (_tMobile != null) {
            return _tMobile!!
        }
        _tMobile = VectorAssetBuilder(name = "TMobile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.342f, 0.0f)
                lineToRelative(-0.26f, 8.52f)
                lineToRelative(1.3f, 0.196f)
                curveToRelative(0.26f, -2.537f, 0.91f, -4.358f, 1.951f, -5.594f)
                curveTo(6.44f, 1.887f, 8.001f, 1.17f, 10.017f, 1.105f)
                verticalLineToRelative(17.757f)
                curveToRelative(0.0f, 1.56f, -0.195f, 2.536f, -0.65f, 2.991f)
                curveToRelative(-0.39f, 0.39f, -1.041f, 0.65f, -1.952f, 0.715f)
                curveToRelative(-0.26f, 0.0f, -0.716f, 0.066f, -1.366f, 0.066f)
                lineTo(6.049f, 24.0f)
                lineTo(17.95f, 24.0f)
                verticalLineToRelative(-1.366f)
                curveToRelative(-0.65f, 0.0f, -1.105f, 0.0f, -1.365f, -0.066f)
                curveToRelative(-0.91f, -0.065f, -1.561f, -0.325f, -1.951f, -0.715f)
                curveToRelative(-0.456f, -0.455f, -0.65f, -1.496f, -0.65f, -2.991f)
                lineTo(13.984f, 1.172f)
                curveToRelative(2.015f, 0.064f, 3.576f, 0.714f, 4.682f, 2.015f)
                curveToRelative(1.105f, 1.236f, 1.756f, 3.057f, 1.95f, 5.593f)
                lineToRelative(1.302f, -0.195f)
                lineTo(21.593f, 0.0f)
                close()
                moveTo(2.082f, 11.057f)
                verticalLineToRelative(4.878f)
                horizontalLineToRelative(4.877f)
                verticalLineToRelative(-4.878f)
                lineTo(4.62f, 11.057f)
                close()
                moveTo(16.976f, 11.057f)
                verticalLineToRelative(4.878f)
                horizontalLineToRelative(4.878f)
                verticalLineToRelative(-4.878f)
                horizontalLineToRelative(-2.081f)
                close()
            }
        }
        .build()
        return _tMobile!!
    }

private var _tMobile: VectorAsset? = null
