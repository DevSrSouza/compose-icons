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

public val MaterialDesignIcons.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(12.0f, 17.0f, 7.97f, 13.0f, 3.0f, 13.0f)
                moveTo(12.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 10.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 5.5f)
                moveTo(5.6f, 10.25f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.1f, 12.75f)
                curveTo(8.63f, 12.75f, 9.12f, 12.58f, 9.5f, 12.31f)
                curveTo(9.5f, 12.37f, 9.5f, 12.43f, 9.5f, 12.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 12.5f)
                curveTo(14.5f, 12.43f, 14.5f, 12.37f, 14.5f, 12.31f)
                curveTo(14.88f, 12.58f, 15.37f, 12.75f, 15.9f, 12.75f)
                curveTo(17.28f, 12.75f, 18.4f, 11.63f, 18.4f, 10.25f)
                curveTo(18.4f, 9.25f, 17.81f, 8.4f, 16.97f, 8.0f)
                curveTo(17.81f, 7.6f, 18.4f, 6.74f, 18.4f, 5.75f)
                curveTo(18.4f, 4.37f, 17.28f, 3.25f, 15.9f, 3.25f)
                curveTo(15.37f, 3.25f, 14.88f, 3.41f, 14.5f, 3.69f)
                curveTo(14.5f, 3.63f, 14.5f, 3.56f, 14.5f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 3.5f)
                curveTo(9.5f, 3.56f, 9.5f, 3.63f, 9.5f, 3.69f)
                curveTo(9.12f, 3.41f, 8.63f, 3.25f, 8.1f, 3.25f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.6f, 5.75f)
                curveTo(5.6f, 6.74f, 6.19f, 7.6f, 7.03f, 8.0f)
                curveTo(6.19f, 8.4f, 5.6f, 9.25f, 5.6f, 10.25f)
                moveTo(12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 13.0f)
                curveTo(16.0f, 13.0f, 12.0f, 17.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
