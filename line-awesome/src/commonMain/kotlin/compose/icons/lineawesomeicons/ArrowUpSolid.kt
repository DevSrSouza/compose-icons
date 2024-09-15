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

public val LineAwesomeIcons.ArrowUpSolid: ImageVector
    get() {
        if (_arrowUpSolid != null) {
            return _arrowUpSolid!!
        }
        _arrowUpSolid = Builder(name = "ArrowUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.094f)
                lineTo(15.281f, 4.781f)
                lineTo(6.781f, 13.281f)
                lineTo(8.219f, 14.719f)
                lineTo(15.0f, 7.938f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 7.938f)
                lineTo(23.781f, 14.719f)
                lineTo(25.219f, 13.281f)
                lineTo(16.719f, 4.781f)
                close()
            }
        }
        .build()
        return _arrowUpSolid!!
    }

private var _arrowUpSolid: ImageVector? = null
