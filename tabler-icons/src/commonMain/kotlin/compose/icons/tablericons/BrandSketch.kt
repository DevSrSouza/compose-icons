package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandSketch: ImageVector
    get() {
        if (_brandSketch != null) {
            return _brandSketch!!
        }
        _brandSketch = Builder(name = "BrandSketch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.262f, 10.878f)
                lineToRelative(8.0f, 8.789f)
                curveToRelative(0.4f, 0.44f, 1.091f, 0.44f, 1.491f, 0.0f)
                lineToRelative(8.0f, -8.79f)
                curveToRelative(0.313f, -0.344f, 0.349f, -0.859f, 0.087f, -1.243f)
                lineToRelative(-3.537f, -5.194f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.823f, -0.436f)
                horizontalLineToRelative(-8.926f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.823f, 0.436f)
                lineToRelative(-3.54f, 5.192f)
                curveToRelative(-0.263f, 0.385f, -0.227f, 0.901f, 0.087f, 1.246f)
                close()
            }
        }
        .build()
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
