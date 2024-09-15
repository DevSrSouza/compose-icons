package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.AppStoreIos: ImageVector
    get() {
        if (_appStoreIos != null) {
            return _appStoreIos!!
        }
        _appStoreIos = Builder(name = "AppStoreIos", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(15.992f, 9.01f)
                curveTo(15.91f, 8.99f, 15.84f, 9.0f, 15.768f, 9.041f)
                curveTo(15.614f, 9.123f, 15.53f, 9.309f, 15.602f, 9.463f)
                curveTo(16.086f, 10.595f, 17.783f, 14.496f, 19.203f, 17.121f)
                lineTo(20.521f, 16.41f)
                curveTo(19.174f, 13.795f, 16.837f, 10.164f, 16.178f, 9.145f)
                curveTo(16.137f, 9.073f, 16.064f, 9.031f, 15.992f, 9.01f)
                close()
                moveTo(15.248f, 11.264f)
                curveTo(14.898f, 11.223f, 14.558f, 11.367f, 14.373f, 11.686f)
                lineTo(15.887f, 12.58f)
                curveTo(16.124f, 12.159f, 15.978f, 11.604f, 15.566f, 11.357f)
                curveTo(15.463f, 11.306f, 15.351f, 11.285f, 15.248f, 11.264f)
                close()
                moveTo(14.248f, 11.902f)
                lineTo(13.436f, 13.293f)
                lineTo(14.98f, 14.156f)
                lineTo(15.762f, 12.809f)
                lineTo(14.248f, 11.902f)
                close()
                moveTo(13.344f, 13.445f)
                lineTo(10.133f, 19.045f)
                lineTo(11.646f, 19.92f)
                lineTo(14.857f, 14.352f)
                lineTo(13.344f, 13.445f)
                close()
                moveTo(9.0f, 15.0f)
                lineTo(9.0f, 17.0f)
                lineTo(10.93f, 17.0f)
                lineTo(12.1f, 15.0f)
                lineTo(9.0f, 15.0f)
                close()
                moveTo(14.84f, 15.0f)
                lineTo(13.689f, 17.0f)
                lineTo(18.77f, 17.0f)
                curveTo(18.49f, 16.45f, 18.06f, 15.59f, 17.77f, 15.0f)
                lineTo(14.84f, 15.0f)
                close()
                moveTo(20.131f, 15.0f)
                curveTo(20.381f, 15.46f, 20.711f, 16.089f, 20.811f, 16.289f)
                curveTo(20.831f, 16.309f, 20.89f, 16.431f, 20.91f, 16.471f)
                lineTo(21.131f, 17.0f)
                lineTo(23.0f, 17.0f)
                lineTo(23.0f, 15.0f)
                lineTo(20.131f, 15.0f)
                close()
                moveTo(20.625f, 16.605f)
                lineTo(19.309f, 17.316f)
                lineTo(20.297f, 18.859f)
                lineTo(21.324f, 18.273f)
                lineTo(20.625f, 16.605f)
                close()
                moveTo(21.428f, 18.531f)
                lineTo(20.461f, 19.047f)
                lineTo(21.488f, 21.496f)
                curveTo(21.673f, 21.928f, 22.168f, 22.134f, 22.58f, 21.908f)
                curveTo(22.992f, 21.691f, 23.126f, 21.145f, 22.869f, 20.754f)
                lineTo(21.428f, 18.531f)
                close()
                moveTo(9.998f, 19.24f)
                lineTo(9.453f, 21.846f)
                lineTo(9.588f, 21.906f)
                lineTo(11.543f, 20.137f)
                lineTo(9.998f, 19.24f)
                close()
            }
        }
        .build()
        return _appStoreIos!!
    }

private var _appStoreIos: ImageVector? = null
