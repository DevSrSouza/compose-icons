package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(493.6f, 163.0f)
                curveToRelative(-24.88f, -19.62f, -45.5f, -35.37f, -164.3f, -121.6f)
                curveTo(312.7f, 29.21f, 279.7f, 0.0f, 256.4f, 0.0f)
                horizontalLineTo(255.6f)
                curveTo(232.3f, 0.0f, 199.3f, 29.21f, 182.6f, 41.38f)
                curveTo(63.88f, 127.6f, 43.25f, 143.4f, 18.38f, 163.0f)
                curveTo(6.75f, 172.0f, 0.0f, 186.0f, 0.0f, 200.8f)
                verticalLineToRelative(247.2f)
                curveTo(0.0f, 483.3f, 28.65f, 512.0f, 64.0f, 512.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.67f, 64.0f, -64.01f)
                verticalLineTo(200.8f)
                curveTo(512.0f, 186.0f, 505.3f, 172.0f, 493.6f, 163.0f)
                close()
                moveTo(464.0f, 448.0f)
                curveToRelative(0.0f, 8.822f, -7.178f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.178f, -16.0f, -16.0f)
                verticalLineTo(276.7f)
                lineToRelative(136.1f, 113.4f)
                curveTo(204.3f, 406.8f, 229.8f, 416.0f, 256.0f, 416.0f)
                reflectiveCurveToRelative(51.75f, -9.211f, 71.97f, -26.01f)
                lineTo(464.0f, 276.7f)
                verticalLineTo(448.0f)
                close()
                moveTo(464.0f, 214.2f)
                lineToRelative(-166.8f, 138.1f)
                curveToRelative(-23.19f, 19.28f, -59.34f, 19.27f, -82.47f, 0.016f)
                lineTo(48.0f, 214.2f)
                lineToRelative(0.105f, -13.48f)
                curveToRelative(23.24f, -18.33f, 42.25f, -32.97f, 162.9f, -120.6f)
                curveToRelative(3.082f, -2.254f, 6.674f, -5.027f, 10.63f, -8.094f)
                curveTo(229.4f, 65.99f, 246.7f, 52.59f, 256.0f, 48.62f)
                curveToRelative(9.312f, 3.973f, 26.62f, 17.37f, 34.41f, 23.41f)
                curveToRelative(3.959f, 3.066f, 7.553f, 5.84f, 10.76f, 8.186f)
                curveTo(421.6f, 167.7f, 440.7f, 182.4f, 464.0f, 200.8f)
                verticalLineTo(214.2f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
