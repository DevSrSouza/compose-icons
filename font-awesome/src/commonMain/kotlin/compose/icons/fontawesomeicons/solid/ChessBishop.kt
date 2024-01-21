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

public val SolidGroup.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 0.0f)
                curveTo(110.3f, 0.0f, 96.0f, 14.3f, 96.0f, 32.0f)
                curveToRelative(0.0f, 16.1f, 11.9f, 29.4f, 27.4f, 31.7f)
                curveTo(78.4f, 106.8f, 8.0f, 190.0f, 8.0f, 288.0f)
                curveToRelative(0.0f, 47.4f, 30.8f, 72.3f, 56.0f, 84.7f)
                verticalLineTo(400.0f)
                horizontalLineTo(256.0f)
                verticalLineTo(372.7f)
                curveToRelative(25.2f, -12.5f, 56.0f, -37.4f, 56.0f, -84.7f)
                curveToRelative(0.0f, -37.3f, -10.2f, -72.4f, -25.3f, -104.1f)
                lineToRelative(-99.4f, 99.4f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineTo(270.8f, 154.6f)
                curveToRelative(-23.2f, -38.1f, -51.8f, -69.5f, -74.2f, -90.9f)
                curveTo(212.1f, 61.4f, 224.0f, 48.1f, 224.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(128.0f)
                close()
                moveTo(48.0f, 432.0f)
                lineTo(6.6f, 473.4f)
                curveToRelative(-4.2f, 4.2f, -6.6f, 10.0f, -6.6f, 16.0f)
                curveTo(0.0f, 501.9f, 10.1f, 512.0f, 22.6f, 512.0f)
                horizontalLineTo(297.4f)
                curveToRelative(12.5f, 0.0f, 22.6f, -10.1f, 22.6f, -22.6f)
                curveToRelative(0.0f, -6.0f, -2.4f, -11.8f, -6.6f, -16.0f)
                lineTo(272.0f, 432.0f)
                horizontalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
