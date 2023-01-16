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

public val MaterialDesignIcons.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(12.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 6.5f)
                moveTo(12.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
