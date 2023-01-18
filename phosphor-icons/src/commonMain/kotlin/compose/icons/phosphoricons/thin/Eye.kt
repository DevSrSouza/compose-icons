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

public val ThinGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.7f, 126.4f)
                curveToRelative(-0.4f, -0.8f, -8.6f, -18.9f, -26.9f, -37.2f)
                reflectiveCurveTo(170.7f, 52.0f, 128.0f, 52.0f)
                reflectiveCurveTo(56.1f, 72.2f, 39.2f, 89.2f)
                reflectiveCurveToRelative(-26.5f, 36.4f, -26.9f, 37.2f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 0.0f, 3.2f)
                curveToRelative(0.4f, 0.8f, 8.6f, 18.9f, 26.9f, 37.2f)
                reflectiveCurveTo(85.3f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveToRelative(71.9f, -20.2f, 88.8f, -37.2f)
                reflectiveCurveToRelative(26.5f, -36.4f, 26.9f, -37.2f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 243.7f, 126.4f)
                close()
                moveTo(211.0f, 161.4f)
                curveToRelative(-23.1f, 22.9f, -51.0f, 34.6f, -83.0f, 34.6f)
                reflectiveCurveToRelative(-59.9f, -11.7f, -83.0f, -34.6f)
                arcTo(138.7f, 138.7f, 0.0f, false, true, 20.4f, 128.0f)
                arcTo(136.8f, 136.8f, 0.0f, false, true, 45.0f, 94.6f)
                curveTo(68.1f, 71.6f, 96.0f, 60.0f, 128.0f, 60.0f)
                reflectiveCurveToRelative(59.9f, 11.6f, 83.0f, 34.6f)
                arcTo(136.8f, 136.8f, 0.0f, false, true, 235.6f, 128.0f)
                arcTo(136.8f, 136.8f, 0.0f, false, true, 211.0f, 161.4f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
