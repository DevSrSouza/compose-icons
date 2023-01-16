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

public val MaterialDesignIcons.CardAccountDetailsStarOutline: ImageVector
    get() {
        if (_cardAccountDetailsStarOutline != null) {
            return _cardAccountDetailsStarOutline!!
        }
        _cardAccountDetailsStarOutline = Builder(name = "CardAccountDetailsStarOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.09f)
                lineTo(22.45f, 23.58f)
                lineTo(21.8f, 20.77f)
                lineTo(24.0f, 18.89f)
                lineTo(21.11f, 18.64f)
                lineTo(20.0f, 16.0f)
                lineTo(18.87f, 18.64f)
                lineTo(16.0f, 18.89f)
                lineTo(18.18f, 20.77f)
                lineTo(17.5f, 23.58f)
                lineTo(20.0f, 22.09f)
                moveTo(14.08f, 21.0f)
                horizontalLineTo(2.0f)
                curveTo(0.91f, 20.96f, 0.04f, 20.09f, 0.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(0.04f, 3.91f, 0.91f, 3.04f, 2.0f, 3.0f)
                horizontalLineTo(22.0f)
                curveTo(23.09f, 3.04f, 23.96f, 3.91f, 24.0f, 5.0f)
                verticalLineTo(15.53f)
                curveTo(23.42f, 15.0f, 22.75f, 14.61f, 22.0f, 14.34f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.08f)
                curveTo(14.03f, 19.33f, 14.0f, 19.66f, 14.0f, 20.0f)
                curveTo(14.0f, 20.34f, 14.03f, 20.68f, 14.08f, 21.0f)
                moveTo(14.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.75f)
                curveTo(4.0f, 14.09f, 7.34f, 13.25f, 9.0f, 13.25f)
                curveTo(10.66f, 13.25f, 14.0f, 14.09f, 14.0f, 15.75f)
                verticalLineTo(17.0f)
                moveTo(14.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                moveTo(9.0f, 7.0f)
                curveTo(7.63f, 7.0f, 6.5f, 8.13f, 6.5f, 9.5f)
                curveTo(6.5f, 10.87f, 7.63f, 12.0f, 9.0f, 12.0f)
                curveTo(10.37f, 12.0f, 11.5f, 10.87f, 11.5f, 9.5f)
                curveTo(11.5f, 8.13f, 10.37f, 7.0f, 9.0f, 7.0f)
                moveTo(14.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                moveTo(14.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _cardAccountDetailsStarOutline!!
    }

private var _cardAccountDetailsStarOutline: ImageVector? = null
