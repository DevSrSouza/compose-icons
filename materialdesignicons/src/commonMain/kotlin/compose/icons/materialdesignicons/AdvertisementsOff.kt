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

public val MaterialDesignIcons.AdvertisementsOff: ImageVector
    get() {
        if (_advertisementsOff != null) {
            return _advertisementsOff!!
        }
        _advertisementsOff = Builder(name = "AdvertisementsOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2f, 9.0f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 7.0f, 15.0f, 7.9f, 15.0f, 9.0f)
                verticalLineTo(11.8f)
                lineTo(13.0f, 9.8f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.2f)
                moveTo(23.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                curveTo(17.9f, 7.0f, 17.0f, 7.9f, 17.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 12.1f, 17.9f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.2f)
                lineTo(20.2f, 17.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 17.0f, 23.0f, 16.1f, 23.0f, 15.0f)
                verticalLineTo(13.0f)
                curveTo(23.0f, 11.9f, 22.1f, 11.0f, 21.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(23.0f)
                moveTo(22.1f, 21.5f)
                lineTo(20.8f, 22.8f)
                lineTo(14.4f, 16.4f)
                curveTo(14.1f, 16.7f, 13.6f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.9f)
                lineTo(7.0f, 8.9f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                curveTo(1.0f, 7.9f, 1.9f, 7.0f, 3.0f, 7.0f)
                horizontalLineTo(5.1f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                moveTo(13.0f, 14.9f)
                lineTo(11.0f, 12.9f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.9f)
                close()
            }
        }
        .build()
        return _advertisementsOff!!
    }

private var _advertisementsOff: ImageVector? = null
