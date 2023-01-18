package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 57.3f)
                curveTo(171.1f, 29.0f, 147.9f, 12.0f, 128.0f, 12.0f)
                reflectiveCurveTo(84.9f, 29.0f, 66.0f, 57.3f)
                reflectiveCurveTo(36.0f, 120.5f, 36.0f, 152.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 120.5f, 209.1f, 86.0f, 190.0f, 57.3f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, -68.0f, -68.0f)
                curveToRelative(0.0f, -61.1f, 46.2f, -116.0f, 68.0f, -116.0f)
                reflectiveCurveToRelative(68.0f, 54.9f, 68.0f, 116.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
