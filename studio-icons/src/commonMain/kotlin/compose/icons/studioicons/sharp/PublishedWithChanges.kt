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

public val SharpGroup.PublishedWithChanges: ImageVector
    get() {
        if (_publishedWithChanges != null) {
            return _publishedWithChanges!!
        }
        _publishedWithChanges = Builder(name = "PublishedWithChanges", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.66f, 9.53f)
                lineToRelative(-7.07f, 7.07f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(5.66f, -5.66f)
                lineTo(17.66f, 9.53f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -2.33f, 1.02f, -4.42f, 2.62f, -5.88f)
                lineTo(9.0f, 8.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(3.0f)
                lineToRelative(2.2f, 2.2f)
                curveTo(3.24f, 6.52f, 2.0f, 9.11f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f)
                verticalLineToRelative(-2.02f)
                curveTo(7.06f, 19.44f, 4.0f, 16.07f, 4.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.19f, -3.95f, -9.45f, -9.0f, -9.95f)
                verticalLineToRelative(2.02f)
                curveToRelative(3.94f, 0.49f, 7.0f, 3.86f, 7.0f, 7.93f)
                curveToRelative(0.0f, 2.33f, -1.02f, 4.42f, -2.62f, 5.88f)
                lineTo(15.0f, 15.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-2.2f, -2.2f)
                curveTo(20.76f, 17.48f, 22.0f, 14.89f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _publishedWithChanges!!
    }

private var _publishedWithChanges: ImageVector? = null
