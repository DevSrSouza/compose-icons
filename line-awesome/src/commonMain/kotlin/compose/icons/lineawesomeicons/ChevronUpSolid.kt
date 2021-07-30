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

public val LineAwesomeIcons.ChevronUpSolid: ImageVector
    get() {
        if (_chevronUpSolid != null) {
            return _chevronUpSolid!!
        }
        _chevronUpSolid = Builder(name = "ChevronUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.6875f)
                lineTo(1.5938f, 20.0938f)
                lineTo(2.2813f, 20.8125f)
                lineTo(6.1875f, 24.7188f)
                lineTo(6.9063f, 25.4063f)
                lineTo(16.0f, 16.3125f)
                lineTo(25.0938f, 25.4063f)
                lineTo(25.8125f, 24.7188f)
                lineTo(29.7188f, 20.8125f)
                lineTo(30.4063f, 20.0938f)
                close()
                moveTo(16.0f, 8.5313f)
                lineTo(27.5625f, 20.125f)
                lineTo(25.125f, 22.5625f)
                lineTo(16.7188f, 14.1875f)
                lineTo(16.0f, 13.5f)
                lineTo(15.2813f, 14.1875f)
                lineTo(6.875f, 22.5625f)
                lineTo(4.4375f, 20.125f)
                close()
            }
        }
        .build()
        return _chevronUpSolid!!
    }

private var _chevronUpSolid: ImageVector? = null
