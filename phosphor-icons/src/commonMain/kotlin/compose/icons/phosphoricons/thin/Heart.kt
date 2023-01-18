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

public val ThinGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 220.0f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -2.0f, -0.5f)
                arcToRelative(321.4f, 321.4f, 0.0f, false, true, -50.7f, -37.0f)
                curveTo(41.3f, 151.8f, 24.0f, 121.4f, 24.0f, 92.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 128.0f, 63.1f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 232.0f, 92.0f)
                curveToRelative(0.0f, 29.4f, -17.3f, 59.8f, -51.3f, 90.5f)
                arcToRelative(321.4f, 321.4f, 0.0f, false, true, -50.7f, 37.0f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(80.0f, 44.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 32.0f, 92.0f)
                curveToRelative(0.0f, 59.7f, 82.2f, 111.1f, 96.0f, 119.4f)
                curveToRelative(13.8f, -8.3f, 96.0f, -59.7f, 96.0f, -119.4f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -92.3f, -18.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.4f, 0.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 80.0f, 44.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
