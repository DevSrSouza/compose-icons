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

public val LineAwesomeIcons.StarOfDavidSolid: ImageVector
    get() {
        if (_starOfDavidSolid != null) {
            return _starOfDavidSolid!!
        }
        _starOfDavidSolid = Builder(name = "StarOfDavidSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.063f)
                lineTo(15.156f, 3.469f)
                lineTo(11.781f, 9.0f)
                lineTo(3.313f, 9.0f)
                lineTo(4.219f, 10.531f)
                lineTo(7.531f, 16.0f)
                lineTo(4.219f, 21.469f)
                lineTo(3.313f, 23.0f)
                lineTo(11.781f, 23.0f)
                lineTo(15.156f, 28.531f)
                lineTo(16.0f, 29.938f)
                lineTo(16.844f, 28.531f)
                lineTo(20.219f, 23.0f)
                lineTo(28.781f, 23.0f)
                lineTo(27.844f, 21.469f)
                lineTo(24.5f, 16.0f)
                lineTo(27.844f, 10.531f)
                lineTo(28.781f, 9.0f)
                lineTo(20.219f, 9.0f)
                lineTo(16.844f, 3.469f)
                close()
                moveTo(16.0f, 5.906f)
                lineTo(17.875f, 9.0f)
                lineTo(14.125f, 9.0f)
                close()
                moveTo(6.875f, 11.0f)
                lineTo(10.594f, 11.0f)
                lineTo(8.719f, 14.063f)
                close()
                moveTo(12.906f, 11.0f)
                lineTo(19.125f, 11.0f)
                lineTo(22.156f, 16.0f)
                lineTo(19.125f, 21.0f)
                lineTo(12.906f, 21.0f)
                lineTo(9.906f, 16.0f)
                close()
                moveTo(21.438f, 11.0f)
                lineTo(25.219f, 11.0f)
                lineTo(23.344f, 14.094f)
                close()
                moveTo(23.344f, 17.906f)
                lineTo(25.219f, 21.0f)
                lineTo(21.438f, 21.0f)
                close()
                moveTo(8.719f, 17.938f)
                lineTo(10.594f, 21.0f)
                lineTo(6.875f, 21.0f)
                close()
                moveTo(14.125f, 23.0f)
                lineTo(17.875f, 23.0f)
                lineTo(16.0f, 26.094f)
                close()
            }
        }
        .build()
        return _starOfDavidSolid!!
    }

private var _starOfDavidSolid: ImageVector? = null
