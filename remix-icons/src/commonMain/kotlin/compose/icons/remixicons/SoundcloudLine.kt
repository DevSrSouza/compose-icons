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

public val RemixIcons.SoundcloudLine: ImageVector
    get() {
        if (_soundcloudLine != null) {
            return _soundcloudLine!!
        }
        _soundcloudLine = Builder(name = "SoundcloudLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(10.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.996f, 5.775f)
                lineToRelative(0.003f, 0.26f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.307f, 6.96f)
                lineTo(20.5f, 19.0f)
                horizontalLineToRelative(-3.501f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(3.447f)
                lineToRelative(0.138f, -0.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.267f, -2.957f)
                lineToRelative(-0.135f, -0.026f)
                lineToRelative(-1.77f, -0.252f)
                lineToRelative(0.053f, -1.787f)
                lineToRelative(-0.004f, -0.176f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.2f, 8.005f)
                lineTo(15.0f, 8.0f)
                curveToRelative(-0.268f, 0.0f, -0.531f, 0.026f, -0.788f, 0.077f)
                lineTo(14.0f, 8.126f)
                lineTo(14.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineTo(13.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineToRelative(-0.001f, -11.197f)
                arcTo(5.972f, 5.972f, 0.0f, false, true, 15.0f, 6.0f)
                close()
                moveTo(1.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _soundcloudLine!!
    }

private var _soundcloudLine: ImageVector? = null
