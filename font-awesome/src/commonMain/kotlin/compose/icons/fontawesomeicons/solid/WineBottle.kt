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
                moveTo(507.31f, 72.57f)
                lineTo(439.43f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineToRelative(-22.63f, 22.63f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(-76.67f, 76.67f)
                curveToRelative(-46.58f, -19.7f, -102.4f, -10.73f, -140.37f, 27.23f)
                lineTo(18.75f, 312.23f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.52f, 0.0f, 90.51f)
                lineToRelative(90.51f, 90.51f)
                curveToRelative(24.99f, 24.99f, 65.52f, 24.99f, 90.51f, 0.0f)
                lineToRelative(158.39f, -158.39f)
                curveToRelative(37.96f, -37.96f, 46.93f, -93.79f, 27.23f, -140.37f)
                lineToRelative(76.67f, -76.67f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(22.63f, -22.63f)
                curveToRelative(6.24f, -6.24f, 6.24f, -16.37f, -0.01f, -22.62f)
                close()
                moveTo(179.22f, 423.29f)
                lineToRelative(-90.51f, -90.51f)
                lineToRelative(122.04f, -122.04f)
                lineToRelative(90.51f, 90.51f)
                lineToRelative(-122.04f, 122.04f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null
