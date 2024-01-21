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

public val SolidGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                horizontalLineTo(160.0f)
                horizontalLineTo(128.0f)
                curveTo(110.3f, 0.0f, 96.0f, 14.3f, 96.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                verticalLineTo(196.8f)
                curveToRelative(0.0f, 11.8f, -3.3f, 23.5f, -9.5f, 33.5f)
                lineTo(10.3f, 406.2f)
                curveTo(3.6f, 417.2f, 0.0f, 429.7f, 0.0f, 442.6f)
                curveTo(0.0f, 480.9f, 31.1f, 512.0f, 69.4f, 512.0f)
                horizontalLineTo(378.6f)
                curveToRelative(38.3f, 0.0f, 69.4f, -31.1f, 69.4f, -69.4f)
                curveToRelative(0.0f, -12.8f, -3.6f, -25.4f, -10.3f, -36.4f)
                lineTo(329.5f, 230.4f)
                curveToRelative(-6.2f, -10.1f, -9.5f, -21.7f, -9.5f, -33.5f)
                verticalLineTo(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(288.0f)
                close()
                moveTo(192.0f, 196.8f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(196.8f)
                curveToRelative(0.0f, 23.7f, 6.6f, 46.9f, 19.0f, 67.1f)
                lineTo(309.5f, 320.0f)
                horizontalLineToRelative(-171.0f)
                lineTo(173.0f, 263.9f)
                curveToRelative(12.4f, -20.2f, 19.0f, -43.4f, 19.0f, -67.1f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
