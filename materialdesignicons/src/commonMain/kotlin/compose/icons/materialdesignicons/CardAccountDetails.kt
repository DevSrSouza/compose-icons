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

public val MaterialDesignIcons.CardAccountDetails: ImageVector
    get() {
        if (_cardAccountDetails != null) {
            return _cardAccountDetails!!
        }
        _cardAccountDetails = Builder(name = "CardAccountDetails", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(22.0f)
                curveTo(23.05f, 3.0f, 24.0f, 3.95f, 24.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(24.0f, 20.05f, 23.05f, 21.0f, 22.0f, 21.0f)
                horizontalLineTo(2.0f)
                curveTo(0.95f, 21.0f, 0.0f, 20.05f, 0.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(0.0f, 3.95f, 0.95f, 3.0f, 2.0f, 3.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.5f)
                lineTo(22.0f, 9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                moveTo(8.0f, 13.91f)
                curveTo(6.0f, 13.91f, 2.0f, 15.0f, 2.0f, 17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                curveTo(14.0f, 15.0f, 10.0f, 13.91f, 8.0f, 13.91f)
                moveTo(8.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 6.0f)
                close()
            }
        }
        .build()
        return _cardAccountDetails!!
    }

private var _cardAccountDetails: ImageVector? = null
