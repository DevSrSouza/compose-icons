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

public val LineAwesomeIcons.MarsStrokeHSolid: ImageVector
    get() {
        if (_marsStrokeHSolid != null) {
            return _marsStrokeHSolid!!
        }
        _marsStrokeHSolid = Builder(name = "MarsStrokeHSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                curveTo(5.5938f, 8.0f, 2.0f, 11.5938f, 2.0f, 16.0f)
                curveTo(2.0f, 20.4063f, 5.5938f, 24.0f, 10.0f, 24.0f)
                curveTo(14.0664f, 24.0f, 17.4375f, 20.9336f, 17.9375f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                lineTo(22.0f, 17.0f)
                lineTo(26.5625f, 17.0f)
                lineTo(22.2813f, 21.2813f)
                lineTo(23.7188f, 22.7188f)
                lineTo(29.7188f, 16.7188f)
                lineTo(30.4063f, 16.0f)
                lineTo(29.7188f, 15.2813f)
                lineTo(23.7188f, 9.2813f)
                lineTo(22.2813f, 10.7188f)
                lineTo(26.5625f, 15.0f)
                lineTo(22.0f, 15.0f)
                lineTo(22.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 15.0f)
                lineTo(17.9375f, 15.0f)
                curveTo(17.4375f, 11.0664f, 14.0664f, 8.0f, 10.0f, 8.0f)
                close()
                moveTo(10.0f, 10.0f)
                curveTo(13.3242f, 10.0f, 16.0f, 12.6758f, 16.0f, 16.0f)
                curveTo(16.0f, 19.3242f, 13.3242f, 22.0f, 10.0f, 22.0f)
                curveTo(6.6758f, 22.0f, 4.0f, 19.3242f, 4.0f, 16.0f)
                curveTo(4.0f, 12.6758f, 6.6758f, 10.0f, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _marsStrokeHSolid!!
    }

private var _marsStrokeHSolid: ImageVector? = null
