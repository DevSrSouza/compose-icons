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

public val LineAwesomeIcons.ToiletSolid: ImageVector
    get() {
        if (_toiletSolid != null) {
            return _toiletSolid!!
        }
        _toiletSolid = Builder(name = "ToiletSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(5.477f, 4.0f, 4.941f, 4.184f, 4.563f, 4.563f)
                curveTo(4.184f, 4.941f, 4.0f, 5.477f, 4.0f, 6.0f)
                lineTo(4.0f, 17.0f)
                curveTo(4.0f, 19.789f, 5.652f, 22.117f, 8.0f, 23.594f)
                lineTo(8.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 23.594f)
                curveTo(25.348f, 22.117f, 27.0f, 19.789f, 27.0f, 17.0f)
                lineTo(27.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 5.477f, 13.816f, 4.941f, 13.438f, 4.563f)
                curveTo(13.059f, 4.184f, 12.523f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(8.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(6.313f, 18.0f)
                lineTo(24.688f, 18.0f)
                curveTo(24.332f, 19.727f, 23.32f, 21.25f, 21.531f, 22.219f)
                lineTo(21.0f, 22.5f)
                lineTo(21.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 22.5f)
                lineTo(9.469f, 22.219f)
                curveTo(7.68f, 21.25f, 6.668f, 19.727f, 6.313f, 18.0f)
                close()
            }
        }
        .build()
        return _toiletSolid!!
    }

private var _toiletSolid: ImageVector? = null
