package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.7f, 59.6f)
                curveTo(168.5f, 32.3f, 146.5f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveTo(87.5f, 32.3f, 69.3f, 59.6f)
                reflectiveCurveTo(40.0f, 121.2f, 40.0f, 152.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 121.2f, 205.3f, 87.5f, 186.7f, 59.6f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -27.7f, 9.7f, -58.2f, 26.7f, -83.6f)
                curveTo(97.2f, 46.6f, 115.4f, 32.0f, 128.0f, 32.0f)
                reflectiveCurveToRelative(30.8f, 14.6f, 45.3f, 36.4f)
                curveToRelative(17.0f, 25.4f, 26.7f, 55.9f, 26.7f, 83.6f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 128.0f, 224.0f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
