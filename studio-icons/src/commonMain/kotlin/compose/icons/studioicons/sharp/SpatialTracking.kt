package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SpatialTracking: ImageVector
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
                moveTo(20.05f, 2.41f)
                lineTo(18.64f, 1.0f)
                curveToRelative(-3.51f, 3.51f, -3.51f, 9.21f, 0.0f, 12.73f)
                lineToRelative(1.41f, -1.41f)
                curveTo(17.32f, 9.58f, 17.32f, 5.14f, 20.05f, 2.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.88f, 5.24f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.0f, 7.07f)
                lineToRelative(1.41f, -1.41f)
                curveTo(21.71f, 8.32f, 21.71f, 6.41f, 22.88f, 5.24f)
                close()
            }
        }
        .build()
        return _spatialTracking!!
    }

private var _spatialTracking: ImageVector? = null
