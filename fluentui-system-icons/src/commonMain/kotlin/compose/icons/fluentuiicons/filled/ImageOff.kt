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

public val FilledGroup.ImageOff: ImageVector
    get() {
        if (_imageOff != null) {
            return _imageOff!!
        }
        _imageOff = Builder(name = "ImageOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(3.4833f, 4.544f)
                curveTo(3.1768f, 5.0398f, 3.0f, 5.6243f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 18.3771f, 3.1776f, 18.9626f, 3.4852f, 19.4592f)
                lineTo(10.4238f, 12.6475f)
                lineTo(10.5592f, 12.5248f)
                curveTo(10.7321f, 12.3804f, 10.9215f, 12.2659f, 11.1207f, 12.1815f)
                lineTo(12.0693f, 13.1302f)
                lineTo(11.4746f, 13.7179f)
                lineTo(4.5469f, 20.5186f)
                curveTo(5.0422f, 20.8239f, 5.6255f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(18.3745f, 21.0f, 18.9578f, 20.8239f, 19.4531f, 20.5186f)
                curveTo(19.4448f, 20.5088f, 19.4364f, 20.4989f, 19.428f, 20.489f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(15.7521f, 7.5f)
                curveTo(15.3367f, 7.5f, 15.0f, 7.8367f, 15.0f, 8.2521f)
                curveTo(15.0f, 8.6675f, 15.3367f, 9.0042f, 15.7521f, 9.0042f)
                curveTo(16.1675f, 9.0042f, 16.5042f, 8.6675f, 16.5042f, 8.2521f)
                curveTo(16.5042f, 7.8367f, 16.1675f, 7.5f, 15.7521f, 7.5f)
                close()
                moveTo(21.0f, 17.75f)
                curveTo(21.0f, 17.7726f, 20.9998f, 17.7952f, 20.9993f, 17.8176f)
                lineTo(6.1827f, 3.0007f)
                curveTo(6.205f, 3.0002f, 6.2275f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(15.7521f, 6.0f)
                curveTo(14.5083f, 6.0f, 13.5f, 7.0083f, 13.5f, 8.2521f)
                curveTo(13.5f, 9.4959f, 14.5083f, 10.5042f, 15.7521f, 10.5042f)
                curveTo(16.9959f, 10.5042f, 18.0042f, 9.4959f, 18.0042f, 8.2521f)
                curveTo(18.0042f, 7.0083f, 16.9959f, 6.0f, 15.7521f, 6.0f)
                close()
            }
        }
        .build()
        return _imageOff!!
    }

private var _imageOff: ImageVector? = null
