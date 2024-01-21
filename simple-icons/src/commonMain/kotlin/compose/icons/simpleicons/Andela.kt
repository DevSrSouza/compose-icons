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

public val SimpleIcons.Andela: ImageVector
    get() {
        if (_andela != null) {
            return _andela!!
        }
        _andela = Builder(name = "Andela", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.999f, 4.586f)
                lineTo(13.956f, 0.511f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 12.0f, 0.0f)
                curveToRelative(-0.713f, 0.0f, -1.378f, 0.183f, -1.946f, 0.511f)
                lineTo(2.982f, 4.586f)
                arcToRelative(4.013f, 4.013f, 0.0f, false, false, -1.917f, 3.42f)
                verticalLineToRelative(7.997f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 1.927f, 3.421f)
                lineToRelative(7.014f, 4.046f)
                curveToRelative(0.587f, 0.337f, 1.262f, 0.53f, 1.994f, 0.53f)
                curveToRelative(0.723f, 0.0f, 1.407f, -0.193f, 1.994f, -0.53f)
                lineToRelative(6.937f, -4.008f)
                arcToRelative(4.008f, 4.008f, 0.0f, false, false, 2.004f, -3.468f)
                lineTo(22.935f, 7.997f)
                arcToRelative(4.003f, 4.003f, 0.0f, false, false, -1.936f, -3.411f)
                close()
                moveTo(21.297f, 12.12f)
                horizontalLineToRelative(-0.038f)
                curveToRelative(-5.039f, 0.02f, -9.143f, 4.143f, -9.143f, 9.182f)
                arcToRelative(0.117f, 0.117f, 0.0f, false, true, -0.116f, 0.116f)
                arcToRelative(0.118f, 0.118f, 0.0f, false, true, -0.116f, -0.116f)
                verticalLineToRelative(-0.038f)
                curveToRelative(-0.019f, -5.039f, -4.143f, -9.144f, -9.181f, -9.144f)
                arcToRelative(0.116f, 0.116f, 0.0f, false, true, -0.116f, -0.115f)
                curveToRelative(0.0f, -0.068f, 0.058f, -0.116f, 0.116f, -0.116f)
                horizontalLineToRelative(0.038f)
                curveToRelative(5.039f, -0.019f, 9.143f, -4.143f, 9.143f, -9.182f)
                curveToRelative(0.0f, -0.067f, 0.058f, -0.115f, 0.116f, -0.115f)
                curveToRelative(0.067f, 0.0f, 0.116f, 0.058f, 0.116f, 0.115f)
                curveToRelative(0.0f, 5.059f, 4.114f, 9.182f, 9.181f, 9.182f)
                curveToRelative(0.068f, 0.0f, 0.116f, 0.058f, 0.116f, 0.116f)
                curveToRelative(0.01f, 0.067f, -0.048f, 0.115f, -0.116f, 0.115f)
                close()
            }
        }
        .build()
        return _andela!!
    }

private var _andela: ImageVector? = null
