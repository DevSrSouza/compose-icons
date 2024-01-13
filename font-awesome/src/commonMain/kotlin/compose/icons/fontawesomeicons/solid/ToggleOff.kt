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

public val SolidGroup.ToggleOff: ImageVector
    get() {
        if (_toggleOff != null) {
            return _toggleOff!!
        }
        _toggleOff = Builder(name = "ToggleOff", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 128.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-57.3f, 128.0f, -128.0f, 128.0f)
                horizontalLineTo(192.0f)
                curveToRelative(-70.7f, 0.0f, -128.0f, -57.3f, -128.0f, -128.0f)
                reflectiveCurveToRelative(57.3f, -128.0f, 128.0f, -128.0f)
                horizontalLineTo(384.0f)
                close()
                moveTo(576.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                horizontalLineTo(192.0f)
                curveTo(86.0f, 64.0f, 0.0f, 150.0f, 0.0f, 256.0f)
                reflectiveCurveTo(86.0f, 448.0f, 192.0f, 448.0f)
                horizontalLineTo(384.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, -86.0f, 192.0f, -192.0f)
                close()
                moveTo(192.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, -192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, 192.0f)
                close()
            }
        }
        .build()
        return _toggleOff!!
    }

private var _toggleOff: ImageVector? = null
