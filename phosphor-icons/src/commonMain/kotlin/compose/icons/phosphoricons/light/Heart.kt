package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.9f, -0.8f)
                curveTo(124.0f, 220.7f, 99.2f, 206.6f, 74.0f, 184.0f)
                curveToRelative(-34.5f, -31.1f, -52.0f, -62.0f, -52.0f, -92.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 128.0f, 59.4f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 234.0f, 92.0f)
                curveToRelative(0.0f, 30.0f, -17.5f, 60.9f, -52.0f, 92.0f)
                curveToRelative(-25.2f, 22.6f, -50.0f, 36.7f, -51.1f, 37.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 128.0f, 222.0f)
                close()
                moveTo(80.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 34.0f, 92.0f)
                curveToRelative(0.0f, 57.3f, 77.8f, 107.3f, 94.0f, 117.0f)
                curveToRelative(16.2f, -9.7f, 94.0f, -59.7f, 94.0f, -117.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -88.5f, -17.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -11.0f, 0.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 80.0f, 46.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
