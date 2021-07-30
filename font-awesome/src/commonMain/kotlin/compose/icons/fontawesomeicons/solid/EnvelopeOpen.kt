package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 464.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 200.724f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 18.387f, -37.776f)
                curveToRelative(24.913f, -19.529f, 45.501f, -35.365f, 164.2f, -121.511f)
                curveTo(199.412f, 29.17f, 232.797f, -0.347f, 256.0f, 0.003f)
                curveToRelative(23.198f, -0.354f, 56.596f, 29.172f, 73.413f, 41.433f)
                curveToRelative(118.687f, 86.137f, 139.303f, 101.995f, 164.2f, 121.512f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 512.0f, 200.724f)
                lineTo(512.0f, 464.0f)
                close()
                moveTo(446.334f, 267.395f)
                curveToRelative(-2.563f, -3.728f, -7.7f, -4.595f, -11.339f, -1.907f)
                curveToRelative(-22.845f, 16.873f, -55.462f, 40.705f, -105.582f, 77.079f)
                curveToRelative(-16.825f, 12.266f, -50.21f, 41.781f, -73.413f, 41.43f)
                curveToRelative(-23.211f, 0.344f, -56.559f, -29.143f, -73.413f, -41.43f)
                curveToRelative(-50.114f, -36.37f, -82.734f, -60.204f, -105.582f, -77.079f)
                curveToRelative(-3.639f, -2.688f, -8.776f, -1.821f, -11.339f, 1.907f)
                lineToRelative(-9.072f, 13.196f)
                arcToRelative(7.998f, 7.998f, 0.0f, false, false, 1.839f, 10.967f)
                curveToRelative(22.887f, 16.899f, 55.454f, 40.69f, 105.303f, 76.868f)
                curveToRelative(20.274f, 14.781f, 56.524f, 47.813f, 92.264f, 47.573f)
                curveToRelative(35.724f, 0.242f, 71.961f, -32.771f, 92.263f, -47.573f)
                curveToRelative(49.85f, -36.179f, 82.418f, -59.97f, 105.303f, -76.868f)
                arcToRelative(7.998f, 7.998f, 0.0f, false, false, 1.839f, -10.967f)
                lineToRelative(-9.071f, -13.196f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
