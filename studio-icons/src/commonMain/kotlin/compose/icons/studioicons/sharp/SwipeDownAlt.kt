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

public val SharpGroup.SwipeDownAlt: ImageVector
    get() {
        if (_swipeDownAlt != null) {
            return _swipeDownAlt!!
        }
        _swipeDownAlt = Builder(name = "SwipeDownAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.9f)
                curveToRelative(2.28f, -0.46f, 4.0f, -2.48f, 4.0f, -4.9f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveTo(7.0f, 6.24f, 7.0f, 9.0f)
                curveToRelative(0.0f, 2.42f, 1.72f, 4.44f, 4.0f, 4.9f)
                verticalLineToRelative(4.27f)
                lineToRelative(-1.59f, -1.59f)
                lineTo(8.0f, 18.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(13.0f, 18.17f)
                verticalLineTo(13.9f)
                close()
            }
        }
        .build()
        return _swipeDownAlt!!
    }

private var _swipeDownAlt: ImageVector? = null
