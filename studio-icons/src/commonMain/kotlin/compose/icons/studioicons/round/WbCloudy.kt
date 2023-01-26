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

public val RoundGroup.WbCloudy: ImageVector
    get() {
        if (_wbCloudy != null) {
            return _wbCloudy!!
        }
        _wbCloudy = Builder(name = "WbCloudy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.37f, 10.04f)
                curveTo(18.68f, 6.59f, 15.65f, 4.0f, 12.01f, 4.0f)
                curveToRelative(-2.89f, 0.0f, -5.4f, 1.64f, -6.65f, 4.04f)
                curveTo(2.35f, 8.36f, 0.01f, 10.91f, 0.01f, 14.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.64f, -4.96f)
                close()
            }
        }
        .build()
        return _wbCloudy!!
    }

private var _wbCloudy: ImageVector? = null
