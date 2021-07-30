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

public val LineAwesomeIcons.SquareRootAltSolid: ImageVector
    get() {
        if (_squareRootAltSolid != null) {
            return _squareRootAltSolid!!
        }
        _squareRootAltSolid = Builder(name = "SquareRootAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3125f, 6.0f)
                lineTo(19.0625f, 6.6563f)
                lineTo(12.9063f, 22.7188f)
                lineTo(9.9063f, 16.5625f)
                lineTo(9.625f, 16.0f)
                lineTo(6.0f, 16.0f)
                lineTo(6.0f, 18.0f)
                lineTo(8.375f, 18.0f)
                lineTo(12.0f, 25.4375f)
                lineTo(12.2813f, 26.0f)
                lineTo(13.7813f, 26.0f)
                lineTo(14.0313f, 25.3438f)
                lineTo(20.6875f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(26.0f, 6.0f)
                close()
            }
        }
        .build()
        return _squareRootAltSolid!!
    }

private var _squareRootAltSolid: ImageVector? = null
