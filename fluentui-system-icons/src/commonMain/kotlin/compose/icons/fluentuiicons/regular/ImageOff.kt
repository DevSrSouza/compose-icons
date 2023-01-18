package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ImageOff: ImageVector
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
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(18.3757f, 21.0f, 18.96f, 20.8232f, 19.4559f, 20.5169f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(12.0681f, 13.1289f)
                lineTo(18.2739f, 19.3349f)
                curveTo(18.2929f, 19.3572f, 18.3118f, 19.3794f, 18.3305f, 19.4014f)
                curveTo(18.1489f, 19.4653f, 17.9535f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(6.0461f, 19.5f, 5.8504f, 19.4651f, 5.6684f, 19.4011f)
                lineTo(11.4752f, 13.7148f)
                lineTo(12.0681f, 13.1289f)
                close()
                moveTo(11.1189f, 12.1797f)
                curveTo(10.8678f, 12.2865f, 10.6322f, 12.4409f, 10.4258f, 12.643f)
                lineTo(4.6033f, 18.3437f)
                curveTo(4.5364f, 18.1583f, 4.5f, 17.9584f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 6.0437f, 4.5357f, 5.8457f, 4.6013f, 5.662f)
                lineTo(11.1189f, 12.1797f)
                close()
                moveTo(19.5f, 16.3183f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(7.6819f)
                lineTo(6.1827f, 3.0007f)
                curveTo(6.205f, 3.0002f, 6.2275f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 17.7726f, 20.9998f, 17.7952f, 20.9993f, 17.8176f)
                lineTo(19.5f, 16.3183f)
                close()
                moveTo(15.2521f, 6.5f)
                curveTo(16.4959f, 6.5f, 17.5042f, 7.5083f, 17.5042f, 8.7521f)
                curveTo(17.5042f, 9.9959f, 16.4959f, 11.0042f, 15.2521f, 11.0042f)
                curveTo(14.0083f, 11.0042f, 13.0f, 9.9959f, 13.0f, 8.7521f)
                curveTo(13.0f, 7.5083f, 14.0083f, 6.5f, 15.2521f, 6.5f)
                close()
                moveTo(15.2521f, 8.0f)
                curveTo(14.8367f, 8.0f, 14.5f, 8.3367f, 14.5f, 8.7521f)
                curveTo(14.5f, 9.1675f, 14.8367f, 9.5042f, 15.2521f, 9.5042f)
                curveTo(15.6675f, 9.5042f, 16.0042f, 9.1675f, 16.0042f, 8.7521f)
                curveTo(16.0042f, 8.3367f, 15.6675f, 8.0f, 15.2521f, 8.0f)
                close()
            }
        }
        .build()
        return _imageOff!!
    }

private var _imageOff: ImageVector? = null
