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

public val MaterialDesignIcons.ToothOutline: ImageVector
    get() {
        if (_toothOutline != null) {
            return _toothOutline!!
        }
        _toothOutline = Builder(name = "ToothOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                curveTo(4.0f, 2.0f, 2.0f, 5.0f, 2.0f, 8.0f)
                curveTo(2.0f, 10.11f, 3.0f, 13.0f, 4.0f, 14.0f)
                curveTo(5.0f, 15.0f, 6.0f, 22.0f, 8.0f, 22.0f)
                curveTo(12.54f, 22.0f, 10.0f, 15.0f, 12.0f, 15.0f)
                curveTo(14.0f, 15.0f, 11.46f, 22.0f, 16.0f, 22.0f)
                curveTo(18.0f, 22.0f, 19.0f, 15.0f, 20.0f, 14.0f)
                curveTo(21.0f, 13.0f, 22.0f, 10.11f, 22.0f, 8.0f)
                curveTo(22.0f, 5.0f, 20.0f, 2.0f, 17.0f, 2.0f)
                curveTo(14.0f, 2.0f, 14.0f, 3.0f, 12.0f, 3.0f)
                curveTo(10.0f, 3.0f, 10.0f, 2.0f, 7.0f, 2.0f)
                moveTo(7.0f, 4.0f)
                curveTo(9.0f, 4.0f, 10.0f, 5.0f, 12.0f, 5.0f)
                curveTo(14.0f, 5.0f, 15.0f, 4.0f, 17.0f, 4.0f)
                curveTo(18.67f, 4.0f, 20.0f, 6.0f, 20.0f, 8.0f)
                curveTo(20.0f, 9.75f, 19.14f, 12.11f, 18.19f, 13.06f)
                curveTo(17.33f, 13.92f, 16.06f, 19.94f, 15.5f, 19.94f)
                curveTo(15.29f, 19.94f, 15.0f, 18.88f, 15.0f, 17.59f)
                curveTo(15.0f, 15.55f, 14.43f, 13.0f, 12.0f, 13.0f)
                curveTo(9.57f, 13.0f, 9.0f, 15.55f, 9.0f, 17.59f)
                curveTo(9.0f, 18.88f, 8.71f, 19.94f, 8.5f, 19.94f)
                curveTo(7.94f, 19.94f, 6.67f, 13.92f, 5.81f, 13.06f)
                curveTo(4.86f, 12.11f, 4.0f, 9.75f, 4.0f, 8.0f)
                curveTo(4.0f, 6.0f, 5.33f, 4.0f, 7.0f, 4.0f)
                close()
            }
        }
        .build()
        return _toothOutline!!
    }

private var _toothOutline: ImageVector? = null
