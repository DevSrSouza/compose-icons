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

public val SolidGroup.FlaskVial: ImageVector
    get() {
        if (_flaskVial != null) {
            return _flaskVial!!
        }
        _flaskVial = Builder(name = "FlaskVial", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.0f, 389.4f)
                curveToRelative(-9.8f, 16.0f, -15.0f, 34.3f, -15.0f, 53.1f)
                curveToRelative(-10.0f, 3.5f, -20.8f, 5.5f, -32.0f, 5.5f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(32.0f, 64.0f)
                curveTo(14.3f, 64.0f, 0.0f, 49.7f, 0.0f, 32.0f)
                reflectiveCurveTo(14.3f, 0.0f, 32.0f, 0.0f)
                lineTo(96.0f, 0.0f)
                horizontalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(224.0f, 309.9f)
                lineToRelative(-49.0f, 79.6f)
                close()
                moveTo(96.0f, 64.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(64.0f)
                lineTo(160.0f, 64.0f)
                lineTo(96.0f, 64.0f)
                close()
                moveTo(352.0f, 0.0f)
                lineTo(480.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(512.0f, 214.9f)
                lineTo(629.7f, 406.2f)
                curveToRelative(6.7f, 10.9f, 10.3f, 23.5f, 10.3f, 36.4f)
                curveToRelative(0.0f, 38.3f, -31.1f, 69.4f, -69.4f, 69.4f)
                lineTo(261.4f, 512.0f)
                curveToRelative(-38.3f, 0.0f, -69.4f, -31.1f, -69.4f, -69.4f)
                curveToRelative(0.0f, -12.8f, 3.6f, -25.4f, 10.3f, -36.4f)
                lineTo(320.0f, 214.9f)
                lineTo(320.0f, 64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(384.0f, 64.0f)
                lineTo(384.0f, 224.0f)
                curveToRelative(0.0f, 5.9f, -1.6f, 11.7f, -4.7f, 16.8f)
                lineTo(330.5f, 320.0f)
                horizontalLineToRelative(171.0f)
                lineToRelative(-48.8f, -79.2f)
                curveToRelative(-3.1f, -5.0f, -4.7f, -10.8f, -4.7f, -16.8f)
                lineTo(448.0f, 64.0f)
                lineTo(384.0f, 64.0f)
                close()
            }
        }
        .build()
        return _flaskVial!!
    }

private var _flaskVial: ImageVector? = null
