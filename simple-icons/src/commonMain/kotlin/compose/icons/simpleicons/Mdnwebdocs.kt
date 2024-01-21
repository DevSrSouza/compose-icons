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

public val SimpleIcons.Mdnwebdocs: ImageVector
    get() {
        if (_mdnwebdocs != null) {
            return _mdnwebdocs!!
        }
        _mdnwebdocs = Builder(name = "Mdnwebdocs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.538f, 1.1f)
                lineToRelative(-6.745f, 21.8f)
                horizontalLineToRelative(-2.77f)
                lineTo(18.77f, 1.1f)
                close()
                moveTo(24.0f, 1.1f)
                verticalLineToRelative(21.8f)
                horizontalLineToRelative(-2.462f)
                lineTo(21.538f, 1.1f)
                close()
                moveTo(12.0f, 1.1f)
                verticalLineToRelative(21.8f)
                lineTo(9.538f, 22.9f)
                lineTo(9.538f, 1.1f)
                close()
                moveTo(9.538f, 1.1f)
                lineTo(2.77f, 22.9f)
                lineTo(0.0f, 22.9f)
                lineTo(6.746f, 1.1f)
                close()
            }
        }
        .build()
        return _mdnwebdocs!!
    }

private var _mdnwebdocs: ImageVector? = null
