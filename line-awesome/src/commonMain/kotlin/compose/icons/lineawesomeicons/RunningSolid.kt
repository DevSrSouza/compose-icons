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

public val LineAwesomeIcons.RunningSolid: ImageVector
    get() {
        if (_runningSolid != null) {
            return _runningSolid!!
        }
        _runningSolid = Builder(name = "RunningSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.219f, 5.0f)
                curveTo(18.539f, 5.0f, 17.156f, 6.383f, 17.156f, 8.063f)
                curveTo(17.156f, 9.742f, 18.539f, 11.125f, 20.219f, 11.125f)
                curveTo(21.902f, 11.125f, 23.313f, 9.742f, 23.313f, 8.063f)
                curveTo(23.313f, 6.383f, 21.902f, 5.0f, 20.219f, 5.0f)
                close()
                moveTo(20.219f, 7.0f)
                curveTo(20.82f, 7.0f, 21.313f, 7.465f, 21.313f, 8.063f)
                curveTo(21.313f, 8.66f, 20.82f, 9.125f, 20.219f, 9.125f)
                curveTo(19.621f, 9.125f, 19.156f, 8.664f, 19.156f, 8.063f)
                curveTo(19.156f, 7.465f, 19.621f, 7.0f, 20.219f, 7.0f)
                close()
                moveTo(12.938f, 9.0f)
                curveTo(12.457f, 9.059f, 11.973f, 9.281f, 11.625f, 9.656f)
                lineTo(8.25f, 13.313f)
                lineTo(9.75f, 14.688f)
                lineTo(13.094f, 11.031f)
                curveTo(13.129f, 10.996f, 13.176f, 10.973f, 13.219f, 11.0f)
                lineTo(14.813f, 12.063f)
                lineTo(12.469f, 15.313f)
                curveTo(11.734f, 16.344f, 11.855f, 17.762f, 12.75f, 18.656f)
                lineTo(16.281f, 22.188f)
                lineTo(13.375f, 28.0f)
                lineTo(15.625f, 28.0f)
                lineTo(18.094f, 23.094f)
                curveTo(18.48f, 22.324f, 18.328f, 21.391f, 17.719f, 20.781f)
                lineTo(14.188f, 17.25f)
                curveTo(13.984f, 17.047f, 13.957f, 16.703f, 14.125f, 16.469f)
                lineTo(16.469f, 13.188f)
                lineTo(17.281f, 13.719f)
                lineTo(18.875f, 16.125f)
                curveTo(19.246f, 16.68f, 19.863f, 17.0f, 20.531f, 17.0f)
                lineTo(25.0f, 17.0f)
                lineTo(25.0f, 15.0f)
                lineTo(20.531f, 15.0f)
                lineTo(18.844f, 12.438f)
                lineTo(18.719f, 12.281f)
                lineTo(18.563f, 12.156f)
                lineTo(14.344f, 9.344f)
                curveTo(13.918f, 9.059f, 13.418f, 8.941f, 12.938f, 9.0f)
                close()
                moveTo(12.063f, 19.531f)
                lineTo(10.594f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 23.0f)
                lineTo(10.594f, 23.0f)
                curveTo(11.121f, 23.0f, 11.625f, 22.785f, 12.0f, 22.406f)
                lineTo(13.469f, 20.938f)
                close()
            }
        }
        .build()
        return _runningSolid!!
    }

private var _runningSolid: ImageVector? = null
