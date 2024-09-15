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

public val LineAwesomeIcons.SimCardSolid: ImageVector
    get() {
        if (_simCardSolid != null) {
            return _simCardSolid!!
        }
        _simCardSolid = Builder(name = "SimCardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(8.477f, 4.0f, 7.941f, 4.184f, 7.563f, 4.563f)
                curveTo(7.184f, 4.941f, 7.0f, 5.477f, 7.0f, 6.0f)
                lineTo(7.0f, 26.0f)
                curveTo(7.0f, 26.523f, 7.184f, 27.059f, 7.563f, 27.438f)
                curveTo(7.941f, 27.816f, 8.477f, 28.0f, 9.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                curveTo(23.523f, 28.0f, 24.059f, 27.816f, 24.438f, 27.438f)
                curveTo(24.816f, 27.059f, 25.0f, 26.523f, 25.0f, 26.0f)
                lineTo(25.0f, 11.406f)
                curveTo(25.0f, 10.883f, 24.723f, 10.316f, 24.406f, 10.0f)
                lineTo(19.0f, 4.594f)
                curveTo(18.684f, 4.277f, 18.117f, 4.0f, 17.594f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(17.594f, 6.0f)
                lineTo(23.0f, 11.406f)
                lineTo(23.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 15.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                close()
            }
        }
        .build()
        return _simCardSolid!!
    }

private var _simCardSolid: ImageVector? = null
