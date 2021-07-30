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

public val LineAwesomeIcons.MousePointerSolid: ImageVector
    get() {
        if (_mousePointerSolid != null) {
            return _mousePointerSolid!!
        }
        _mousePointerSolid = Builder(name = "MousePointerSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.5938f)
                lineTo(9.0f, 28.1563f)
                lineTo(10.6563f, 26.7813f)
                lineTo(14.6875f, 23.4063f)
                lineTo(16.7188f, 27.4375f)
                lineTo(17.1563f, 28.3438f)
                lineTo(18.0625f, 27.875f)
                lineTo(21.1563f, 26.2813f)
                lineTo(22.0313f, 25.8438f)
                lineTo(21.5938f, 24.9375f)
                lineTo(19.75f, 21.3125f)
                lineTo(24.8125f, 20.6875f)
                lineTo(26.8438f, 20.4375f)
                lineTo(25.4063f, 19.0f)
                lineTo(10.7188f, 4.2813f)
                close()
                moveTo(11.0f, 7.4375f)
                lineTo(22.5625f, 18.9688f)
                lineTo(18.0625f, 19.5f)
                lineTo(16.6563f, 19.6875f)
                lineTo(17.3125f, 20.9688f)
                lineTo(19.375f, 24.9688f)
                lineTo(18.0625f, 25.6563f)
                lineTo(15.9063f, 21.3438f)
                lineTo(15.3125f, 20.2188f)
                lineTo(14.3438f, 21.0313f)
                lineTo(11.0f, 23.8438f)
                close()
            }
        }
        .build()
        return _mousePointerSolid!!
    }

private var _mousePointerSolid: ImageVector? = null
