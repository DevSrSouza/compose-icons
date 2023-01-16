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

public val MaterialDesignIcons.PentagonOutline: ImageVector
    get() {
        if (_pentagonOutline != null) {
            return _pentagonOutline!!
        }
        _pentagonOutline = Builder(name = "PentagonOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                lineTo(19.6f, 10.5f)
                lineTo(16.7f, 19.4f)
                horizontalLineTo(7.3f)
                lineTo(4.4f, 10.5f)
                lineTo(12.0f, 5.0f)
                moveTo(12.0f, 2.5f)
                lineTo(2.0f, 9.8f)
                lineTo(5.8f, 21.5f)
                horizontalLineTo(18.1f)
                lineTo(22.0f, 9.8f)
                lineTo(12.0f, 2.5f)
                close()
            }
        }
        .build()
        return _pentagonOutline!!
    }

private var _pentagonOutline: ImageVector? = null
