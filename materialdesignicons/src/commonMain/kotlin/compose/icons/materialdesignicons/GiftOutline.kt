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

public val MaterialDesignIcons.GiftOutline: ImageVector
    get() {
        if (_giftOutline != null) {
            return _giftOutline!!
        }
        _giftOutline = Builder(name = "GiftOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 11.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 6.0f)
                horizontalLineTo(6.17f)
                curveTo(6.06f, 5.69f, 6.0f, 5.35f, 6.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 2.0f)
                curveTo(10.0f, 2.0f, 10.88f, 2.5f, 11.43f, 3.24f)
                verticalLineTo(3.23f)
                lineTo(12.0f, 4.0f)
                lineTo(12.57f, 3.23f)
                verticalLineTo(3.24f)
                curveTo(13.12f, 2.5f, 14.0f, 2.0f, 15.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 5.0f)
                curveTo(18.0f, 5.35f, 17.94f, 5.69f, 17.83f, 6.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 8.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(4.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 4.0f)
                moveTo(15.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 4.0f)
                moveTo(3.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                moveTo(13.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _giftOutline!!
    }

private var _giftOutline: ImageVector? = null
