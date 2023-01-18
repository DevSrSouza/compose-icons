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

public val FilledGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 18.3771f, 3.1776f, 18.9626f, 3.4852f, 19.4592f)
                lineTo(10.4238f, 12.6475f)
                lineTo(10.5592f, 12.5248f)
                curveTo(11.3941f, 11.8273f, 12.615f, 11.8293f, 13.4477f, 12.5306f)
                lineTo(13.5762f, 12.6475f)
                lineTo(20.5148f, 19.4592f)
                curveTo(20.8224f, 18.9626f, 21.0f, 18.3771f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(15.25f, 10.75f)
                curveTo(14.1454f, 10.75f, 13.25f, 9.8546f, 13.25f, 8.75f)
                curveTo(13.25f, 7.6454f, 14.1454f, 6.75f, 15.25f, 6.75f)
                curveTo(16.3546f, 6.75f, 17.25f, 7.6454f, 17.25f, 8.75f)
                curveTo(17.25f, 9.8546f, 16.3546f, 10.75f, 15.25f, 10.75f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
