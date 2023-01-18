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

public val RegularGroup.Food: ImageVector
    get() {
        if (_food != null) {
            return _food!!
        }
        _food = Builder(name = "Food", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 3.25f)
                curveTo(18.6297f, 3.25f, 18.9435f, 3.5322f, 18.9932f, 3.8982f)
                lineTo(19.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.4142f, 18.6642f, 20.75f, 18.25f, 20.75f)
                curveTo(17.8703f, 20.75f, 17.5565f, 20.4678f, 17.5068f, 20.1018f)
                lineTo(17.5f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.25f)
                curveTo(14.8703f, 15.0f, 14.5565f, 14.7178f, 14.5068f, 14.3518f)
                lineTo(14.5f, 14.25f)
                verticalLineTo(7.0f)
                curveTo(14.5f, 4.9289f, 16.1789f, 3.25f, 18.25f, 3.25f)
                close()
                moveTo(12.25f, 3.25f)
                curveTo(12.6297f, 3.25f, 12.9435f, 3.5322f, 12.9932f, 3.8982f)
                lineTo(13.0f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(13.0f, 9.9526f, 11.6009f, 11.5784f, 9.7506f, 11.9297f)
                lineTo(9.75f, 20.0f)
                curveTo(9.75f, 20.4142f, 9.4142f, 20.75f, 9.0f, 20.75f)
                curveTo(8.6203f, 20.75f, 8.3065f, 20.4678f, 8.2569f, 20.1018f)
                lineTo(8.25f, 20.0f)
                lineTo(8.2504f, 11.9299f)
                curveTo(6.4657f, 11.5915f, 5.1005f, 10.0675f, 5.0053f, 8.2079f)
                lineTo(5.0f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.5858f, 5.3358f, 3.25f, 5.75f, 3.25f)
                curveTo(6.1297f, 3.25f, 6.4435f, 3.5322f, 6.4932f, 3.8982f)
                lineTo(6.5f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(6.5f, 9.1196f, 7.2359f, 10.0672f, 8.2504f, 10.3857f)
                lineTo(8.25f, 4.0f)
                curveTo(8.25f, 3.5858f, 8.5858f, 3.25f, 9.0f, 3.25f)
                curveTo(9.3797f, 3.25f, 9.6935f, 3.5322f, 9.7431f, 3.8982f)
                lineTo(9.75f, 4.0f)
                lineTo(9.7506f, 10.3854f)
                curveTo(10.7082f, 10.0843f, 11.4174f, 9.2225f, 11.4933f, 8.1849f)
                lineTo(11.5f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(11.5f, 3.5858f, 11.8358f, 3.25f, 12.25f, 3.25f)
                close()
                moveTo(17.5f, 13.5f)
                verticalLineTo(4.878f)
                curveTo(16.6775f, 5.1687f, 16.0745f, 5.9241f, 16.0064f, 6.8287f)
                lineTo(16.0f, 7.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(4.878f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _food!!
    }

private var _food: ImageVector? = null
