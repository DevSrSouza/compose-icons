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

public val SharpGroup.LockPerson: ImageVector
    get() {
        if (_lockPerson != null) {
            return _lockPerson!!
        }
        _lockPerson = Builder(name = "LockPerson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.43f, 11.18f)
                curveToRelative(1.26f, -0.29f, 2.47f, -0.21f, 3.57f, 0.12f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.22f)
                curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f)
                curveTo(9.51f, 0.74f, 7.0f, 3.08f, 7.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(8.26f)
                curveToRelative(-1.01f, -1.45f, -1.5f, -3.3f, -1.15f, -5.27f)
                curveTo(11.6f, 14.0f, 13.74f, 11.79f, 16.43f, 11.18f)
                close()
                moveTo(8.9f, 6.0f)
                curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f)
                reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.9f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(18.83f, 18.0f, 18.0f, 18.0f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(17.17f, 15.0f, 18.0f, 15.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveToRelative(-1.03f, 0.0f, -1.94f, -0.52f, -2.48f, -1.32f)
                curveTo(16.25f, 19.26f, 17.09f, 19.0f, 18.0f, 19.0f)
                reflectiveCurveToRelative(1.75f, 0.26f, 2.48f, 0.68f)
                curveTo(19.94f, 20.48f, 19.03f, 21.0f, 18.0f, 21.0f)
                close()
            }
        }
        .build()
        return _lockPerson!!
    }

private var _lockPerson: ImageVector? = null
