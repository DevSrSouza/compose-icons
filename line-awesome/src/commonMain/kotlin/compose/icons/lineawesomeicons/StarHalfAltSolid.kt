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

public val LineAwesomeIcons.StarHalfAltSolid: ImageVector
    get() {
        if (_starHalfAltSolid != null) {
            return _starHalfAltSolid!!
        }
        _starHalfAltSolid = Builder(name = "StarHalfAltSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.375f)
                lineTo(15.0938f, 4.4063f)
                lineTo(11.8438f, 11.7188f)
                lineTo(3.9063f, 12.5313f)
                lineTo(1.6563f, 12.7813f)
                lineTo(3.3438f, 14.2813f)
                lineTo(9.25f, 19.625f)
                lineTo(7.5938f, 27.4375f)
                lineTo(7.125f, 29.625f)
                lineTo(7.1563f, 29.625f)
                lineTo(9.0938f, 28.5f)
                lineTo(16.0f, 24.5313f)
                lineTo(22.9063f, 28.5f)
                lineTo(24.875f, 29.625f)
                lineTo(24.4063f, 27.4375f)
                lineTo(22.75f, 19.625f)
                lineTo(28.6563f, 14.2813f)
                lineTo(30.3438f, 12.7813f)
                lineTo(28.0938f, 12.5313f)
                lineTo(20.1563f, 11.7188f)
                lineTo(16.9063f, 4.4063f)
                close()
                moveTo(16.0f, 7.2813f)
                lineTo(18.5625f, 13.0625f)
                lineTo(18.8125f, 13.5625f)
                lineTo(19.375f, 13.625f)
                lineTo(25.6875f, 14.2813f)
                lineTo(20.9688f, 18.5313f)
                lineTo(20.5313f, 18.9063f)
                lineTo(20.6563f, 19.4688f)
                lineTo(21.9688f, 25.6563f)
                lineTo(16.5f, 22.5f)
                lineTo(16.0f, 22.2188f)
                close()
            }
        }
        .build()
        return _starHalfAltSolid!!
    }

private var _starHalfAltSolid: ImageVector? = null
