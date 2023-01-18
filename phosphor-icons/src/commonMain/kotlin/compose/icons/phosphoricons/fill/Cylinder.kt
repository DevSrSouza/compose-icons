package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                curveTo(87.6f, 16.0f, 56.0f, 34.4f, 56.0f, 58.0f)
                lineTo(56.0f, 198.0f)
                curveToRelative(0.0f, 23.6f, 31.6f, 42.0f, 72.0f, 42.0f)
                reflectiveCurveToRelative(72.0f, -18.4f, 72.0f, -42.0f)
                lineTo(200.0f, 58.0f)
                curveTo(200.0f, 34.4f, 168.4f, 16.0f, 128.0f, 16.0f)
                close()
                moveTo(184.0f, 198.0f)
                curveToRelative(0.0f, 12.3f, -23.0f, 26.0f, -56.0f, 26.0f)
                reflectiveCurveToRelative(-56.0f, -13.7f, -56.0f, -26.0f)
                lineTo(72.0f, 84.7f)
                curveToRelative(13.1f, 9.4f, 33.1f, 15.3f, 56.0f, 15.3f)
                reflectiveCurveToRelative(42.9f, -5.9f, 56.0f, -15.3f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
