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

public val SimpleIcons.D: ImageVector
    get() {
        if (_d != null) {
            return _d!!
        }
        _d = Builder(name = "D", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.635f, 3.883f)
                arcToRelative(1.364f, 1.25f, 0.0f, false, false, -1.363f, 1.25f)
                arcToRelative(1.364f, 1.25f, 0.0f, false, false, 1.363f, 1.25f)
                arcTo(1.364f, 1.25f, 0.0f, false, false, 24.0f, 5.133f)
                arcToRelative(1.364f, 1.25f, 0.0f, false, false, -1.365f, -1.25f)
                close()
                moveTo(6.631f, 4.301f)
                lineTo(0.604f, 4.309f)
                curveToRelative(-0.026f, 0.0f, -0.051f, -0.003f, -0.076f, 0.0f)
                curveToRelative(-0.296f, 0.036f, -0.527f, 0.273f, -0.528f, 0.558f)
                lineToRelative(0.018f, 14.574f)
                curveToRelative(0.0f, 0.22f, 0.06f, 0.676f, 0.682f, 0.676f)
                lineToRelative(5.58f, -0.021f)
                curveToRelative(1.595f, -0.003f, 2.664f, -0.031f, 3.3f, -0.112f)
                horizontalLineToRelative(0.016f)
                arcToRelative(11.43f, 11.43f, 0.0f, false, false, 1.955f, -0.469f)
                curveToRelative(1.22f, -0.38f, 2.3f, -0.944f, 3.23f, -1.697f)
                arcToRelative(7.854f, 7.854f, 0.0f, false, false, 2.114f, -2.562f)
                arcToRelative(6.716f, 6.716f, 0.0f, false, false, 0.646f, -1.987f)
                arcToRelative(4.244f, 3.89f, 0.0f, false, false, 0.26f, 0.028f)
                arcToRelative(4.244f, 3.89f, 0.0f, false, false, 4.244f, -3.89f)
                arcToRelative(4.244f, 3.89f, 0.0f, false, false, -4.244f, -3.89f)
                arcToRelative(4.244f, 3.89f, 0.0f, false, false, -2.9f, 1.082f)
                arcToRelative(8.838f, 8.838f, 0.0f, false, false, -2.25f, -1.355f)
                curveToRelative(-1.536f, -0.65f, -3.536f, -0.948f, -6.02f, -0.943f)
                close()
                moveTo(6.369f, 7.305f)
                curveToRelative(1.215f, -0.003f, 2.079f, 0.034f, 2.569f, 0.101f)
                arcToRelative(7.32f, 7.32f, 0.0f, false, true, 1.617f, 0.436f)
                curveToRelative(0.57f, 0.218f, 1.068f, 0.483f, 1.496f, 0.814f)
                curveToRelative(1.177f, 0.915f, 1.732f, 1.999f, 1.734f, 3.432f)
                curveToRelative(0.003f, 1.468f, -0.534f, 2.611f, -1.68f, 3.57f)
                arcToRelative(5.582f, 5.582f, 0.0f, false, true, -1.177f, 0.742f)
                curveToRelative(-0.409f, 0.19f, -0.942f, 0.355f, -1.615f, 0.496f)
                curveToRelative(-0.636f, 0.128f, -1.6f, 0.2f, -2.856f, 0.202f)
                lineToRelative(-2.673f, 0.004f)
                lineToRelative(-0.012f, -9.793f)
                lineToRelative(2.598f, -0.004f)
                close()
            }
        }
        .build()
        return _d!!
    }

private var _d: ImageVector? = null
