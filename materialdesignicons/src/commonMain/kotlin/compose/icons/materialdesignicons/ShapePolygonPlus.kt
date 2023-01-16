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

public val MaterialDesignIcons.ShapePolygonPlus: ImageVector
    get() {
        if (_shapePolygonPlus != null) {
            return _shapePolygonPlus!!
        }
        _shapePolygonPlus = Builder(name = "ShapePolygonPlus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.7f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                lineTo(10.0f, 21.0f)
                lineTo(3.0f, 14.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.3f)
                lineTo(5.4f, 13.6f)
                lineTo(10.4f, 18.6f)
                lineTo(17.0f, 15.7f)
                moveTo(22.0f, 5.0f)
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
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _shapePolygonPlus!!
    }

private var _shapePolygonPlus: ImageVector? = null
