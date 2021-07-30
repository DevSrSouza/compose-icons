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

public val LineAwesomeIcons.BedSolid: ImageVector
    get() {
        if (_bedSolid != null) {
            return _bedSolid!!
        }
        _bedSolid = Builder(name = "BedSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(4.3555f, 6.0f, 3.0f, 7.3555f, 3.0f, 9.0f)
                lineTo(3.0f, 15.7813f)
                curveTo(2.3906f, 16.332f, 2.0f, 17.1211f, 2.0f, 18.0f)
                lineTo(2.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                lineTo(7.0f, 25.0f)
                lineTo(25.0f, 25.0f)
                lineTo(25.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 18.0f)
                curveTo(30.0f, 17.1211f, 29.6094f, 16.332f, 29.0f, 15.7813f)
                lineTo(29.0f, 9.0f)
                curveTo(29.0f, 7.3555f, 27.6445f, 6.0f, 26.0f, 6.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(26.0f, 8.0f)
                curveTo(26.5547f, 8.0f, 27.0f, 8.4453f, 27.0f, 9.0f)
                lineTo(27.0f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 14.0f)
                curveTo(25.0f, 12.3555f, 23.6445f, 11.0f, 22.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                curveTo(17.2344f, 11.0f, 16.5313f, 11.3008f, 16.0f, 11.7813f)
                curveTo(15.4688f, 11.3008f, 14.7656f, 11.0f, 14.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                curveTo(8.3555f, 11.0f, 7.0f, 12.3555f, 7.0f, 14.0f)
                lineTo(7.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 9.0f)
                curveTo(5.0f, 8.4453f, 5.4453f, 8.0f, 6.0f, 8.0f)
                close()
                moveTo(10.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                curveTo(14.5547f, 13.0f, 15.0f, 13.4453f, 15.0f, 14.0f)
                lineTo(15.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                lineTo(9.0f, 14.0f)
                curveTo(9.0f, 13.4453f, 9.4453f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(22.0f, 13.0f)
                curveTo(22.5547f, 13.0f, 23.0f, 13.4453f, 23.0f, 14.0f)
                lineTo(23.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                lineTo(17.0f, 14.0f)
                curveTo(17.0f, 13.4453f, 17.4453f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(27.0f, 17.0f)
                curveTo(27.5547f, 17.0f, 28.0f, 17.4453f, 28.0f, 18.0f)
                lineTo(28.0f, 25.0f)
                lineTo(27.0f, 25.0f)
                lineTo(27.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                lineTo(5.0f, 25.0f)
                lineTo(4.0f, 25.0f)
                lineTo(4.0f, 18.0f)
                curveTo(4.0f, 17.4453f, 4.4453f, 17.0f, 5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bedSolid!!
    }

private var _bedSolid: ImageVector? = null
