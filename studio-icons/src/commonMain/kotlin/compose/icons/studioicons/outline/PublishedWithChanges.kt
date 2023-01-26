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

public val OutlineGroup.PublishedWithChanges: ImageVector
    get() {
        if (_publishedWithChanges != null) {
            return _publishedWithChanges!!
        }
        _publishedWithChanges = Builder(name = "PublishedWithChanges", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6f, 19.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.73f)
                curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.23f)
                curveToRelative(0.0f, -4.07f, -3.06f, -7.44f, -7.0f, -7.93f)
                verticalLineTo(2.05f)
                curveToRelative(5.05f, 0.5f, 9.0f, 4.76f, 9.0f, 9.95f)
                curveTo(22.0f, 14.99f, 20.68f, 17.67f, 18.6f, 19.5f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -2.52f, 1.17f, -4.77f, 3.0f, -6.23f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.4f)
                curveTo(3.32f, 6.33f, 2.0f, 9.01f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f)
                verticalLineToRelative(-2.02f)
                curveTo(7.06f, 19.44f, 4.0f, 16.07f, 4.0f, 12.0f)
                close()
                moveTo(16.24f, 8.11f)
                lineToRelative(-5.66f, 5.66f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(7.07f, -7.07f)
                lineTo(16.24f, 8.11f)
                close()
            }
        }
        .build()
        return _publishedWithChanges!!
    }

private var _publishedWithChanges: ImageVector? = null
