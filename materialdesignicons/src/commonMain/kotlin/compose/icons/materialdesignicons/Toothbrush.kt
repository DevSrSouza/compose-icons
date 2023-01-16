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

public val MaterialDesignIcons.Toothbrush: ImageVector
    get() {
        if (_toothbrush != null) {
            return _toothbrush!!
        }
        _toothbrush = Builder(name = "Toothbrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.91f, 6.43f)
                lineTo(15.03f, 8.55f)
                lineTo(16.09f, 7.5f)
                lineTo(15.03f, 6.43f)
                lineTo(17.86f, 3.6f)
                lineTo(18.92f, 4.66f)
                lineTo(20.0f, 3.6f)
                lineTo(17.86f, 1.5f)
                moveTo(3.0f, 20.57f)
                lineTo(4.43f, 22.0f)
                lineTo(14.5f, 11.9f)
                lineTo(16.63f, 11.19f)
                lineTo(21.4f, 6.43f)
                curveTo(22.18f, 5.65f, 22.18f, 4.38f, 21.4f, 3.6f)
                lineTo(15.55f, 9.44f)
                lineTo(13.43f, 10.15f)
                close()
            }
        }
        .build()
        return _toothbrush!!
    }

private var _toothbrush: ImageVector? = null
