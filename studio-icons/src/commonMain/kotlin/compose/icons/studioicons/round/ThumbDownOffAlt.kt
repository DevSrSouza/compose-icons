package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ThumbDownOffAlt: ImageVector
    get() {
        if (_thumbDownOffAlt != null) {
            return _thumbDownOffAlt!!
        }
        _thumbDownOffAlt = Builder(name = "ThumbDownOffAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.99f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.2f, 3.0f, 4.48f, 3.48f, 4.17f, 4.21f)
                lineToRelative(-3.26f, 7.61f)
                curveTo(0.06f, 13.8f, 1.51f, 16.0f, 3.66f, 16.0f)
                horizontalLineToRelative(5.65f)
                lineToRelative(-0.95f, 4.58f)
                curveToRelative(-0.1f, 0.5f, 0.05f, 1.01f, 0.41f, 1.37f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
                curveToRelative(0.38f, 0.0f, 0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(5.53f, -5.54f)
                curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f)
                verticalLineTo(5.0f)
                curveTo(16.99f, 3.9f, 16.09f, 3.0f, 14.99f, 3.0f)
                close()
                moveTo(10.66f, 19.33f)
                lineToRelative(0.61f, -2.92f)
                lineToRelative(0.5f, -2.41f)
                horizontalLineTo(9.31f)
                horizontalLineTo(3.66f)
                curveToRelative(-0.47f, 0.0f, -0.72f, -0.28f, -0.83f, -0.45f)
                curveToRelative(-0.11f, -0.17f, -0.27f, -0.51f, -0.08f, -0.95f)
                lineTo(6.0f, 5.0f)
                horizontalLineToRelative(8.99f)
                lineToRelative(0.0f, 9.99f)
                lineTo(10.66f, 19.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f)
                close()
            }
        }
        .build()
        return _thumbDownOffAlt!!
    }

private var _thumbDownOffAlt: ImageVector? = null
