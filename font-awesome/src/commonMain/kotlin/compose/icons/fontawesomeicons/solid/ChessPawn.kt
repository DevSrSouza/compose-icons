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

public val SolidGroup.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.5f, 224.0f)
                curveToRelative(29.2f, -18.4f, 48.5f, -50.9f, 48.5f, -88.0f)
                curveToRelative(0.0f, -57.4f, -46.6f, -104.0f, -104.0f, -104.0f)
                reflectiveCurveTo(56.0f, 78.6f, 56.0f, 136.0f)
                curveToRelative(0.0f, 37.1f, 19.4f, 69.6f, 48.5f, 88.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                curveToRelative(0.0f, 16.5f, 12.5f, 30.0f, 28.5f, 31.8f)
                lineTo(80.0f, 400.0f)
                horizontalLineTo(240.0f)
                lineTo(227.5f, 287.8f)
                curveToRelative(16.0f, -1.8f, 28.5f, -15.3f, 28.5f, -31.8f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(22.6f, 473.4f)
                curveToRelative(-4.2f, 4.2f, -6.6f, 10.0f, -6.6f, 16.0f)
                curveTo(16.0f, 501.9f, 26.1f, 512.0f, 38.6f, 512.0f)
                horizontalLineTo(281.4f)
                curveToRelative(12.5f, 0.0f, 22.6f, -10.1f, 22.6f, -22.6f)
                curveToRelative(0.0f, -6.0f, -2.4f, -11.8f, -6.6f, -16.0f)
                lineTo(256.0f, 432.0f)
                horizontalLineTo(64.0f)
                lineTo(22.6f, 473.4f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
