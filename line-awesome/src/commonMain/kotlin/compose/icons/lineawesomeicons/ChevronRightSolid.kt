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

public val LineAwesomeIcons.ChevronRightSolid: ImageVector
    get() {
        if (_chevronRightSolid != null) {
            return _chevronRightSolid!!
        }
        _chevronRightSolid = Builder(name = "ChevronRightSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.25f, 2.5938f)
                lineTo(11.5313f, 3.2813f)
                lineTo(7.9375f, 6.9063f)
                lineTo(7.25f, 7.5938f)
                lineTo(7.9375f, 8.3125f)
                lineTo(15.625f, 16.0f)
                lineTo(7.9375f, 23.6875f)
                lineTo(7.25f, 24.4063f)
                lineTo(7.9375f, 25.0938f)
                lineTo(11.5313f, 28.7188f)
                lineTo(12.25f, 29.4063f)
                lineTo(12.9688f, 28.7188f)
                lineTo(24.9688f, 16.7188f)
                lineTo(25.6563f, 16.0f)
                lineTo(24.9688f, 15.2813f)
                lineTo(12.9688f, 3.2813f)
                close()
                moveTo(12.25f, 5.4375f)
                lineTo(22.8125f, 16.0f)
                lineTo(12.25f, 26.5625f)
                lineTo(10.0625f, 24.375f)
                lineTo(17.75f, 16.7188f)
                lineTo(18.4688f, 16.0f)
                lineTo(17.75f, 15.2813f)
                lineTo(10.0625f, 7.625f)
                close()
            }
        }
        .build()
        return _chevronRightSolid!!
    }

private var _chevronRightSolid: ImageVector? = null
