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
                moveTo(178.12f, 262.1f)
                curveTo(87.43f, 196.29f, 88.35f, 196.12f, 64.0f, 177.17f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(272.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                verticalLineToRelative(25.17f)
                curveToRelative(-24.37f, 18.97f, -23.43f, 19.12f, -114.12f, 84.94f)
                curveToRelative(-10.5f, 7.66f, -31.39f, 26.12f, -45.88f, 25.89f)
                curveToRelative(-14.5f, 0.22f, -35.37f, -18.23f, -45.88f, -25.9f)
                close()
                moveTo(384.0f, 217.77f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(88.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                verticalLineTo(217.77f)
                curveToRelative(13.96f, 10.79f, 33.33f, 25.24f, 95.3f, 70.21f)
                curveToRelative(14.16f, 10.34f, 37.97f, 32.15f, 64.69f, 32.01f)
                curveToRelative(26.89f, 0.13f, 51.04f, -22.04f, 64.72f, -32.03f)
                curveToRelative(61.96f, -44.97f, 81.32f, -59.41f, 95.28f, -70.2f)
                close()
            }
        }
        .build()
        return _envelopeSquare!!
    }

private var _envelopeSquare: ImageVector? = null
