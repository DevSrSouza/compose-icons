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
                curveToRelative(0.0f, 15.464f, -12.536f, 28.0f, -28.0f, 28.0f)
                reflectiveCurveToRelative(-28.0f, -12.536f, -28.0f, -28.0f)
                curveToRelative(0.0f, -44.112f, 35.888f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.888f, 80.0f, 80.0f)
                curveToRelative(0.0f, 15.464f, -12.536f, 28.0f, -28.0f, 28.0f)
                reflectiveCurveToRelative(-28.0f, -12.536f, -28.0f, -28.0f)
                curveToRelative(0.0f, -13.234f, -10.767f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.766f, -24.0f, 24.0f)
                close()
                moveTo(240.0f, 84.0f)
                curveToRelative(-97.047f, 0.0f, -176.0f, 78.953f, -176.0f, 176.0f)
                curveToRelative(0.0f, 15.464f, 12.536f, 28.0f, 28.0f, 28.0f)
                reflectiveCurveToRelative(28.0f, -12.536f, 28.0f, -28.0f)
                curveToRelative(0.0f, -66.168f, 53.832f, -120.0f, 120.0f, -120.0f)
                reflectiveCurveToRelative(120.0f, 53.832f, 120.0f, 120.0f)
                curveToRelative(0.0f, 75.164f, -71.009f, 70.311f, -71.997f, 143.622f)
                lineTo(288.0f, 404.0f)
                curveToRelative(0.0f, 28.673f, -23.327f, 52.0f, -52.0f, 52.0f)
                curveToRelative(-15.464f, 0.0f, -28.0f, 12.536f, -28.0f, 28.0f)
                reflectiveCurveToRelative(12.536f, 28.0f, 28.0f, 28.0f)
                curveToRelative(59.475f, 0.0f, 107.876f, -48.328f, 108.0f, -107.774f)
                curveToRelative(0.595f, -34.428f, 72.0f, -48.24f, 72.0f, -144.226f)
                curveToRelative(0.0f, -97.047f, -78.953f, -176.0f, -176.0f, -176.0f)
                close()
                moveTo(508.485f, 31.799f)
                lineTo(480.2f, 3.515f)
                curveToRelative(-4.687f, -4.686f, -12.284f, -4.686f, -16.971f, 0.0f)
                lineTo(376.2f, 90.544f)
                curveToRelative(-4.686f, 4.686f, -4.686f, 12.284f, 0.0f, 16.971f)
                lineToRelative(28.285f, 28.285f)
                curveToRelative(4.686f, 4.686f, 12.284f, 4.686f, 16.97f, 0.0f)
                lineToRelative(87.03f, -87.029f)
                curveToRelative(4.687f, -4.688f, 4.687f, -12.286f, 0.0f, -16.972f)
                close()
                moveTo(168.97f, 314.745f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.97f, 0.0f)
                lineTo(3.515f, 463.23f)
                curveToRelative(-4.686f, 4.686f, -4.686f, 12.284f, 0.0f, 16.971f)
                lineTo(31.8f, 508.485f)
                curveToRelative(4.687f, 4.686f, 12.284f, 4.686f, 16.971f, 0.0f)
                lineTo(197.256f, 360.0f)
                curveToRelative(4.686f, -4.686f, 4.686f, -12.284f, 0.0f, -16.971f)
                lineToRelative(-28.286f, -28.284f)
                close()
            }
        }
        .build()
        return _deaf!!
    }

private var _deaf: ImageVector? = null
