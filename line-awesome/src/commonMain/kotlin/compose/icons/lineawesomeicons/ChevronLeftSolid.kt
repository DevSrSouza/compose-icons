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

public val LineAwesomeIcons.ChevronLeftSolid: ImageVector
    get() {
        if (_chevronLeftSolid != null) {
            return _chevronLeftSolid!!
        }
        _chevronLeftSolid = Builder(name = "ChevronLeftSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 2.5938f)
                lineTo(19.0313f, 3.2813f)
                lineTo(7.0313f, 15.2813f)
                lineTo(6.3438f, 16.0f)
                lineTo(7.0313f, 16.7188f)
                lineTo(19.0313f, 28.7188f)
                lineTo(19.75f, 29.4063f)
                lineTo(20.4688f, 28.7188f)
                lineTo(24.0625f, 25.0938f)
                lineTo(24.75f, 24.4063f)
                lineTo(24.0625f, 23.6875f)
                lineTo(16.375f, 16.0f)
                lineTo(24.0625f, 8.3125f)
                lineTo(24.75f, 7.5938f)
                lineTo(24.0625f, 6.9063f)
                lineTo(20.4688f, 3.2813f)
                close()
                moveTo(19.75f, 5.4375f)
                lineTo(21.9375f, 7.625f)
                lineTo(14.25f, 15.2813f)
                lineTo(13.5313f, 16.0f)
                lineTo(14.25f, 16.7188f)
                lineTo(21.9375f, 24.375f)
                lineTo(19.75f, 26.5625f)
                lineTo(9.1875f, 16.0f)
                close()
            }
        }
        .build()
        return _chevronLeftSolid!!
    }

private var _chevronLeftSolid: ImageVector? = null
