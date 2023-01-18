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

public val RemixIcons.AppStoreFill: ImageVector
    get() {
        if (_appStoreFill != null) {
            return _appStoreFill!!
        }
        _appStoreFill = Builder(name = "AppStoreFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.823f, 15.343f)
                curveToRelative(-0.395f, -0.477f, -0.886f, -0.647f, -1.479f, -0.509f)
                lineToRelative(-0.15f, 0.041f)
                lineToRelative(-0.59f, 1.016f)
                arcToRelative(0.823f, 0.823f, 0.0f, false, false, 1.366f, 0.916f)
                lineToRelative(0.062f, -0.093f)
                lineToRelative(0.79f, -1.371f)
                close()
                moveTo(13.21f, 8.66f)
                curveToRelative(-0.488f, 0.404f, -0.98f, 1.597f, -0.29f, 2.787f)
                lineToRelative(3.04f, 5.266f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, false, 1.476f, -0.722f)
                lineToRelative(-0.049f, -0.1f)
                lineToRelative(-0.802f, -1.392f)
                horizontalLineToRelative(1.19f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, 0.822f, -0.823f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.72f, -0.816f)
                lineToRelative(-0.103f, -0.006f)
                horizontalLineToRelative(-2.14f)
                lineTo(13.44f, 9.057f)
                lineToRelative(-0.23f, -0.396f)
                close()
                moveTo(13.488f, 5.616f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, -1.063f, 0.21f)
                lineToRelative(-0.062f, 0.092f)
                lineToRelative(-0.367f, 0.633f)
                lineToRelative(-0.359f, -0.633f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, false, -1.476f, 0.722f)
                lineToRelative(0.049f, 0.1f)
                lineToRelative(0.838f, 1.457f)
                lineToRelative(-2.685f, 4.653f)
                lineTo(6.266f, 12.85f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.822f, 0.822f)
                curveToRelative(0.0f, 0.421f, 0.312f, 0.766f, 0.719f, 0.817f)
                lineToRelative(0.103f, 0.006f)
                horizontalLineToRelative(7.48f)
                curveToRelative(0.34f, -0.64f, -0.06f, -1.549f, -0.81f, -1.638f)
                lineToRelative(-0.121f, -0.007f)
                horizontalLineToRelative(-2.553f)
                lineToRelative(3.528f, -6.11f)
                arcToRelative(0.823f, 0.823f, 0.0f, false, false, -0.302f, -1.124f)
                close()
            }
        }
        .build()
        return _appStoreFill!!
    }

private var _appStoreFill: ImageVector? = null
