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

public val LineAwesomeIcons.TimesSolid: ImageVector
    get() {
        if (_timesSolid != null) {
            return _timesSolid!!
        }
        _timesSolid = Builder(name = "TimesSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2188f, 5.7813f)
                lineTo(5.7813f, 7.2188f)
                lineTo(14.5625f, 16.0f)
                lineTo(5.7813f, 24.7813f)
                lineTo(7.2188f, 26.2188f)
                lineTo(16.0f, 17.4375f)
                lineTo(24.7813f, 26.2188f)
                lineTo(26.2188f, 24.7813f)
                lineTo(17.4375f, 16.0f)
                lineTo(26.2188f, 7.2188f)
                lineTo(24.7813f, 5.7813f)
                lineTo(16.0f, 14.5625f)
                close()
            }
        }
        .build()
        return _timesSolid!!
    }

private var _timesSolid: ImageVector? = null
