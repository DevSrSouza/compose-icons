package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Webcomponentsdotorg: ImageVector
    get() {
        if (_webcomponentsdotorg != null) {
            return _webcomponentsdotorg!!
        }
        _webcomponentsdotorg = Builder(name = "Webcomponentsdotorg", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.731f, 2.225f)
                lineToRelative(-0.01f, 0.016f)
                horizontalLineTo(5.618f)
                lineTo(0.0f, 11.979f)
                lineToRelative(5.618f, 9.736f)
                horizontalLineToRelative(12.8f)
                lineToRelative(0.04f, 0.06f)
                lineToRelative(2.134f, -3.735f)
                lineToRelative(0.518f, -0.893f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(0.008f, -0.014f)
                lineToRelative(-0.626f, -0.75f)
                horizontalLineToRelative(0.895f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.008f, 0.01f)
                lineTo(24.0f, 11.994f)
                lineToRelative(-2.607f, -4.39f)
                lineToRelative(-0.003f, 0.005f)
                lineToRelative(-0.011f, -0.02f)
                horizontalLineToRelative(-0.945f)
                lineToRelative(0.63f, -0.763f)
                lineToRelative(-2.606f, -4.57f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.024f, -0.04f)
                horizontalLineTo(11.73f)
                close()
                moveTo(9.107f, 6.824f)
                horizontalLineToRelative(6.19f)
                lineToRelative(-0.53f, 0.764f)
                horizontalLineToRelative(-0.023f)
                lineToRelative(2.398f, 4.015f)
                horizontalLineToRelative(0.875f)
                lineToRelative(-0.277f, 0.328f)
                lineToRelative(0.357f, 0.435f)
                horizontalLineToRelative(-0.956f)
                lineToRelative(-2.398f, 4.015f)
                horizontalLineToRelative(0.027f)
                lineToRelative(0.523f, 0.764f)
                horizontalLineTo(9.074f)
                lineToRelative(-2.99f, -5.168f)
                lineToRelative(3.022f, -5.155f)
                close()
            }
        }
        .build()
        return _webcomponentsdotorg!!
    }

private var _webcomponentsdotorg: ImageVector? = null
