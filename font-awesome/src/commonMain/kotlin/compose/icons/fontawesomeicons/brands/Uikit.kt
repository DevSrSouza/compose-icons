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

public val BrandsGroup.Uikit: ImageVector
    get() {
        if (_uikit != null) {
            return _uikit!!
        }
        _uikit = Builder(name = "Uikit", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.9f, 128.0f)
                verticalLineToRelative(256.0f)
                lineTo(218.0f, 512.0f)
                lineTo(0.0f, 384.0f)
                verticalLineTo(169.7f)
                lineToRelative(87.6f, 45.1f)
                verticalLineToRelative(117.0f)
                lineToRelative(133.5f, 75.5f)
                lineToRelative(135.8f, -75.5f)
                verticalLineToRelative(-151.0f)
                lineToRelative(-101.1f, -57.6f)
                lineToRelative(87.6f, -53.1f)
                lineTo(443.9f, 128.0f)
                close()
                moveTo(308.6f, 49.1f)
                lineTo(223.8f, 0.0f)
                lineToRelative(-88.6f, 54.8f)
                lineToRelative(86.0f, 47.3f)
                lineToRelative(87.4f, -53.0f)
                close()
            }
        }
        .build()
        return _uikit!!
    }

private var _uikit: ImageVector? = null
