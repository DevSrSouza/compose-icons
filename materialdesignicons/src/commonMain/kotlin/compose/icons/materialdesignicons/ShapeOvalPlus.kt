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

public val MaterialDesignIcons.ShapeOvalPlus: ImageVector
    get() {
        if (_shapeOvalPlus != null) {
            return _shapeOvalPlus!!
        }
        _shapeOvalPlus = Builder(name = "ShapeOvalPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(11.0f, 4.0f)
                lineTo(12.0f, 4.09f)
                verticalLineTo(6.14f)
                curveTo(11.68f, 6.05f, 11.34f, 6.0f, 11.0f, 6.0f)
                curveTo(8.24f, 6.0f, 6.0f, 9.13f, 6.0f, 13.0f)
                curveTo(6.0f, 16.87f, 8.24f, 20.0f, 11.0f, 20.0f)
                curveTo(13.76f, 20.0f, 16.0f, 16.87f, 16.0f, 13.0f)
                lineTo(15.95f, 12.0f)
                horizontalLineTo(17.96f)
                lineTo(18.0f, 13.0f)
                curveTo(18.0f, 17.97f, 14.87f, 22.0f, 11.0f, 22.0f)
                curveTo(7.13f, 22.0f, 4.0f, 17.97f, 4.0f, 13.0f)
                curveTo(4.0f, 8.03f, 7.13f, 4.0f, 11.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shapeOvalPlus!!
    }

private var _shapeOvalPlus: ImageVector? = null
