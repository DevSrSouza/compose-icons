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

public val SimpleIcons.Nx: ImageVector
    get() {
        if (_nx != null) {
            return _nx!!
        }
        _nx = Builder(name = "Nx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.987f, 14.138f)
                lineToRelative(-3.132f, 4.923f)
                lineToRelative(-5.193f, -8.427f)
                lineToRelative(-0.012f, 8.822f)
                lineTo(0.0f, 19.456f)
                lineTo(0.0f, 4.544f)
                horizontalLineToRelative(3.691f)
                lineToRelative(5.247f, 8.833f)
                lineToRelative(0.005f, -3.998f)
                lineToRelative(3.044f, 4.759f)
                close()
                moveTo(12.588f, 8.377f)
                curveToRelative(0.024f, -0.048f, 0.0f, -3.784f, 0.008f, -3.833f)
                horizontalLineToRelative(-3.65f)
                curveToRelative(0.002f, 0.059f, -0.005f, 3.776f, -0.003f, 3.833f)
                horizontalLineToRelative(3.645f)
                close()
                moveTo(18.222f, 12.511f)
                arcToRelative(2.061f, 2.061f, 0.0f, false, false, -1.969f, 1.336f)
                arcToRelative(1.963f, 1.963f, 0.0f, false, true, 2.343f, -0.739f)
                curveToRelative(0.396f, 0.161f, 0.917f, 0.422f, 1.33f, 0.283f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.704f, -0.88f)
                close()
                moveTo(21.612f, 13.572f)
                curveToRelative(-0.375f, -0.13f, -0.8f, -0.277f, -1.109f, -0.681f)
                curveToRelative(-0.06f, -0.08f, -0.116f, -0.17f, -0.176f, -0.265f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, -0.533f, -0.642f)
                curveToRelative(-0.294f, -0.216f, -0.68f, -0.322f, -1.18f, -0.322f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, false, -2.294f, 1.536f)
                arcToRelative(2.325f, 2.325f, 0.0f, false, true, 4.002f, 0.388f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.836f, 0.334f)
                curveToRelative(0.493f, -0.105f, 0.46f, 0.36f, 1.203f, 0.518f)
                verticalLineToRelative(-0.133f)
                curveToRelative(-0.003f, -0.446f, -0.246f, -0.55f, -0.75f, -0.733f)
                close()
                moveTo(23.636f, 14.838f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, false, 0.347f, -0.638f)
                curveToRelative(-0.01f, -2.957f, -2.41f, -5.487f, -5.37f, -5.487f)
                arcToRelative(5.364f, 5.364f, 0.0f, false, false, -4.487f, 2.418f)
                curveToRelative(-0.01f, -0.026f, -1.522f, -2.39f, -1.538f, -2.418f)
                lineTo(8.943f, 8.713f)
                lineToRelative(3.463f, 5.423f)
                lineToRelative(-3.379f, 5.32f)
                horizontalLineToRelative(3.54f)
                lineToRelative(1.54f, -2.366f)
                lineToRelative(1.568f, 2.366f)
                horizontalLineToRelative(3.541f)
                lineToRelative(-3.21f, -5.052f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.084f, -0.32f)
                arcToRelative(2.69f, 2.69f, 0.0f, false, true, 2.69f, -2.691f)
                horizontalLineToRelative(0.001f)
                curveToRelative(1.488f, 0.0f, 1.736f, 0.89f, 2.057f, 1.308f)
                curveToRelative(0.634f, 0.826f, 1.9f, 0.464f, 1.9f, 1.541f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, 1.066f, 0.596f)
                close()
                moveTo(23.986f, 14.971f)
                curveToRelative(-0.173f, 0.372f, -0.56f, 0.338f, -0.755f, 0.639f)
                curveToRelative(-0.176f, 0.271f, 0.114f, 0.412f, 0.114f, 0.412f)
                reflectiveCurveToRelative(0.337f, 0.156f, 0.538f, -0.311f)
                curveToRelative(0.104f, -0.231f, 0.14f, -0.488f, 0.103f, -0.74f)
                close()
            }
        }
        .build()
        return _nx!!
    }

private var _nx: ImageVector? = null
