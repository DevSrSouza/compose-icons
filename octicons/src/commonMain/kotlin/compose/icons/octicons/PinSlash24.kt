package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PinSlash24: ImageVector
    get() {
        if (_pinSlash24 != null) {
            return _pinSlash24!!
        }
        _pinSlash24 = Builder(name = "PinSlash24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.345f, 20.595f)
                lineTo(8.47f, 14.47f)
                quadToRelative(0.219f, -0.22f, 0.53f, -0.22f)
                quadToRelative(0.311f, 0.0f, 0.53f, 0.22f)
                quadToRelative(0.22f, 0.219f, 0.22f, 0.53f)
                quadToRelative(0.0f, 0.311f, -0.22f, 0.53f)
                lineToRelative(-6.125f, 6.125f)
                quadToRelative(-0.219f, 0.22f, -0.53f, 0.22f)
                quadToRelative(-0.311f, 0.0f, -0.53f, -0.22f)
                quadToRelative(-0.22f, -0.219f, -0.22f, -0.53f)
                quadToRelative(0.0f, -0.311f, 0.22f, -0.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.72f, 11.97f)
                lineToRelative(0.358f, -0.358f)
                arcToRelative(6.738f, 6.738f, 0.0f, false, true, 2.326f, -1.518f)
                lineToRelative(1.896f, -0.738f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.086f, -0.409f)
                lineToRelative(-6.333f, -6.333f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.409f, 0.086f)
                lineToRelative(-0.521f, 1.34f)
                arcToRelative(8.663f, 8.663f, 0.0f, false, true, -2.243f, 3.265f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.01f, -1.11f)
                arcToRelative(7.132f, 7.132f, 0.0f, false, false, 1.854f, -2.699f)
                lineToRelative(0.521f, -1.34f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.869f, -0.603f)
                lineToRelative(6.333f, 6.333f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.603f, 2.869f)
                lineToRelative(-1.896f, 0.737f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, false, -1.81f, 1.18f)
                lineToRelative(-0.358f, 0.358f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                close()
                moveTo(4.171f, 11.232f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.757f, -2.92f)
                lineToRelative(3.366f, -0.962f)
                lineToRelative(0.412f, 1.443f)
                lineToRelative(-3.366f, 0.961f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.108f, 0.417f)
                lineToRelative(8.597f, 8.597f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.417f, -0.108f)
                lineToRelative(0.961f, -3.366f)
                lineToRelative(1.443f, 0.412f)
                lineToRelative(-0.962f, 3.366f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.92f, 0.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.405f, 2.095f)
                lineToRelative(18.75f, 18.75f)
                quadToRelative(0.22f, 0.219f, 0.22f, 0.53f)
                quadToRelative(0.0f, 0.311f, -0.22f, 0.53f)
                quadToRelative(-0.219f, 0.22f, -0.53f, 0.22f)
                quadToRelative(-0.311f, 0.0f, -0.53f, -0.22f)
                lineTo(2.345f, 3.155f)
                quadToRelative(-0.22f, -0.219f, -0.22f, -0.53f)
                quadToRelative(0.0f, -0.311f, 0.22f, -0.53f)
                quadToRelative(0.219f, -0.22f, 0.53f, -0.22f)
                quadToRelative(0.311f, 0.0f, 0.53f, 0.22f)
                close()
            }
        }
        .build()
        return _pinSlash24!!
    }

private var _pinSlash24: ImageVector? = null
