package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 10.687f, 21.741f, 9.386f, 21.239f, 8.173f)
                curveTo(20.736f, 6.96f, 20.0f, 5.857f, 19.071f, 4.929f)
                curveTo(18.142f, 4.0f, 17.04f, 3.264f, 15.827f, 2.761f)
                curveTo(14.614f, 2.259f, 13.313f, 2.0f, 12.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(13.051f, 4.0f, 14.091f, 4.207f, 15.061f, 4.609f)
                curveTo(16.032f, 5.011f, 16.914f, 5.6f, 17.657f, 6.343f)
                curveTo(18.4f, 7.086f, 18.989f, 7.968f, 19.391f, 8.938f)
                curveTo(19.793f, 9.909f, 20.0f, 10.95f, 20.0f, 12.0f)
                horizontalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 4.448f, 2.448f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(8.552f, 4.0f, 9.0f, 4.448f, 9.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 9.552f, 8.552f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 14.418f, 9.582f, 18.0f, 14.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(14.0f, 15.448f, 14.448f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 15.0f, 20.0f, 15.448f, 20.0f, 16.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.552f, 19.552f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(7.373f, 22.0f, 2.0f, 16.627f, 2.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.543f, 9.704f)
                curveTo(17.845f, 10.432f, 18.0f, 11.212f, 18.0f, 12.0f)
                horizontalLineTo(16.2f)
                curveTo(16.2f, 11.448f, 16.091f, 10.902f, 15.88f, 10.393f)
                curveTo(15.669f, 9.883f, 15.36f, 9.42f, 14.97f, 9.03f)
                curveTo(14.58f, 8.64f, 14.117f, 8.331f, 13.607f, 8.12f)
                curveTo(13.098f, 7.909f, 12.552f, 7.8f, 12.0f, 7.8f)
                verticalLineTo(6.0f)
                curveTo(12.788f, 6.0f, 13.568f, 6.155f, 14.296f, 6.457f)
                curveTo(15.024f, 6.758f, 15.686f, 7.2f, 16.243f, 7.757f)
                curveTo(16.8f, 8.314f, 17.242f, 8.976f, 17.543f, 9.704f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
