package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Markdown: ImageVector
    get() {
        if (_markdown != null) {
            return _markdown!!
        }
        _markdown = Builder(name = "Markdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.27f, 19.385f)
                horizontalLineTo(1.73f)
                arcTo(1.73f, 1.73f, 0.0f, false, true, 0.0f, 17.655f)
                verticalLineTo(6.345f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, 1.73f, -1.73f)
                horizontalLineToRelative(20.54f)
                arcTo(1.73f, 1.73f, 0.0f, false, true, 24.0f, 6.345f)
                verticalLineToRelative(11.308f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -1.73f, 1.731f)
                close()
                moveTo(5.769f, 15.923f)
                verticalLineToRelative(-4.5f)
                lineToRelative(2.308f, 2.885f)
                lineToRelative(2.307f, -2.885f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.308f)
                verticalLineTo(8.078f)
                horizontalLineToRelative(-2.308f)
                lineToRelative(-2.307f, 2.885f)
                lineToRelative(-2.308f, -2.885f)
                horizontalLineTo(3.46f)
                verticalLineToRelative(7.847f)
                close()
                moveTo(21.232f, 12.0f)
                horizontalLineToRelative(-2.309f)
                verticalLineTo(8.077f)
                horizontalLineToRelative(-2.307f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-2.308f)
                lineToRelative(3.461f, 4.039f)
                close()
            }
        }
        .build()
        return _markdown!!
    }

private var _markdown: ImageVector? = null
