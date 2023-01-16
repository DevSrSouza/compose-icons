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

public val MaterialDesignIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.27f)
                lineTo(18.18f, 21.0f)
                lineTo(16.54f, 13.97f)
                lineTo(22.0f, 9.24f)
                lineTo(14.81f, 8.62f)
                lineTo(12.0f, 2.0f)
                lineTo(9.19f, 8.62f)
                lineTo(2.0f, 9.24f)
                lineTo(7.45f, 13.97f)
                lineTo(5.82f, 21.0f)
                lineTo(12.0f, 17.27f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
