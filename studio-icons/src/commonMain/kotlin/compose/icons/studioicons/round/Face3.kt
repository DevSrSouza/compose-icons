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

public val RoundGroup.Face3: ImageVector
    get() {
        if (_face3 != null) {
            return _face3!!
        }
        _face3 = Builder(name = "Face3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.91f, 11.96f)
                curveTo(22.39f, 6.32f, 17.66f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(1.61f, 6.32f, 1.09f, 11.96f)
                lineToRelative(-0.9f, 9.86f)
                curveTo(0.09f, 22.99f, 1.01f, 24.0f, 2.19f, 24.0f)
                horizontalLineToRelative(19.62f)
                curveToRelative(1.18f, 0.0f, 2.1f, -1.01f, 1.99f, -2.18f)
                lineTo(22.91f, 11.96f)
                close()
                moveTo(4.54f, 9.13f)
                curveTo(5.41f, 9.68f, 6.43f, 10.0f, 7.5f, 10.0f)
                curveTo(9.36f, 10.0f, 11.0f, 9.07f, 12.0f, 7.65f)
                curveTo(13.0f, 9.07f, 14.64f, 10.0f, 16.5f, 10.0f)
                curveToRelative(1.07f, 0.0f, 2.09f, -0.32f, 2.96f, -0.87f)
                curveTo(19.8f, 10.02f, 20.0f, 10.99f, 20.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f)
                curveTo(4.0f, 10.99f, 4.2f, 10.02f, 4.54f, 9.13f)
                close()
            }
        }
        .build()
        return _face3!!
    }

private var _face3: ImageVector? = null
