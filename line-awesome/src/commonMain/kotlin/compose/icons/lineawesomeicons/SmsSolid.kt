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

public val LineAwesomeIcons.SmsSolid: ImageVector
    get() {
        if (_smsSolid != null) {
            return _smsSolid!!
        }
        _smsSolid = Builder(name = "SmsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineTo(2.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 30.0938f)
                lineTo(8.625f, 28.7813f)
                lineTo(13.3438f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 5.0f)
                close()
                moveTo(4.0f, 7.0f)
                lineTo(28.0f, 7.0f)
                lineTo(28.0f, 23.0f)
                lineTo(12.6563f, 23.0f)
                lineTo(12.375f, 23.2188f)
                lineTo(9.0f, 25.9063f)
                lineTo(9.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                close()
                moveTo(8.0f, 12.0f)
                lineTo(8.0f, 14.0f)
                lineTo(24.0f, 14.0f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(8.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 16.0f)
                close()
            }
        }
        .build()
        return _smsSolid!!
    }

private var _smsSolid: ImageVector? = null
