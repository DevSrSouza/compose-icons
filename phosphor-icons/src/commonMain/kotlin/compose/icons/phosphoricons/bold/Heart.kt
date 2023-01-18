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

public val BoldGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 228.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -5.9f, -1.5f)
                curveTo(117.8f, 224.0f, 16.0f, 166.2f, 16.0f, 92.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 128.0f, 49.6f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 240.0f, 92.0f)
                curveToRelative(0.0f, 74.2f, -101.8f, 132.0f, -106.1f, 134.5f)
                arcTo(12.6f, 12.6f, 0.0f, false, true, 128.0f, 228.0f)
                close()
                moveTo(80.0f, 52.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 40.0f, 92.0f)
                curveToRelative(0.0f, 51.2f, 67.4f, 97.2f, 88.0f, 110.0f)
                curveToRelative(20.6f, -12.8f, 88.0f, -58.8f, 88.0f, -110.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -76.9f, -15.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.2f, 0.0f)
                arcTo(39.9f, 39.9f, 0.0f, false, false, 80.0f, 52.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
