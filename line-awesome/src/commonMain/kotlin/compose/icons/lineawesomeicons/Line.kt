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

public val LineAwesomeIcons.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.625f, 5.0f)
                curveTo(7.09f, 5.0f, 5.0f, 7.09f, 5.0f, 9.625f)
                lineTo(5.0f, 22.375f)
                curveTo(5.0f, 24.91f, 7.09f, 27.0f, 9.625f, 27.0f)
                lineTo(22.375f, 27.0f)
                curveTo(24.91f, 27.0f, 27.0f, 24.91f, 27.0f, 22.375f)
                lineTo(27.0f, 9.625f)
                curveTo(27.0f, 7.09f, 24.91f, 5.0f, 22.375f, 5.0f)
                close()
                moveTo(9.625f, 7.0f)
                lineTo(22.375f, 7.0f)
                curveTo(23.828f, 7.0f, 25.0f, 8.172f, 25.0f, 9.625f)
                lineTo(25.0f, 22.375f)
                curveTo(25.0f, 23.828f, 23.828f, 25.0f, 22.375f, 25.0f)
                lineTo(9.625f, 25.0f)
                curveTo(8.172f, 25.0f, 7.0f, 23.828f, 7.0f, 22.375f)
                lineTo(7.0f, 9.625f)
                curveTo(7.0f, 8.172f, 8.172f, 7.0f, 9.625f, 7.0f)
                close()
                moveTo(16.0f, 9.219f)
                curveTo(11.984f, 9.219f, 8.719f, 11.867f, 8.719f, 15.125f)
                curveTo(8.719f, 18.047f, 11.313f, 20.477f, 14.813f, 20.938f)
                curveTo(15.051f, 20.988f, 15.355f, 21.109f, 15.438f, 21.313f)
                curveTo(15.512f, 21.496f, 15.492f, 21.781f, 15.469f, 21.969f)
                curveTo(15.469f, 21.969f, 15.395f, 22.484f, 15.375f, 22.594f)
                curveTo(15.344f, 22.777f, 15.223f, 23.328f, 16.0f, 23.0f)
                curveTo(16.777f, 22.672f, 20.191f, 20.508f, 21.719f, 18.75f)
                curveTo(22.773f, 17.594f, 23.281f, 16.43f, 23.281f, 15.125f)
                curveTo(23.281f, 11.867f, 20.016f, 9.219f, 16.0f, 9.219f)
                close()
                moveTo(11.719f, 13.406f)
                curveTo(11.93f, 13.406f, 12.094f, 13.57f, 12.094f, 13.781f)
                lineTo(12.094f, 16.281f)
                lineTo(13.156f, 16.281f)
                curveTo(13.367f, 16.281f, 13.531f, 16.477f, 13.531f, 16.688f)
                curveTo(13.531f, 16.898f, 13.367f, 17.063f, 13.156f, 17.063f)
                lineTo(11.719f, 17.063f)
                curveTo(11.508f, 17.063f, 11.313f, 16.898f, 11.313f, 16.688f)
                lineTo(11.313f, 13.781f)
                curveTo(11.313f, 13.57f, 11.508f, 13.406f, 11.719f, 13.406f)
                close()
                moveTo(14.281f, 13.406f)
                curveTo(14.492f, 13.406f, 14.656f, 13.57f, 14.656f, 13.781f)
                lineTo(14.656f, 16.688f)
                curveTo(14.656f, 16.898f, 14.492f, 17.063f, 14.281f, 17.063f)
                curveTo(14.07f, 17.063f, 13.875f, 16.898f, 13.875f, 16.688f)
                lineTo(13.875f, 13.781f)
                curveTo(13.875f, 13.57f, 14.07f, 13.406f, 14.281f, 13.406f)
                close()
                moveTo(15.469f, 13.406f)
                curveTo(15.508f, 13.395f, 15.555f, 13.406f, 15.594f, 13.406f)
                curveTo(15.711f, 13.406f, 15.805f, 13.465f, 15.875f, 13.563f)
                lineTo(17.375f, 15.563f)
                lineTo(17.375f, 13.781f)
                curveTo(17.375f, 13.57f, 17.539f, 13.406f, 17.75f, 13.406f)
                curveTo(17.961f, 13.406f, 18.125f, 13.57f, 18.125f, 13.781f)
                lineTo(18.125f, 16.688f)
                curveTo(18.125f, 16.852f, 18.031f, 16.98f, 17.875f, 17.031f)
                curveTo(17.836f, 17.043f, 17.789f, 17.063f, 17.75f, 17.063f)
                curveTo(17.633f, 17.063f, 17.508f, 17.004f, 17.438f, 16.906f)
                lineTo(15.969f, 14.875f)
                lineTo(15.969f, 16.688f)
                curveTo(15.969f, 16.898f, 15.805f, 17.063f, 15.594f, 17.063f)
                curveTo(15.383f, 17.063f, 15.188f, 16.898f, 15.188f, 16.688f)
                lineTo(15.188f, 13.781f)
                curveTo(15.188f, 13.617f, 15.313f, 13.457f, 15.469f, 13.406f)
                close()
                moveTo(19.031f, 13.406f)
                lineTo(20.469f, 13.406f)
                curveTo(20.68f, 13.406f, 20.844f, 13.57f, 20.844f, 13.781f)
                curveTo(20.844f, 13.992f, 20.68f, 14.156f, 20.469f, 14.156f)
                lineTo(19.406f, 14.156f)
                lineTo(19.406f, 14.844f)
                lineTo(20.469f, 14.844f)
                curveTo(20.68f, 14.844f, 20.844f, 15.008f, 20.844f, 15.219f)
                curveTo(20.844f, 15.43f, 20.68f, 15.625f, 20.469f, 15.625f)
                lineTo(19.406f, 15.625f)
                lineTo(19.406f, 16.281f)
                lineTo(20.469f, 16.281f)
                curveTo(20.68f, 16.281f, 20.844f, 16.477f, 20.844f, 16.688f)
                curveTo(20.844f, 16.898f, 20.68f, 17.063f, 20.469f, 17.063f)
                lineTo(19.031f, 17.063f)
                curveTo(18.82f, 17.063f, 18.656f, 16.898f, 18.656f, 16.688f)
                lineTo(18.656f, 13.781f)
                curveTo(18.656f, 13.57f, 18.82f, 13.406f, 19.031f, 13.406f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
