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

public val RoundGroup.Architecture: ImageVector
    get() {
        if (_architecture != null) {
            return _architecture!!
        }
        _architecture = Builder(name = "Architecture", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.36f, 18.78f)
                lineTo(6.61f, 21.0f)
                lineToRelative(1.62f, -1.54f)
                lineToRelative(2.77f, -7.6f)
                curveToRelative(-0.68f, -0.17f, -1.28f, -0.51f, -1.77f, -0.98f)
                lineTo(6.36f, 18.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.77f, 10.88f)
                curveToRelative(-0.49f, 0.47f, -1.1f, 0.81f, -1.77f, 0.98f)
                lineToRelative(2.77f, 7.6f)
                lineTo(17.39f, 21.0f)
                lineToRelative(0.26f, -2.22f)
                lineTo(14.77f, 10.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.94f, 8.6f)
                curveToRelative(0.3f, -1.56f, -0.6f, -2.94f, -1.94f, -3.42f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.18f)
                curveTo(9.84f, 5.6f, 9.0f, 6.7f, 9.0f, 8.0f)
                curveToRelative(0.0f, 1.84f, 1.66f, 3.3f, 3.56f, 2.95f)
                curveTo(13.74f, 10.73f, 14.71f, 9.78f, 14.94f, 8.6f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(13.0f, 8.55f, 12.55f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _architecture!!
    }

private var _architecture: ImageVector? = null
