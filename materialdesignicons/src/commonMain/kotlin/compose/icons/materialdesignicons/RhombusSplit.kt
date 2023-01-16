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

public val MaterialDesignIcons.RhombusSplit: ImageVector
    get() {
        if (_rhombusSplit != null) {
            return _rhombusSplit!!
        }
        _rhombusSplit = Builder(name = "RhombusSplit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(11.5f, 2.0f, 11.0f, 2.19f, 10.59f, 2.59f)
                lineTo(7.29f, 5.88f)
                lineTo(12.0f, 10.58f)
                lineTo(16.71f, 5.88f)
                lineTo(13.41f, 2.59f)
                curveTo(13.0f, 2.19f, 12.5f, 2.0f, 12.0f, 2.0f)
                moveTo(5.88f, 7.29f)
                lineTo(2.59f, 10.59f)
                curveTo(1.8f, 11.37f, 1.8f, 12.63f, 2.59f, 13.41f)
                lineTo(5.88f, 16.71f)
                lineTo(10.58f, 12.0f)
                lineTo(5.88f, 7.29f)
                moveTo(18.12f, 7.29f)
                lineTo(13.42f, 12.0f)
                lineTo(18.12f, 16.71f)
                lineTo(21.41f, 13.41f)
                curveTo(22.2f, 12.63f, 22.2f, 11.37f, 21.41f, 10.59f)
                lineTo(18.12f, 7.29f)
                moveTo(12.0f, 13.42f)
                lineTo(7.29f, 18.12f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.2f, 12.63f, 22.2f, 13.41f, 21.41f)
                lineTo(16.71f, 18.12f)
                lineTo(12.0f, 13.42f)
                close()
            }
        }
        .build()
        return _rhombusSplit!!
    }

private var _rhombusSplit: ImageVector? = null
