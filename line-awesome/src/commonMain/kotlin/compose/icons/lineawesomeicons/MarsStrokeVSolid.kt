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

public val LineAwesomeIcons.MarsStrokeVSolid: ImageVector
    get() {
        if (_marsStrokeVSolid != null) {
            return _marsStrokeVSolid!!
        }
        _marsStrokeVSolid = Builder(name = "MarsStrokeVSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.5938f)
                lineTo(15.2813f, 2.2813f)
                lineTo(9.2813f, 8.2813f)
                lineTo(10.7188f, 9.7188f)
                lineTo(15.0f, 5.4375f)
                lineTo(15.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                lineTo(12.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 14.0625f)
                curveTo(11.0664f, 14.5625f, 8.0f, 17.9336f, 8.0f, 22.0f)
                curveTo(8.0f, 26.4063f, 11.5938f, 30.0f, 16.0f, 30.0f)
                curveTo(20.4063f, 30.0f, 24.0f, 26.4063f, 24.0f, 22.0f)
                curveTo(24.0f, 17.9336f, 20.9336f, 14.5625f, 17.0f, 14.0625f)
                lineTo(17.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 10.0f)
                lineTo(17.0f, 10.0f)
                lineTo(17.0f, 5.4375f)
                lineTo(21.2813f, 9.7188f)
                lineTo(22.7188f, 8.2813f)
                lineTo(16.7188f, 2.2813f)
                close()
                moveTo(16.0f, 16.0f)
                curveTo(19.3242f, 16.0f, 22.0f, 18.6758f, 22.0f, 22.0f)
                curveTo(22.0f, 25.3242f, 19.3242f, 28.0f, 16.0f, 28.0f)
                curveTo(12.6758f, 28.0f, 10.0f, 25.3242f, 10.0f, 22.0f)
                curveTo(10.0f, 18.6758f, 12.6758f, 16.0f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _marsStrokeVSolid!!
    }

private var _marsStrokeVSolid: ImageVector? = null
