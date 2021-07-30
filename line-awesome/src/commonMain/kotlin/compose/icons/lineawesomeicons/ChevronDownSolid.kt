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

public val LineAwesomeIcons.ChevronDownSolid: ImageVector
    get() {
        if (_chevronDownSolid != null) {
            return _chevronDownSolid!!
        }
        _chevronDownSolid = Builder(name = "ChevronDownSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9063f, 6.5938f)
                lineTo(6.1875f, 7.2813f)
                lineTo(2.2813f, 11.1875f)
                lineTo(1.5938f, 11.9063f)
                lineTo(16.0f, 26.3125f)
                lineTo(30.4063f, 11.9063f)
                lineTo(29.7188f, 11.1875f)
                lineTo(25.8125f, 7.2813f)
                lineTo(25.0938f, 6.5938f)
                lineTo(16.0f, 15.6875f)
                close()
                moveTo(6.875f, 9.4375f)
                lineTo(15.2813f, 17.8125f)
                lineTo(16.0f, 18.5f)
                lineTo(16.7188f, 17.8125f)
                lineTo(25.125f, 9.4375f)
                lineTo(27.5625f, 11.875f)
                lineTo(16.0f, 23.4688f)
                lineTo(4.4375f, 11.875f)
                close()
            }
        }
        .build()
        return _chevronDownSolid!!
    }

private var _chevronDownSolid: ImageVector? = null
