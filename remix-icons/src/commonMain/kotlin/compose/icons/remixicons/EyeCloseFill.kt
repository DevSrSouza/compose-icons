package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.EyeCloseFill: ImageVector
    get() {
        if (_eyeCloseFill != null) {
            return _eyeCloseFill!!
        }
        _eyeCloseFill = Builder(name = "EyeCloseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.13f, 15.842f)
                lineToRelative(-0.788f, 2.94f)
                lineToRelative(-1.931f, -0.518f)
                lineToRelative(0.787f, -2.939f)
                arcToRelative(10.988f, 10.988f, 0.0f, false, true, -3.237f, -1.872f)
                lineToRelative(-2.153f, 2.154f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(2.154f, -2.153f)
                arcToRelative(10.957f, 10.957f, 0.0f, false, true, -2.371f, -5.07f)
                lineToRelative(0.9f, -0.165f)
                arcTo(16.923f, 16.923f, 0.0f, false, false, 12.0f, 10.0f)
                curveToRelative(3.704f, 0.0f, 7.131f, -1.185f, 9.924f, -3.196f)
                lineToRelative(0.9f, 0.164f)
                arcToRelative(10.957f, 10.957f, 0.0f, false, true, -2.37f, 5.071f)
                lineToRelative(2.153f, 2.153f)
                lineToRelative(-1.415f, 1.415f)
                lineToRelative(-2.153f, -2.154f)
                arcToRelative(10.988f, 10.988f, 0.0f, false, true, -3.237f, 1.872f)
                lineToRelative(0.787f, 2.94f)
                lineToRelative(-1.931f, 0.517f)
                lineToRelative(-0.788f, -2.94f)
                arcToRelative(11.072f, 11.072f, 0.0f, false, true, -3.74f, 0.0f)
                close()
            }
        }
        .build()
        return _eyeCloseFill!!
    }

private var _eyeCloseFill: ImageVector? = null
