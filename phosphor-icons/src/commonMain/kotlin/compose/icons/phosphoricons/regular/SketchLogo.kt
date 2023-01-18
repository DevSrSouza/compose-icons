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

public val RegularGroup.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) {
            return _sketchLogo!!
        }
        _sketchLogo = Builder(name = "SketchLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 98.7f)
                lineToRelative(-56.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, -2.7f)
                lineTo(72.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 2.7f)
                lineToRelative(-56.0f, 64.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.2f, 10.8f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.6f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 246.0f, 98.7f)
                close()
                moveTo(222.4f, 96.0f)
                lineTo(181.0f, 96.0f)
                lineTo(144.2f, 48.0f)
                horizontalLineToRelative(36.2f)
                close()
                moveTo(73.5f, 112.0f)
                lineToRelative(30.6f, 74.6f)
                lineTo(34.4f, 112.0f)
                close()
                moveTo(165.2f, 112.0f)
                lineTo(128.0f, 202.9f)
                lineTo(90.8f, 112.0f)
                close()
                moveTo(95.1f, 96.0f)
                lineTo(128.0f, 53.1f)
                lineTo(160.9f, 96.0f)
                close()
                moveTo(182.5f, 112.0f)
                horizontalLineToRelative(39.1f)
                lineToRelative(-69.7f, 74.6f)
                close()
                moveTo(75.6f, 48.0f)
                horizontalLineToRelative(36.2f)
                lineTo(75.0f, 96.0f)
                lineTo(33.6f, 96.0f)
                close()
            }
        }
        .build()
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
