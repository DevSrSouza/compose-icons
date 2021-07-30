package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(277.0f, 170.7f)
                arcTo(85.35f, 85.35f, 0.0f, false, false, 277.0f, 0.0f)
                lineTo(106.3f, 0.0f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, false, 0.0f, 170.6f)
                arcToRelative(85.35f, 85.35f, 0.0f, false, false, 0.0f, 170.7f)
                arcToRelative(85.35f, 85.35f, 0.0f, true, false, 85.3f, 85.4f)
                verticalLineToRelative(-256.0f)
                close()
                moveTo(277.0f, 170.7f)
                arcToRelative(85.3f, 85.3f, 0.0f, true, false, 85.3f, 85.3f)
                arcToRelative(85.31f, 85.31f, 0.0f, false, false, -85.3f, -85.3f)
                close()
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
