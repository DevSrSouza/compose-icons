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

public val LineAwesomeIcons.Gg: ImageVector
    get() {
        if (_gg != null) {
            return _gg!!
        }
        _gg = Builder(name = "Gg", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth =
                32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.594f)
                lineTo(11.281f, 7.281f)
                lineTo(3.281f, 15.281f)
                lineTo(2.594f, 16.0f)
                lineTo(3.281f, 16.719f)
                lineTo(11.281f, 24.719f)
                lineTo(12.0f, 25.406f)
                lineTo(12.719f, 24.719f)
                lineTo(16.719f, 20.719f)
                lineTo(17.406f, 20.0f)
                lineTo(16.719f, 19.281f)
                lineTo(11.719f, 14.281f)
                lineTo(10.281f, 15.719f)
                lineTo(14.563f, 20.0f)
                lineTo(12.0f, 22.563f)
                lineTo(5.438f, 16.0f)
                lineTo(12.0f, 9.438f)
                lineTo(13.281f, 10.719f)
                lineTo(14.719f, 9.281f)
                lineTo(12.719f, 7.281f)
                close()
                moveTo(20.0f, 6.594f)
                lineTo(19.281f, 7.281f)
                lineTo(15.281f, 11.281f)
                lineTo(14.594f, 12.0f)
                lineTo(15.281f, 12.719f)
                lineTo(20.281f, 17.719f)
                lineTo(21.719f, 16.281f)
                lineTo(17.438f, 12.0f)
                lineTo(20.0f, 9.438f)
                lineTo(26.563f, 16.0f)
                lineTo(20.0f, 22.563f)
                lineTo(18.719f, 21.281f)
                lineTo(17.281f, 22.719f)
                lineTo(19.281f, 24.719f)
                lineTo(20.0f, 25.406f)
                lineTo(20.719f, 24.719f)
                lineTo(28.719f, 16.719f)
                lineTo(29.406f, 16.0f)
                lineTo(28.719f, 15.281f)
                lineTo(20.719f, 7.281f)
                close()
            }
        }
        .build()
        return _gg!!
    }

private var _gg: ImageVector? = null
