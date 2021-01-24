package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = Builder(name = "Socks", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.66f, 311.01f)
                lineTo(288.0f, 256.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(176.0f)
                lineToRelative(-86.65f, 64.61f)
                curveToRelative(-39.4f, 29.56f, -53.86f, 84.42f, -29.21f, 127.06f)
                curveTo(30.39f, 495.25f, 63.27f, 512.0f, 96.08f, 512.0f)
                curveToRelative(20.03f, 0.0f, 40.25f, -6.25f, 57.52f, -19.2f)
                lineToRelative(21.86f, -16.39f)
                curveToRelative(-29.85f, -55.38f, -13.54f, -125.84f, 39.2f, -165.4f)
                close()
                moveTo(288.0f, 32.0f)
                curveToRelative(0.0f, -11.05f, 3.07f, -21.3f, 8.02f, -30.38f)
                curveTo(293.4f, 0.92f, 290.85f, 0.0f, 288.0f, 0.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(160.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(480.0f, 0.0f)
                horizontalLineTo(352.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(192.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(320.0f, 272.0f)
                lineToRelative(-86.13f, 64.61f)
                curveToRelative(-39.4f, 29.56f, -53.86f, 84.42f, -29.21f, 127.06f)
                curveToRelative(18.25f, 31.58f, 50.61f, 48.33f, 83.42f, 48.33f)
                curveToRelative(20.03f, 0.0f, 40.25f, -6.25f, 57.52f, -19.2f)
                lineToRelative(115.2f, -86.4f)
                arcTo(127.997f, 127.997f, 0.0f, false, false, 512.0f, 304.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(320.0f)
                verticalLineToRelative(176.0f)
                close()
            }
        }
        .build()
        return _socks!!
    }

private var _socks: ImageVector? = null
