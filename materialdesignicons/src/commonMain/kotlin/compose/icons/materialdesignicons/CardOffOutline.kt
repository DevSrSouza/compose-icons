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

public val MaterialDesignIcons.CardOffOutline: ImageVector
    get() {
        if (_cardOffOutline != null) {
            return _cardOffOutline!!
        }
        _cardOffOutline = Builder(name = "CardOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2f, 6.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 4.0f, 22.0f, 4.89f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.24f, 21.96f, 18.47f, 21.88f, 18.68f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.42f, 2.25f, 4.9f, 2.65f, 4.54f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(6.66f, 6.0f)
                lineTo(18.65f, 18.0f)
                horizontalLineTo(18.66f)
                lineTo(20.57f, 19.91f)
                lineTo(20.56f, 19.91f)
                lineTo(22.11f, 21.46f)
                moveTo(16.11f, 18.0f)
                lineTo(4.11f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.11f)
                close()
            }
        }
        .build()
        return _cardOffOutline!!
    }

private var _cardOffOutline: ImageVector? = null
