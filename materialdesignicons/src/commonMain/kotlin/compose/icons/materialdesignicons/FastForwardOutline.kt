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

public val MaterialDesignIcons.FastForwardOutline: ImageVector
    get() {
        if (_fastForwardOutline != null) {
            return _fastForwardOutline!!
        }
        _fastForwardOutline = Builder(name = "FastForwardOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.9f)
                lineTo(18.0f, 12.0f)
                lineTo(15.0f, 14.1f)
                verticalLineTo(9.9f)
                moveTo(6.0f, 9.9f)
                lineTo(9.0f, 12.0f)
                lineTo(6.0f, 14.1f)
                verticalLineTo(9.9f)
                moveTo(13.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(21.5f, 12.0f)
                lineTo(13.0f, 6.0f)
                moveTo(4.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(12.5f, 12.0f)
                lineTo(4.0f, 6.0f)
                close()
            }
        }
        .build()
        return _fastForwardOutline!!
    }

private var _fastForwardOutline: ImageVector? = null
