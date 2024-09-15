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

public val SolidGroup.Deaf: ImageVector
    get() {
        if (_deaf != null) {
            return _deaf!!
        }
        _deaf = Builder(name = "Deaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 260.0f)
                curveToRelative(0.0f, 15.46f, -12.54f, 28.0f, -28.0f, 28.0f)
                reflectiveCurveToRelative(-28.0f, -12.54f, -28.0f, -28.0f)
                curveToRelative(0.0f, -44.11f, 35.89f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.89f, 80.0f, 80.0f)
                curveToRelative(0.0f, 15.46f, -12.54f, 28.0f, -28.0f, 28.0f)
                reflectiveCurveToRelative(-28.0f, -12.54f, -28.0f, -28.0f)
                curveToRelative(0.0f, -13.23f, -10.77f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.77f, -24.0f, 24.0f)
                close()
                moveTo(240.0f, 84.0f)
                curveToRelative(-97.05f, 0.0f, -176.0f, 78.95f, -176.0f, 176.0f)
                curveToRelative(0.0f, 15.46f, 12.54f, 28.0f, 28.0f, 28.0f)
                reflectiveCurveToRelative(28.0f, -12.54f, 28.0f, -28.0f)
                curveToRelative(0.0f, -66.17f, 53.83f, -120.0f, 120.0f, -120.0f)
                reflectiveCurveToRelative(120.0f, 53.83f, 120.0f, 120.0f)
                curveToRelative(0.0f, 75.16f, -71.01f, 70.31f, -72.0f, 143.62f)
                lineTo(288.0f, 404.0f)
                curveToRelative(0.0f, 28.67f, -23.33f, 52.0f, -52.0f, 52.0f)
                curveToRelative(-15.46f, 0.0f, -28.0f, 12.54f, -28.0f, 28.0f)
                reflectiveCurveToRelative(12.54f, 28.0f, 28.0f, 28.0f)
                curveToRelative(59.47f, 0.0f, 107.88f, -48.33f, 108.0f, -107.77f)
                curveToRelative(0.6f, -34.43f, 72.0f, -48.24f, 72.0f, -144.23f)
                curveToRelative(0.0f, -97.05f, -78.95f, -176.0f, -176.0f, -176.0f)
                close()
                moveTo(508.48f, 31.8f)
                lineTo(480.2f, 3.52f)
                curveToRelative(-4.69f, -4.69f, -12.28f, -4.69f, -16.97f, 0.0f)
                lineTo(376.2f, 90.54f)
                curveToRelative(-4.69f, 4.69f, -4.69f, 12.28f, 0.0f, 16.97f)
                lineToRelative(28.28f, 28.28f)
                curveToRelative(4.69f, 4.69f, 12.28f, 4.69f, 16.97f, 0.0f)
                lineToRelative(87.03f, -87.03f)
                curveToRelative(4.69f, -4.69f, 4.69f, -12.29f, 0.0f, -16.97f)
                close()
                moveTo(168.97f, 314.74f)
                curveToRelative(-4.69f, -4.69f, -12.28f, -4.69f, -16.97f, 0.0f)
                lineTo(3.52f, 463.23f)
                curveToRelative(-4.69f, 4.69f, -4.69f, 12.28f, 0.0f, 16.97f)
                lineTo(31.8f, 508.48f)
                curveToRelative(4.69f, 4.69f, 12.28f, 4.69f, 16.97f, 0.0f)
                lineTo(197.26f, 360.0f)
                curveToRelative(4.69f, -4.69f, 4.69f, -12.28f, 0.0f, -16.97f)
                lineToRelative(-28.29f, -28.28f)
                close()
            }
        }
        .build()
        return _deaf!!
    }

private var _deaf: ImageVector? = null
