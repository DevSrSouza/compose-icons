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

public val LineAwesomeIcons.AdSolid: ImageVector
    get() {
        if (_adSolid != null) {
            return _adSolid!!
        }
        _adSolid = Builder(name = "AdSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(11.7188f, 11.0f)
                lineTo(11.5f, 11.6875f)
                lineTo(9.0313f, 19.4063f)
                lineTo(9.0f, 19.5625f)
                lineTo(9.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 20.0f)
                lineTo(14.0f, 20.0f)
                lineTo(14.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                lineTo(16.0f, 19.5625f)
                lineTo(15.9688f, 19.4063f)
                lineTo(13.5f, 11.6875f)
                lineTo(13.2813f, 11.0f)
                lineTo(11.7188f, 11.0f)
                close()
                moveTo(21.0f, 11.0f)
                lineTo(21.0f, 15.0f)
                lineTo(19.5f, 15.0f)
                curveTo(18.133f, 15.0f, 17.0f, 16.133f, 17.0f, 17.5f)
                lineTo(17.0f, 18.5f)
                curveTo(17.0f, 19.867f, 18.133f, 21.0f, 19.5f, 21.0f)
                lineTo(23.0f, 21.0f)
                lineTo(23.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                close()
                moveTo(12.5f, 15.1563f)
                lineTo(13.4063f, 18.0f)
                lineTo(11.5938f, 18.0f)
                lineTo(12.5f, 15.1563f)
                close()
                moveTo(19.5f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 19.0f)
                lineTo(19.5f, 19.0f)
                curveTo(19.215f, 19.0f, 19.0f, 18.785f, 19.0f, 18.5f)
                lineTo(19.0f, 17.5f)
                curveTo(19.0f, 17.215f, 19.215f, 17.0f, 19.5f, 17.0f)
                close()
            }
        }
        .build()
        return _adSolid!!
    }

private var _adSolid: ImageVector? = null
