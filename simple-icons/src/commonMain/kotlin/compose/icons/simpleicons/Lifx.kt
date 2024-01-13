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

public val SimpleIcons.Lifx: ImageVector
    get() {
        if (_lifx != null) {
            return _lifx!!
        }
        _lifx = Builder(name = "Lifx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.128f, 8.2f)
                arcToRelative(3.11f, 3.11f, 0.0f, false, false, -2.212f, 0.92f)
                arcTo(3.148f, 3.148f, 0.0f, false, false, 0.0f, 11.347f)
                arcToRelative(3.144f, 3.144f, 0.0f, false, false, 0.916f, 2.226f)
                lineToRelative(0.27f, 0.266f)
                lineToRelative(0.014f, -0.014f)
                arcToRelative(2.729f, 2.729f, 0.0f, false, true, 1.932f, -0.795f)
                arcToRelative(2.739f, 2.739f, 0.0f, false, true, 1.931f, 0.795f)
                lineToRelative(0.015f, 0.014f)
                lineToRelative(0.266f, -0.27f)
                arcToRelative(3.157f, 3.157f, 0.0f, false, false, 0.916f, -2.226f)
                curveToRelative(0.0f, -0.806f, -0.305f, -1.612f, -0.916f, -2.226f)
                arcTo(3.139f, 3.139f, 0.0f, false, false, 3.128f, 8.2f)
                close()
                moveTo(3.128f, 8.925f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, 1.701f, 0.707f)
                arcToRelative(2.431f, 2.431f, 0.0f, false, true, 0.156f, 3.252f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, false, -3.72f, 0.0f)
                arcToRelative(2.45f, 2.45f, 0.0f, false, true, -0.544f, -1.537f)
                curveToRelative(0.0f, -0.618f, 0.234f, -1.24f, 0.706f, -1.715f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, true, 1.701f, -0.707f)
                close()
                moveTo(8.444f, 9.007f)
                verticalLineToRelative(6.025f)
                horizontalLineToRelative(3.167f)
                verticalLineToRelative(-1.487f)
                lineTo(9.928f, 13.545f)
                lineToRelative(0.004f, -4.538f)
                close()
                moveTo(12.691f, 9.007f)
                verticalLineToRelative(6.022f)
                horizontalLineToRelative(1.487f)
                lineTo(14.178f, 9.007f)
                close()
                moveTo(15.276f, 9.007f)
                verticalLineToRelative(6.025f)
                horizontalLineToRelative(1.487f)
                lineTo(16.763f, 13.15f)
                horizontalLineToRelative(1.918f)
                verticalLineToRelative(-1.41f)
                horizontalLineToRelative(-1.918f)
                verticalLineToRelative(-1.228f)
                horizontalLineToRelative(3.047f)
                lineToRelative(0.863f, 1.545f)
                lineToRelative(-1.662f, 2.975f)
                horizontalLineToRelative(1.662f)
                lineToRelative(0.813f, -1.53f)
                lineToRelative(0.696f, 1.53f)
                horizontalLineToRelative(1.779f)
                lineToRelative(-1.665f, -2.975f)
                lineTo(24.0f, 9.007f)
                horizontalLineToRelative(-1.779f)
                lineToRelative(-0.735f, 1.686f)
                lineToRelative(-0.735f, -1.686f)
                close()
                moveTo(3.128f, 13.75f)
                curveToRelative(-0.518f, 0.0f, -1.04f, 0.202f, -1.438f, 0.6f)
                lineToRelative(0.444f, 0.443f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 1.996f, 0.0f)
                lineToRelative(0.443f, -0.443f)
                curveToRelative(-0.4f, -0.398f, -0.92f, -0.6f, -1.445f, -0.6f)
                close()
                moveTo(3.128f, 15.074f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, -0.507f, 0.213f)
                lineToRelative(0.507f, 0.511f)
                lineToRelative(0.508f, -0.511f)
                arcToRelative(0.701f, 0.701f, 0.0f, false, false, -0.508f, -0.213f)
                close()
            }
        }
        .build()
        return _lifx!!
    }

private var _lifx: ImageVector? = null
