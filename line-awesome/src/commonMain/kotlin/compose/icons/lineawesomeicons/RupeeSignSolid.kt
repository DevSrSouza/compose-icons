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

public val LineAwesomeIcons.RupeeSignSolid: ImageVector
    get() {
        if (_rupeeSignSolid != null) {
            return _rupeeSignSolid!!
        }
        _rupeeSignSolid = Builder(name = "RupeeSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                lineTo(8.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                curveTo(13.703f, 7.0f, 15.941f, 8.039f, 16.719f, 10.0f)
                lineTo(8.0f, 10.0f)
                lineTo(8.0f, 12.0f)
                lineTo(16.969f, 12.0f)
                curveTo(16.66f, 14.609f, 13.973f, 16.0f, 12.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 18.469f)
                lineTo(18.25f, 27.0f)
                lineTo(21.375f, 27.0f)
                lineTo(10.563f, 18.0f)
                lineTo(12.0f, 18.0f)
                curveTo(15.234f, 18.0f, 18.676f, 15.609f, 18.969f, 12.0f)
                lineTo(24.0f, 12.0f)
                lineTo(24.0f, 10.0f)
                lineTo(18.813f, 10.0f)
                curveTo(18.508f, 8.816f, 17.859f, 7.805f, 17.0f, 7.0f)
                lineTo(24.0f, 7.0f)
                lineTo(24.0f, 5.0f)
                close()
            }
        }
        .build()
        return _rupeeSignSolid!!
    }

private var _rupeeSignSolid: ImageVector? = null
