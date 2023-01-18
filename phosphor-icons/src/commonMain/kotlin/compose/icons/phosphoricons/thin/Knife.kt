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

public val ThinGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 35.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -34.0f, 0.1f)
                lineTo(21.1f, 213.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.0f, 6.7f)
                arcToRelative(151.6f, 151.6f, 0.0f, false, false, 34.0f, 3.9f)
                curveToRelative(32.7f, 0.0f, 65.4f, -10.6f, 96.1f, -31.5f)
                reflectiveCurveToRelative(49.2f, -44.9f, 50.0f, -45.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.4f, -5.2f)
                lineToRelative(-21.4f, -21.5f)
                lineTo(229.0f, 68.9f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 229.0f, 35.0f)
                close()
                moveTo(194.6f, 144.3f)
                arcToRelative(221.3f, 221.3f, 0.0f, false, true, -45.8f, 41.4f)
                curveToRelative(-38.0f, 25.7f, -77.2f, 35.0f, -116.8f, 27.9f)
                lineTo(146.5f, 96.2f)
                lineToRelative(26.3f, 26.2f)
                lineToRelative(0.2f, 0.3f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(223.3f, 63.3f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                lineTo(175.7f, 114.0f)
                lineTo(152.1f, 90.5f)
                lineToRelative(48.6f, -49.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.6f, 22.6f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
