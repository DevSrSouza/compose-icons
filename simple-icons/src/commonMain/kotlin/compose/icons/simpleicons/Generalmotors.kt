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

public val SimpleIcons.Generalmotors: ImageVector
    get() {
        if (_generalmotors != null) {
            return _generalmotors!!
        }
        _generalmotors = Builder(name = "Generalmotors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.34f, 0.0f)
                arcTo(3.345f, 3.345f, 0.0f, false, false, 0.0f, 3.34f)
                verticalLineToRelative(17.32f)
                arcTo(3.345f, 3.345f, 0.0f, false, false, 3.34f, 24.0f)
                horizontalLineToRelative(17.32f)
                arcTo(3.345f, 3.345f, 0.0f, false, false, 24.0f, 20.66f)
                lineTo(24.0f, 3.34f)
                curveTo(23.982f, 1.5f, 22.501f, 0.0f, 20.66f, 0.0f)
                close()
                moveTo(3.34f, 1.535f)
                horizontalLineToRelative(17.32f)
                curveToRelative(0.992f, 0.0f, 1.805f, 0.813f, 1.805f, 1.806f)
                verticalLineToRelative(17.3f)
                curveToRelative(0.0f, 0.993f, -0.813f, 1.806f, -1.806f, 1.806f)
                lineTo(3.341f, 22.447f)
                arcToRelative(1.811f, 1.811f, 0.0f, false, true, -1.806f, -1.806f)
                verticalLineToRelative(-17.3f)
                curveToRelative(0.0f, -0.993f, 0.813f, -1.806f, 1.806f, -1.806f)
                close()
                moveTo(6.32f, 6.212f)
                arcTo(1.877f, 1.877f, 0.0f, false, false, 4.442f, 8.09f)
                verticalLineToRelative(4.569f)
                curveToRelative(0.0f, 1.03f, 0.85f, 1.86f, 1.879f, 1.878f)
                horizontalLineToRelative(1.552f)
                verticalLineToRelative(0.343f)
                curveToRelative(-0.018f, 0.85f, -0.505f, 1.337f, -1.679f, 1.355f)
                horizontalLineToRelative(-0.74f)
                verticalLineToRelative(1.535f)
                horizontalLineToRelative(0.74f)
                curveToRelative(2.167f, 0.0f, 3.395f, -1.03f, 3.431f, -2.908f)
                verticalLineToRelative(-8.65f)
                close()
                moveTo(10.943f, 6.212f)
                verticalLineToRelative(8.307f)
                horizontalLineToRelative(1.752f)
                lineTo(12.695f, 7.73f)
                horizontalLineToRelative(1.68f)
                verticalLineToRelative(6.79f)
                horizontalLineToRelative(1.752f)
                lineTo(16.127f, 7.73f)
                horizontalLineToRelative(1.01f)
                curveToRelative(0.362f, 0.0f, 0.669f, 0.289f, 0.669f, 0.668f)
                verticalLineToRelative(6.14f)
                horizontalLineToRelative(1.752f)
                lineTo(19.558f, 8.09f)
                curveToRelative(-0.018f, -1.029f, -0.85f, -1.878f, -1.879f, -1.878f)
                close()
                moveTo(6.863f, 7.73f)
                horizontalLineToRelative(1.01f)
                verticalLineToRelative(5.273f)
                horizontalLineToRelative(-1.01f)
                arcToRelative(0.666f, 0.666f, 0.0f, false, true, -0.669f, -0.668f)
                lineTo(6.194f, 8.397f)
                curveToRelative(0.0f, -0.36f, 0.29f, -0.668f, 0.668f, -0.668f)
                close()
                moveTo(10.943f, 16.236f)
                verticalLineToRelative(1.535f)
                horizontalLineToRelative(8.596f)
                verticalLineToRelative(-1.535f)
                close()
            }
        }
        .build()
        return _generalmotors!!
    }

private var _generalmotors: ImageVector? = null
