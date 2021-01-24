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

public val SolidGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 56.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(128.0f, 56.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 32.0f)
                curveTo(10.745f, 32.0f, 0.0f, 42.745f, 0.0f, 56.0f)
                close()
                moveTo(40.0f, 256.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.745f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.745f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.745f, -24.0f, -24.0f)
                close()
                moveTo(312.0f, 512.0f)
                curveToRelative(-20.183f, 0.0f, -29.485f, -39.293f, -33.931f, -57.795f)
                curveToRelative(-5.206f, -21.666f, -10.589f, -44.07f, -25.393f, -58.902f)
                curveToRelative(-32.469f, -32.524f, -49.503f, -73.967f, -89.117f, -113.111f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, true, -3.558f, -8.521f)
                lineTo(160.001f, 59.901f)
                curveToRelative(0.0f, -6.541f, 5.243f, -11.878f, 11.783f, -11.998f)
                curveToRelative(15.831f, -0.29f, 36.694f, -9.079f, 52.651f, -16.178f)
                curveTo(256.189f, 17.598f, 295.709f, 0.017f, 343.995f, 0.0f)
                horizontalLineToRelative(2.844f)
                curveToRelative(42.777f, 0.0f, 93.363f, 0.413f, 113.774f, 29.737f)
                curveToRelative(8.392f, 12.057f, 10.446f, 27.034f, 6.148f, 44.632f)
                curveToRelative(16.312f, 17.053f, 25.063f, 48.863f, 16.382f, 74.757f)
                curveToRelative(17.544f, 23.432f, 19.143f, 56.132f, 9.308f, 79.469f)
                lineToRelative(0.11f, 0.11f)
                curveToRelative(11.893f, 11.949f, 19.523f, 31.259f, 19.439f, 49.197f)
                curveToRelative(-0.156f, 30.352f, -26.157f, 58.098f, -59.553f, 58.098f)
                lineTo(350.723f, 336.0f)
                curveTo(358.03f, 364.34f, 384.0f, 388.132f, 384.0f, 430.548f)
                curveTo(384.0f, 504.0f, 336.0f, 512.0f, 312.0f, 512.0f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
