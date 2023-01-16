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

public val MaterialDesignIcons.CardSearchOutline: ImageVector
    get() {
        if (_cardSearchOutline != null) {
            return _cardSearchOutline!!
        }
        _cardSearchOutline = Builder(name = "CardSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 16.0f)
                curveTo(12.37f, 16.0f, 13.19f, 15.74f, 13.88f, 15.3f)
                lineTo(16.32f, 17.74f)
                lineTo(17.74f, 16.32f)
                lineTo(15.3f, 13.89f)
                curveTo(15.74f, 13.19f, 16.0f, 12.38f, 16.0f, 11.5f)
                curveTo(16.0f, 9.0f, 14.0f, 7.0f, 11.5f, 7.0f)
                reflectiveCurveTo(7.0f, 9.0f, 7.0f, 11.5f)
                reflectiveCurveTo(9.0f, 16.0f, 11.5f, 16.0f)
                moveTo(11.5f, 9.0f)
                curveTo(12.88f, 9.0f, 14.0f, 10.12f, 14.0f, 11.5f)
                reflectiveCurveTo(12.88f, 14.0f, 11.5f, 14.0f)
                reflectiveCurveTo(9.0f, 12.88f, 9.0f, 11.5f)
                reflectiveCurveTo(10.12f, 9.0f, 11.5f, 9.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _cardSearchOutline!!
    }

private var _cardSearchOutline: ImageVector? = null
