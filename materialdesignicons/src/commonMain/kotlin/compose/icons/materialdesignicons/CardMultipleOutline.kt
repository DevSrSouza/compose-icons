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

public val MaterialDesignIcons.CardMultipleOutline: ImageVector
    get() {
        if (_cardMultipleOutline != null) {
            return _cardMultipleOutline!!
        }
        _cardMultipleOutline = Builder(name = "CardMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 4.0f)
                curveTo(21.53f, 4.0f, 22.04f, 4.21f, 22.41f, 4.59f)
                curveTo(22.79f, 4.96f, 23.0f, 5.47f, 23.0f, 6.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 16.53f, 22.79f, 17.04f, 22.41f, 17.41f)
                curveTo(22.04f, 17.79f, 21.53f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 18.0f, 5.0f, 17.1f, 5.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 4.89f, 5.89f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.47f, 22.0f, 1.96f, 21.79f, 1.59f, 21.41f)
                curveTo(1.21f, 21.04f, 1.0f, 20.53f, 1.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _cardMultipleOutline!!
    }

private var _cardMultipleOutline: ImageVector? = null
