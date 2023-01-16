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

public val MaterialDesignIcons.BlockHelper: ImageVector
    get() {
        if (_blockHelper != null) {
            return _blockHelper!!
        }
        _blockHelper = Builder(name = "BlockHelper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 0.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                curveTo(2.0f, 14.4f, 2.85f, 16.6f, 4.26f, 18.33f)
                lineTo(18.33f, 4.26f)
                curveTo(16.6f, 2.85f, 14.4f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                curveTo(22.0f, 9.6f, 21.15f, 7.4f, 19.74f, 5.67f)
                lineTo(5.67f, 19.74f)
                curveTo(7.4f, 21.15f, 9.6f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _blockHelper!!
    }

private var _blockHelper: ImageVector? = null
