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

public val SimpleIcons.Usps: ImageVector
    get() {
        if (_usps != null) {
            return _usps!!
        }
        _usps = Builder(name = "Usps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.145f, 4.577f)
                lineTo(0.0f, 19.423f)
                horizontalLineToRelative(20.855f)
                lineTo(24.0f, 4.577f)
                lineTo(3.145f, 4.577f)
                close()
                moveTo(2.988f, 8.383f)
                horizontalLineToRelative(9.436f)
                curveToRelative(0.157f, 0.0f, 5.064f, 0.0f, 5.159f, 0.975f)
                lineTo(9.09f, 9.358f)
                lineToRelative(1.321f, 4.026f)
                curveToRelative(1.51f, -0.723f, 5.222f, -2.233f, 7.455f, -2.328f)
                curveToRelative(0.944f, -0.031f, 1.321f, 0.126f, 1.132f, 0.252f)
                curveToRelative(-0.126f, 0.063f, -1.038f, 0.189f, -1.761f, 0.377f)
                curveToRelative(-1.258f, 0.315f, -1.321f, 0.315f, -2.642f, 0.755f)
                curveToRelative(-1.478f, 0.503f, -2.705f, 1.069f, -4.53f, 1.919f)
                lineTo(0.723f, 18.983f)
                lineToRelative(2.265f, -10.6f)
                close()
                moveTo(19.471f, 10.081f)
                curveToRelative(-0.535f, -0.094f, -2.768f, 0.063f, -3.334f, 0.063f)
                curveToRelative(-0.126f, 0.0f, -0.472f, 0.031f, -0.472f, -0.063f)
                curveToRelative(0.0f, -0.063f, 0.126f, -0.063f, 0.377f, -0.094f)
                reflectiveCurveToRelative(1.006f, -0.157f, 1.258f, -0.283f)
                curveToRelative(0.063f, -0.063f, 0.22f, -0.157f, 0.315f, -0.252f)
                curveToRelative(0.031f, -0.063f, 0.063f, -0.094f, 0.157f, -0.094f)
                horizontalLineToRelative(1.164f)
                curveToRelative(0.755f, 0.0f, 1.195f, 0.094f, 1.132f, 0.723f)
                curveToRelative(-0.031f, 0.315f, -0.472f, 1.132f, -0.629f, 1.384f)
                curveToRelative(-0.063f, 0.094f, -0.189f, 0.189f, -0.157f, 0.0f)
                curveToRelative(0.126f, -0.503f, 0.597f, -1.321f, 0.189f, -1.384f)
                close()
                moveTo(20.351f, 18.983f)
                lineTo(2.076f, 18.983f)
                reflectiveCurveToRelative(17.363f, -6.794f, 17.552f, -6.92f)
                curveToRelative(0.0f, 0.0f, 1.541f, -2.076f, 0.629f, -2.925f)
                curveToRelative(-0.283f, -0.283f, -0.692f, -0.283f, -2.265f, -0.283f)
                curveToRelative(0.0f, 0.0f, -0.063f, -0.598f, -2.485f, -1.164f)
                curveToRelative(-0.283f, -0.063f, -11.858f, -2.517f, -11.858f, -2.517f)
                horizontalLineToRelative(19.628f)
                lineToRelative(-2.926f, 13.809f)
                close()
                moveTo(23.276f, 18.288f)
                curveToRelative(0.0f, -0.195f, -0.114f, -0.293f, -0.358f, -0.293f)
                horizontalLineToRelative(-0.406f)
                verticalLineToRelative(1.008f)
                horizontalLineToRelative(0.146f)
                verticalLineToRelative(-0.439f)
                horizontalLineToRelative(0.179f)
                lineToRelative(0.276f, 0.455f)
                horizontalLineToRelative(0.179f)
                lineTo(23.0f, 18.564f)
                curveToRelative(0.162f, -0.016f, 0.276f, -0.097f, 0.276f, -0.276f)
                close()
                moveTo(22.821f, 18.434f)
                horizontalLineToRelative(-0.163f)
                verticalLineToRelative(-0.341f)
                horizontalLineToRelative(0.211f)
                curveToRelative(0.114f, 0.0f, 0.228f, 0.016f, 0.228f, 0.163f)
                curveToRelative(0.0f, 0.162f, -0.13f, 0.178f, -0.276f, 0.178f)
                close()
                moveTo(22.837f, 17.605f)
                arcToRelative(0.868f, 0.868f, 0.0f, false, false, -0.894f, 0.878f)
                curveToRelative(0.0f, 0.504f, 0.406f, 0.894f, 0.894f, 0.894f)
                reflectiveCurveToRelative(0.894f, -0.39f, 0.894f, -0.894f)
                arcToRelative(0.878f, 0.878f, 0.0f, false, false, -0.894f, -0.878f)
                close()
                moveTo(22.837f, 19.247f)
                curveToRelative(-0.423f, 0.0f, -0.731f, -0.325f, -0.731f, -0.764f)
                curveToRelative(0.0f, -0.423f, 0.325f, -0.748f, 0.731f, -0.748f)
                curveToRelative(0.406f, 0.0f, 0.731f, 0.325f, 0.731f, 0.748f)
                curveToRelative(0.0f, 0.439f, -0.325f, 0.764f, -0.731f, 0.764f)
                close()
            }
        }
        .build()
        return _usps!!
    }

private var _usps: ImageVector? = null
