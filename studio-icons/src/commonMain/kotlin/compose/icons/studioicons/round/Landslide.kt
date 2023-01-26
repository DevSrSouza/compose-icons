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

public val RoundGroup.Landslide: ImageVector
    get() {
        if (_landslide != null) {
            return _landslide!!
        }
        _landslide = Builder(name = "Landslide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.47f, 13.79f)
                lineToRelative(-2.58f, -1.03f)
                lineToRelative(-6.89f, 2.29f)
                lineToRelative(-4.0f, -1.54f)
                lineToRelative(0.0f, 2.1f)
                lineToRelative(4.0f, 1.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.57f, 11.42f)
                lineTo(8.6f, 8.8f)
                curveTo(8.22f, 8.3f, 7.63f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.61f)
                lineToRelative(4.0f, 1.33f)
                lineTo(10.57f, 11.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.05f)
                lineToRelative(-4.0f, -1.33f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 2.59f, -1.88f, 1.6f, -3.2f)
                lineToRelative(-2.57f, -3.42f)
                lineTo(6.0f, 19.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.65f)
                verticalLineTo(2.64f)
                curveToRelative(0.0f, -0.95f, -0.67f, -1.77f, -1.61f, -1.96f)
                lineToRelative(-2.58f, -0.52f)
                curveToRelative(-0.52f, -0.1f, -1.06f, 0.0f, -1.5f, 0.3f)
                lineTo(9.89f, 1.41f)
                curveTo(9.33f, 1.78f, 9.0f, 2.4f, 9.0f, 3.07f)
                verticalLineToRelative(1.86f)
                curveTo(9.0f, 5.6f, 9.33f, 6.22f, 9.89f, 6.59f)
                lineToRelative(1.23f, 0.82f)
                curveToRelative(0.55f, 0.37f, 1.24f, 0.44f, 1.85f, 0.19f)
                lineToRelative(2.77f, -1.11f)
                curveTo(16.5f, 6.2f, 17.0f, 5.46f, 17.0f, 4.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 7.6f)
                lineToRelative(-1.0f, 0.8f)
                curveTo(16.28f, 8.78f, 16.0f, 9.35f, 16.0f, 9.96f)
                verticalLineToRelative(1.08f)
                curveToRelative(0.0f, 0.61f, 0.28f, 1.18f, 0.75f, 1.56f)
                lineToRelative(0.8f, 0.64f)
                curveToRelative(0.58f, 0.47f, 1.38f, 0.57f, 2.06f, 0.27f)
                lineToRelative(2.2f, -0.98f)
                curveTo(22.53f, 12.21f, 23.0f, 11.49f, 23.0f, 10.7f)
                verticalLineTo(9.6f)
                curveToRelative(0.0f, -0.94f, -0.65f, -1.75f, -1.57f, -1.95f)
                lineToRelative(-2.0f, -0.44f)
                curveTo(18.84f, 7.08f, 18.22f, 7.22f, 17.75f, 7.6f)
                close()
            }
        }
        .build()
        return _landslide!!
    }

private var _landslide: ImageVector? = null
