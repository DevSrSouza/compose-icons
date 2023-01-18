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

public val FilledGroup.MailList: ImageVector
    get() {
        if (_mailList != null) {
            return _mailList!!
        }
        _mailList = Builder(name = "MailList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2973f, 9.5f)
                horizontalLineTo(21.25f)
                curveTo(21.5184f, 9.5f, 21.7727f, 9.4396f, 22.0f, 9.3316f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(8.608f)
                lineTo(11.652f, 13.6644f)
                curveTo(11.87f, 13.7785f, 12.13f, 13.7785f, 12.348f, 13.6644f)
                lineTo(20.2973f, 9.5f)
                close()
                moveTo(12.5253f, 4.0f)
                horizontalLineTo(5.25f)
                lineTo(5.0641f, 4.0052f)
                curveTo(3.4643f, 4.0954f, 2.1739f, 5.3427f, 2.0162f, 6.9236f)
                lineTo(12.0f, 12.1533f)
                lineTo(17.0653f, 9.5f)
                horizontalLineTo(13.75f)
                curveTo(12.7835f, 9.5f, 12.0f, 8.7165f, 12.0f, 7.75f)
                curveTo(12.0f, 7.2603f, 12.2011f, 6.8176f, 12.5253f, 6.5f)
                curveTo(12.2011f, 6.1825f, 12.0f, 5.74f, 12.0f, 5.25f)
                curveTo(12.0f, 4.7603f, 12.2011f, 4.3176f, 12.5253f, 4.0f)
                close()
                moveTo(21.25f, 2.0f)
                curveTo(21.6401f, 2.0f, 21.9607f, 2.2978f, 21.9966f, 2.6786f)
                curveTo(21.9989f, 2.7021f, 22.0f, 2.7259f, 22.0f, 2.75f)
                curveTo(22.0f, 2.8073f, 21.9936f, 2.8631f, 21.9814f, 2.9167f)
                curveTo(21.9056f, 3.2507f, 21.6069f, 3.5f, 21.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(13.6501f, 3.5f, 13.5548f, 3.4805f, 13.4677f, 3.445f)
                curveTo(13.1934f, 3.3335f, 13.0f, 3.0643f, 13.0f, 2.75f)
                curveTo(13.0f, 2.4234f, 13.2087f, 2.1456f, 13.5f, 2.0427f)
                curveTo(13.5782f, 2.015f, 13.6623f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(21.25f, 4.5f)
                curveTo(21.3201f, 4.5f, 21.3879f, 4.5096f, 21.4522f, 4.5276f)
                curveTo(21.7682f, 4.6158f, 22.0f, 4.9058f, 22.0f, 5.25f)
                curveTo(22.0f, 5.6642f, 21.6642f, 6.0f, 21.25f, 6.0f)
                horizontalLineTo(13.75f)
                curveTo(13.7131f, 6.0f, 13.6769f, 5.9973f, 13.6414f, 5.9922f)
                curveTo(13.2787f, 5.9396f, 13.0f, 5.6273f, 13.0f, 5.25f)
                curveTo(13.0f, 4.8358f, 13.3358f, 4.5f, 13.75f, 4.5f)
                horizontalLineTo(21.25f)
                close()
                moveTo(13.0f, 7.75f)
                curveTo(13.0f, 7.3358f, 13.3358f, 7.0f, 13.75f, 7.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 7.0f, 22.0f, 7.3358f, 22.0f, 7.75f)
                curveTo(22.0f, 8.1642f, 21.6642f, 8.5f, 21.25f, 8.5f)
                horizontalLineTo(13.75f)
                curveTo(13.3358f, 8.5f, 13.0f, 8.1642f, 13.0f, 7.75f)
                close()
            }
        }
        .build()
        return _mailList!!
    }

private var _mailList: ImageVector? = null
