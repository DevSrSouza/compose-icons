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

public val RegularGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(18.3305f, 19.4014f)
                lineTo(12.5247f, 13.7148f)
                curveTo(12.2596f, 13.4553f, 11.8501f, 13.4316f, 11.5588f, 13.644f)
                lineTo(11.4752f, 13.7148f)
                lineTo(5.6684f, 19.4011f)
                curveTo(5.8504f, 19.4651f, 6.0461f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(17.9535f, 19.5f, 18.1489f, 19.4653f, 18.3305f, 19.4014f)
                lineTo(12.5247f, 13.7148f)
                lineTo(18.3305f, 19.4014f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 17.9584f, 4.5364f, 18.1583f, 4.6033f, 18.3437f)
                lineTo(10.4258f, 12.643f)
                curveTo(11.2589f, 11.8273f, 12.5675f, 11.7885f, 13.4458f, 12.5266f)
                lineTo(13.5742f, 12.6431f)
                lineTo(19.3964f, 18.3447f)
                curveTo(19.4634f, 18.159f, 19.5f, 17.9588f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
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
        return _image!!
    }

private var _image: ImageVector? = null
