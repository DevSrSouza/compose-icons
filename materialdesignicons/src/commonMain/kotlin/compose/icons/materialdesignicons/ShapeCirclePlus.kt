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

public val MaterialDesignIcons.ShapeCirclePlus: ImageVector
    get() {
        if (_shapeCirclePlus != null) {
            return _shapeCirclePlus!!
        }
        _shapeCirclePlus = Builder(name = "ShapeCirclePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 17.0f, 13.0f)
                horizontalLineTo(19.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 11.0f, 21.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 3.0f, 13.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 11.0f, 5.0f)
                verticalLineTo(7.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 5.0f, 13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 11.0f, 19.0f)
                moveTo(19.0f, 5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _shapeCirclePlus!!
    }

private var _shapeCirclePlus: ImageVector? = null
