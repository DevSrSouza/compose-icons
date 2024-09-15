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

public val LineAwesomeIcons.GavelSolid: ImageVector
    get() {
        if (_gavelSolid != null) {
            return _gavelSolid!!
        }
        _gavelSolid = Builder(name = "GavelSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.969f, 1.594f)
                lineTo(15.25f, 2.281f)
                lineTo(8.25f, 9.313f)
                lineTo(7.531f, 10.0f)
                lineTo(11.969f, 14.438f)
                lineTo(12.656f, 13.719f)
                lineTo(13.0f, 13.375f)
                lineTo(15.094f, 15.469f)
                lineTo(3.281f, 27.281f)
                lineTo(4.719f, 28.719f)
                lineTo(16.531f, 16.906f)
                lineTo(18.594f, 18.969f)
                lineTo(18.25f, 19.313f)
                lineTo(17.531f, 20.0f)
                lineTo(21.969f, 24.438f)
                lineTo(22.656f, 23.719f)
                lineTo(30.375f, 16.0f)
                lineTo(29.656f, 15.313f)
                lineTo(26.656f, 12.281f)
                lineTo(25.969f, 11.594f)
                lineTo(25.25f, 12.281f)
                lineTo(24.969f, 12.563f)
                lineTo(19.375f, 7.0f)
                lineTo(20.375f, 6.0f)
                lineTo(19.656f, 5.313f)
                lineTo(16.656f, 2.281f)
                close()
                moveTo(15.969f, 4.406f)
                lineTo(17.563f, 6.0f)
                lineTo(11.969f, 11.594f)
                lineTo(10.375f, 10.0f)
                close()
                moveTo(18.0f, 8.438f)
                lineTo(23.563f, 14.0f)
                lineTo(20.0f, 17.563f)
                lineTo(14.438f, 12.0f)
                close()
                moveTo(25.969f, 14.406f)
                lineTo(27.563f, 16.0f)
                lineTo(21.969f, 21.594f)
                lineTo(20.375f, 20.0f)
                close()
            }
        }
        .build()
        return _gavelSolid!!
    }

private var _gavelSolid: ImageVector? = null
