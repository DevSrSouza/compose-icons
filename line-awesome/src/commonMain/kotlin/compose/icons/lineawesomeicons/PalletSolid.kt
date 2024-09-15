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

public val LineAwesomeIcons.PalletSolid: ImageVector
    get() {
        if (_palletSolid != null) {
            return _palletSolid!!
        }
        _palletSolid = Builder(name = "PalletSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.125f, 5.0f)
                lineTo(6.0f, 5.844f)
                lineTo(4.0f, 19.844f)
                lineTo(4.0f, 27.0f)
                lineTo(10.0f, 27.0f)
                lineTo(10.0f, 25.0f)
                lineTo(22.0f, 25.0f)
                lineTo(22.0f, 27.0f)
                lineTo(28.0f, 27.0f)
                lineTo(28.0f, 19.844f)
                lineTo(26.0f, 5.844f)
                lineTo(25.875f, 5.0f)
                close()
                moveTo(7.875f, 7.0f)
                lineTo(9.938f, 7.0f)
                lineTo(9.063f, 19.0f)
                lineTo(6.156f, 19.0f)
                close()
                moveTo(11.938f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 19.0f)
                lineTo(11.063f, 19.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(20.063f, 7.0f)
                lineTo(20.938f, 19.0f)
                lineTo(17.0f, 19.0f)
                close()
                moveTo(22.063f, 7.0f)
                lineTo(24.125f, 7.0f)
                lineTo(25.844f, 19.0f)
                lineTo(22.938f, 19.0f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(26.0f, 21.0f)
                lineTo(26.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                lineTo(24.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 25.0f)
                lineTo(6.0f, 25.0f)
                close()
            }
        }
        .build()
        return _palletSolid!!
    }

private var _palletSolid: ImageVector? = null
