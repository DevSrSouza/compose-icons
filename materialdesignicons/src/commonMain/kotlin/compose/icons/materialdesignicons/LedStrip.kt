package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.LedStrip: ImageVector
    get() {
        if (_ledStrip != null) {
            return _ledStrip!!
        }
        _ledStrip = Builder(name = "LedStrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 8.46f)
                lineTo(14.83f, 20.5f)
                lineTo(15.54f, 19.78f)
                lineTo(16.95f, 21.19f)
                lineTo(18.36f, 19.78f)
                lineTo(16.95f, 18.36f)
                lineTo(18.36f, 16.95f)
                lineTo(19.78f, 18.36f)
                lineTo(21.19f, 16.95f)
                lineTo(19.78f, 15.54f)
                lineTo(20.5f, 14.83f)
                lineTo(8.46f, 2.81f)
                lineTo(2.81f, 8.46f)
                moveTo(5.64f, 8.46f)
                lineTo(8.46f, 5.64f)
                lineTo(17.66f, 14.83f)
                lineTo(14.83f, 17.66f)
                lineTo(5.64f, 8.46f)
                moveTo(7.05f, 8.46f)
                lineTo(8.46f, 9.88f)
                lineTo(9.88f, 8.46f)
                lineTo(8.46f, 7.05f)
                lineTo(7.05f, 8.46f)
                moveTo(9.17f, 10.59f)
                lineTo(10.59f, 12.0f)
                lineTo(12.0f, 10.59f)
                lineTo(10.59f, 9.17f)
                lineTo(9.17f, 10.59f)
                moveTo(11.29f, 12.71f)
                lineTo(12.71f, 14.12f)
                lineTo(14.12f, 12.71f)
                lineTo(12.71f, 11.29f)
                lineTo(11.29f, 12.71f)
                moveTo(13.41f, 14.83f)
                lineTo(14.83f, 16.24f)
                lineTo(16.24f, 14.83f)
                lineTo(14.83f, 13.41f)
                lineTo(13.41f, 14.83f)
                close()
            }
        }
        .build()
        return _ledStrip!!
    }

private var _ledStrip: ImageVector? = null
