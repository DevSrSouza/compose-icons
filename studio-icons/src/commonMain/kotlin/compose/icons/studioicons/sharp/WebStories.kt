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

public val SharpGroup.WebStories: ImageVector
    get() {
        if (_webStories != null) {
            return _webStories!!
        }
        _webStories = Builder(name = "WebStories", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.0f, -0.9f, 0.0f, -2.0f, 0.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(21.0f, 18.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.0f, 1.5f, 0.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, 0.0f, -0.67f, 0.0f, -1.5f, 0.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _webStories!!
    }

private var _webStories: ImageVector? = null
