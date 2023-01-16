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

public val MaterialDesignIcons.CardAccountDetailsOutline: ImageVector
    get() {
        if (_cardAccountDetailsOutline != null) {
            return _cardAccountDetailsOutline!!
        }
        _cardAccountDetailsOutline = Builder(name = "CardAccountDetailsOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineTo(2.0f)
                curveTo(0.91f, 3.04f, 0.04f, 3.91f, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(0.04f, 20.09f, 0.91f, 20.96f, 2.0f, 21.0f)
                horizontalLineTo(22.0f)
                curveTo(23.09f, 20.96f, 23.96f, 20.09f, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.96f, 3.91f, 23.09f, 3.04f, 22.0f, 3.0f)
                moveTo(22.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 17.0f)
                verticalLineTo(15.75f)
                curveTo(14.0f, 14.09f, 10.66f, 13.25f, 9.0f, 13.25f)
                curveTo(7.34f, 13.25f, 4.0f, 14.09f, 4.0f, 15.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                moveTo(9.0f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 7.0f)
                moveTo(14.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
            }
        }
        .build()
        return _cardAccountDetailsOutline!!
    }

private var _cardAccountDetailsOutline: ImageVector? = null
