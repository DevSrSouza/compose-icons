package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SortByAlpha: ImageVector
    get() {
        if (_sortByAlpha != null) {
            return _sortByAlpha!!
        }
        _sortByAlpha = Builder(name = "SortByAlpha", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.94f, 4.66f)
                horizontalLineToRelative(-4.72f)
                lineToRelative(2.36f, -2.36f)
                lineToRelative(2.36f, 2.36f)
                close()
                moveTo(10.25f, 19.37f)
                horizontalLineToRelative(4.66f)
                lineToRelative(-2.33f, 2.33f)
                lineToRelative(-2.33f, -2.33f)
                close()
                moveTo(6.1f, 6.27f)
                lineTo(1.6f, 17.73f)
                horizontalLineToRelative(1.84f)
                lineToRelative(0.92f, -2.45f)
                horizontalLineToRelative(5.11f)
                lineToRelative(0.92f, 2.45f)
                horizontalLineToRelative(1.84f)
                lineTo(7.74f, 6.27f)
                lineTo(6.1f, 6.27f)
                close()
                moveTo(4.97f, 13.64f)
                lineToRelative(1.94f, -5.18f)
                lineToRelative(1.94f, 5.18f)
                lineTo(4.97f, 13.64f)
                close()
                moveTo(15.73f, 16.14f)
                horizontalLineToRelative(6.12f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(-8.53f)
                verticalLineToRelative(-1.29f)
                lineToRelative(5.92f, -8.56f)
                horizontalLineToRelative(-5.88f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(8.3f)
                verticalLineToRelative(1.26f)
                lineToRelative(-5.93f, 8.6f)
                close()
            }
        }
        .build()
        return _sortByAlpha!!
    }

private var _sortByAlpha: ImageVector? = null
