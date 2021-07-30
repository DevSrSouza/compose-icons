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
                moveTo(9.4777f, 7.8108f)
                arcToRelative(0.4611f, 0.4611f, 0.0f, false, false, -0.462f, 0.462f)
                verticalLineToRelative(7.452f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, 0.462f, 0.462f)
                lineTo(23.538f, 16.1868f)
                verticalLineToRelative(0.0024f)
                arcToRelative(0.4611f, 0.4611f, 0.0f, false, false, 0.462f, -0.462f)
                lineTo(24.0f, 8.2728f)
                arcToRelative(0.4611f, 0.4611f, 0.0f, false, false, -0.462f, -0.462f)
                close()
                moveTo(4.1915f, 7.818f)
                curveTo(1.879f, 7.818f, 0.0f, 9.6922f, 0.0f, 12.007f)
                curveToRelative(0.0f, 2.0922f, 1.533f, 3.8267f, 3.5376f, 4.1394f)
                lineTo(3.5376f, 13.218f)
                horizontalLineToRelative(-1.071f)
                verticalLineToRelative(-1.211f)
                horizontalLineToRelative(1.071f)
                verticalLineToRelative(-0.924f)
                curveToRelative(0.0f, -1.0497f, 0.6208f, -1.6326f, 1.578f, -1.6326f)
                curveToRelative(0.4573f, 0.0f, 0.9336f, 0.0877f, 0.9336f, 0.0877f)
                verticalLineToRelative(1.0236f)
                horizontalLineToRelative(-0.5237f)
                curveToRelative(-0.5213f, 0.0f, -0.6871f, 0.327f, -0.6871f, 0.6563f)
                verticalLineToRelative(0.7866f)
                horizontalLineToRelative(1.1634f)
                lineToRelative(-0.1872f, 1.2108f)
                lineTo(4.836f, 13.2154f)
                verticalLineToRelative(2.9286f)
                curveToRelative(2.0093f, -0.3104f, 3.5447f, -2.0448f, 3.5447f, -4.137f)
                curveToRelative(0.0f, -2.315f, -1.8766f, -4.1891f, -4.1892f, -4.1891f)
                close()
                moveTo(11.3591f, 10.2253f)
                horizontalLineToRelative(0.635f)
                verticalLineToRelative(2.9926f)
                horizontalLineToRelative(1.6278f)
                verticalLineToRelative(0.5544f)
                lineTo(11.359f, 13.7723f)
                close()
                moveTo(14.3043f, 10.2253f)
                horizontalLineToRelative(0.635f)
                verticalLineToRelative(3.547f)
                horizontalLineToRelative(-0.635f)
                close()
                moveTo(15.5482f, 10.2253f)
                horizontalLineToRelative(0.7014f)
                lineToRelative(0.8932f, 2.8078f)
                horizontalLineToRelative(0.0427f)
                lineToRelative(0.8862f, -2.8078f)
                horizontalLineToRelative(0.6752f)
                lineToRelative(-1.2273f, 3.547f)
                horizontalLineToRelative(-0.7322f)
                close()
                moveTo(19.3582f, 10.2277f)
                horizontalLineToRelative(2.296f)
                verticalLineToRelative(0.5473f)
                horizontalLineToRelative(-1.6609f)
                verticalLineToRelative(0.9407f)
                horizontalLineToRelative(1.5709f)
                verticalLineToRelative(0.5165f)
                horizontalLineToRelative(-1.5709f)
                verticalLineToRelative(0.9928f)
                horizontalLineToRelative(1.661f)
                verticalLineToRelative(0.5497f)
                horizontalLineToRelative(-2.296f)
                close()
            }
        }
        .build()
        return _facebooklive!!
    }

private var _facebooklive: ImageVector? = null
