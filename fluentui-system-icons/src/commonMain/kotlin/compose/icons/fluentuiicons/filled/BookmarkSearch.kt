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

public val FilledGroup.BookmarkSearch: ImageVector
    get() {
        if (_bookmarkSearch != null) {
            return _bookmarkSearch!!
        }
        _bookmarkSearch = Builder(name = "BookmarkSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1069f, 9.1681f)
                curveTo(18.3713f, 9.6919f, 17.4714f, 10.0f, 16.4995f, 10.0f)
                curveTo(14.0142f, 10.0f, 11.9995f, 7.9853f, 11.9995f, 5.5f)
                curveTo(11.9995f, 3.0147f, 14.0142f, 1.0f, 16.4995f, 1.0f)
                curveTo(18.9848f, 1.0f, 20.9995f, 3.0147f, 20.9995f, 5.5f)
                curveTo(20.9995f, 6.4719f, 20.6914f, 7.3718f, 20.1676f, 8.1074f)
                lineTo(22.7798f, 10.7197f)
                curveTo(23.0727f, 11.0126f, 23.0727f, 11.4874f, 22.7798f, 11.7803f)
                curveTo(22.4869f, 12.0732f, 22.0121f, 12.0732f, 21.7192f, 11.7803f)
                lineTo(19.1069f, 9.1681f)
                close()
                moveTo(19.4995f, 5.5f)
                curveTo(19.4995f, 3.8431f, 18.1564f, 2.5f, 16.4995f, 2.5f)
                curveTo(14.8427f, 2.5f, 13.4995f, 3.8431f, 13.4995f, 5.5f)
                curveTo(13.4995f, 7.1568f, 14.8427f, 8.5f, 16.4995f, 8.5f)
                curveTo(18.1564f, 8.5f, 19.4995f, 7.1568f, 19.4995f, 5.5f)
                close()
                moveTo(19.0003f, 10.4757f)
                verticalLineTo(21.2449f)
                curveTo(19.0003f, 21.8562f, 18.3085f, 22.2107f, 17.8123f, 21.8538f)
                lineTo(12.0011f, 17.6728f)
                lineTo(6.19f, 21.8538f)
                curveTo(5.6938f, 22.2107f, 5.0019f, 21.8562f, 5.0019f, 21.2449f)
                verticalLineTo(6.249f)
                curveTo(5.0019f, 4.4541f, 6.457f, 2.999f, 8.252f, 2.999f)
                horizontalLineTo(11.5997f)
                curveTo(11.216f, 3.7493f, 10.9995f, 4.5994f, 10.9995f, 5.5f)
                curveTo(10.9995f, 8.5376f, 13.4619f, 11.0f, 16.4995f, 11.0f)
                curveTo(17.38f, 11.0f, 18.2121f, 10.7931f, 18.9499f, 10.4253f)
                lineTo(19.0003f, 10.4757f)
                close()
            }
        }
        .build()
        return _bookmarkSearch!!
    }

private var _bookmarkSearch: ImageVector? = null
