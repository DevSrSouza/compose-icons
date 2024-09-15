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
                moveTo(384.0f, 64.0f)
                lineTo(192.0f, 64.0f)
                curveTo(85.96f, 64.0f, 0.0f, 149.96f, 0.0f, 256.0f)
                reflectiveCurveToRelative(85.96f, 192.0f, 192.0f, 192.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(106.04f, 0.0f, 192.0f, -85.96f, 192.0f, -192.0f)
                reflectiveCurveTo(490.04f, 64.0f, 384.0f, 64.0f)
                close()
                moveTo(64.0f, 256.0f)
                curveToRelative(0.0f, -70.74f, 57.25f, -128.0f, 128.0f, -128.0f)
                curveToRelative(70.74f, 0.0f, 128.0f, 57.25f, 128.0f, 128.0f)
                curveToRelative(0.0f, 70.74f, -57.25f, 128.0f, -128.0f, 128.0f)
                curveToRelative(-70.74f, 0.0f, -128.0f, -57.25f, -128.0f, -128.0f)
                close()
                moveTo(384.0f, 384.0f)
                horizontalLineToRelative(-48.9f)
                curveToRelative(65.22f, -72.86f, 65.24f, -183.12f, 0.0f, -256.0f)
                lineTo(384.0f, 128.0f)
                curveToRelative(70.74f, 0.0f, 128.0f, 57.25f, 128.0f, 128.0f)
                curveToRelative(0.0f, 70.74f, -57.25f, 128.0f, -128.0f, 128.0f)
                close()
            }
        }
        .build()
        return _toggleOff!!
    }

private var _toggleOff: ImageVector? = null
