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

public val SolidGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.4f, 21.9f)
                curveToRelative(5.6f, 16.8f, -3.5f, 34.9f, -20.2f, 40.5f)
                lineTo(96.0f, 71.1f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                verticalLineTo(71.1f)
                lineToRelative(-26.1f, -8.7f)
                curveToRelative(-16.8f, -5.6f, -25.8f, -23.7f, -20.2f, -40.5f)
                reflectiveCurveToRelative(23.7f, -25.8f, 40.5f, -20.2f)
                lineToRelative(26.1f, 8.7f)
                curveTo(334.4f, 19.1f, 352.0f, 43.5f, 352.0f, 71.1f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 77.2f, -54.6f, 141.6f, -127.3f, 156.7f)
                curveTo(231.0f, 404.6f, 278.4f, 448.0f, 336.0f, 448.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                verticalLineTo(265.3f)
                curveToRelative(-28.3f, -12.3f, -48.0f, -40.5f, -48.0f, -73.3f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                verticalLineTo(336.0f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                curveToRelative(-92.9f, 0.0f, -168.9f, -71.9f, -175.5f, -163.1f)
                curveTo(87.2f, 334.2f, 32.0f, 269.6f, 32.0f, 192.0f)
                verticalLineTo(71.1f)
                curveToRelative(0.0f, -27.5f, 17.6f, -52.0f, 43.8f, -60.7f)
                lineToRelative(26.1f, -8.7f)
                curveToRelative(16.8f, -5.6f, 34.9f, 3.5f, 40.5f, 20.2f)
                close()
                moveTo(480.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
