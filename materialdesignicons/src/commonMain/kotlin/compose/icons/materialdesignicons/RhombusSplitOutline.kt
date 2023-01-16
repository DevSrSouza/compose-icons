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

public val MaterialDesignIcons.RhombusSplitOutline: ImageVector
    get() {
        if (_rhombusSplitOutline != null) {
            return _rhombusSplitOutline!!
        }
        _rhombusSplitOutline = Builder(name = "RhombusSplitOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(11.5f, 2.0f, 11.0f, 2.19f, 10.59f, 2.59f)
                lineTo(2.59f, 10.59f)
                curveTo(1.8f, 11.37f, 1.8f, 12.63f, 2.59f, 13.41f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.2f, 12.63f, 22.2f, 13.41f, 21.41f)
                lineTo(21.41f, 13.41f)
                curveTo(22.2f, 12.63f, 22.2f, 11.37f, 21.41f, 10.59f)
                lineTo(13.41f, 2.59f)
                curveTo(13.0f, 2.19f, 12.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                lineTo(15.29f, 7.29f)
                lineTo(12.0f, 10.59f)
                lineTo(8.71f, 7.29f)
                lineTo(12.0f, 4.0f)
                moveTo(7.29f, 8.71f)
                lineTo(10.59f, 12.0f)
                lineTo(7.29f, 15.29f)
                lineTo(4.0f, 12.0f)
                lineTo(7.29f, 8.71f)
                moveTo(16.71f, 8.71f)
                lineTo(20.0f, 12.0f)
                lineTo(16.71f, 15.29f)
                lineTo(13.41f, 12.0f)
                lineTo(16.71f, 8.71f)
                moveTo(12.0f, 13.41f)
                lineTo(15.29f, 16.71f)
                lineTo(12.0f, 20.0f)
                lineTo(8.71f, 16.71f)
                lineTo(12.0f, 13.41f)
                close()
            }
        }
        .build()
        return _rhombusSplitOutline!!
    }

private var _rhombusSplitOutline: ImageVector? = null
