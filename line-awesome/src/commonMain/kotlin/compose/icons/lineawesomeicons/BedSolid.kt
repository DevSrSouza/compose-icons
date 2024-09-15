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
                curveTo(4.355f, 6.0f, 3.0f, 7.355f, 3.0f, 9.0f)
                lineTo(3.0f, 15.781f)
                curveTo(2.391f, 16.332f, 2.0f, 17.121f, 2.0f, 18.0f)
                lineTo(2.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                lineTo(7.0f, 25.0f)
                lineTo(25.0f, 25.0f)
                lineTo(25.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 18.0f)
                curveTo(30.0f, 17.121f, 29.609f, 16.332f, 29.0f, 15.781f)
                lineTo(29.0f, 9.0f)
                curveTo(29.0f, 7.355f, 27.645f, 6.0f, 26.0f, 6.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(26.0f, 8.0f)
                curveTo(26.555f, 8.0f, 27.0f, 8.445f, 27.0f, 9.0f)
                lineTo(27.0f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 14.0f)
                curveTo(25.0f, 12.355f, 23.645f, 11.0f, 22.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                curveTo(17.234f, 11.0f, 16.531f, 11.301f, 16.0f, 11.781f)
                curveTo(15.469f, 11.301f, 14.766f, 11.0f, 14.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                curveTo(8.355f, 11.0f, 7.0f, 12.355f, 7.0f, 14.0f)
                lineTo(7.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 9.0f)
                curveTo(5.0f, 8.445f, 5.445f, 8.0f, 6.0f, 8.0f)
                close()
                moveTo(10.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                curveTo(14.555f, 13.0f, 15.0f, 13.445f, 15.0f, 14.0f)
                lineTo(15.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                lineTo(9.0f, 14.0f)
                curveTo(9.0f, 13.445f, 9.445f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(22.0f, 13.0f)
                curveTo(22.555f, 13.0f, 23.0f, 13.445f, 23.0f, 14.0f)
                lineTo(23.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                lineTo(17.0f, 14.0f)
                curveTo(17.0f, 13.445f, 17.445f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(27.0f, 17.0f)
                curveTo(27.555f, 17.0f, 28.0f, 17.445f, 28.0f, 18.0f)
                lineTo(28.0f, 25.0f)
                lineTo(27.0f, 25.0f)
                lineTo(27.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                lineTo(5.0f, 25.0f)
                lineTo(4.0f, 25.0f)
                lineTo(4.0f, 18.0f)
                curveTo(4.0f, 17.445f, 4.445f, 17.0f, 5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bedSolid!!
    }

private var _bedSolid: ImageVector? = null
