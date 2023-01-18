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

public val FilledGroup.ImageProhibited: ImageVector
    get() {
        if (_imageProhibited != null) {
            return _imageProhibited!!
        }
        _imageProhibited = Builder(name = "ImageProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 9.5376f, 1.0f, 6.5f, 1.0f)
                curveTo(3.4624f, 1.0f, 1.0f, 3.4624f, 1.0f, 6.5f)
                curveTo(1.0f, 9.5376f, 3.4624f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(6.5f, 10.5f)
                curveTo(5.6665f, 10.5f, 4.8925f, 10.2451f, 4.2519f, 9.8089f)
                lineTo(9.8089f, 4.2519f)
                curveTo(10.2451f, 4.8925f, 10.5f, 5.6665f, 10.5f, 6.5f)
                curveTo(10.5f, 8.7091f, 8.7091f, 10.5f, 6.5f, 10.5f)
                close()
                moveTo(3.1912f, 8.7483f)
                curveTo(2.755f, 8.1076f, 2.5f, 7.3336f, 2.5f, 6.5f)
                curveTo(2.5f, 4.2909f, 4.2909f, 2.5f, 6.5f, 2.5f)
                curveTo(7.3336f, 2.5f, 8.1076f, 2.755f, 8.7483f, 3.1912f)
                lineTo(3.1912f, 8.7483f)
                close()
                moveTo(16.5042f, 8.2521f)
                curveTo(16.5042f, 7.8367f, 16.1675f, 7.5f, 15.7521f, 7.5f)
                curveTo(15.3367f, 7.5f, 15.0f, 7.8367f, 15.0f, 8.2521f)
                curveTo(15.0f, 8.6675f, 15.3367f, 9.0042f, 15.7521f, 9.0042f)
                curveTo(16.1675f, 9.0042f, 16.5042f, 8.6675f, 16.5042f, 8.2521f)
                close()
                moveTo(6.5f, 13.0f)
                curveTo(10.0899f, 13.0f, 13.0f, 10.0899f, 13.0f, 6.5f)
                curveTo(13.0f, 5.2114f, 12.625f, 4.0103f, 11.9782f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 18.3771f, 20.8224f, 18.9626f, 20.5148f, 19.4592f)
                lineTo(13.5762f, 12.6475f)
                lineTo(13.4477f, 12.5306f)
                curveTo(12.615f, 11.8293f, 11.3941f, 11.8273f, 10.5592f, 12.5248f)
                lineTo(10.4238f, 12.6475f)
                lineTo(3.4852f, 19.4592f)
                curveTo(3.1776f, 18.9626f, 3.0f, 18.3771f, 3.0f, 17.75f)
                verticalLineTo(11.9782f)
                curveTo(4.0103f, 12.625f, 5.2114f, 13.0f, 6.5f, 13.0f)
                close()
                moveTo(13.5f, 8.2521f)
                curveTo(13.5f, 9.4959f, 14.5083f, 10.5042f, 15.7521f, 10.5042f)
                curveTo(16.9959f, 10.5042f, 18.0042f, 9.4959f, 18.0042f, 8.2521f)
                curveTo(18.0042f, 7.0083f, 16.9959f, 6.0f, 15.7521f, 6.0f)
                curveTo(14.5083f, 6.0f, 13.5f, 7.0083f, 13.5f, 8.2521f)
                close()
                moveTo(11.5582f, 13.6469f)
                lineTo(11.4746f, 13.7179f)
                lineTo(4.5469f, 20.5186f)
                curveTo(5.0422f, 20.8239f, 5.6255f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(18.3745f, 21.0f, 18.9578f, 20.8239f, 19.4531f, 20.5186f)
                lineTo(12.5254f, 13.7179f)
                lineTo(12.432f, 13.6399f)
                curveTo(12.1705f, 13.4552f, 11.8174f, 13.4576f, 11.5582f, 13.6469f)
                close()
            }
        }
        .build()
        return _imageProhibited!!
    }

private var _imageProhibited: ImageVector? = null
