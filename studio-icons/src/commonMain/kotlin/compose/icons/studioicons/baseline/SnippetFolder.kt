package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SnippetFolder: ImageVector
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
                horizontalLineToRelative(6.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f)
                close()
                moveTo(19.0f, 11.5f)
                lineTo(16.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(6.0f, 0.0f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _snippetFolder!!
    }

private var _snippetFolder: ImageVector? = null
