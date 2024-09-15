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

public val LineAwesomeIcons.PencilRulerSolid: ImageVector
    get() {
        if (_pencilRulerSolid != null) {
            return _pencilRulerSolid!!
        }
        _pencilRulerSolid = Builder(name = "PencilRulerSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.813f, 3.0f)
                lineTo(8.125f, 3.719f)
                lineTo(3.719f, 8.125f)
                lineTo(3.0f, 8.813f)
                lineTo(10.188f, 16.0f)
                lineTo(5.188f, 21.0f)
                lineTo(5.125f, 21.313f)
                lineTo(4.031f, 26.813f)
                lineTo(3.719f, 28.281f)
                lineTo(5.188f, 27.969f)
                lineTo(10.688f, 26.875f)
                lineTo(11.0f, 26.813f)
                lineTo(16.0f, 21.813f)
                lineTo(23.156f, 28.969f)
                lineTo(23.844f, 28.25f)
                lineTo(28.25f, 23.844f)
                lineTo(28.969f, 23.156f)
                lineTo(21.813f, 16.0f)
                lineTo(26.75f, 11.063f)
                curveTo(28.359f, 9.453f, 28.359f, 6.859f, 26.75f, 5.25f)
                curveTo(25.945f, 4.445f, 24.895f, 4.031f, 23.844f, 4.031f)
                curveTo(22.793f, 4.031f, 21.742f, 4.445f, 20.938f, 5.25f)
                lineTo(16.0f, 10.188f)
                close()
                moveTo(8.813f, 5.844f)
                lineTo(10.75f, 7.813f)
                lineTo(9.281f, 9.281f)
                lineTo(10.719f, 10.719f)
                lineTo(12.188f, 9.25f)
                lineTo(14.563f, 11.625f)
                lineTo(11.594f, 14.594f)
                lineTo(5.813f, 8.813f)
                close()
                moveTo(23.844f, 5.969f)
                curveTo(24.363f, 5.969f, 24.891f, 6.203f, 25.344f, 6.656f)
                curveTo(26.246f, 7.559f, 26.246f, 8.723f, 25.344f, 9.625f)
                lineTo(24.688f, 10.281f)
                lineTo(21.719f, 7.313f)
                lineTo(22.375f, 6.656f)
                curveTo(22.828f, 6.203f, 23.324f, 5.969f, 23.844f, 5.969f)
                close()
                moveTo(20.313f, 8.719f)
                lineTo(23.281f, 11.688f)
                lineTo(11.188f, 23.781f)
                curveTo(10.527f, 22.512f, 9.488f, 21.473f, 8.219f, 20.813f)
                close()
                moveTo(20.406f, 17.406f)
                lineTo(22.781f, 19.781f)
                lineTo(21.281f, 21.281f)
                lineTo(22.719f, 22.719f)
                lineTo(24.219f, 21.219f)
                lineTo(26.125f, 23.125f)
                lineTo(23.125f, 26.125f)
                lineTo(17.406f, 20.406f)
                close()
                moveTo(6.938f, 22.406f)
                curveTo(8.137f, 22.91f, 9.09f, 23.863f, 9.594f, 25.063f)
                lineTo(6.281f, 25.719f)
                close()
            }
        }
        .build()
        return _pencilRulerSolid!!
    }

private var _pencilRulerSolid: ImageVector? = null
