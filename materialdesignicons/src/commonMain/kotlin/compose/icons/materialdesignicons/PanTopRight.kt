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

public val MaterialDesignIcons.PanTopRight: ImageVector
    get() {
        if (_panTopRight != null) {
            return _panTopRight!!
        }
        _panTopRight = Builder(name = "PanTopRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                moveTo(18.65f, 11.0f)
                lineTo(13.0f, 5.35f)
                lineTo(19.0f, 5.0f)
                lineTo(18.65f, 11.0f)
                close()
            }
        }
        .build()
        return _panTopRight!!
    }

private var _panTopRight: ImageVector? = null
