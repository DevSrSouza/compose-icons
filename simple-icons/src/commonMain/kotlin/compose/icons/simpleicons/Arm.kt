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

public val SimpleIcons.Arm: ImageVector
    get() {
        if (_arm != null) {
            return _arm!!
        }
        _arm = Builder(name = "Arm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.419f, 8.534f)
                horizontalLineToRelative(1.614f)
                verticalLineToRelative(6.911f)
                lineTo(5.419f, 15.445f)
                verticalLineToRelative(-0.72f)
                curveToRelative(-0.71f, 0.822f, -1.573f, 0.933f, -2.07f, 0.933f)
                curveTo(1.218f, 15.658f, 0.0f, 13.882f, 0.0f, 11.985f)
                curveToRelative(0.0f, -2.253f, 1.542f, -3.633f, 3.37f, -3.633f)
                curveToRelative(0.507f, 0.0f, 1.4f, 0.132f, 2.049f, 0.984f)
                close()
                moveTo(1.654f, 12.025f)
                curveToRelative(0.0f, 1.198f, 0.751f, 2.202f, 1.918f, 2.202f)
                curveToRelative(1.015f, 0.0f, 1.959f, -0.74f, 1.959f, -2.181f)
                curveToRelative(0.0f, -1.512f, -0.934f, -2.233f, -1.959f, -2.233f)
                curveToRelative(-1.167f, -0.01f, -1.918f, 0.974f, -1.918f, 2.212f)
                close()
                moveTo(8.951f, 8.535f)
                horizontalLineToRelative(1.613f)
                verticalLineToRelative(0.618f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.67f, -0.578f)
                curveToRelative(0.314f, -0.183f, 0.619f, -0.233f, 0.984f, -0.233f)
                curveToRelative(0.396f, 0.0f, 0.822f, 0.06f, 1.269f, 0.324f)
                lineToRelative(-0.66f, 1.462f)
                arcToRelative(1.432f, 1.432f, 0.0f, false, false, -0.822f, -0.244f)
                curveToRelative(-0.345f, 0.0f, -0.69f, 0.05f, -1.005f, 0.376f)
                curveToRelative(-0.446f, 0.477f, -0.446f, 1.136f, -0.446f, 1.593f)
                verticalLineToRelative(3.582f)
                lineTo(8.94f, 15.435f)
                close()
                moveTo(14.511f, 8.535f)
                horizontalLineToRelative(1.614f)
                verticalLineToRelative(0.639f)
                curveToRelative(0.538f, -0.66f, 1.177f, -0.822f, 1.705f, -0.822f)
                curveToRelative(0.72f, 0.0f, 1.4f, 0.345f, 1.786f, 1.015f)
                curveToRelative(0.579f, -0.822f, 1.441f, -1.015f, 2.05f, -1.015f)
                curveToRelative(0.842f, 0.0f, 1.573f, 0.396f, 1.969f, 1.086f)
                curveToRelative(0.132f, 0.233f, 0.365f, 0.74f, 0.365f, 1.745f)
                verticalLineToRelative(4.272f)
                horizontalLineToRelative(-1.614f)
                lineTo(22.386f, 11.65f)
                curveToRelative(0.0f, -0.771f, -0.08f, -1.086f, -0.152f, -1.228f)
                curveToRelative(-0.101f, -0.264f, -0.345f, -0.609f, -0.923f, -0.609f)
                curveToRelative(-0.396f, 0.0f, -0.741f, 0.213f, -0.954f, 0.508f)
                curveToRelative(-0.284f, 0.395f, -0.315f, 0.984f, -0.315f, 1.572f)
                verticalLineToRelative(3.562f)
                lineTo(18.43f, 15.455f)
                lineTo(18.43f, 11.65f)
                curveToRelative(0.0f, -0.771f, -0.081f, -1.086f, -0.152f, -1.228f)
                curveToRelative(-0.102f, -0.264f, -0.345f, -0.609f, -0.924f, -0.609f)
                curveToRelative(-0.396f, 0.0f, -0.74f, 0.213f, -0.954f, 0.508f)
                curveToRelative(-0.284f, 0.395f, -0.314f, 0.984f, -0.314f, 1.572f)
                verticalLineToRelative(3.562f)
                horizontalLineToRelative(-1.573f)
                close()
            }
        }
        .build()
        return _arm!!
    }

private var _arm: ImageVector? = null
