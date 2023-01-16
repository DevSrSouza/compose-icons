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

public val MaterialDesignIcons.BagCarryOnCheck: ImageVector
    get() {
        if (_bagCarryOnCheck != null) {
            return _bagCarryOnCheck!!
        }
        _bagCarryOnCheck = Builder(name = "BagCarryOnCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.28f, 16.69f)
                lineTo(18.14f, 13.88f)
                lineTo(18.84f, 14.58f)
                lineTo(15.28f, 18.14f)
                lineTo(13.17f, 16.0f)
                lineTo(13.88f, 15.28f)
                lineTo(15.28f, 16.69f)
                moveTo(8.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 19.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 7.0f)
                verticalLineTo(21.0f)
                moveTo(9.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 22.0f, 16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 16.0f, 22.0f)
                curveTo(14.77f, 22.0f, 13.63f, 21.63f, 12.68f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                moveTo(16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _bagCarryOnCheck!!
    }

private var _bagCarryOnCheck: ImageVector? = null
