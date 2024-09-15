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

public val LineAwesomeIcons.ChurchSolid: ImageVector
    get() {
        if (_churchSolid != null) {
            return _churchSolid!!
        }
        _churchSolid = Builder(name = "ChurchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 9.563f)
                lineTo(11.281f, 13.281f)
                lineTo(11.0f, 13.594f)
                lineTo(11.0f, 17.406f)
                lineTo(4.5f, 21.125f)
                lineTo(5.5f, 22.875f)
                lineTo(7.0f, 22.031f)
                lineTo(7.0f, 29.0f)
                lineTo(15.0f, 29.0f)
                lineTo(15.0f, 25.0f)
                curveTo(15.0f, 24.445f, 15.445f, 24.0f, 16.0f, 24.0f)
                curveTo(16.555f, 24.0f, 17.0f, 24.445f, 17.0f, 25.0f)
                lineTo(17.0f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(25.0f, 22.031f)
                lineTo(26.5f, 22.875f)
                lineTo(27.5f, 21.125f)
                lineTo(21.0f, 17.406f)
                lineTo(21.0f, 13.594f)
                lineTo(20.719f, 13.281f)
                lineTo(17.0f, 9.563f)
                lineTo(17.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(16.0f, 11.438f)
                lineTo(19.0f, 14.438f)
                lineTo(19.0f, 18.594f)
                lineTo(19.5f, 18.875f)
                lineTo(23.0f, 20.875f)
                lineTo(23.0f, 27.0f)
                lineTo(19.0f, 27.0f)
                lineTo(19.0f, 25.0f)
                curveTo(19.0f, 23.355f, 17.645f, 22.0f, 16.0f, 22.0f)
                curveTo(14.355f, 22.0f, 13.0f, 23.355f, 13.0f, 25.0f)
                lineTo(13.0f, 27.0f)
                lineTo(9.0f, 27.0f)
                lineTo(9.0f, 20.875f)
                lineTo(12.5f, 18.875f)
                lineTo(13.0f, 18.594f)
                lineTo(13.0f, 14.438f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(15.449f, 15.0f, 15.0f, 15.449f, 15.0f, 16.0f)
                lineTo(15.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 16.0f)
                curveTo(17.0f, 15.449f, 16.551f, 15.0f, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _churchSolid!!
    }

private var _churchSolid: ImageVector? = null
