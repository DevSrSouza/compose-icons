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

public val BoldGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.0f, 123.1f)
                arcToRelative(149.8f, 149.8f, 0.0f, false, false, -28.5f, -39.6f)
                curveTo(196.6f, 57.7f, 164.0f, 44.0f, 128.0f, 44.0f)
                reflectiveCurveTo(59.4f, 57.7f, 33.5f, 83.5f)
                arcTo(149.8f, 149.8f, 0.0f, false, false, 5.0f, 123.1f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, false, 0.0f, 9.8f)
                arcToRelative(149.8f, 149.8f, 0.0f, false, false, 28.5f, 39.6f)
                curveTo(59.4f, 198.3f, 92.0f, 212.0f, 128.0f, 212.0f)
                reflectiveCurveToRelative(68.6f, -13.7f, 94.5f, -39.5f)
                arcTo(149.8f, 149.8f, 0.0f, false, false, 251.0f, 132.9f)
                arcTo(12.8f, 12.8f, 0.0f, false, false, 251.0f, 123.1f)
                close()
                moveTo(204.9f, 156.1f)
                curveTo(183.5f, 177.3f, 157.6f, 188.0f, 128.0f, 188.0f)
                reflectiveCurveToRelative(-55.5f, -10.7f, -76.9f, -31.9f)
                arcTo(131.4f, 131.4f, 0.0f, false, true, 29.5f, 128.0f)
                arcTo(128.9f, 128.9f, 0.0f, false, true, 51.1f, 99.9f)
                curveTo(72.5f, 78.7f, 98.4f, 68.0f, 128.0f, 68.0f)
                reflectiveCurveToRelative(55.5f, 10.7f, 76.9f, 31.9f)
                arcTo(131.4f, 131.4f, 0.0f, false, true, 226.5f, 128.0f)
                arcTo(131.4f, 131.4f, 0.0f, false, true, 204.9f, 156.1f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 148.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
