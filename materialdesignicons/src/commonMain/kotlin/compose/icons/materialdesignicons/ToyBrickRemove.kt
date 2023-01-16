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

public val MaterialDesignIcons.ToyBrickRemove: ImageVector
    get() {
        if (_toyBrickRemove != null) {
            return _toyBrickRemove!!
        }
        _toyBrickRemove = Builder(name = "ToyBrickRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 3.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.09f)
                arcTo(5.47f, 5.47f, 0.0f, false, true, 13.0f, 19.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 21.0f, 13.34f)
                verticalLineTo(6.0f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19.0f)
                lineTo(15.46f, 16.88f)
                lineTo(16.88f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }
        .build()
        return _toyBrickRemove!!
    }

private var _toyBrickRemove: ImageVector? = null
