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

public val SimpleIcons.Devrant: ImageVector
    get() {
        if (_devrant != null) {
            return _devrant!!
        }
        _devrant = Builder(name = "Devrant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.72f, 0.0f)
                curveTo(5.482f, -0.015f, 1.592f, 4.046f, 1.701f, 10.322f)
                curveToRelative(-0.074f, 3.907f, 1.437f, 7.002f, 4.127f, 8.734f)
                curveToRelative(0.663f, 0.405f, 1.364f, 0.737f, 2.137f, 0.995f)
                lineToRelative(2.174f, 3.353f)
                curveToRelative(0.333f, 0.848f, 0.7f, 0.774f, 0.848f, -0.11f)
                lineToRelative(0.59f, -2.69f)
                horizontalLineToRelative(0.442f)
                curveToRelative(2.469f, 0.073f, 4.57f, -0.517f, 6.228f, -1.585f)
                curveToRelative(2.616f, -1.733f, 4.126f, -4.791f, 4.053f, -8.697f)
                curveTo(22.41f, 3.948f, 18.431f, -0.144f, 12.019f, 0.004f)
                curveToRelative(-0.1f, -0.002f, -0.2f, -0.004f, -0.299f, -0.004f)
                close()
                moveTo(16.291f, 4.636f)
                curveToRelative(0.258f, 0.0f, 0.516f, 0.092f, 0.7f, 0.276f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.185f, 0.185f, 0.295f, 0.442f, 0.295f, 0.737f)
                curveToRelative(0.0f, 0.148f, 0.0f, 0.295f, -0.074f, 0.406f)
                lineToRelative(-3.722f, 9.25f)
                curveToRelative(-0.258f, 0.441f, -0.627f, 0.552f, -0.885f, 0.552f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, -0.994f, -0.995f)
                curveToRelative(0.0f, -0.148f, 0.037f, -0.258f, 0.073f, -0.406f)
                lineToRelative(3.685f, -9.212f)
                curveToRelative(0.073f, -0.147f, 0.148f, -0.258f, 0.221f, -0.332f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, true, 0.7f, -0.276f)
                close()
                moveTo(9.456f, 7.5f)
                curveToRelative(0.313f, 0.0f, 0.626f, 0.12f, 0.866f, 0.359f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.221f, 0.221f, 0.368f, 0.516f, 0.331f, 0.848f)
                curveToRelative(0.0f, 0.332f, -0.147f, 0.589f, -0.368f, 0.848f)
                curveToRelative(-0.222f, 0.258f, -0.517f, 0.369f, -0.848f, 0.369f)
                curveToRelative(-0.332f, 0.0f, -0.59f, -0.148f, -0.848f, -0.37f)
                curveToRelative(-0.259f, -0.22f, -0.37f, -0.515f, -0.37f, -0.847f)
                reflectiveCurveToRelative(0.149f, -0.627f, 0.37f, -0.848f)
                curveToRelative(0.24f, -0.24f, 0.552f, -0.36f, 0.866f, -0.36f)
                close()
                moveTo(9.456f, 12.474f)
                curveToRelative(0.313f, 0.0f, 0.626f, 0.12f, 0.866f, 0.36f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.221f, 0.258f, 0.368f, 0.553f, 0.331f, 0.848f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.368f, 0.848f)
                curveToRelative(-0.221f, 0.258f, -0.516f, 0.368f, -0.848f, 0.368f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.848f, -0.368f)
                curveToRelative(-0.259f, -0.222f, -0.37f, -0.516f, -0.37f, -0.848f)
                reflectiveCurveToRelative(0.149f, -0.627f, 0.37f, -0.848f)
                curveToRelative(0.24f, -0.24f, 0.552f, -0.36f, 0.866f, -0.36f)
                close()
            }
        }
        .build()
        return _devrant!!
    }

private var _devrant: ImageVector? = null
