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

public val MaterialDesignIcons.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.91f, 5.5f)
                lineTo(9.21f, 7.79f)
                lineTo(7.79f, 9.21f)
                lineTo(5.5f, 6.91f)
                lineTo(3.21f, 9.21f)
                lineTo(1.79f, 7.79f)
                lineTo(4.09f, 5.5f)
                lineTo(1.79f, 3.21f)
                lineTo(3.21f, 1.79f)
                lineTo(5.5f, 4.09f)
                lineTo(7.79f, 1.79f)
                lineTo(9.21f, 3.21f)
                moveTo(22.21f, 16.21f)
                lineTo(20.79f, 14.79f)
                lineTo(18.5f, 17.09f)
                lineTo(16.21f, 14.79f)
                lineTo(14.79f, 16.21f)
                lineTo(17.09f, 18.5f)
                lineTo(14.79f, 20.79f)
                lineTo(16.21f, 22.21f)
                lineTo(18.5f, 19.91f)
                lineTo(20.79f, 22.21f)
                lineTo(22.21f, 20.79f)
                lineTo(19.91f, 18.5f)
                moveTo(20.4f, 6.83f)
                lineTo(17.18f, 11.0f)
                lineTo(15.6f, 9.73f)
                lineTo(16.77f, 8.23f)
                arcTo(9.08f, 9.08f, 0.0f, false, false, 10.11f, 13.85f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 7.5f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.28f, 13.08f)
                arcTo(11.27f, 11.27f, 0.0f, false, true, 16.43f, 6.26f)
                lineTo(15.0f, 5.18f)
                lineTo(16.27f, 3.6f)
                moveTo(10.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 7.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.0f, 17.5f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
