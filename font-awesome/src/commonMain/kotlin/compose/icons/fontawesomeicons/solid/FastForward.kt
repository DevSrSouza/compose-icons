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

public val SolidGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 76.0f)
                verticalLineToRelative(360.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineTo(284.1f)
                lineTo(276.5f, 440.6f)
                curveToRelative(-20.6f, 17.2f, -52.5f, 2.8f, -52.5f, -24.6f)
                verticalLineTo(284.1f)
                lineTo(52.5f, 440.6f)
                curveTo(31.9f, 457.8f, 0.0f, 443.4f, 0.0f, 416.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -27.4f, 31.9f, -41.7f, 52.5f, -24.6f)
                lineTo(224.0f, 226.8f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -27.4f, 31.9f, -41.7f, 52.5f, -24.6f)
                lineTo(448.0f, 226.8f)
                verticalLineTo(76.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
