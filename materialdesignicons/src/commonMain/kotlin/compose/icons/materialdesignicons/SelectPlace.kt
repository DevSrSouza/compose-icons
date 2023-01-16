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

public val MaterialDesignIcons.SelectPlace: ImageVector
    get() {
        if (_selectPlace != null) {
            return _selectPlace!!
        }
        _selectPlace = Builder(name = "SelectPlace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.5f, 3.5f, 3.0f, 4.0f, 3.0f)
                moveTo(20.0f, 3.0f)
                curveTo(20.5f, 3.0f, 21.0f, 3.5f, 21.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                moveTo(15.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 12.5f, 20.5f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                moveTo(15.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                moveTo(4.0f, 13.0f)
                curveTo(3.5f, 13.0f, 3.0f, 12.5f, 3.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                moveTo(3.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                moveTo(21.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                moveTo(7.0f, 16.0f)
                lineTo(12.0f, 21.0f)
                lineTo(17.0f, 16.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _selectPlace!!
    }

private var _selectPlace: ImageVector? = null
