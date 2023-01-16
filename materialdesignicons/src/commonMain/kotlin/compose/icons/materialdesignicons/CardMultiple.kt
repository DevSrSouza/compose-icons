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

public val MaterialDesignIcons.CardMultiple: ImageVector
    get() {
        if (_cardMultiple != null) {
            return _cardMultiple!!
        }
        _cardMultiple = Builder(name = "CardMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.53f, 3.0f, 22.04f, 3.21f, 22.41f, 3.59f)
                curveTo(22.79f, 3.96f, 23.0f, 4.47f, 23.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 15.53f, 22.79f, 16.04f, 22.41f, 16.41f)
                curveTo(22.04f, 16.79f, 21.53f, 17.0f, 21.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(6.47f, 17.0f, 5.96f, 16.79f, 5.59f, 16.41f)
                curveTo(5.21f, 16.04f, 5.0f, 15.53f, 5.0f, 15.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.47f, 5.21f, 3.96f, 5.59f, 3.59f)
                curveTo(5.96f, 3.21f, 6.47f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.47f, 21.0f, 1.96f, 20.79f, 1.59f, 20.41f)
                curveTo(1.21f, 20.04f, 1.0f, 19.53f, 1.0f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _cardMultiple!!
    }

private var _cardMultiple: ImageVector? = null
