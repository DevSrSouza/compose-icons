package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Park: ImageVector
    get() {
        if (_park != null) {
            return _park!!
        }
        _park = Builder(name = "Park", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 2.0f)
                lineTo(5.05f, 12.0f)
                horizontalLineTo(7.0f)
                lineToRelative(-3.9f, 6.0f)
                horizontalLineToRelative(6.92f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.95f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(21.0f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(6.79f, 16.0f)
                lineToRelative(3.9f, -6.0f)
                horizontalLineTo(8.88f)
                lineToRelative(3.13f, -4.5f)
                lineToRelative(3.15f, 4.5f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(4.0f, 6.0f)
                horizontalLineTo(6.79f)
                close()
            }
        }
        .build()
        return _park!!
    }

private var _park: ImageVector? = null
