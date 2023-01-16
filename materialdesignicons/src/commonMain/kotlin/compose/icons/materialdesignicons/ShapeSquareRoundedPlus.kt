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

public val MaterialDesignIcons.ShapeSquareRoundedPlus: ImageVector
    get() {
        if (_shapeSquareRoundedPlus != null) {
            return _shapeSquareRoundedPlus!!
        }
        _shapeSquareRoundedPlus = Builder(name = "ShapeSquareRoundedPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
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
                moveTo(7.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 7.0f, 5.0f, 7.9f, 5.0f, 9.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 18.11f, 5.9f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(15.0f)
                curveTo(16.11f, 19.0f, 17.0f, 18.11f, 17.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 19.21f, 17.21f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(4.79f, 21.0f, 3.0f, 19.21f, 3.0f, 17.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 6.79f, 4.79f, 5.0f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _shapeSquareRoundedPlus!!
    }

private var _shapeSquareRoundedPlus: ImageVector? = null
