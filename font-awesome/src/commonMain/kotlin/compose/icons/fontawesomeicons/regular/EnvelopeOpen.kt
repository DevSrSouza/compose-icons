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
                moveTo(494.59f, 164.52f)
                curveToRelative(-4.7f, -3.88f, -111.72f, -89.95f, -135.25f, -108.66f)
                curveTo(337.23f, 38.19f, 299.44f, 0.0f, 256.0f, 0.0f)
                curveToRelative(-43.21f, 0.0f, -80.64f, 37.72f, -103.33f, 55.86f)
                curveToRelative(-24.46f, 19.45f, -131.07f, 105.19f, -135.15f, 108.55f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 0.0f, 201.49f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 201.51f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -17.41f, -36.99f)
                close()
                moveTo(464.0f, 458.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(54.0f, 464.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(48.0f, 204.35f)
                curveToRelative(0.0f, -1.81f, 0.82f, -3.53f, 2.23f, -4.66f)
                curveToRelative(15.87f, -12.81f, 108.79f, -87.55f, 132.36f, -106.29f)
                curveTo(200.76f, 78.88f, 232.4f, 48.0f, 256.0f, 48.0f)
                curveToRelative(23.69f, 0.0f, 55.86f, 31.37f, 73.41f, 45.39f)
                curveToRelative(23.57f, 18.74f, 116.5f, 93.49f, 132.37f, 106.32f)
                arcToRelative(5.99f, 5.99f, 0.0f, false, true, 2.22f, 4.66f)
                lineTo(464.0f, 458.0f)
                close()
                moveTo(432.01f, 270.3f)
                curveToRelative(4.25f, 5.16f, 3.46f, 12.8f, -1.75f, 16.98f)
                curveToRelative(-28.98f, 23.28f, -59.27f, 47.6f, -70.93f, 56.86f)
                curveTo(336.64f, 362.28f, 299.2f, 400.0f, 256.0f, 400.0f)
                curveToRelative(-43.45f, 0.0f, -81.29f, -38.24f, -103.33f, -55.86f)
                curveToRelative(-11.28f, -8.97f, -41.74f, -33.41f, -70.93f, -56.87f)
                curveToRelative(-5.21f, -4.19f, -5.99f, -11.82f, -1.75f, -16.98f)
                lineToRelative(15.26f, -18.53f)
                curveToRelative(4.18f, -5.07f, 11.66f, -5.84f, 16.78f, -1.73f)
                curveToRelative(28.62f, 23.0f, 58.57f, 47.03f, 70.56f, 56.57f)
                curveTo(200.14f, 320.63f, 232.31f, 352.0f, 256.0f, 352.0f)
                curveToRelative(23.6f, 0.0f, 55.25f, -30.88f, 73.41f, -45.39f)
                curveToRelative(11.99f, -9.53f, 41.94f, -33.57f, 70.56f, -56.57f)
                curveToRelative(5.12f, -4.12f, 12.6f, -3.35f, 16.78f, 1.73f)
                lineToRelative(15.26f, 18.53f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
