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

public val MaterialDesignIcons.CellphoneKey: ImageVector
    get() {
        if (_cellphoneKey != null) {
            return _cellphoneKey!!
        }
        _cellphoneKey = Builder(name = "CellphoneKey", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 22.1f, 5.9f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 23.0f, 19.0f, 22.1f, 19.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f)
                horizontalLineTo(7.0f)
                moveTo(6.0f, 9.0f)
                curveTo(4.3f, 9.0f, 3.0f, 10.3f, 3.0f, 12.0f)
                reflectiveCurveTo(4.3f, 15.0f, 6.0f, 15.0f)
                curveTo(7.3f, 15.0f, 8.4f, 14.2f, 8.8f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.8f)
                curveTo(8.4f, 9.8f, 7.3f, 9.0f, 6.0f, 9.0f)
                moveTo(6.0f, 11.0f)
                curveTo(6.6f, 11.0f, 7.0f, 11.4f, 7.0f, 12.0f)
                reflectiveCurveTo(6.6f, 13.0f, 6.0f, 13.0f)
                reflectiveCurveTo(5.0f, 12.6f, 5.0f, 12.0f)
                reflectiveCurveTo(5.4f, 11.0f, 6.0f, 11.0f)
                close()
            }
        }
        .build()
        return _cellphoneKey!!
    }

private var _cellphoneKey: ImageVector? = null
