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

public val FilledGroup.TextFont: ImageVector
    get() {
        if (_textFont != null) {
            return _textFont!!
        }
        _textFont = Builder(name = "TextFont", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0008f, 2.0f)
                curveTo(7.4213f, 2.0f, 7.7969f, 2.2631f, 7.9406f, 2.6583f)
                lineTo(10.8223f, 10.5839f)
                lineTo(9.7115f, 13.382f)
                lineTo(9.209f, 12.0f)
                horizontalLineTo(4.7917f)
                lineTo(3.94f, 14.3418f)
                curveTo(3.7513f, 14.8608f, 3.1775f, 15.1285f, 2.6585f, 14.9398f)
                curveTo(2.1395f, 14.751f, 1.8717f, 14.1772f, 2.0605f, 13.6582f)
                lineTo(6.061f, 2.6582f)
                curveTo(6.2047f, 2.263f, 6.5803f, 2.0f, 7.0008f, 2.0f)
                close()
                moveTo(5.5191f, 10.0f)
                horizontalLineTo(8.4819f)
                lineTo(7.0006f, 5.9262f)
                lineTo(5.5191f, 10.0f)
                close()
                moveTo(15.3677f, 6.5279f)
                curveTo(15.2168f, 6.1467f, 14.8484f, 5.8962f, 14.4384f, 5.8961f)
                curveTo(14.0284f, 5.8959f, 13.6598f, 6.146f, 13.5085f, 6.5271f)
                lineTo(8.1511f, 20.0233f)
                lineTo(8.0002f, 20.0233f)
                curveTo(7.4479f, 20.0233f, 7.0002f, 20.471f, 7.0002f, 21.0233f)
                curveTo(7.0002f, 21.5756f, 7.448f, 22.0233f, 8.0002f, 22.0233f)
                lineTo(8.8097f, 22.0233f)
                curveTo(8.8231f, 22.0236f, 8.8364f, 22.0236f, 8.8498f, 22.0233f)
                lineTo(11.0003f, 22.0233f)
                curveTo(11.5525f, 22.0233f, 12.0002f, 21.5756f, 12.0002f, 21.0233f)
                curveTo(12.0002f, 20.471f, 11.5525f, 20.0233f, 11.0002f, 20.0233f)
                lineTo(10.3029f, 20.0233f)
                lineTo(11.1061f, 17.9999f)
                horizontalLineTo(17.7587f)
                lineTo(18.5598f, 20.0233f)
                lineTo(18.0002f, 20.0233f)
                curveTo(17.448f, 20.0233f, 17.0002f, 20.471f, 17.0002f, 21.0233f)
                curveTo(17.0002f, 21.5756f, 17.4479f, 22.0233f, 18.0002f, 22.0233f)
                lineTo(20.0143f, 22.0234f)
                curveTo(20.0257f, 22.0236f, 20.0372f, 22.0236f, 20.0486f, 22.0234f)
                lineTo(21.0088f, 22.0234f)
                curveTo(21.5611f, 22.0234f, 22.0088f, 21.5757f, 22.0088f, 21.0234f)
                curveTo(22.0089f, 20.4711f, 21.5611f, 20.0234f, 21.0089f, 20.0234f)
                lineTo(20.7108f, 20.0234f)
                lineTo(15.3677f, 6.5279f)
                close()
                moveTo(16.9668f, 15.9999f)
                horizontalLineTo(11.9f)
                lineTo(14.4367f, 9.6095f)
                lineTo(16.9668f, 15.9999f)
                close()
            }
        }
        .build()
        return _textFont!!
    }

private var _textFont: ImageVector? = null
