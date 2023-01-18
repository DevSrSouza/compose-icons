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

public val RegularGroup.FolderMail: ImageVector
    get() {
        if (_folderMail != null) {
            return _folderMail!!
        }
        _folderMail = Builder(name = "FolderMail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4909f, 4.4023f)
                curveTo(9.1153f, 4.1413f, 8.6675f, 4.0f, 8.2069f, 4.0f)
                horizontalLineTo(4.25f)
                lineTo(4.096f, 4.0052f)
                curveTo(2.9252f, 4.0844f, 2.0f, 5.0591f, 2.0f, 6.25f)
                verticalLineTo(17.75f)
                lineTo(2.0052f, 17.904f)
                curveTo(2.0844f, 19.0748f, 3.0591f, 20.0f, 4.25f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(4.25f)
                lineTo(4.1482f, 18.4932f)
                curveTo(3.7822f, 18.4435f, 3.5f, 18.1297f, 3.5f, 17.75f)
                verticalLineTo(10.499f)
                lineTo(8.2069f, 10.5f)
                lineTo(8.4033f, 10.4914f)
                curveTo(8.8591f, 10.4515f, 9.2935f, 10.2733f, 9.6473f, 9.9785f)
                lineTo(12.021f, 8.0f)
                horizontalLineTo(19.75f)
                lineTo(19.8518f, 8.0069f)
                curveTo(20.2178f, 8.0565f, 20.5f, 8.3703f, 20.5f, 8.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.3506f, 13.0f, 21.6872f, 13.0602f, 22.0f, 13.1707f)
                verticalLineTo(8.75f)
                lineTo(21.9948f, 8.596f)
                lineTo(21.9785f, 8.4379f)
                curveTo(21.8266f, 7.343f, 20.8867f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(12.022f)
                lineTo(9.6473f, 4.5215f)
                lineTo(9.4909f, 4.4023f)
                close()
                moveTo(4.25f, 5.5f)
                horizontalLineTo(8.2069f)
                lineTo(8.3113f, 5.5073f)
                curveTo(8.4489f, 5.5266f, 8.5792f, 5.584f, 8.6871f, 5.6738f)
                lineTo(10.578f, 7.249f)
                lineTo(8.6871f, 8.8262f)
                lineTo(8.6022f, 8.8874f)
                curveTo(8.4841f, 8.9606f, 8.3473f, 9.0f, 8.2069f, 9.0f)
                lineTo(3.5f, 8.999f)
                verticalLineTo(6.25f)
                lineTo(3.5069f, 6.1482f)
                curveTo(3.5565f, 5.7821f, 3.8703f, 5.5f, 4.25f, 5.5f)
                close()
                moveTo(17.5098f, 18.9269f)
                lineTo(12.0189f, 15.7238f)
                curveTo(12.1534f, 14.75f, 12.9891f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(21.0f)
                curveTo(22.0948f, 14.0f, 22.9841f, 14.8796f, 22.9998f, 15.9707f)
                lineTo(17.5098f, 18.9269f)
                close()
                moveTo(17.737f, 19.9402f)
                lineTo(23.0f, 17.1063f)
                verticalLineTo(21.0f)
                curveTo(23.0f, 22.1046f, 22.1046f, 23.0f, 21.0f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 23.0f, 12.0f, 22.1046f, 12.0f, 21.0f)
                verticalLineTo(16.8705f)
                lineTo(17.2481f, 19.9319f)
                curveTo(17.3985f, 20.0196f, 17.5837f, 20.0228f, 17.737f, 19.9402f)
                close()
            }
        }
        .build()
        return _folderMail!!
    }

private var _folderMail: ImageVector? = null
