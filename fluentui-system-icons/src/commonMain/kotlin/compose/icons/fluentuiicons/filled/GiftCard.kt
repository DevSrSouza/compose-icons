package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = Builder(name = "GiftCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 19.0f, 22.0f, 17.6569f, 22.0f, 16.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(10.5607f)
                lineTo(12.2803f, 13.2197f)
                curveTo(12.5732f, 13.5126f, 12.5732f, 13.9874f, 12.2803f, 14.2803f)
                curveTo(11.9874f, 14.5732f, 11.5126f, 14.5732f, 11.2197f, 14.2803f)
                lineTo(9.5f, 12.5607f)
                lineTo(9.5f, 19.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(8.0f, 9.0003f, 8.0f, 8.9997f, 8.0f, 9.0f)
                curveTo(7.9995f, 8.4481f, 7.552f, 8.0f, 7.0f, 8.0f)
                curveTo(6.4477f, 8.0f, 6.0f, 8.4477f, 6.0f, 9.0f)
                curveTo(6.0f, 9.5523f, 6.4477f, 10.0f, 7.0f, 10.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(9.5f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.5f)
                curveTo(11.0523f, 10.0f, 11.5f, 9.5523f, 11.5f, 9.0f)
                curveTo(11.5f, 8.4477f, 11.0523f, 8.0f, 10.5f, 8.0f)
                curveTo(9.9477f, 8.0f, 9.5f, 8.4477f, 9.5f, 9.0f)
                close()
                moveTo(9.5f, 6.708f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 4.0f, 22.0f, 5.3432f, 22.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.792f)
                curveTo(12.9258f, 9.6938f, 13.0f, 9.3555f, 13.0f, 9.0f)
                curveTo(13.0f, 7.6193f, 11.8807f, 6.5f, 10.5f, 6.5f)
                curveTo(10.1444f, 6.5f, 9.8062f, 6.5742f, 9.5f, 6.708f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineTo(6.708f)
                curveTo(7.6938f, 6.5742f, 7.3555f, 6.5f, 7.0f, 6.5f)
                curveTo(5.6193f, 6.5f, 4.5f, 7.6193f, 4.5f, 9.0f)
                curveTo(4.5f, 9.3555f, 4.5742f, 9.6938f, 4.708f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.3432f, 3.3431f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 12.5607f)
                lineTo(8.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 19.0f, 2.0f, 17.6569f, 2.0f, 16.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.9393f)
                lineTo(5.2197f, 13.2197f)
                curveTo(4.9268f, 13.5126f, 4.9268f, 13.9874f, 5.2197f, 14.2803f)
                curveTo(5.5126f, 14.5732f, 5.9874f, 14.5732f, 6.2803f, 14.2803f)
                lineTo(8.0f, 12.5607f)
                close()
            }
        }
        .build()
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
