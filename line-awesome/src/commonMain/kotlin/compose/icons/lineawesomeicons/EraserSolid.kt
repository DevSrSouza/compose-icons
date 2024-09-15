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

public val LineAwesomeIcons.EraserSolid: ImageVector
    get() {
        if (_eraserSolid != null) {
            return _eraserSolid!!
        }
        _eraserSolid = Builder(name = "EraserSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.906f, 4.094f)
                curveTo(18.102f, 4.094f, 17.266f, 4.367f, 16.625f, 4.938f)
                lineTo(16.625f, 4.969f)
                lineTo(16.594f, 5.0f)
                lineTo(4.906f, 16.594f)
                curveTo(3.695f, 17.805f, 3.703f, 19.777f, 4.844f, 21.063f)
                lineTo(4.875f, 21.094f)
                lineTo(4.906f, 21.094f)
                lineTo(10.906f, 27.094f)
                curveTo(12.117f, 28.305f, 14.09f, 28.297f, 15.375f, 27.156f)
                lineTo(15.375f, 27.125f)
                lineTo(27.0f, 15.5f)
                curveTo(28.266f, 14.234f, 28.305f, 12.211f, 27.094f, 11.0f)
                lineTo(21.094f, 5.0f)
                curveTo(20.488f, 4.395f, 19.711f, 4.094f, 18.906f, 4.094f)
                close()
                moveTo(18.875f, 6.125f)
                curveTo(19.195f, 6.125f, 19.492f, 6.211f, 19.688f, 6.406f)
                lineTo(25.688f, 12.406f)
                curveTo(26.074f, 12.793f, 26.129f, 13.559f, 25.594f, 14.094f)
                lineTo(20.563f, 19.125f)
                lineTo(12.906f, 11.469f)
                lineTo(17.969f, 6.438f)
                lineTo(18.0f, 6.406f)
                curveTo(18.254f, 6.195f, 18.57f, 6.125f, 18.875f, 6.125f)
                close()
                moveTo(11.469f, 12.906f)
                lineTo(19.125f, 20.563f)
                lineTo(14.031f, 25.656f)
                curveTo(14.02f, 25.664f, 14.012f, 25.68f, 14.0f, 25.688f)
                curveTo(13.484f, 26.117f, 12.691f, 26.066f, 12.313f, 25.688f)
                lineTo(6.344f, 19.75f)
                curveTo(6.328f, 19.73f, 6.328f, 19.707f, 6.313f, 19.688f)
                curveTo(5.902f, 19.172f, 5.938f, 18.375f, 6.313f, 18.0f)
                close()
            }
        }
        .build()
        return _eraserSolid!!
    }

private var _eraserSolid: ImageVector? = null
