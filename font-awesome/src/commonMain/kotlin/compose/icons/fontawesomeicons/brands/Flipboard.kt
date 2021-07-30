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

public val BrandsGroup.Flipboard: ImageVector
    get() {
        if (_flipboard != null) {
            return _flipboard!!
        }
        _flipboard = Builder(name = "Flipboard", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                verticalLineToRelative(448.0f)
                horizontalLineToRelative(448.0f)
                lineTo(448.0f, 32.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(358.4f, 211.2f)
                horizontalLineToRelative(-89.6f)
                verticalLineToRelative(89.6f)
                horizontalLineToRelative(-89.6f)
                verticalLineToRelative(89.6f)
                lineTo(89.6f, 390.4f)
                lineTo(89.6f, 121.6f)
                horizontalLineToRelative(268.8f)
                verticalLineToRelative(89.6f)
                close()
            }
        }
        .build()
        return _flipboard!!
    }

private var _flipboard: ImageVector? = null
