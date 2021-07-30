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

public val SimpleIcons.Wireshark: ImageVector
    get() {
        if (_wireshark != null) {
            return _wireshark!!
        }
        _wireshark = Builder(name = "Wireshark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.95f, 0.0f)
                curveToRelative(-1.62f, 0.0f, -2.95f, 1.32f, -2.95f, 2.95f)
                verticalLineToRelative(18.1f)
                curveToRelative(0.0f, 1.63f, 1.32f, 2.95f, 2.95f, 2.95f)
                horizontalLineToRelative(18.1f)
                curveToRelative(1.62f, 0.0f, 2.95f, -1.32f, 2.95f, -2.95f)
                verticalLineToRelative(-18.1f)
                curveToRelative(-2.0E-4f, -1.63f, -1.32f, -2.95f, -2.95f, -2.95f)
                close()
                moveTo(2.95f, 1.09f)
                horizontalLineToRelative(18.1f)
                curveToRelative(1.04f, 0.0f, 1.85f, 0.818f, 1.85f, 1.86f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-5.27f)
                curveToRelative(-0.335f, -0.796f, -2.57f, -6.47f, 0.283f, -10.9f)
                arcToRelative(0.516f, 0.517f, 0.0f, false, false, -0.443f, -0.794f)
                curveToRelative(-5.24f, 0.0827f, -8.2f, 3.19f, -9.74f, 6.21f)
                curveToRelative(-1.35f, 2.64f, -1.63f, 4.91f, -1.69f, 5.53f)
                horizontalLineToRelative(-4.95f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.0f, -1.04f, 0.817f, -1.86f, 1.85f, -1.86f)
                close()
                moveTo(16.55f, 6.33f)
                curveToRelative(-2.62f, 5.24f, 0.248f, 11.4f, 0.248f, 11.4f)
                arcToRelative(0.516f, 0.517f, 0.0f, false, false, 0.469f, 0.301f)
                horizontalLineToRelative(5.62f)
                verticalLineToRelative(3.05f)
                curveToRelative(0.0f, 1.04f, -0.817f, 1.86f, -1.85f, 1.86f)
                horizontalLineToRelative(-18.1f)
                curveToRelative(-1.04f, 0.0f, -1.85f, -0.818f, -1.85f, -1.86f)
                verticalLineToRelative(-3.05f)
                horizontalLineToRelative(5.39f)
                arcToRelative(0.516f, 0.517f, 0.0f, false, false, 0.514f, -0.477f)
                reflectiveCurveToRelative(0.226f, -2.8f, 1.66f, -5.62f)
                curveToRelative(1.34f, -2.62f, 3.67f, -5.17f, 7.91f, -5.57f)
                close()
            }
        }
        .build()
        return _wireshark!!
    }

private var _wireshark: ImageVector? = null
