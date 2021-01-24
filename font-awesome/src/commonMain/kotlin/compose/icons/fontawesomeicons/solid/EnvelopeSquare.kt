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

public val SolidGroup.EnvelopeSquare: ImageVector
    get() {
        if (_envelopeSquare != null) {
            return _envelopeSquare!!
        }
        _envelopeSquare = Builder(name = "EnvelopeSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                horizontalLineTo(48.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(178.117f, 262.104f)
                curveTo(87.429f, 196.287f, 88.353f, 196.121f, 64.0f, 177.167f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(272.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                verticalLineToRelative(25.167f)
                curveToRelative(-24.371f, 18.969f, -23.434f, 19.124f, -114.117f, 84.938f)
                curveToRelative(-10.5f, 7.655f, -31.392f, 26.12f, -45.883f, 25.894f)
                curveToRelative(-14.503f, 0.218f, -35.367f, -18.227f, -45.883f, -25.895f)
                close()
                moveTo(384.0f, 217.775f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(88.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                verticalLineTo(217.775f)
                curveToRelative(13.958f, 10.794f, 33.329f, 25.236f, 95.303f, 70.214f)
                curveToRelative(14.162f, 10.341f, 37.975f, 32.145f, 64.694f, 32.01f)
                curveToRelative(26.887f, 0.134f, 51.037f, -22.041f, 64.72f, -32.025f)
                curveToRelative(61.958f, -44.965f, 81.325f, -59.406f, 95.283f, -70.199f)
                close()
            }
        }
        .build()
        return _envelopeSquare!!
    }

private var _envelopeSquare: ImageVector? = null
