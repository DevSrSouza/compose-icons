package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 93.7f)
                lineToRelative(183.6f, -25.3f)
                verticalLineToRelative(177.4f)
                lineTo(0.0f, 245.8f)
                lineTo(0.0f, 93.7f)
                close()
                moveTo(0.0f, 418.3f)
                lineToRelative(183.6f, 25.3f)
                lineTo(183.6f, 268.4f)
                lineTo(0.0f, 268.4f)
                verticalLineToRelative(149.9f)
                close()
                moveTo(203.8f, 446.3f)
                lineTo(448.0f, 480.0f)
                lineTo(448.0f, 268.4f)
                lineTo(203.8f, 268.4f)
                verticalLineToRelative(177.9f)
                close()
                moveTo(203.8f, 65.7f)
                verticalLineToRelative(180.1f)
                lineTo(448.0f, 245.8f)
                lineTo(448.0f, 32.0f)
                lineTo(203.8f, 65.7f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
