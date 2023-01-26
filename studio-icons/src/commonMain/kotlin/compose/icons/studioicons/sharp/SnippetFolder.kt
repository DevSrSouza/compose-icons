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

public val SharpGroup.SnippetFolder: ImageVector
    get() {
        if (_snippetFolder != null) {
            return _snippetFolder!!
        }
        _snippetFolder = Builder(name = "SnippetFolder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineToRelative(-6.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(2.5f, 2.5f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.88f, 10.5f)
                lineToRelative(1.62f, 1.62f)
                verticalLineToRelative(3.38f)
                lineToRelative(-3.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(15.88f)
                close()
            }
        }
        .build()
        return _snippetFolder!!
    }

private var _snippetFolder: ImageVector? = null
