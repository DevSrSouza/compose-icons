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

public val LineAwesomeIcons.AtSolid: ImageVector
    get() {
        if (_atSolid != null) {
            return _atSolid!!
        }
        _atSolid = Builder(name = "AtSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.188f, 4.0f)
                curveTo(8.824f, 3.891f, 2.914f, 10.484f, 4.156f, 18.031f)
                curveTo(5.0f, 23.152f, 9.203f, 27.18f, 14.344f, 27.875f)
                curveTo(17.809f, 28.344f, 21.047f, 27.344f, 23.5f, 25.375f)
                lineTo(22.25f, 23.813f)
                curveTo(20.203f, 25.453f, 17.512f, 26.301f, 14.594f, 25.906f)
                curveTo(10.34f, 25.332f, 6.852f, 21.953f, 6.156f, 17.719f)
                curveTo(5.109f, 11.348f, 9.992f, 5.91f, 16.156f, 6.0f)
                curveTo(21.41f, 6.078f, 25.84f, 10.434f, 26.0f, 15.688f)
                curveTo(26.004f, 15.801f, 26.0f, 15.91f, 26.0f, 16.031f)
                curveTo(25.992f, 18.234f, 24.207f, 20.0f, 22.0f, 20.0f)
                curveTo(20.883f, 20.0f, 20.0f, 19.117f, 20.0f, 18.0f)
                lineTo(20.0f, 10.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 10.781f)
                curveTo(17.281f, 10.293f, 16.426f, 10.0f, 15.5f, 10.0f)
                curveTo(13.027f, 10.0f, 11.0f, 12.027f, 11.0f, 14.5f)
                lineTo(11.0f, 17.5f)
                curveTo(11.0f, 19.973f, 13.027f, 22.0f, 15.5f, 22.0f)
                curveTo(16.848f, 22.0f, 18.047f, 21.387f, 18.875f, 20.438f)
                curveTo(19.609f, 21.371f, 20.73f, 22.0f, 22.0f, 22.0f)
                curveTo(25.285f, 22.0f, 27.988f, 19.32f, 28.0f, 16.031f)
                curveTo(28.0f, 15.898f, 28.004f, 15.77f, 28.0f, 15.625f)
                curveTo(27.809f, 9.289f, 22.523f, 4.094f, 16.188f, 4.0f)
                close()
                moveTo(15.5f, 12.0f)
                curveTo(16.891f, 12.0f, 18.0f, 13.109f, 18.0f, 14.5f)
                lineTo(18.0f, 17.5f)
                curveTo(18.0f, 18.891f, 16.891f, 20.0f, 15.5f, 20.0f)
                curveTo(14.109f, 20.0f, 13.0f, 18.891f, 13.0f, 17.5f)
                lineTo(13.0f, 14.5f)
                curveTo(13.0f, 13.109f, 14.109f, 12.0f, 15.5f, 12.0f)
                close()
            }
        }
        .build()
        return _atSolid!!
    }

private var _atSolid: ImageVector? = null
