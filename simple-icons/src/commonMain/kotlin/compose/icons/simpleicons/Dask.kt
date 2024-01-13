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

public val SimpleIcons.Dask: ImageVector
    get() {
        if (_dask != null) {
            return _dask!!
        }
        _dask = Builder(name = "Dask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.246f, 9.754f)
                lineToRelative(5.848f, -3.374f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.1f, -0.175f)
                lineToRelative(0.002f, -2.553f)
                curveToRelative(0.0f, -0.324f, -0.133f, -0.645f, -0.392f, -0.841f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.118f, -0.074f)
                lineToRelative(-2.425f, 1.4f)
                lineToRelative(-6.436f, 3.712f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -0.504f, 0.872f)
                lineToRelative(-0.003f, 8.721f)
                verticalLineToRelative(2.825f)
                curveToRelative(0.0f, 0.324f, 0.132f, 0.645f, 0.39f, 0.842f)
                curveToRelative(0.335f, 0.253f, 0.766f, 0.278f, 1.12f, 0.074f)
                lineToRelative(2.363f, -1.364f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.101f, -0.175f)
                lineToRelative(0.003f, -8.244f)
                arcToRelative(1.902f, 1.902f, 0.0f, false, true, 0.951f, -1.646f)
                close()
                moveTo(21.562f, 5.418f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, false, -0.504f, -0.137f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.503f, 0.137f)
                lineToRelative(-8.86f, 5.112f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.505f, 0.87f)
                lineToRelative(-0.003f, 11.591f)
                curveToRelative(0.0f, 0.364f, 0.188f, 0.69f, 0.503f, 0.872f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 1.007f, 0.0f)
                lineToRelative(8.86f, -5.112f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, 0.504f, -0.872f)
                lineToRelative(0.004f, -11.59f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.503f, -0.871f)
                close()
                moveTo(6.378f, 7.074f)
                lineToRelative(6.334f, -3.655f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.1f, -0.175f)
                lineToRelative(0.001f, -2.193f)
                curveToRelative(0.0f, -0.324f, -0.133f, -0.646f, -0.392f, -0.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.118f, -0.075f)
                lineTo(2.443f, 5.25f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -0.504f, 0.872f)
                lineToRelative(-0.003f, 11.546f)
                curveToRelative(0.0f, 0.324f, 0.133f, 0.645f, 0.39f, 0.842f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.12f, 0.074f)
                lineToRelative(1.877f, -1.082f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.1f, -0.175f)
                lineToRelative(0.003f, -8.605f)
                curveToRelative(0.0f, -0.68f, 0.363f, -1.307f, 0.952f, -1.647f)
                close()
            }
        }
        .build()
        return _dask!!
    }

private var _dask: ImageVector? = null
