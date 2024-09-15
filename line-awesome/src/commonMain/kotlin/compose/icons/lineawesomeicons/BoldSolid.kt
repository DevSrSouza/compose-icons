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

public val LineAwesomeIcons.BoldSolid: ImageVector
    get() {
        if (_boldSolid != null) {
            return _boldSolid!!
        }
        _boldSolid = Builder(name = "BoldSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(18.801f, 7.0f, 21.0f, 9.199f, 21.0f, 12.0f)
                curveTo(21.0f, 13.301f, 20.5f, 14.398f, 19.699f, 15.301f)
                curveTo(21.602f, 16.0f, 23.0f, 17.801f, 23.0f, 20.0f)
                curveTo(23.0f, 22.801f, 20.801f, 25.0f, 18.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                moveTo(9.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                curveTo(17.699f, 15.0f, 19.0f, 13.699f, 19.0f, 12.0f)
                curveTo(19.0f, 10.301f, 17.699f, 9.0f, 16.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 15.0f)
                moveTo(9.0f, 23.0f)
                lineTo(18.0f, 23.0f)
                curveTo(19.699f, 23.0f, 21.0f, 21.699f, 21.0f, 20.0f)
                curveTo(21.0f, 18.301f, 19.699f, 17.0f, 18.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 23.0f)
                moveTo(16.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                curveTo(21.898f, 27.0f, 25.0f, 23.898f, 25.0f, 20.0f)
                curveTo(25.0f, 17.898f, 24.0f, 15.898f, 22.5f, 14.602f)
                curveTo(22.801f, 13.801f, 23.0f, 12.898f, 23.0f, 12.0f)
                curveTo(23.0f, 8.102f, 19.898f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                curveTo(16.602f, 11.0f, 17.0f, 11.398f, 17.0f, 12.0f)
                curveTo(17.0f, 12.602f, 16.602f, 13.0f, 16.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                close()
                moveTo(11.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                curveTo(18.602f, 19.0f, 19.0f, 19.398f, 19.0f, 20.0f)
                curveTo(19.0f, 20.602f, 18.602f, 21.0f, 18.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                close()
            }
        }
        .build()
        return _boldSolid!!
    }

private var _boldSolid: ImageVector? = null
