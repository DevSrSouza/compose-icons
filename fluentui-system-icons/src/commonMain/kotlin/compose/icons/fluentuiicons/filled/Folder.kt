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

public val FilledGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.821f, 6.5f)
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
                verticalLineTo(10.499f)
                lineTo(8.2069f, 10.5f)
                lineTo(8.4033f, 10.4914f)
                curveTo(8.794f, 10.4572f, 9.169f, 10.3214f, 9.4909f, 10.0977f)
                lineTo(9.6473f, 9.9785f)
                lineTo(13.821f, 6.5f)
                close()
                moveTo(8.2069f, 4.0f)
                curveTo(8.6675f, 4.0f, 9.1153f, 4.1413f, 9.4909f, 4.4023f)
                lineTo(9.6473f, 4.5215f)
                lineTo(11.75f, 6.273f)
                lineTo(8.6871f, 8.8262f)
                lineTo(8.6022f, 8.8874f)
                curveTo(8.5136f, 8.9423f, 8.4145f, 8.9782f, 8.3113f, 8.9927f)
                lineTo(8.2069f, 9.0f)
                lineTo(2.0f, 8.999f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0591f, 2.9252f, 4.0844f, 4.096f, 4.0052f)
                lineTo(4.25f, 4.0f)
                horizontalLineTo(8.2069f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
