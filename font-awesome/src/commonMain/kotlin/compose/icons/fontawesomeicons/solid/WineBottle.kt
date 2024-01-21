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

public val SolidGroup.WineBottle: ImageVector
    get() {
        if (_wineBottle != null) {
            return _wineBottle!!
        }
        _wineBottle = Builder(name = "WineBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(393.4f, 9.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                curveToRelative(-11.8f, 11.8f, -30.7f, 12.5f, -43.2f, 1.9f)
                lineToRelative(-9.5f, 9.5f)
                lineToRelative(-48.8f, 48.8f)
                curveToRelative(-9.2f, 9.2f, -11.5f, 22.9f, -8.6f, 35.6f)
                curveToRelative(9.4f, 40.9f, -1.9f, 85.6f, -33.8f, 117.5f)
                lineTo(197.3f, 493.3f)
                curveToRelative(-25.0f, 25.0f, -65.5f, 25.0f, -90.5f, 0.0f)
                lineToRelative(-88.0f, -88.0f)
                curveToRelative(-25.0f, -25.0f, -25.0f, -65.5f, 0.0f, -90.5f)
                lineTo(180.2f, 153.3f)
                curveToRelative(31.9f, -31.9f, 76.6f, -43.1f, 117.5f, -33.8f)
                curveToRelative(12.6f, 2.9f, 26.4f, 0.5f, 35.5f, -8.6f)
                lineToRelative(48.8f, -48.8f)
                lineToRelative(9.5f, -9.5f)
                curveToRelative(-10.6f, -12.6f, -10.0f, -31.4f, 1.9f, -43.2f)
                close()
                moveTo(99.3f, 347.3f)
                lineToRelative(65.4f, 65.4f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(97.4f, -97.4f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-65.4f, -65.4f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                lineTo(99.3f, 324.7f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null
