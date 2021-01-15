package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Kaggle: ImageVector
    get() {
        if (_kaggle != null) {
            return _kaggle!!
        }
        _kaggle = Builder(name = "Kaggle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.825f, 23.859f)
                curveToRelative(-0.022f, 0.092f, -0.117f, 0.141f, -0.281f, 0.141f)
                horizontalLineToRelative(-3.139f)
                curveToRelative(-0.187f, 0.0f, -0.351f, -0.082f, -0.492f, -0.248f)
                lineToRelative(-5.178f, -6.589f)
                lineToRelative(-1.448f, 1.374f)
                verticalLineToRelative(5.111f)
                curveToRelative(0.0f, 0.235f, -0.117f, 0.352f, -0.351f, 0.352f)
                horizontalLineTo(5.505f)
                curveToRelative(-0.236f, 0.0f, -0.354f, -0.117f, -0.354f, -0.352f)
                verticalLineTo(0.353f)
                curveToRelative(0.0f, -0.233f, 0.118f, -0.353f, 0.354f, -0.353f)
                horizontalLineToRelative(2.431f)
                curveToRelative(0.234f, 0.0f, 0.351f, 0.12f, 0.351f, 0.353f)
                verticalLineToRelative(14.343f)
                lineToRelative(6.203f, -6.272f)
                curveToRelative(0.165f, -0.165f, 0.33f, -0.246f, 0.495f, -0.246f)
                horizontalLineToRelative(3.239f)
                curveToRelative(0.144f, 0.0f, 0.236f, 0.06f, 0.285f, 0.18f)
                curveToRelative(0.046f, 0.149f, 0.034f, 0.255f, -0.036f, 0.315f)
                lineToRelative(-6.555f, 6.344f)
                lineToRelative(6.836f, 8.507f)
                curveToRelative(0.095f, 0.104f, 0.117f, 0.208f, 0.07f, 0.358f)
            }
        }
        .build()
        return _kaggle!!
    }

private var _kaggle: ImageVector? = null
