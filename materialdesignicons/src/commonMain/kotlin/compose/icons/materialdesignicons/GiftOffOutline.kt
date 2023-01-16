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

public val MaterialDesignIcons.GiftOffOutline: ImageVector
    get() {
        if (_giftOffOutline != null) {
            return _giftOffOutline!!
        }
        _giftOffOutline = Builder(name = "GiftOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(17.83f)
                curveTo(17.94f, 5.69f, 18.0f, 5.35f, 18.0f, 5.0f)
                curveTo(18.0f, 3.34f, 16.66f, 2.0f, 15.0f, 2.0f)
                curveTo(14.0f, 2.0f, 13.12f, 2.5f, 12.57f, 3.24f)
                verticalLineTo(3.23f)
                lineTo(12.0f, 4.0f)
                lineTo(11.43f, 3.23f)
                verticalLineTo(3.24f)
                curveTo(10.88f, 2.5f, 10.0f, 2.0f, 9.0f, 2.0f)
                curveTo(7.97f, 2.0f, 7.06f, 2.5f, 6.5f, 3.32f)
                lineTo(8.03f, 4.83f)
                curveTo(8.12f, 4.36f, 8.5f, 4.0f, 9.0f, 4.0f)
                curveTo(9.55f, 4.0f, 10.0f, 4.45f, 10.0f, 5.0f)
                curveTo(10.0f, 5.5f, 9.64f, 5.88f, 9.17f, 5.97f)
                lineTo(13.0f, 9.8f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.2f)
                lineTo(15.2f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.8f)
                lineTo(22.0f, 18.8f)
                verticalLineTo(12.0f)
                curveTo(22.55f, 12.0f, 23.0f, 11.55f, 23.0f, 11.0f)
                verticalLineTo(8.0f)
                curveTo(23.0f, 6.9f, 22.11f, 6.0f, 21.0f, 6.0f)
                moveTo(15.0f, 6.0f)
                curveTo(14.45f, 6.0f, 14.0f, 5.55f, 14.0f, 5.0f)
                reflectiveCurveTo(14.45f, 4.0f, 15.0f, 4.0f)
                reflectiveCurveTo(16.0f, 4.45f, 16.0f, 5.0f)
                reflectiveCurveTo(15.55f, 6.0f, 15.0f, 6.0f)
                moveTo(1.11f, 3.0f)
                lineTo(4.11f, 6.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 6.0f, 1.0f, 6.9f, 1.0f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(1.0f, 11.55f, 1.45f, 12.0f, 2.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.03f, 22.0f, 20.07f, 22.0f, 20.1f, 22.0f)
                lineTo(21.56f, 23.45f)
                lineTo(22.83f, 22.18f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                moveTo(13.0f, 14.89f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.89f)
                moveTo(11.0f, 12.89f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.11f)
                lineTo(11.0f, 12.89f)
                moveTo(8.11f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.11f)
                lineTo(8.11f, 10.0f)
                close()
            }
        }
        .build()
        return _giftOffOutline!!
    }

private var _giftOffOutline: ImageVector? = null
