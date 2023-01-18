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

public val ThinGroup.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) {
            return _sketchLogo!!
        }
        _sketchLogo = Builder(name = "SketchLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 101.4f)
                lineToRelative(-56.0f, -64.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -3.0f, -1.4f)
                lineTo(72.0f, 36.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -3.0f, 1.4f)
                lineToRelative(-56.0f, 64.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.1f, 5.3f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.8f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 243.0f, 101.4f)
                close()
                moveTo(231.2f, 100.0f)
                lineTo(179.1f, 100.0f)
                lineToRelative(-43.0f, -56.0f)
                horizontalLineToRelative(46.1f)
                close()
                moveTo(76.2f, 108.0f)
                lineTo(116.0f, 205.3f)
                lineTo(25.2f, 108.0f)
                close()
                moveTo(171.1f, 108.0f)
                lineTo(128.0f, 213.4f)
                lineTo(84.9f, 108.0f)
                close()
                moveTo(87.0f, 100.0f)
                lineToRelative(41.0f, -53.4f)
                lineTo(169.0f, 100.0f)
                close()
                moveTo(179.8f, 108.0f)
                horizontalLineToRelative(51.0f)
                lineTo(140.0f, 205.3f)
                close()
                moveTo(73.8f, 44.0f)
                horizontalLineToRelative(46.1f)
                lineToRelative(-43.0f, 56.0f)
                lineTo(24.8f, 100.0f)
                close()
            }
        }
        .build()
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
