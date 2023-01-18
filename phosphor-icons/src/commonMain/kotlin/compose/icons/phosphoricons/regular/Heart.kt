package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 224.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -3.9f, -1.0f)
                curveTo(119.8f, 220.6f, 20.0f, 163.9f, 20.0f, 92.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 128.0f, 56.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 236.0f, 92.0f)
                curveToRelative(0.0f, 30.6f, -17.7f, 62.0f, -52.6f, 93.4f)
                arcTo(314.3f, 314.3f, 0.0f, false, true, 131.9f, 223.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 128.0f, 224.0f)
                close()
                moveTo(124.1f, 209.0f)
                close()
                moveTo(80.0f, 48.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 36.0f, 92.0f)
                curveToRelative(0.0f, 55.2f, 74.0f, 103.7f, 92.0f, 114.7f)
                curveToRelative(18.0f, -11.0f, 92.0f, -59.5f, 92.0f, -114.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -84.6f, -17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.8f, 0.0f)
                arcTo(43.8f, 43.8f, 0.0f, false, false, 80.0f, 48.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
