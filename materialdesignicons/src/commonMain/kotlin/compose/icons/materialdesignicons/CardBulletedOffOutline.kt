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

public val MaterialDesignIcons.CardBulletedOffOutline: ImageVector
    get() {
        if (_cardBulletedOffOutline != null) {
            return _cardBulletedOffOutline!!
        }
        _cardBulletedOffOutline = Builder(name = "CardBulletedOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.59f, 20.87f)
                lineTo(19.17f, 22.29f)
                lineTo(16.88f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.74f, 2.05f, 5.5f, 2.14f, 5.26f)
                lineTo(1.17f, 4.29f)
                lineTo(2.59f, 2.87f)
                lineTo(3.73f, 4.0f)
                lineTo(20.59f, 20.87f)
                verticalLineTo(20.87f)
                moveTo(6.54f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.41f, 21.87f, 18.8f, 21.66f, 19.12f)
                lineTo(20.0f, 17.46f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.54f)
                lineTo(6.54f, 4.0f)
                moveTo(4.0f, 18.0f)
                horizontalLineTo(14.88f)
                lineTo(11.88f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.12f)
                lineTo(7.88f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.12f)
                lineTo(4.0f, 7.12f)
                verticalLineTo(18.0f)
                moveTo(18.0f, 15.0f)
                horizontalLineTo(17.54f)
                lineTo(15.54f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(13.54f)
                lineTo(11.54f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _cardBulletedOffOutline!!
    }

private var _cardBulletedOffOutline: ImageVector? = null
