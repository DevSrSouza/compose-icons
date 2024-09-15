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
                moveTo(16.0f, 1.594f)
                lineTo(15.281f, 2.281f)
                lineTo(9.281f, 8.281f)
                lineTo(10.719f, 9.719f)
                lineTo(15.0f, 5.438f)
                lineTo(15.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                lineTo(12.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 14.063f)
                curveTo(11.066f, 14.563f, 8.0f, 17.934f, 8.0f, 22.0f)
                curveTo(8.0f, 26.406f, 11.594f, 30.0f, 16.0f, 30.0f)
                curveTo(20.406f, 30.0f, 24.0f, 26.406f, 24.0f, 22.0f)
                curveTo(24.0f, 17.934f, 20.934f, 14.563f, 17.0f, 14.063f)
                lineTo(17.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 10.0f)
                lineTo(17.0f, 10.0f)
                lineTo(17.0f, 5.438f)
                lineTo(21.281f, 9.719f)
                lineTo(22.719f, 8.281f)
                lineTo(16.719f, 2.281f)
                close()
                moveTo(16.0f, 16.0f)
                curveTo(19.324f, 16.0f, 22.0f, 18.676f, 22.0f, 22.0f)
                curveTo(22.0f, 25.324f, 19.324f, 28.0f, 16.0f, 28.0f)
                curveTo(12.676f, 28.0f, 10.0f, 25.324f, 10.0f, 22.0f)
                curveTo(10.0f, 18.676f, 12.676f, 16.0f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _marsStrokeVSolid!!
    }

private var _marsStrokeVSolid: ImageVector? = null
