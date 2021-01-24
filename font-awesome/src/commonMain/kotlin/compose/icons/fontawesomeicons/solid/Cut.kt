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

public val SolidGroup.Cut: ImageVector
    get() {
        if (_cut != null) {
            return _cut!!
        }
        _cut = Builder(name = "Cut", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(278.06f, 256.0f)
                lineTo(444.48f, 89.57f)
                curveToRelative(4.69f, -4.69f, 4.69f, -12.29f, 0.0f, -16.97f)
                curveToRelative(-32.8f, -32.8f, -85.99f, -32.8f, -118.79f, 0.0f)
                lineTo(210.18f, 188.12f)
                lineToRelative(-24.86f, -24.86f)
                curveToRelative(4.31f, -10.92f, 6.68f, -22.81f, 6.68f, -35.26f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveTo(0.0f, 74.98f, 0.0f, 128.0f)
                reflectiveCurveToRelative(42.98f, 96.0f, 96.0f, 96.0f)
                curveToRelative(4.54f, 0.0f, 8.99f, -0.32f, 13.36f, -0.93f)
                lineTo(142.29f, 256.0f)
                lineToRelative(-32.93f, 32.93f)
                curveToRelative(-4.37f, -0.61f, -8.83f, -0.93f, -13.36f, -0.93f)
                curveToRelative(-53.02f, 0.0f, -96.0f, 42.98f, -96.0f, 96.0f)
                reflectiveCurveToRelative(42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                curveToRelative(0.0f, -12.45f, -2.37f, -24.34f, -6.68f, -35.26f)
                lineToRelative(24.86f, -24.86f)
                lineTo(325.69f, 439.4f)
                curveToRelative(32.8f, 32.8f, 85.99f, 32.8f, 118.79f, 0.0f)
                curveToRelative(4.69f, -4.68f, 4.69f, -12.28f, 0.0f, -16.97f)
                lineTo(278.06f, 256.0f)
                close()
                moveTo(96.0f, 160.0f)
                curveToRelative(-17.64f, 0.0f, -32.0f, -14.36f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.36f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.36f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.36f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(96.0f, 416.0f)
                curveToRelative(-17.64f, 0.0f, -32.0f, -14.36f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.36f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.36f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.36f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _cut!!
    }

private var _cut: ImageVector? = null
