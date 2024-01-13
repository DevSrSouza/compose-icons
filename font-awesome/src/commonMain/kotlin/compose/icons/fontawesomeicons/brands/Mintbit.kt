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

public val BrandsGroup.Mintbit: ImageVector
    get() {
        if (_mintbit != null) {
            return _mintbit!!
        }
        _mintbit = Builder(name = "Mintbit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.2f, 512.0f)
                lineTo(73.2f, 438.9f)
                lineTo(365.7f, 438.9f)
                lineTo(365.7f, 365.7f)
                horizontalLineToRelative(73.2f)
                lineTo(438.9f, 219.4f)
                lineTo(512.0f, 219.4f)
                lineTo(512.0f, 0.0f)
                lineTo(292.6f, 0.0f)
                lineTo(292.6f, 73.1f)
                lineTo(146.3f, 73.1f)
                verticalLineToRelative(73.2f)
                lineTo(73.2f, 146.3f)
                lineTo(73.2f, 438.9f)
                lineTo(0.0f, 438.9f)
                lineTo(0.0f, 512.0f)
                lineTo(73.2f, 512.0f)
                close()
                moveTo(146.3f, 292.6f)
                horizontalLineToRelative(73.2f)
                verticalLineToRelative(73.1f)
                lineTo(146.3f, 365.7f)
                lineTo(146.3f, 292.6f)
                close()
                moveTo(219.5f, 219.5f)
                horizontalLineToRelative(73.1f)
                verticalLineToRelative(73.1f)
                lineTo(219.4f, 292.6f)
                lineTo(219.4f, 219.4f)
                close()
                moveTo(292.6f, 219.5f)
                lineTo(292.6f, 146.3f)
                horizontalLineToRelative(73.2f)
                verticalLineToRelative(73.1f)
                lineTo(292.6f, 219.4f)
                close()
                moveTo(365.7f, 73.1f)
                horizontalLineToRelative(73.2f)
                verticalLineToRelative(73.2f)
                lineTo(365.7f, 146.3f)
                lineTo(365.7f, 73.1f)
                close()
            }
        }
        .build()
        return _mintbit!!
    }

private var _mintbit: ImageVector? = null
