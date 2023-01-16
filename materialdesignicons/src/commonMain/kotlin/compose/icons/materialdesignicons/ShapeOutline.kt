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

public val MaterialDesignIcons.ShapeOutline: ImageVector
    get() {
        if (_shapeOutline != null) {
            return _shapeOutline!!
        }
        _shapeOutline = Builder(name = "ShapeOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(11.0f)
                moveTo(9.0f, 15.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.5f)
                moveTo(12.0f, 2.0f)
                lineTo(17.5f, 11.0f)
                horizontalLineTo(6.5f)
                lineTo(12.0f, 2.0f)
                moveTo(12.0f, 5.86f)
                lineTo(10.08f, 9.0f)
                horizontalLineTo(13.92f)
                lineTo(12.0f, 5.86f)
                moveTo(17.5f, 13.0f)
                curveTo(20.0f, 13.0f, 22.0f, 15.0f, 22.0f, 17.5f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 17.5f, 22.0f)
                curveTo(15.0f, 22.0f, 13.0f, 20.0f, 13.0f, 17.5f)
                curveTo(13.0f, 15.0f, 15.0f, 13.0f, 17.5f, 13.0f)
                moveTo(17.5f, 15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 15.0f)
                close()
            }
        }
        .build()
        return _shapeOutline!!
    }

private var _shapeOutline: ImageVector? = null
