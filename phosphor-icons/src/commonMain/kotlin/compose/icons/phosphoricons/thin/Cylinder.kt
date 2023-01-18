package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                curveTo(89.9f, 20.0f, 60.0f, 36.7f, 60.0f, 58.0f)
                lineTo(60.0f, 198.0f)
                curveToRelative(0.0f, 21.3f, 29.9f, 38.0f, 68.0f, 38.0f)
                reflectiveCurveToRelative(68.0f, -16.7f, 68.0f, -38.0f)
                lineTo(196.0f, 58.0f)
                curveTo(196.0f, 36.7f, 166.1f, 20.0f, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 28.0f)
                curveToRelative(32.5f, 0.0f, 60.0f, 13.7f, 60.0f, 30.0f)
                reflectiveCurveToRelative(-27.5f, 30.0f, -60.0f, 30.0f)
                reflectiveCurveTo(68.0f, 74.3f, 68.0f, 58.0f)
                reflectiveCurveTo(95.5f, 28.0f, 128.0f, 28.0f)
                close()
                moveTo(188.0f, 198.0f)
                curveToRelative(0.0f, 16.3f, -27.5f, 30.0f, -60.0f, 30.0f)
                reflectiveCurveToRelative(-60.0f, -13.7f, -60.0f, -30.0f)
                lineTo(68.0f, 76.2f)
                curveTo(79.4f, 88.1f, 101.7f, 96.0f, 128.0f, 96.0f)
                reflectiveCurveToRelative(48.6f, -7.9f, 60.0f, -19.8f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
