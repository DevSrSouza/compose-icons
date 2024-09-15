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
                curveTo(5.594f, 8.0f, 2.0f, 11.594f, 2.0f, 16.0f)
                curveTo(2.0f, 20.406f, 5.594f, 24.0f, 10.0f, 24.0f)
                curveTo(14.066f, 24.0f, 17.438f, 20.934f, 17.938f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                lineTo(22.0f, 17.0f)
                lineTo(26.563f, 17.0f)
                lineTo(22.281f, 21.281f)
                lineTo(23.719f, 22.719f)
                lineTo(29.719f, 16.719f)
                lineTo(30.406f, 16.0f)
                lineTo(29.719f, 15.281f)
                lineTo(23.719f, 9.281f)
                lineTo(22.281f, 10.719f)
                lineTo(26.563f, 15.0f)
                lineTo(22.0f, 15.0f)
                lineTo(22.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 15.0f)
                lineTo(17.938f, 15.0f)
                curveTo(17.438f, 11.066f, 14.066f, 8.0f, 10.0f, 8.0f)
                close()
                moveTo(10.0f, 10.0f)
                curveTo(13.324f, 10.0f, 16.0f, 12.676f, 16.0f, 16.0f)
                curveTo(16.0f, 19.324f, 13.324f, 22.0f, 10.0f, 22.0f)
                curveTo(6.676f, 22.0f, 4.0f, 19.324f, 4.0f, 16.0f)
                curveTo(4.0f, 12.676f, 6.676f, 10.0f, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _marsStrokeHSolid!!
    }

private var _marsStrokeHSolid: ImageVector? = null
