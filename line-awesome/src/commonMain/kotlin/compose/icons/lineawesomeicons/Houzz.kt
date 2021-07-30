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

public val LineAwesomeIcons.Houzz: ImageVector
    get() {
        if (_houzz != null) {
            return _houzz!!
        }
        _houzz = Builder(name = "Houzz", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.2813f)
                lineTo(8.0f, 6.8438f)
                lineTo(8.0f, 16.0f)
                lineTo(16.0f, 11.4375f)
                close()
                moveTo(16.0f, 11.4375f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 6.8438f)
                close()
                moveTo(24.0f, 16.0f)
                lineTo(16.0f, 20.5625f)
                lineTo(16.0f, 29.7188f)
                lineTo(24.0f, 25.1563f)
                close()
                moveTo(16.0f, 20.5625f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 25.1563f)
                close()
            }
        }
        .build()
        return _houzz!!
    }

private var _houzz: ImageVector? = null
