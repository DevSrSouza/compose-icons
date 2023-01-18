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

public val RegularGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2069f, 4.0f)
                curveTo(8.6675f, 4.0f, 9.1153f, 4.1413f, 9.4909f, 4.4023f)
                lineTo(9.6473f, 4.5215f)
                lineTo(12.022f, 6.5f)
                horizontalLineTo(19.75f)
                curveTo(20.8867f, 6.5f, 21.8266f, 7.343f, 21.9785f, 8.4379f)
                lineTo(21.9948f, 8.596f)
                lineTo(22.0f, 8.75f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.9409f, 21.0748f, 19.9156f, 19.904f, 19.9948f)
                lineTo(19.75f, 20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0591f, 20.0f, 2.0844f, 19.0748f, 2.0052f, 17.904f)
                lineTo(2.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0591f, 2.9252f, 4.0844f, 4.096f, 4.0052f)
                lineTo(4.25f, 4.0f)
                horizontalLineTo(8.2069f)
                close()
                moveTo(9.6473f, 9.9785f)
                curveTo(9.2935f, 10.2733f, 8.8591f, 10.4515f, 8.4033f, 10.4914f)
                lineTo(8.2069f, 10.5f)
                lineTo(3.5f, 10.499f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.1297f, 3.7822f, 18.4435f, 4.1482f, 18.4932f)
                lineTo(4.25f, 18.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1297f, 18.5f, 20.4435f, 18.2178f, 20.4932f, 17.8518f)
                lineTo(20.5f, 17.75f)
                verticalLineTo(8.75f)
                curveTo(20.5f, 8.3703f, 20.2178f, 8.0565f, 19.8518f, 8.0069f)
                lineTo(19.75f, 8.0f)
                horizontalLineTo(12.021f)
                lineTo(9.6473f, 9.9785f)
                close()
                moveTo(8.2069f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8703f, 5.5f, 3.5565f, 5.7821f, 3.5069f, 6.1482f)
                lineTo(3.5f, 6.25f)
                verticalLineTo(8.999f)
                lineTo(8.2069f, 9.0f)
                curveTo(8.3473f, 9.0f, 8.4841f, 8.9606f, 8.6022f, 8.8874f)
                lineTo(8.6871f, 8.8262f)
                lineTo(10.578f, 7.249f)
                lineTo(8.6871f, 5.6738f)
                curveTo(8.5792f, 5.584f, 8.4489f, 5.5266f, 8.3113f, 5.5073f)
                lineTo(8.2069f, 5.5f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
