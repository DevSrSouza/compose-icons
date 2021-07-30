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

public val SimpleIcons.Airfrance: ImageVector
    get() {
        if (_airfrance != null) {
            return _airfrance!!
        }
        _airfrance = Builder(name = "Airfrance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.776f, 3.9f)
                lineTo(5.184f, 16.332f)
                curveTo(4.051f, 17.969f, 2.208f, 19.548f, 0.0f, 19.721f)
                verticalLineToRelative(0.379f)
                horizontalLineToRelative(9.552f)
                curveToRelative(2.544f, 0.0f, 4.397f, -1.656f, 5.616f, -3.48f)
                lineTo(24.0f, 3.9f)
                close()
            }
        }
        .build()
        return _airfrance!!
    }

private var _airfrance: ImageVector? = null
