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

public val SolidGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 32.0f)
                curveToRelative(13.5f, 0.0f, 26.3f, 5.6f, 35.4f, 15.6f)
                lineToRelative(176.0f, 192.0f)
                curveToRelative(12.9f, 14.0f, 16.2f, 34.3f, 8.6f, 51.8f)
                reflectiveCurveTo(419.0f, 320.0f, 400.0f, 320.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-19.0f, 0.0f, -36.3f, -11.2f, -43.9f, -28.7f)
                reflectiveCurveToRelative(-4.3f, -37.7f, 8.6f, -51.8f)
                lineToRelative(176.0f, -192.0f)
                curveTo(197.7f, 37.6f, 210.5f, 32.0f, 224.0f, 32.0f)
                close()
                moveTo(0.0f, 432.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineTo(400.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
