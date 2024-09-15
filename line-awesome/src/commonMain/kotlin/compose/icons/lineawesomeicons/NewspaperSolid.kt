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

public val LineAwesomeIcons.NewspaperSolid: ImageVector
    get() {
        if (_newspaperSolid != null) {
            return _newspaperSolid!!
        }
        _newspaperSolid = Builder(name = "NewspaperSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                lineTo(3.0f, 23.0f)
                curveTo(3.0f, 25.211f, 4.789f, 27.0f, 7.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                curveTo(27.211f, 27.0f, 29.0f, 25.211f, 29.0f, 23.0f)
                lineTo(29.0f, 12.0f)
                lineTo(23.0f, 12.0f)
                lineTo(23.0f, 5.0f)
                close()
                moveTo(5.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 23.0f)
                curveTo(21.0f, 23.73f, 21.223f, 24.41f, 21.563f, 25.0f)
                lineTo(7.0f, 25.0f)
                curveTo(5.809f, 25.0f, 5.0f, 24.191f, 5.0f, 23.0f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(7.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                lineTo(19.0f, 9.0f)
                close()
                moveTo(9.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(23.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 23.0f)
                curveTo(27.0f, 24.191f, 26.191f, 25.0f, 25.0f, 25.0f)
                curveTo(23.809f, 25.0f, 23.0f, 24.191f, 23.0f, 23.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(7.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 15.0f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(14.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 15.0f)
                close()
                moveTo(7.0f, 18.0f)
                lineTo(7.0f, 20.0f)
                lineTo(12.0f, 20.0f)
                lineTo(12.0f, 18.0f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(14.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                lineTo(19.0f, 18.0f)
                close()
                moveTo(7.0f, 21.0f)
                lineTo(7.0f, 23.0f)
                lineTo(12.0f, 23.0f)
                lineTo(12.0f, 21.0f)
                close()
                moveTo(14.0f, 21.0f)
                lineTo(14.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _newspaperSolid!!
    }

private var _newspaperSolid: ImageVector? = null
