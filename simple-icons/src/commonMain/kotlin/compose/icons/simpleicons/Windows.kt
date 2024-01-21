package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineTo(11.377f, 0.0f)
                lineTo(11.377f, 11.372f)
                lineTo(0.0f, 11.372f)
                close()
                moveTo(12.623f, 0.0f)
                lineTo(24.0f, 0.0f)
                lineTo(24.0f, 11.372f)
                lineTo(12.623f, 11.372f)
                close()
                moveTo(0.0f, 12.623f)
                lineTo(11.377f, 12.623f)
                lineTo(11.377f, 24.0f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(12.623f, 12.623f)
                lineTo(24.0f, 12.623f)
                lineTo(24.0f, 24.0f)
                lineTo(12.623f, 24.0f)
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
