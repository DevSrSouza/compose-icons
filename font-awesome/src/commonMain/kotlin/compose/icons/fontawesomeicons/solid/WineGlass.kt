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
        _wineGlass = Builder(name = "WineGlass", defaultWidth = 288.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 464.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineTo(346.81f)
                curveToRelative(68.47f, -15.89f, 118.05f, -79.91f, 111.4f, -154.16f)
                lineToRelative(-15.95f, -178.1f)
                curveTo(270.71f, 6.31f, 263.9f, 0.0f, 255.74f, 0.0f)
                horizontalLineTo(32.26f)
                curveToRelative(-8.15f, 0.0f, -14.97f, 6.31f, -15.7f, 14.55f)
                lineTo(0.6f, 192.66f)
                curveTo(-6.05f, 266.91f, 43.53f, 330.93f, 112.0f, 346.82f)
                verticalLineTo(464.0f)
                horizontalLineTo(72.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, 17.91f, -40.0f, 40.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(208.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                curveToRelative(0.0f, -22.09f, -17.91f, -40.0f, -40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _wineGlass!!
    }

private var _wineGlass: ImageVector? = null
