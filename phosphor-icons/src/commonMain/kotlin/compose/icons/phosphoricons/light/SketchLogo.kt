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

public val LightGroup.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) {
            return _sketchLogo!!
        }
        _sketchLogo = Builder(name = "SketchLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.5f, 100.0f)
                lineToRelative(-56.0f, -64.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.5f, -2.0f)
                lineTo(72.0f, 34.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.5f, 2.0f)
                lineToRelative(-56.0f, 64.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.1f, 8.1f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.8f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 244.5f, 100.0f)
                close()
                moveTo(74.7f, 46.0f)
                horizontalLineToRelative(41.1f)
                lineTo(75.9f, 98.0f)
                lineTo(29.2f, 98.0f)
                close()
                moveTo(128.0f, 49.9f)
                lineTo(164.9f, 98.0f)
                lineTo(91.1f, 98.0f)
                close()
                moveTo(29.8f, 110.0f)
                lineTo(74.9f, 110.0f)
                lineToRelative(35.2f, 86.0f)
                close()
                moveTo(128.0f, 208.2f)
                lineTo(87.8f, 110.0f)
                horizontalLineToRelative(80.4f)
                close()
                moveTo(145.9f, 196.0f)
                lineToRelative(35.2f, -86.0f)
                horizontalLineToRelative(45.1f)
                close()
                moveTo(180.1f, 98.0f)
                lineTo(140.2f, 46.0f)
                horizontalLineToRelative(41.1f)
                lineToRelative(45.5f, 52.0f)
                close()
            }
        }
        .build()
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
