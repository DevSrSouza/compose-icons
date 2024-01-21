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

public val SolidGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 320.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, -71.6f, 160.0f, -160.0f)
                curveToRelative(0.0f, -15.3f, -2.2f, -30.1f, -6.2f, -44.2f)
                curveToRelative(-3.1f, -10.8f, -16.4f, -13.2f, -24.3f, -5.3f)
                lineToRelative(-76.8f, 76.8f)
                curveToRelative(-3.0f, 3.0f, -7.1f, 4.7f, -11.3f, 4.7f)
                horizontalLineTo(336.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(118.6f)
                curveToRelative(0.0f, -4.2f, 1.7f, -8.3f, 4.7f, -11.3f)
                lineToRelative(76.8f, -76.8f)
                curveToRelative(7.9f, -7.9f, 5.4f, -21.2f, -5.3f, -24.3f)
                curveTo(382.1f, 2.2f, 367.3f, 0.0f, 352.0f, 0.0f)
                curveTo(263.6f, 0.0f, 192.0f, 71.6f, 192.0f, 160.0f)
                curveToRelative(0.0f, 19.1f, 3.4f, 37.5f, 9.5f, 54.5f)
                lineTo(19.9f, 396.1f)
                curveTo(7.2f, 408.8f, 0.0f, 426.1f, 0.0f, 444.1f)
                curveTo(0.0f, 481.6f, 30.4f, 512.0f, 67.9f, 512.0f)
                curveToRelative(18.0f, 0.0f, 35.3f, -7.2f, 48.0f, -19.9f)
                lineTo(297.5f, 310.5f)
                curveToRelative(17.0f, 6.2f, 35.4f, 9.5f, 54.5f, 9.5f)
                close()
                moveTo(80.0f, 408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
