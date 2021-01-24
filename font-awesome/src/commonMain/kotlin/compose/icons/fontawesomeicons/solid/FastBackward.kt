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

public val SolidGroup.FastBackward: ImageVector
    get() {
        if (_fastBackward != null) {
            return _fastBackward!!
        }
        _fastBackward = Builder(name = "FastBackward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 436.0f)
                verticalLineTo(76.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(151.9f)
                lineTo(235.5f, 71.4f)
                curveTo(256.1f, 54.3f, 288.0f, 68.6f, 288.0f, 96.0f)
                verticalLineToRelative(131.9f)
                lineTo(459.5f, 71.4f)
                curveTo(480.1f, 54.3f, 512.0f, 68.6f, 512.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 27.4f, -31.9f, 41.7f, -52.5f, 24.6f)
                lineTo(288.0f, 285.3f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 27.4f, -31.9f, 41.7f, -52.5f, 24.6f)
                lineTo(64.0f, 285.3f)
                verticalLineTo(436.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _fastBackward!!
    }

private var _fastBackward: ImageVector? = null
