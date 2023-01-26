package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Whatshot: ImageVector
    get() {
        if (_whatshot != null) {
            return _whatshot!!
        }
        _whatshot = Builder(name = "Whatshot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.11f, 6.77f)
                curveToRelative(-0.53f, 2.6f, -2.62f, 4.43f, -5.28f, 4.43f)
                curveToRelative(-1.56f, 0.0f, -2.96f, -0.62f, -3.97f, -1.63f)
                curveTo(6.3f, 10.96f, 6.0f, 12.47f, 6.0f, 14.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                curveToRelative(0.0f, -2.56f, -0.66f, -5.03f, -1.89f, -7.23f)
                close()
                moveTo(11.89f, 17.99f)
                curveToRelative(-1.37f, 0.0f, -2.49f, -1.08f, -2.49f, -2.42f)
                curveToRelative(0.0f, -1.25f, 0.81f, -2.13f, 2.17f, -2.41f)
                curveToRelative(1.37f, -0.28f, 2.78f, -0.93f, 3.57f, -1.99f)
                curveToRelative(0.3f, 1.0f, 0.46f, 2.05f, 0.46f, 3.12f)
                curveToRelative(0.0f, 2.04f, -1.66f, 3.7f, -3.71f, 3.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.57f, 13.16f)
                curveToRelative(-1.36f, 0.28f, -2.17f, 1.16f, -2.17f, 2.41f)
                curveToRelative(0.0f, 1.34f, 1.11f, 2.42f, 2.49f, 2.42f)
                curveToRelative(2.05f, 0.0f, 3.71f, -1.66f, 3.71f, -3.71f)
                curveToRelative(0.0f, -1.07f, -0.15f, -2.12f, -0.46f, -3.12f)
                curveToRelative(-0.79f, 1.07f, -2.2f, 1.72f, -3.57f, 2.0f)
                close()
                moveTo(13.5f, 0.67f)
                reflectiveCurveToRelative(0.74f, 2.65f, 0.74f, 4.8f)
                curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f)
                curveToRelative(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f)
                lineToRelative(0.03f, -0.36f)
                curveTo(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                curveTo(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.53f, 0.3f, -3.04f, 0.86f, -4.43f)
                curveToRelative(1.01f, 1.01f, 2.41f, 1.63f, 3.97f, 1.63f)
                curveToRelative(2.66f, 0.0f, 4.75f, -1.83f, 5.28f, -4.43f)
                curveTo(17.34f, 8.97f, 18.0f, 11.44f, 18.0f, 14.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _whatshot!!
    }

private var _whatshot: ImageVector? = null
