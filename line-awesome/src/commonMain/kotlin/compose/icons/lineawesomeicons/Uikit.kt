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

public val LineAwesomeIcons.Uikit: ImageVector
    get() {
        if (_uikit != null) {
            return _uikit!!
        }
        _uikit = Builder(name = "Uikit", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2f, 6.7f)
                lineTo(17.9f, 9.2f)
                lineTo(23.0f, 12.1f)
                lineTo(23.0f, 19.9f)
                lineTo(16.0f, 24.0f)
                lineTo(9.0f, 19.9f)
                lineTo(9.0f, 14.4f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 22.5f)
                lineTo(16.0f, 29.0f)
                lineTo(27.0f, 22.5f)
                lineTo(27.0f, 9.5f)
                close()
                moveTo(20.2f, 5.5f)
                lineTo(16.0f, 3.0f)
                lineTo(11.8f, 5.5f)
                lineTo(16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _uikit!!
    }

private var _uikit: ImageVector? = null
