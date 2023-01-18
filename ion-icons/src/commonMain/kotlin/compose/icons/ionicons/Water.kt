package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Water: ImageVector
    get() {
        if (_water != null) {
            return _water!!
        }
        _water = Builder(name = "Water", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(265.12f, 60.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.23f, 0.0f)
                curveTo(215.23f, 97.15f, 112.0f, 225.17f, 112.0f, 320.0f)
                curveToRelative(0.0f, 88.37f, 55.64f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -55.63f, 144.0f, -144.0f)
                curveTo(400.0f, 225.17f, 296.77f, 97.15f, 265.12f, 60.12f)
                close()
                moveTo(272.0f, 412.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.34f, -16.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, true, 11.41f, -8.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, false, 332.0f, 328.07f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, true, 8.0f, -11.41f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 356.0f, 328.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 272.0f, 412.0f)
                close()
            }
        }
        .build()
        return _water!!
    }

private var _water: ImageVector? = null
