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

public val SimpleIcons.Uber: ImageVector
    get() {
        if (_uber != null) {
            return _uber!!
        }
        _uber = Builder(name = "Uber", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.97f)
                verticalLineToRelative(4.958f)
                curveToRelative(0.0f, 1.867f, 1.302f, 3.101f, 3.0f, 3.101f)
                curveToRelative(0.826f, 0.0f, 1.562f, -0.316f, 2.094f, -0.87f)
                verticalLineToRelative(0.736f)
                lineTo(6.27f, 15.895f)
                lineTo(6.27f, 7.97f)
                lineTo(5.082f, 7.97f)
                verticalLineToRelative(4.888f)
                curveToRelative(0.0f, 1.257f, -0.85f, 2.106f, -1.947f, 2.106f)
                curveToRelative(-1.11f, 0.0f, -1.946f, -0.827f, -1.946f, -2.106f)
                lineTo(1.189f, 7.971f)
                lineTo(0.0f, 7.971f)
                close()
                moveTo(7.44f, 7.97f)
                verticalLineToRelative(7.925f)
                horizontalLineToRelative(1.13f)
                verticalLineToRelative(-0.725f)
                curveToRelative(0.521f, 0.532f, 1.257f, 0.86f, 2.06f, 0.86f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, false, 3.034f, -3.01f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, false, -3.033f, -3.024f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, false, -2.049f, 0.861f)
                lineTo(8.582f, 7.971f)
                lineTo(7.439f, 7.971f)
                close()
                moveTo(17.309f, 10.008f)
                curveToRelative(-1.687f, 0.0f, -2.965f, 1.37f, -2.965f, 3.0f)
                curveToRelative(0.0f, 1.72f, 1.334f, 3.01f, 3.066f, 3.01f)
                curveToRelative(1.053f, 0.0f, 1.913f, -0.463f, 2.49f, -1.233f)
                lineToRelative(-0.826f, -0.611f)
                curveToRelative(-0.43f, 0.577f, -0.996f, 0.847f, -1.664f, 0.847f)
                curveToRelative(-0.973f, 0.0f, -1.753f, -0.7f, -1.912f, -1.64f)
                horizontalLineToRelative(4.697f)
                verticalLineToRelative(-0.373f)
                curveToRelative(0.0f, -1.72f, -1.222f, -3.0f, -2.886f, -3.0f)
                close()
                moveTo(23.604f, 10.076f)
                curveToRelative(-0.634f, 0.0f, -1.098f, 0.294f, -1.381f, 0.758f)
                verticalLineToRelative(-0.713f)
                horizontalLineToRelative(-1.131f)
                verticalLineToRelative(5.774f)
                horizontalLineToRelative(1.142f)
                lineTo(22.234f, 12.61f)
                curveToRelative(0.0f, -0.894f, 0.544f, -1.47f, 1.291f, -1.47f)
                lineTo(24.0f, 11.14f)
                verticalLineToRelative(-1.065f)
                horizontalLineToRelative(-0.396f)
                close()
                moveTo(17.285f, 11.004f)
                curveToRelative(0.85f, 0.0f, 1.564f, 0.588f, 1.756f, 1.47f)
                lineTo(15.52f, 12.474f)
                curveToRelative(0.203f, -0.882f, 0.916f, -1.47f, 1.765f, -1.47f)
                close()
                moveTo(10.553f, 11.016f)
                curveToRelative(1.086f, 0.0f, 1.98f, 0.883f, 1.98f, 2.004f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, -1.98f, 2.001f)
                arcTo(1.989f, 1.989f, 0.0f, false, true, 8.56f, 13.02f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 1.992f, -2.004f)
                close()
            }
        }
        .build()
        return _uber!!
    }

private var _uber: ImageVector? = null
