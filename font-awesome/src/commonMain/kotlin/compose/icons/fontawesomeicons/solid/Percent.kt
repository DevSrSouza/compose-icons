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

public val SolidGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 224.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveTo(173.9f, 0.0f, 112.0f, 0.0f)
                reflectiveCurveTo(0.0f, 50.1f, 0.0f, 112.0f)
                reflectiveCurveToRelative(50.1f, 112.0f, 112.0f, 112.0f)
                close()
                moveTo(112.0f, 64.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                close()
                moveTo(336.0f, 288.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, 50.1f, -112.0f, 112.0f)
                reflectiveCurveToRelative(50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveToRelative(-50.1f, -112.0f, -112.0f, -112.0f)
                close()
                moveTo(336.0f, 448.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(392.3f, 0.2f)
                lineToRelative(31.6f, -0.1f)
                curveToRelative(19.4f, -0.1f, 30.9f, 21.8f, 19.7f, 37.8f)
                lineTo(77.4f, 501.6f)
                arcToRelative(23.95f, 23.95f, 0.0f, false, true, -19.6f, 10.2f)
                lineToRelative(-33.4f, 0.1f)
                curveToRelative(-19.5f, 0.0f, -30.9f, -21.9f, -19.7f, -37.8f)
                lineToRelative(368.0f, -463.7f)
                curveTo(377.2f, 4.0f, 384.5f, 0.2f, 392.3f, 0.2f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
