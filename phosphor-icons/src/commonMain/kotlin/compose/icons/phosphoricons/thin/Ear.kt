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

public val ThinGroup.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                curveToRelative(0.0f, -13.8f, 8.2f, -20.9f, 15.4f, -27.0f)
                reflectiveCurveTo(164.0f, 114.2f, 164.0f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                curveToRelative(0.0f, 13.8f, -8.2f, 20.9f, -15.4f, 27.0f)
                reflectiveCurveTo(144.0f, 141.8f, 144.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(128.0f, 20.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, -84.0f, 84.0f)
                curveToRelative(0.0f, 31.8f, 11.3f, 42.7f, 21.2f, 52.3f)
                curveToRelative(8.0f, 7.6f, 14.8f, 14.2f, 14.8f, 31.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 85.0f, 30.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.5f, -5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 0.6f)
                arcTo(40.1f, 40.1f, 0.0f, false, true, 88.0f, 188.0f)
                curveToRelative(0.0f, -20.9f, -8.7f, -29.3f, -17.2f, -37.5f)
                reflectiveCurveTo(52.0f, 132.4f, 52.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
