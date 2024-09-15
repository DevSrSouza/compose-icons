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

public val LineAwesomeIcons.AppStore: ImageVector
    get() {
        if (_appStore != null) {
            return _appStore!!
        }
        _appStore = Builder(name = "AppStore", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.086f, 5.0f, 27.0f, 9.914f, 27.0f, 16.0f)
                curveTo(27.0f, 22.086f, 22.086f, 27.0f, 16.0f, 27.0f)
                curveTo(9.914f, 27.0f, 5.0f, 22.086f, 5.0f, 16.0f)
                curveTo(5.0f, 9.914f, 9.914f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(15.969f, 8.25f)
                curveTo(15.891f, 8.262f, 15.793f, 8.301f, 15.719f, 8.344f)
                lineTo(15.219f, 8.625f)
                curveTo(14.926f, 8.797f, 14.828f, 9.172f, 15.0f, 9.469f)
                lineTo(19.281f, 16.813f)
                lineTo(20.844f, 15.906f)
                lineTo(16.563f, 8.563f)
                curveTo(16.434f, 8.344f, 16.207f, 8.219f, 15.969f, 8.25f)
                close()
                moveTo(14.656f, 10.688f)
                curveTo(14.418f, 10.656f, 14.16f, 10.777f, 14.031f, 11.0f)
                lineTo(13.5f, 11.938f)
                lineTo(15.125f, 12.875f)
                lineTo(15.656f, 11.938f)
                curveTo(15.828f, 11.641f, 15.73f, 11.266f, 15.438f, 11.094f)
                lineTo(14.875f, 10.781f)
                curveTo(14.801f, 10.738f, 14.734f, 10.699f, 14.656f, 10.688f)
                close()
                moveTo(13.375f, 12.156f)
                lineTo(9.594f, 18.625f)
                lineTo(11.188f, 19.563f)
                lineTo(14.969f, 13.094f)
                close()
                moveTo(8.0f, 15.094f)
                lineTo(8.0f, 16.906f)
                lineTo(10.281f, 16.906f)
                lineTo(11.344f, 15.094f)
                close()
                moveTo(14.063f, 15.094f)
                lineTo(13.063f, 16.906f)
                lineTo(18.906f, 16.906f)
                lineTo(17.906f, 15.094f)
                close()
                moveTo(20.75f, 15.094f)
                lineTo(21.719f, 16.906f)
                lineTo(23.969f, 16.906f)
                lineTo(23.969f, 15.094f)
                close()
                moveTo(21.031f, 16.219f)
                lineTo(19.469f, 17.125f)
                lineTo(20.375f, 18.688f)
                lineTo(21.938f, 17.781f)
                close()
                moveTo(21.844f, 18.188f)
                curveTo(21.793f, 18.195f, 21.742f, 18.219f, 21.688f, 18.25f)
                curveTo(21.434f, 18.395f, 21.066f, 18.617f, 20.844f, 18.75f)
                curveTo(20.426f, 19.0f, 20.75f, 19.746f, 20.844f, 19.906f)
                curveTo(21.387f, 20.816f, 21.953f, 20.699f, 22.375f, 21.344f)
                curveTo(22.605f, 21.695f, 22.52f, 21.852f, 22.594f, 21.969f)
                curveTo(22.621f, 22.012f, 22.715f, 22.051f, 22.75f, 22.0f)
                curveTo(23.402f, 21.098f, 23.223f, 19.531f, 22.75f, 18.844f)
                curveTo(22.559f, 18.563f, 22.211f, 18.125f, 21.844f, 18.188f)
                close()
                moveTo(9.375f, 18.969f)
                lineTo(8.594f, 21.906f)
                curveTo(8.578f, 21.961f, 8.609f, 22.035f, 8.656f, 22.063f)
                curveTo(8.703f, 22.09f, 8.773f, 22.07f, 8.813f, 22.031f)
                lineTo(11.0f, 19.906f)
                close()
            }
        }
        .build()
        return _appStore!!
    }

private var _appStore: ImageVector? = null
