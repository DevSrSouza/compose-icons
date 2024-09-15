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

public val LineAwesomeIcons.LowVisionSolid: ImageVector
    get() {
        if (_lowVisionSolid != null) {
            return _lowVisionSolid!!
        }
        _lowVisionSolid = Builder(name = "LowVisionSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.719f, 2.281f)
                lineTo(2.281f, 3.719f)
                lineTo(28.281f, 29.719f)
                lineTo(29.719f, 28.281f)
                lineTo(23.125f, 21.688f)
                curveTo(26.438f, 19.621f, 28.637f, 16.902f, 28.781f, 16.719f)
                lineTo(29.0f, 16.438f)
                lineTo(29.0f, 15.531f)
                lineTo(28.75f, 15.25f)
                curveTo(28.496f, 14.953f, 22.523f, 8.0f, 16.0f, 8.0f)
                curveTo(14.098f, 8.0f, 12.32f, 8.531f, 10.719f, 9.281f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(20.648f, 10.0f, 25.281f, 14.48f, 26.75f, 16.031f)
                curveTo(25.938f, 16.949f, 24.098f, 18.832f, 21.688f, 20.25f)
                lineTo(19.438f, 18.0f)
                curveTo(20.336f, 16.469f, 20.129f, 14.473f, 18.813f, 13.156f)
                curveTo(17.496f, 11.84f, 15.531f, 11.664f, 14.0f, 12.563f)
                lineTo(12.25f, 10.813f)
                curveTo(13.434f, 10.336f, 14.684f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(7.75f, 11.031f)
                curveTo(5.07f, 12.957f, 3.348f, 15.121f, 3.219f, 15.281f)
                lineTo(3.0f, 15.531f)
                lineTo(3.0f, 16.469f)
                lineTo(3.25f, 16.75f)
                curveTo(3.512f, 17.047f, 9.719f, 24.0f, 16.0f, 24.0f)
                curveTo(17.398f, 24.0f, 18.75f, 23.727f, 20.0f, 23.281f)
                close()
                moveTo(8.375f, 13.094f)
                lineTo(17.188f, 21.906f)
                curveTo(16.801f, 21.961f, 16.398f, 22.0f, 16.0f, 22.0f)
                curveTo(15.516f, 22.0f, 15.02f, 21.941f, 14.531f, 21.844f)
                lineTo(6.969f, 14.25f)
                curveTo(7.383f, 13.871f, 7.863f, 13.488f, 8.375f, 13.094f)
                close()
                moveTo(6.219f, 14.938f)
                lineTo(12.531f, 21.219f)
                curveTo(9.289f, 19.867f, 6.379f, 17.121f, 5.25f, 15.969f)
                curveTo(5.484f, 15.703f, 5.82f, 15.332f, 6.219f, 14.938f)
                close()
            }
        }
        .build()
        return _lowVisionSolid!!
    }

private var _lowVisionSolid: ImageVector? = null
