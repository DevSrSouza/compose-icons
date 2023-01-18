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

public val BoldGroup.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) {
            return _sketchLogo!!
        }
        _sketchLogo = Builder(name = "SketchLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.0f, 96.1f)
                lineToRelative(-56.0f, -64.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -9.0f, -4.1f)
                lineTo(72.0f, 28.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -9.0f, 4.1f)
                lineTo(7.0f, 96.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.2f, 16.1f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.6f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 249.0f, 96.1f)
                close()
                moveTo(213.6f, 92.0f)
                lineTo(183.0f, 92.0f)
                lineTo(152.3f, 52.0f)
                horizontalLineToRelative(26.3f)
                close()
                moveTo(70.9f, 116.0f)
                lineToRelative(21.2f, 52.0f)
                lineTo(43.6f, 116.0f)
                close()
                moveTo(159.2f, 116.0f)
                lineTo(128.0f, 192.3f)
                lineTo(96.8f, 116.0f)
                close()
                moveTo(103.2f, 92.0f)
                lineTo(128.0f, 59.7f)
                lineTo(152.8f, 92.0f)
                close()
                moveTo(185.1f, 116.0f)
                horizontalLineToRelative(27.3f)
                lineToRelative(-48.5f, 52.0f)
                close()
                moveTo(77.4f, 52.0f)
                horizontalLineToRelative(26.3f)
                lineTo(73.0f, 92.0f)
                lineTo(42.4f, 92.0f)
                close()
            }
        }
        .build()
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
