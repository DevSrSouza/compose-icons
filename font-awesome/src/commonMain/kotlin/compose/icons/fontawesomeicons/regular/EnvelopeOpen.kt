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
                moveTo(255.4f, 48.2f)
                curveToRelative(0.2f, -0.1f, 0.4f, -0.2f, 0.6f, -0.2f)
                reflectiveCurveToRelative(0.4f, 0.1f, 0.6f, 0.2f)
                lineTo(460.6f, 194.0f)
                curveToRelative(2.1f, 1.5f, 3.4f, 3.9f, 3.4f, 6.5f)
                verticalLineToRelative(13.6f)
                lineTo(291.5f, 355.7f)
                curveToRelative(-20.7f, 17.0f, -50.4f, 17.0f, -71.1f, 0.0f)
                lineTo(48.0f, 214.1f)
                verticalLineTo(200.5f)
                curveToRelative(0.0f, -2.6f, 1.2f, -5.0f, 3.4f, -6.5f)
                lineTo(255.4f, 48.2f)
                close()
                moveTo(48.0f, 276.2f)
                lineTo(190.0f, 392.8f)
                curveToRelative(38.4f, 31.5f, 93.7f, 31.5f, 132.0f, 0.0f)
                lineTo(464.0f, 276.2f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                horizontalLineTo(56.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                verticalLineTo(276.2f)
                close()
                moveTo(256.0f, 0.0f)
                curveToRelative(-10.2f, 0.0f, -20.2f, 3.2f, -28.5f, 9.1f)
                lineTo(23.5f, 154.9f)
                curveTo(8.7f, 165.4f, 0.0f, 182.4f, 0.0f, 200.5f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 30.9f, 25.1f, 56.0f, 56.0f, 56.0f)
                horizontalLineTo(456.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, -25.1f, 56.0f, -56.0f)
                verticalLineTo(200.5f)
                curveToRelative(0.0f, -18.1f, -8.7f, -35.1f, -23.4f, -45.6f)
                lineTo(284.5f, 9.1f)
                curveTo(276.2f, 3.2f, 266.2f, 0.0f, 256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
