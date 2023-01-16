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

public val MaterialDesignIcons.CheckAll: ImageVector
    get() {
        if (_checkAll != null) {
            return _checkAll!!
        }
        _checkAll = Builder(name = "CheckAll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.41f, 13.41f)
                lineTo(6.0f, 19.0f)
                lineTo(7.41f, 17.58f)
                lineTo(1.83f, 12.0f)
                moveTo(22.24f, 5.58f)
                lineTo(11.66f, 16.17f)
                lineTo(7.5f, 12.0f)
                lineTo(6.07f, 13.41f)
                lineTo(11.66f, 19.0f)
                lineTo(23.66f, 7.0f)
                moveTo(18.0f, 7.0f)
                lineTo(16.59f, 5.58f)
                lineTo(10.24f, 11.93f)
                lineTo(11.66f, 13.34f)
                lineTo(18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _checkAll!!
    }

private var _checkAll: ImageVector? = null
