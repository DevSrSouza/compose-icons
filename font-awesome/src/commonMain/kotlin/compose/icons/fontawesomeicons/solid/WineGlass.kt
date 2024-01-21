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
                moveTo(32.1f, 29.3f)
                curveTo(33.5f, 12.8f, 47.4f, 0.0f, 64.0f, 0.0f)
                lineTo(256.0f, 0.0f)
                curveToRelative(16.6f, 0.0f, 30.5f, 12.8f, 31.9f, 29.3f)
                lineToRelative(14.0f, 168.4f)
                curveToRelative(6.0f, 72.0f, -42.5f, 135.2f, -109.9f, 150.6f)
                lineTo(192.0f, 448.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(160.0f, 512.0f)
                lineTo(80.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(48.0f)
                lineTo(128.0f, 348.4f)
                curveTo(60.6f, 333.0f, 12.1f, 269.8f, 18.1f, 197.8f)
                lineToRelative(14.0f, -168.4f)
                close()
                moveTo(88.1f, 128.0f)
                lineTo(231.9f, 128.0f)
                lineToRelative(-5.3f, -64.0f)
                lineTo(93.4f, 64.0f)
                lineToRelative(-5.3f, 64.0f)
                close()
            }
        }
        .build()
        return _wineGlass!!
    }

private var _wineGlass: ImageVector? = null
