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

public val SolidGroup.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 216.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(176.0f, 168.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(160.0f, 296.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(176.0f, 264.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(256.0f, 417.13f)
                curveToRelative(-16.42f, 0.0f, -32.84f, -5.06f, -46.86f, -15.19f)
                lineTo(0.0f, 250.86f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 250.86f)
                lineTo(302.86f, 401.94f)
                curveToRelative(-14.02f, 10.12f, -30.44f, 15.19f, -46.86f, 15.19f)
                close()
                moveTo(493.61f, 162.95f)
                curveToRelative(-8.85f, -6.94f, -17.24f, -13.47f, -29.61f, -22.81f)
                lineTo(464.0f, 96.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                horizontalLineToRelative(-77.55f)
                curveToRelative(-3.04f, -2.2f, -5.87f, -4.26f, -9.04f, -6.56f)
                curveTo(312.6f, 29.17f, 279.2f, -0.35f, 256.0f, 0.0f)
                curveToRelative(-23.2f, -0.35f, -56.59f, 29.17f, -73.41f, 41.44f)
                curveToRelative(-3.17f, 2.3f, -6.0f, 4.36f, -9.04f, 6.56f)
                lineTo(96.0f, 48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(44.14f)
                curveToRelative(-12.37f, 9.33f, -20.76f, 15.87f, -29.61f, 22.81f)
                arcTo(47.995f, 47.995f, 0.0f, false, false, 0.0f, 200.72f)
                verticalLineToRelative(10.65f)
                lineToRelative(96.0f, 69.35f)
                lineTo(96.0f, 96.0f)
                horizontalLineToRelative(320.0f)
                verticalLineToRelative(184.72f)
                lineToRelative(96.0f, -69.35f)
                verticalLineToRelative(-10.65f)
                curveToRelative(0.0f, -14.74f, -6.78f, -28.67f, -18.39f, -37.77f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
