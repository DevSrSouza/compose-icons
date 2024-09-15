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
                lineTo(0.0f, 200.72f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 18.39f, -37.78f)
                curveToRelative(24.91f, -19.53f, 45.5f, -35.37f, 164.2f, -121.51f)
                curveTo(199.41f, 29.17f, 232.8f, -0.35f, 256.0f, 0.0f)
                curveToRelative(23.2f, -0.35f, 56.6f, 29.17f, 73.41f, 41.43f)
                curveToRelative(118.69f, 86.14f, 139.3f, 102.0f, 164.2f, 121.51f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 512.0f, 200.72f)
                lineTo(512.0f, 464.0f)
                close()
                moveTo(446.33f, 267.4f)
                curveToRelative(-2.56f, -3.73f, -7.7f, -4.59f, -11.34f, -1.91f)
                curveToRelative(-22.84f, 16.87f, -55.46f, 40.71f, -105.58f, 77.08f)
                curveToRelative(-16.83f, 12.27f, -50.21f, 41.78f, -73.41f, 41.43f)
                curveToRelative(-23.21f, 0.34f, -56.56f, -29.14f, -73.41f, -41.43f)
                curveToRelative(-50.11f, -36.37f, -82.73f, -60.2f, -105.58f, -77.08f)
                curveToRelative(-3.64f, -2.69f, -8.78f, -1.82f, -11.34f, 1.91f)
                lineToRelative(-9.07f, 13.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.84f, 10.97f)
                curveToRelative(22.89f, 16.9f, 55.45f, 40.69f, 105.3f, 76.87f)
                curveToRelative(20.27f, 14.78f, 56.52f, 47.81f, 92.26f, 47.57f)
                curveToRelative(35.72f, 0.24f, 71.96f, -32.77f, 92.26f, -47.57f)
                curveToRelative(49.85f, -36.18f, 82.42f, -59.97f, 105.3f, -76.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.84f, -10.97f)
                lineToRelative(-9.07f, -13.2f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
