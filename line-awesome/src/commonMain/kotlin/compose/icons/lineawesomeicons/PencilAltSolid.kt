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

public val LineAwesomeIcons.PencilAltSolid: ImageVector
    get() {
        if (_pencilAltSolid != null) {
            return _pencilAltSolid!!
        }
        _pencilAltSolid = Builder(name = "PencilAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.688f, 4.031f)
                curveTo(23.852f, 4.031f, 23.039f, 4.367f, 22.406f, 5.0f)
                lineTo(22.313f, 5.094f)
                lineTo(21.688f, 4.5f)
                lineTo(5.188f, 21.0f)
                lineTo(5.125f, 21.313f)
                lineTo(4.031f, 26.813f)
                lineTo(3.719f, 28.281f)
                lineTo(5.188f, 27.969f)
                lineTo(10.688f, 26.875f)
                lineTo(11.0f, 26.813f)
                lineTo(27.5f, 10.313f)
                lineTo(26.906f, 9.719f)
                lineTo(26.969f, 9.656f)
                lineTo(27.0f, 9.594f)
                curveTo(28.266f, 8.328f, 28.266f, 6.266f, 27.0f, 5.0f)
                curveTo(26.367f, 4.367f, 25.523f, 4.031f, 24.688f, 4.031f)
                close()
                moveTo(24.688f, 6.0f)
                curveTo(25.0f, 6.0f, 25.328f, 6.141f, 25.594f, 6.406f)
                curveTo(26.129f, 6.941f, 26.129f, 7.652f, 25.594f, 8.188f)
                lineTo(25.5f, 8.281f)
                lineTo(23.719f, 6.5f)
                lineTo(23.813f, 6.406f)
                curveTo(24.078f, 6.141f, 24.375f, 6.0f, 24.688f, 6.0f)
                close()
                moveTo(21.719f, 7.313f)
                lineTo(24.688f, 10.281f)
                lineTo(23.25f, 11.75f)
                lineTo(20.25f, 8.75f)
                close()
                moveTo(18.875f, 10.188f)
                lineTo(21.813f, 13.125f)
                lineTo(11.375f, 23.594f)
                lineTo(10.969f, 21.781f)
                lineTo(10.844f, 21.156f)
                lineTo(10.219f, 21.031f)
                lineTo(8.406f, 20.625f)
                close()
                moveTo(6.969f, 22.344f)
                lineTo(9.156f, 22.844f)
                lineTo(9.656f, 25.031f)
                lineTo(7.625f, 25.438f)
                lineTo(6.563f, 24.375f)
                close()
            }
        }
        .build()
        return _pencilAltSolid!!
    }

private var _pencilAltSolid: ImageVector? = null
