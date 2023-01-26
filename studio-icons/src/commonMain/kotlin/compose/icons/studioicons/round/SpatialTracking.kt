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

public val RoundGroup.SpatialTracking: ImageVector
    get() {
        if (_spatialTracking != null) {
            return _spatialTracking!!
        }
        _spatialTracking = Builder(name = "SpatialTracking", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.39f, 15.56f)
                curveTo(14.71f, 14.7f, 12.53f, 14.0f, 10.0f, 14.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(2.61f, 16.07f, 2.0f, 17.1f, 2.0f, 18.22f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(18.0f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.39f, 1.76f)
                lineTo(19.39f, 1.76f)
                curveToRelative(-0.43f, -0.43f, -1.14f, -0.39f, -1.51f, 0.09f)
                curveToRelative(-1.5f, 1.93f, -3.35f, 6.72f, 0.0f, 11.03f)
                curveToRelative(0.37f, 0.48f, 1.08f, 0.52f, 1.5f, 0.09f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.35f, -0.35f, 0.39f, -0.91f, 0.09f, -1.3f)
                curveToRelative(-1.17f, -1.5f, -2.64f, -5.23f, 0.0f, -8.61f)
                curveTo(19.78f, 2.67f, 19.74f, 2.11f, 19.39f, 1.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4f, 5.86f)
                curveToRelative(0.23f, -0.4f, 0.19f, -0.9f, -0.14f, -1.22f)
                lineToRelative(0.0f, 0.0f)
                curveTo(21.79f, 4.16f, 21.0f, 4.27f, 20.67f, 4.85f)
                curveToRelative(-1.15f, 2.0f, -0.57f, 4.03f, 0.01f, 5.04f)
                curveToRelative(0.33f, 0.57f, 1.11f, 0.67f, 1.58f, 0.21f)
                curveToRelative(0.33f, -0.33f, 0.36f, -0.84f, 0.13f, -1.25f)
                curveTo(22.14f, 8.41f, 21.65f, 7.16f, 22.4f, 5.86f)
                close()
            }
        }
        .build()
        return _spatialTracking!!
    }

private var _spatialTracking: ImageVector? = null
