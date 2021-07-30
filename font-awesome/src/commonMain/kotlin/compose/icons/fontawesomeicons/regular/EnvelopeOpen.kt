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
                moveTo(494.586f, 164.516f)
                curveToRelative(-4.697f, -3.883f, -111.723f, -89.95f, -135.251f, -108.657f)
                curveTo(337.231f, 38.191f, 299.437f, 0.0f, 256.0f, 0.0f)
                curveToRelative(-43.205f, 0.0f, -80.636f, 37.717f, -103.335f, 55.859f)
                curveToRelative(-24.463f, 19.45f, -131.07f, 105.195f, -135.15f, 108.549f)
                arcTo(48.004f, 48.004f, 0.0f, false, false, 0.0f, 201.485f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 201.509f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -17.414f, -36.993f)
                close()
                moveTo(464.0f, 458.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(54.0f, 464.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(48.0f, 204.347f)
                curveToRelative(0.0f, -1.813f, 0.816f, -3.526f, 2.226f, -4.665f)
                curveToRelative(15.87f, -12.814f, 108.793f, -87.554f, 132.364f, -106.293f)
                curveTo(200.755f, 78.88f, 232.398f, 48.0f, 256.0f, 48.0f)
                curveToRelative(23.693f, 0.0f, 55.857f, 31.369f, 73.41f, 45.389f)
                curveToRelative(23.573f, 18.741f, 116.503f, 93.493f, 132.366f, 106.316f)
                arcToRelative(5.99f, 5.99f, 0.0f, false, true, 2.224f, 4.663f)
                lineTo(464.0f, 458.0f)
                close()
                moveTo(432.009f, 270.296f)
                curveToRelative(4.249f, 5.159f, 3.465f, 12.795f, -1.745f, 16.981f)
                curveToRelative(-28.975f, 23.283f, -59.274f, 47.597f, -70.929f, 56.863f)
                curveTo(336.636f, 362.283f, 299.205f, 400.0f, 256.0f, 400.0f)
                curveToRelative(-43.452f, 0.0f, -81.287f, -38.237f, -103.335f, -55.86f)
                curveToRelative(-11.279f, -8.967f, -41.744f, -33.413f, -70.927f, -56.865f)
                curveToRelative(-5.21f, -4.187f, -5.993f, -11.822f, -1.745f, -16.981f)
                lineToRelative(15.258f, -18.528f)
                curveToRelative(4.178f, -5.073f, 11.657f, -5.843f, 16.779f, -1.726f)
                curveToRelative(28.618f, 23.001f, 58.566f, 47.035f, 70.56f, 56.571f)
                curveTo(200.143f, 320.631f, 232.307f, 352.0f, 256.0f, 352.0f)
                curveToRelative(23.602f, 0.0f, 55.246f, -30.88f, 73.41f, -45.389f)
                curveToRelative(11.994f, -9.535f, 41.944f, -33.57f, 70.563f, -56.568f)
                curveToRelative(5.122f, -4.116f, 12.601f, -3.346f, 16.778f, 1.727f)
                lineToRelative(15.258f, 18.526f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
