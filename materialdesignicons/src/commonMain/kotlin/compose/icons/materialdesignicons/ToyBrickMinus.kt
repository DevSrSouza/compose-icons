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

public val MaterialDesignIcons.ToyBrickMinus: ImageVector
    get() {
        if (_toyBrickMinus != null) {
            return _toyBrickMinus!!
        }
        _toyBrickMinus = Builder(name = "ToyBrickMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 15.69f, 15.69f, 13.0f, 19.0f, 13.0f)
                curveTo(19.7f, 13.0f, 20.37f, 13.13f, 21.0f, 13.35f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.9f, 18.11f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 3.0f, 13.0f, 3.9f, 13.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 3.9f, 10.11f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13.0f, 19.34f, 13.0f, 19.0f)
                close()
            }
        }
        .build()
        return _toyBrickMinus!!
    }

private var _toyBrickMinus: ImageVector? = null
