package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SnippetFolder: ImageVector
    get() {
        if (_snippetFolder != null) {
            return _snippetFolder!!
        }
        _snippetFolder = Builder(name = "SnippetFolder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.88f, 10.5f)
                lineToRelative(1.62f, 1.62f)
                verticalLineToRelative(3.38f)
                lineToRelative(-3.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(15.88f)
                close()
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(2.01f, 6.0f)
                curveTo(2.01f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(5.17f)
                curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.41f, 0.59f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f)
                close()
                moveTo(19.0f, 11.91f)
                curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-1.91f, -1.91f)
                curveTo(16.61f, 9.11f, 16.35f, 9.0f, 16.09f, 9.0f)
                horizontalLineTo(14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                lineToRelative(4.0f, 0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(11.91f)
                close()
            }
        }
        .build()
        return _snippetFolder!!
    }

private var _snippetFolder: ImageVector? = null
