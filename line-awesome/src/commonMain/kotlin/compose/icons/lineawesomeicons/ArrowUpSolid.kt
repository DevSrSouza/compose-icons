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
                moveTo(16.0f, 4.0938f)
                lineTo(15.2813f, 4.7813f)
                lineTo(6.7813f, 13.2813f)
                lineTo(8.2188f, 14.7188f)
                lineTo(15.0f, 7.9375f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 7.9375f)
                lineTo(23.7813f, 14.7188f)
                lineTo(25.2188f, 13.2813f)
                lineTo(16.7188f, 4.7813f)
                close()
            }
        }
        .build()
        return _arrowUpSolid!!
    }

private var _arrowUpSolid: ImageVector? = null
