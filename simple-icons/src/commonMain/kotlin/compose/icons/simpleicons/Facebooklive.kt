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

public val SimpleIcons.Facebooklive: ImageVector
    get() {
        if (_facebooklive != null) {
            return _facebooklive!!
        }
        _facebooklive = Builder(name = "Facebooklive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.478f, 7.811f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, -0.462f, 0.462f)
                verticalLineToRelative(7.452f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, 0.462f, 0.462f)
                lineTo(23.538f, 16.187f)
                verticalLineToRelative(0.002f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, 0.462f, -0.462f)
                lineTo(24.0f, 8.273f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, -0.462f, -0.462f)
                close()
                moveTo(4.192f, 7.818f)
                curveTo(1.879f, 7.818f, 0.0f, 9.692f, 0.0f, 12.007f)
                curveToRelative(0.0f, 2.092f, 1.533f, 3.827f, 3.538f, 4.139f)
                lineTo(3.538f, 13.218f)
                horizontalLineToRelative(-1.071f)
                verticalLineToRelative(-1.211f)
                horizontalLineToRelative(1.071f)
                verticalLineToRelative(-0.924f)
                curveToRelative(0.0f, -1.05f, 0.621f, -1.633f, 1.578f, -1.633f)
                curveToRelative(0.457f, 0.0f, 0.934f, 0.088f, 0.934f, 0.088f)
                verticalLineToRelative(1.024f)
                horizontalLineToRelative(-0.524f)
                curveToRelative(-0.521f, 0.0f, -0.687f, 0.327f, -0.687f, 0.656f)
                verticalLineToRelative(0.787f)
                horizontalLineToRelative(1.163f)
                lineToRelative(-0.187f, 1.211f)
                lineTo(4.836f, 13.215f)
                verticalLineToRelative(2.929f)
                curveToRelative(2.009f, -0.31f, 3.545f, -2.045f, 3.545f, -4.137f)
                curveToRelative(0.0f, -2.315f, -1.877f, -4.189f, -4.189f, -4.189f)
                close()
                moveTo(11.359f, 10.225f)
                horizontalLineToRelative(0.635f)
                verticalLineToRelative(2.993f)
                horizontalLineToRelative(1.628f)
                verticalLineToRelative(0.554f)
                lineTo(11.359f, 13.772f)
                close()
                moveTo(14.304f, 10.225f)
                horizontalLineToRelative(0.635f)
                verticalLineToRelative(3.547f)
                horizontalLineToRelative(-0.635f)
                close()
                moveTo(15.548f, 10.225f)
                horizontalLineToRelative(0.701f)
                lineToRelative(0.893f, 2.808f)
                horizontalLineToRelative(0.043f)
                lineToRelative(0.886f, -2.808f)
                horizontalLineToRelative(0.675f)
                lineToRelative(-1.227f, 3.547f)
                horizontalLineToRelative(-0.732f)
                close()
                moveTo(19.358f, 10.228f)
                horizontalLineToRelative(2.296f)
                verticalLineToRelative(0.547f)
                horizontalLineToRelative(-1.661f)
                verticalLineToRelative(0.941f)
                horizontalLineToRelative(1.571f)
                verticalLineToRelative(0.516f)
                horizontalLineToRelative(-1.571f)
                verticalLineToRelative(0.993f)
                horizontalLineToRelative(1.661f)
                verticalLineToRelative(0.55f)
                horizontalLineToRelative(-2.296f)
                close()
            }
        }
        .build()
        return _facebooklive!!
    }

private var _facebooklive: ImageVector? = null
