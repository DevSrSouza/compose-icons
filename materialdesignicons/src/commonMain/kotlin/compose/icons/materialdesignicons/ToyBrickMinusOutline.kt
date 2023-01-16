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

public val MaterialDesignIcons.ToyBrickMinusOutline: ImageVector
    get() {
        if (_toyBrickMinusOutline != null) {
            return _toyBrickMinusOutline!!
        }
        _toyBrickMinusOutline = Builder(name = "ToyBrickMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.09f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 3.9f, 5.9f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(10.11f, 3.0f, 11.0f, 3.9f, 11.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 3.9f, 13.9f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 3.0f, 19.0f, 3.9f, 19.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13.0f, 19.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13.0f, 18.66f, 13.0f, 19.0f)
                reflectiveCurveTo(13.04f, 19.67f, 13.09f, 20.0f)
                moveTo(23.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _toyBrickMinusOutline!!
    }

private var _toyBrickMinusOutline: ImageVector? = null
