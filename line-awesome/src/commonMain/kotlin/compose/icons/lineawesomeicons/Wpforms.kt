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

public val LineAwesomeIcons.Wpforms: ImageVector
    get() {
        if (_wpforms != null) {
            return _wpforms!!
        }
        _wpforms = Builder(name = "Wpforms", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(7.5352f, 7.0f)
                lineTo(12.5996f, 11.3008f)
                lineTo(16.0f, 8.3008f)
                lineTo(19.4004f, 11.3008f)
                lineTo(24.4648f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(10.7051f, 7.0f)
                lineTo(14.5254f, 7.0f)
                lineTo(12.5996f, 8.6992f)
                lineTo(10.7051f, 7.0f)
                close()
                moveTo(17.4746f, 7.0f)
                lineTo(21.2949f, 7.0f)
                lineTo(19.4004f, 8.6992f)
                lineTo(17.4746f, 7.0f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(9.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(14.0f, 13.0f)
                lineTo(14.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                close()
                moveTo(9.0f, 17.0f)
                lineTo(9.0f, 19.0f)
                lineTo(12.0f, 19.0f)
                lineTo(12.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(14.0f, 19.0f)
                lineTo(23.0f, 19.0f)
                lineTo(23.0f, 17.0f)
                lineTo(14.0f, 17.0f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(18.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                lineTo(23.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                close()
            }
        }
        .build()
        return _wpforms!!
    }

private var _wpforms: ImageVector? = null
