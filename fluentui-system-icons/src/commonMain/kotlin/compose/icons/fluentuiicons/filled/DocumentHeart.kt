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

public val FilledGroup.DocumentHeart: ImageVector
    get() {
        if (_documentHeart != null) {
            return _documentHeart!!
        }
        _documentHeart = Builder(name = "DocumentHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0002f, 9.1046f, 12.8957f, 10.0f, 14.0002f, 10.0f)
                horizontalLineTo(20.0002f)
                verticalLineTo(20.0f)
                curveTo(20.0002f, 21.1046f, 19.1048f, 22.0f, 18.0002f, 22.0f)
                horizontalLineTo(9.4895f)
                lineTo(12.6604f, 18.8292f)
                curveTo(14.4048f, 17.0848f, 14.4048f, 14.2566f, 12.6604f, 12.5123f)
                curveTo(11.1254f, 10.9772f, 8.7511f, 10.793f, 7.0146f, 11.9596f)
                curveTo(6.1129f, 11.3538f, 5.0391f, 11.1123f, 4.0002f, 11.235f)
                verticalLineTo(4.0f)
                curveTo(4.0002f, 2.8954f, 4.8957f, 2.0f, 6.0002f, 2.0f)
                horizontalLineTo(12.0002f)
                close()
                moveTo(13.5002f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5002f, 8.2761f, 13.7241f, 8.5f, 14.0002f, 8.5f)
                horizontalLineTo(19.5002f)
                lineTo(13.5002f, 2.5f)
                close()
                moveTo(7.0146f, 22.75f)
                curveTo(6.8226f, 22.75f, 6.6307f, 22.6768f, 6.4842f, 22.5303f)
                lineTo(2.0759f, 18.122f)
                curveTo(0.7221f, 16.7682f, 0.7221f, 14.5732f, 2.0759f, 13.2194f)
                curveTo(3.4298f, 11.8655f, 5.6248f, 11.8655f, 6.9786f, 13.2194f)
                lineTo(7.0146f, 13.2554f)
                lineTo(7.0506f, 13.2194f)
                curveTo(8.4044f, 11.8655f, 10.5994f, 11.8655f, 11.9533f, 13.2194f)
                curveTo(13.3071f, 14.5732f, 13.3071f, 16.7682f, 11.9533f, 18.122f)
                lineTo(7.545f, 22.5303f)
                curveTo(7.3986f, 22.6768f, 7.2066f, 22.75f, 7.0146f, 22.75f)
                close()
            }
        }
        .build()
        return _documentHeart!!
    }

private var _documentHeart: ImageVector? = null
