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

public val MaterialDesignIcons.BreadSliceOutline: ImageVector
    get() {
        if (_breadSliceOutline != null) {
            return _breadSliceOutline!!
        }
        _breadSliceOutline = Builder(name = "BreadSliceOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 5.36f, 22.0f, 9.5f)
                curveTo(22.0f, 11.19f, 21.26f, 12.75f, 20.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                curveTo(2.74f, 12.75f, 2.0f, 11.19f, 2.0f, 9.5f)
                curveTo(2.0f, 5.36f, 6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(18.0f, 13.14f)
                curveTo(19.24f, 12.17f, 20.0f, 10.89f, 20.0f, 9.5f)
                curveTo(20.0f, 6.46f, 16.42f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 6.46f, 4.0f, 9.5f)
                curveTo(4.0f, 10.89f, 4.76f, 12.17f, 6.0f, 13.14f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.14f)
                moveTo(8.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _breadSliceOutline!!
    }

private var _breadSliceOutline: ImageVector? = null
