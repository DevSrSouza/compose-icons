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

public val SimpleIcons.Maildotru: ImageVector
    get() {
        if (_maildotru != null) {
            return _maildotru!!
        }
        _maildotru = Builder(name = "Maildotru", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.61f, 12.0f)
                curveToRelative(0.0f, 1.99f, -1.62f, 3.61f, -3.61f, 3.61f)
                curveToRelative(-1.99f, 0.0f, -3.61f, -1.62f, -3.61f, -3.61f)
                curveToRelative(0.0f, -1.99f, 1.62f, -3.61f, 3.61f, -3.61f)
                curveToRelative(1.99f, 0.0f, 3.61f, 1.62f, 3.61f, 3.61f)
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(2.424f, 0.0f, 4.761f, -0.722f, 6.76f, -2.087f)
                lineToRelative(0.034f, -0.024f)
                lineToRelative(-1.617f, -1.879f)
                lineToRelative(-0.027f, 0.017f)
                arcTo(9.494f, 9.494f, 0.0f, false, true, 12.0f, 21.54f)
                curveToRelative(-5.26f, 0.0f, -9.54f, -4.28f, -9.54f, -9.54f)
                curveToRelative(0.0f, -5.26f, 4.28f, -9.54f, 9.54f, -9.54f)
                curveToRelative(5.26f, 0.0f, 9.54f, 4.28f, 9.54f, 9.54f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, true, -0.225f, 2.05f)
                curveToRelative(-0.301f, 1.239f, -1.169f, 1.618f, -1.82f, 1.568f)
                curveToRelative(-0.654f, -0.053f, -1.42f, -0.52f, -1.426f, -1.661f)
                verticalLineTo(12.0f)
                arcTo(6.076f, 6.076f, 0.0f, false, false, 12.0f, 5.93f)
                arcTo(6.076f, 6.076f, 0.0f, false, false, 5.93f, 12.0f)
                arcTo(6.076f, 6.076f, 0.0f, false, false, 12.0f, 18.07f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, false, 4.3f, -1.792f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.32f, 1.805f)
                curveToRelative(0.874f, 0.0f, 1.74f, -0.292f, 2.437f, -0.821f)
                curveToRelative(0.719f, -0.547f, 1.256f, -1.336f, 1.553f, -2.285f)
                curveToRelative(0.047f, -0.154f, 0.135f, -0.504f, 0.135f, -0.507f)
                lineToRelative(0.002f, -0.013f)
                curveToRelative(0.175f, -0.76f, 0.253f, -1.52f, 0.253f, -2.457f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
            }
        }
        .build()
        return _maildotru!!
    }

private var _maildotru: ImageVector? = null
