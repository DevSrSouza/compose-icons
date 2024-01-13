package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ThreeBars16: ImageVector
    get() {
        if (_threeBars16 != null) {
            return _threeBars16!!
        }
        _threeBars16 = Builder(name = "ThreeBars16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.75f, 2.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(1.75f, 3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 2.75f)
                close()
                moveTo(1.0f, 7.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.75f, 7.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(1.75f, 8.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 7.75f)
                close()
                moveTo(1.75f, 12.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(1.75f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        .build()
        return _threeBars16!!
    }

private var _threeBars16: ImageVector? = null
