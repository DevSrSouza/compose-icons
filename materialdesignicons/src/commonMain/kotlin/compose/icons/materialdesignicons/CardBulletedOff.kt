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

public val MaterialDesignIcons.CardBulletedOff: ImageVector
    get() {
        if (_cardBulletedOff != null) {
            return _cardBulletedOff!!
        }
        _cardBulletedOff = Builder(name = "CardBulletedOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.35f, 3.58f)
                lineTo(20.65f, 20.87f)
                lineTo(19.23f, 22.29f)
                lineTo(16.94f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.72f, 2.06f, 5.46f, 2.16f, 5.22f)
                lineTo(1.23f, 4.29f)
                lineTo(2.65f, 2.87f)
                lineTo(3.35f, 3.58f)
                moveTo(6.6f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.4f, 21.88f, 18.77f, 21.68f, 19.08f)
                lineTo(17.6f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.6f)
                lineTo(13.6f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.6f)
                lineTo(6.6f, 4.0f)
                moveTo(9.94f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.06f)
                lineTo(9.94f, 13.0f)
                moveTo(5.94f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.06f)
                lineTo(5.94f, 9.0f)
                close()
            }
        }
        .build()
        return _cardBulletedOff!!
    }

private var _cardBulletedOff: ImageVector? = null
