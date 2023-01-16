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

public val MaterialDesignIcons.CardAccountPhoneOutline: ImageVector
    get() {
        if (_cardAccountPhoneOutline != null) {
            return _cardAccountPhoneOutline!!
        }
        _cardAccountPhoneOutline = Builder(name = "CardAccountPhoneOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 21.0f)
                horizontalLineTo(22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 3.0f)
                moveTo(22.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                moveTo(19.0f, 18.0f)
                lineTo(21.0f, 16.0f)
                lineTo(19.5f, 14.0f)
                horizontalLineTo(17.85f)
                curveTo(17.63f, 13.37f, 17.5f, 12.7f, 17.5f, 12.0f)
                curveTo(17.5f, 11.3f, 17.63f, 10.63f, 17.85f, 10.0f)
                horizontalLineTo(19.5f)
                lineTo(21.0f, 8.0f)
                lineTo(19.0f, 6.0f)
                curveTo(17.7f, 7.0f, 16.73f, 8.38f, 16.28f, 10.0f)
                curveTo(16.1f, 10.64f, 16.0f, 11.31f, 16.0f, 12.0f)
                curveTo(16.0f, 12.69f, 16.1f, 13.36f, 16.28f, 14.0f)
                curveTo(16.73f, 15.61f, 17.7f, 17.0f, 19.0f, 18.0f)
                moveTo(9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                moveTo(9.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 8.0f)
                moveTo(15.0f, 16.59f)
                curveTo(15.0f, 14.09f, 11.03f, 13.0f, 9.0f, 13.0f)
                curveTo(6.97f, 13.0f, 3.0f, 14.09f, 3.0f, 16.59f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.59f)
                moveTo(5.5f, 16.0f)
                curveTo(6.22f, 15.5f, 7.7f, 15.0f, 9.0f, 15.0f)
                curveTo(10.3f, 15.0f, 11.77f, 15.5f, 12.5f, 16.0f)
                horizontalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _cardAccountPhoneOutline!!
    }

private var _cardAccountPhoneOutline: ImageVector? = null
