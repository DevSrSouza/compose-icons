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

public val RoundGroup.ThumbUpAlt: ImageVector
    get() {
        if (_thumbUpAlt != null) {
            return _thumbUpAlt!!
        }
        _thumbUpAlt = Builder(name = "ThumbUpAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.12f, 2.06f)
                lineTo(7.58f, 7.6f)
                curveToRelative(-0.37f, 0.37f, -0.58f, 0.88f, -0.58f, 1.41f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f)
                lineToRelative(3.26f, -7.61f)
                curveTo(23.94f, 10.2f, 22.49f, 8.0f, 20.34f, 8.0f)
                horizontalLineToRelative(-5.65f)
                lineToRelative(0.95f, -4.58f)
                curveToRelative(0.1f, -0.5f, -0.05f, -1.01f, -0.41f, -1.37f)
                curveToRelative(-0.59f, -0.58f, -1.53f, -0.58f, -2.11f, 0.01f)
                close()
                moveTo(3.0f, 21.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _thumbUpAlt!!
    }

private var _thumbUpAlt: ImageVector? = null
