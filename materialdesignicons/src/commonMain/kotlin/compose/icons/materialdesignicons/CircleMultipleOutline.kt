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

public val MaterialDesignIcons.CircleMultipleOutline: ImageVector
    get() {
        if (_circleMultipleOutline != null) {
            return _circleMultipleOutline!!
        }
        _circleMultipleOutline = Builder(name = "CircleMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 15.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 7.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 15.0f, 4.0f)
                moveTo(15.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 15.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 15.0f, 18.0f)
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 14.61f, 4.67f, 16.83f, 7.0f, 17.65f)
                verticalLineTo(19.74f)
                curveTo(3.55f, 18.85f, 1.0f, 15.73f, 1.0f, 12.0f)
                curveTo(1.0f, 8.27f, 3.55f, 5.15f, 7.0f, 4.26f)
                verticalLineTo(6.35f)
                curveTo(4.67f, 7.17f, 3.0f, 9.39f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _circleMultipleOutline!!
    }

private var _circleMultipleOutline: ImageVector? = null
