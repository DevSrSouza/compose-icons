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

public val FilledGroup.ImageMultiple: ImageVector
    get() {
        if (_imageMultiple != null) {
            return _imageMultiple!!
        }
        _imageMultiple = Builder(name = "ImageMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(15.25f)
                curveTo(17.0449f, 3.0f, 18.5f, 4.4551f, 18.5f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(18.5f, 15.8963f, 18.3114f, 16.4985f, 17.9861f, 17.0046f)
                lineTo(12.2941f, 11.6292f)
                curveTo(11.427f, 10.8103f, 10.0715f, 10.8103f, 9.2044f, 11.6292f)
                lineTo(3.5133f, 17.0037f)
                curveTo(3.1884f, 16.4978f, 3.0f, 15.8959f, 3.0f, 15.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(13.7472f, 8.9963f)
                curveTo(14.4365f, 8.9963f, 14.9954f, 8.4375f, 14.9954f, 7.7482f)
                curveTo(14.9954f, 7.0588f, 14.4365f, 6.5f, 13.7472f, 6.5f)
                curveTo(13.0578f, 6.5f, 12.499f, 7.0588f, 12.499f, 7.7482f)
                curveTo(12.499f, 8.4375f, 13.0578f, 8.9963f, 13.7472f, 8.9963f)
                close()
                moveTo(11.2642f, 12.7198f)
                lineTo(16.9056f, 18.0473f)
                curveTo(16.4207f, 18.3349f, 15.8546f, 18.5f, 15.25f, 18.5f)
                horizontalLineTo(6.25f)
                curveTo(5.645f, 18.5f, 5.0786f, 18.3347f, 4.5935f, 18.0468f)
                lineTo(10.2343f, 12.7198f)
                curveTo(10.5234f, 12.4468f, 10.9752f, 12.4468f, 11.2642f, 12.7198f)
                close()
                moveTo(8.749f, 21.0002f)
                curveTo(7.5983f, 21.0002f, 6.5873f, 20.4022f, 6.0098f, 19.5f)
                horizontalLineTo(8.7235f)
                lineTo(8.749f, 19.5002f)
                horizontalLineTo(15.749f)
                curveTo(17.82f, 19.5002f, 19.499f, 17.8212f, 19.499f, 15.7502f)
                verticalLineTo(6.0111f)
                curveTo(20.4011f, 6.5886f, 20.999f, 7.5996f, 20.999f, 8.7502f)
                verticalLineTo(15.7502f)
                curveTo(20.999f, 18.6497f, 18.6485f, 21.0002f, 15.749f, 21.0002f)
                horizontalLineTo(8.749f)
                close()
            }
        }
        .build()
        return _imageMultiple!!
    }

private var _imageMultiple: ImageVector? = null
