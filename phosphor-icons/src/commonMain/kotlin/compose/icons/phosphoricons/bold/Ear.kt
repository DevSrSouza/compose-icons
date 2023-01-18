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

public val BoldGroup.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                curveToRelative(0.0f, 25.0f, 7.6f, 32.3f, 16.3f, 40.8f)
                reflectiveCurveTo(96.0f, 163.7f, 96.0f, 188.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.7f, 20.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.5f, 15.2f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 188.0f)
                curveToRelative(0.0f, -14.1f, -4.6f, -18.6f, -12.3f, -26.0f)
                curveTo(49.1f, 151.9f, 36.0f, 139.2f, 36.0f, 104.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f)
                close()
                moveTo(183.1f, 149.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -15.8f, 6.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 160.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(0.0f, -6.2f, 3.0f, -9.1f, 9.8f, -14.9f)
                reflectiveCurveTo(180.0f, 121.5f, 180.0f, 104.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -104.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                curveToRelative(0.0f, 6.2f, -3.0f, 9.1f, -9.8f, 14.9f)
                reflectiveCurveTo(128.0f, 134.5f, 128.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 61.3f, 12.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 183.1f, 149.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
