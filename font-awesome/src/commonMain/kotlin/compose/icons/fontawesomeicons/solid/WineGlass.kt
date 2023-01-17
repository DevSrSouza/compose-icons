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

public val SolidGroup.WineGlass: ImageVector
    get() {
        if (_wineGlass != null) {
            return _wineGlass!!
        }
        _wineGlass = Builder(name = "WineGlass", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(47.4f, 0.0f, 33.5f, 12.8f, 32.1f, 29.3f)
                lineToRelative(-14.0f, 168.4f)
                curveToRelative(-6.0f, 72.0f, 42.5f, 135.2f, 109.9f, 150.6f)
                verticalLineTo(448.0f)
                horizontalLineTo(80.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(348.4f)
                curveToRelative(67.4f, -15.4f, 115.9f, -78.6f, 109.9f, -150.6f)
                lineToRelative(-14.0f, -168.4f)
                curveTo(286.5f, 12.8f, 272.6f, 0.0f, 256.0f, 0.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(88.1f, 128.0f)
                lineToRelative(5.3f, -64.0f)
                horizontalLineTo(226.6f)
                lineToRelative(5.3f, 64.0f)
                horizontalLineTo(88.1f)
                close()
            }
        }
        .build()
        return _wineGlass!!
    }

private var _wineGlass: ImageVector? = null
