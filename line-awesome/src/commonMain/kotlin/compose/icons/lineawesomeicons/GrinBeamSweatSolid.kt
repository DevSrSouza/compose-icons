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

public val LineAwesomeIcons.GrinBeamSweatSolid: ImageVector
    get() {
        if (_grinBeamSweatSolid != null) {
            return _grinBeamSweatSolid!!
        }
        _grinBeamSweatSolid = Builder(name = "GrinBeamSweatSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 13.946f, 28.508f, 12.008f, 27.656f, 10.279f)
                curveTo(27.356f, 10.986f, 26.865f, 11.587f, 26.256f, 12.053f)
                curveTo(26.73f, 13.28f, 27.0f, 14.608f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                curveTo(17.351f, 5.0f, 18.641f, 5.256f, 19.838f, 5.703f)
                curveTo(20.098f, 5.111f, 20.398f, 4.502f, 20.715f, 3.898f)
                curveTo(19.251f, 3.326f, 17.664f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(23.5f, 3.0f)
                curveTo(23.5f, 3.0f, 21.0f, 7.275f, 21.0f, 8.6f)
                curveTo(21.0f, 9.925f, 22.12f, 11.0f, 23.5f, 11.0f)
                curveTo(24.88f, 11.0f, 26.0f, 9.925f, 26.0f, 8.6f)
                curveTo(26.0f, 7.275f, 23.5f, 3.0f, 23.5f, 3.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(9.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(18.0f, 16.0f)
                lineTo(23.0f, 16.0f)
                lineTo(23.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _grinBeamSweatSolid!!
    }

private var _grinBeamSweatSolid: ImageVector? = null
