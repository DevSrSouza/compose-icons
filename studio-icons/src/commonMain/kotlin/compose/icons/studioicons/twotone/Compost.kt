package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Compost: ImageVector
    get() {
        if (_compost != null) {
            return _compost!!
        }
        _compost = Builder(name = "Compost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.87f, 11.81f)
                curveToRelative(-0.23f, -0.38f, -0.37f, -0.83f, -0.37f, -1.31f)
                curveTo(12.5f, 9.12f, 13.62f, 8.0f, 15.0f, 8.0f)
                lineToRelative(1.0f, 0.0f)
                curveToRelative(1.51f, 0.0f, 2.0f, -1.0f, 2.0f, -1.0f)
                reflectiveCurveToRelative(0.55f, 6.0f, -3.0f, 6.0f)
                curveToRelative(-0.49f, 0.0f, -0.94f, -0.14f, -1.32f, -0.38f)
                curveToRelative(-0.24f, 0.64f, -0.59f, 1.76f, -0.76f, 2.96f)
                curveToRelative(1.26f, 0.22f, 2.28f, 0.89f, 2.77f, 1.77f)
                curveToRelative(1.69f, -1.17f, 2.81f, -3.13f, 2.81f, -5.35f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 5.24f, -4.26f, 9.5f, -9.5f, 9.5f)
                reflectiveCurveTo(2.5f, 17.24f, 2.5f, 12.0f)
                reflectiveCurveTo(6.76f, 2.5f, 12.0f, 2.5f)
                verticalLineTo(0.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(5.5f)
                curveToRelative(-3.58f, 0.0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0.0f, 2.21f, 1.11f, 4.17f, 2.81f, 5.35f)
                curveToRelative(0.51f, -0.92f, 1.63f, -1.62f, 2.98f, -1.8f)
                curveToRelative(-0.09f, -0.69f, -0.26f, -1.42f, -0.49f, -2.03f)
                curveTo(10.45f, 13.82f, 10.0f, 14.0f, 9.5f, 14.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-0.99f)
                curveToRelative(0.0f, -0.56f, -0.19f, -1.09f, -0.5f, -1.51f)
                curveToRelative(0.0f, 0.0f, 4.45f, -0.23f, 4.5f, 2.5f)
                curveToRelative(0.0f, 0.29f, -0.06f, 0.56f, -0.17f, 0.8f)
                curveTo(10.91f, 12.48f, 10.47f, 12.2f, 10.0f, 12.0f)
                curveToRelative(0.58f, 0.43f, 1.37f, 1.37f, 2.0f, 2.6f)
                curveToRelative(0.67f, -1.62f, 1.68f, -3.27f, 3.0f, -4.6f)
                curveTo(14.24f, 10.52f, 13.53f, 11.12f, 12.87f, 11.81f)
                close()
            }
        }
        .build()
        return _compost!!
    }

private var _compost: ImageVector? = null
