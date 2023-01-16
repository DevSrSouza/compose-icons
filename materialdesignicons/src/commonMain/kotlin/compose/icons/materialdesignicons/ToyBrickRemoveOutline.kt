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

public val MaterialDesignIcons.ToyBrickRemoveOutline: ImageVector
    get() {
        if (_toyBrickRemoveOutline != null) {
            return _toyBrickRemoveOutline!!
        }
        _toyBrickRemoveOutline = Builder(name = "ToyBrickRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.9f, 18.1f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 3.0f, 13.0f, 3.9f, 13.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 3.9f, 10.1f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                moveTo(17.88f, 15.46f)
                lineTo(20.0f, 17.59f)
                lineTo(22.12f, 15.47f)
                lineTo(23.54f, 16.88f)
                lineTo(21.41f, 19.0f)
                lineTo(23.54f, 21.12f)
                lineTo(22.12f, 22.54f)
                lineTo(20.0f, 20.41f)
                lineTo(17.88f, 22.54f)
                lineTo(16.46f, 21.12f)
                lineTo(18.59f, 19.0f)
                lineTo(16.47f, 16.88f)
            }
        }
        .build()
        return _toyBrickRemoveOutline!!
    }

private var _toyBrickRemoveOutline: ImageVector? = null
