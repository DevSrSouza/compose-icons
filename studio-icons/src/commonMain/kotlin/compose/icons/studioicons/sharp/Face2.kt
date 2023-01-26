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

public val SharpGroup.Face2: ImageVector
    get() {
        if (_face2 != null) {
            return _face2!!
        }
        _face2 = Builder(name = "Face2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.97f, 13.52f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.02f, 0.0f, -0.04f)
                curveTo(23.21f, 12.38f, 24.0f, 10.78f, 24.0f, 9.0f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.26f, 0.0f, -0.52f, 0.02f, -0.78f, 0.06f)
                curveTo(16.19f, 1.23f, 14.24f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(7.81f, 1.23f, 6.78f, 3.06f)
                curveTo(6.52f, 3.02f, 6.26f, 3.0f, 6.0f, 3.0f)
                curveTo(2.69f, 3.0f, 0.0f, 5.69f, 0.0f, 9.0f)
                curveToRelative(0.0f, 1.78f, 0.79f, 3.38f, 2.02f, 4.48f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.04f)
                curveTo(0.79f, 14.62f, 0.0f, 16.22f, 0.0f, 18.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.39f, 0.0f, 2.67f, -0.48f, 3.69f, -1.28f)
                curveTo(10.43f, 22.9f, 11.2f, 23.0f, 12.0f, 23.0f)
                reflectiveCurveToRelative(1.57f, -0.1f, 2.31f, -0.28f)
                curveTo(15.33f, 23.52f, 16.61f, 24.0f, 18.0f, 24.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                curveTo(24.0f, 16.22f, 23.21f, 14.62f, 21.97f, 13.52f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -3.72f, 2.56f, -6.85f, 6.0f, -7.74f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.03f, 0.0f, 0.05f)
                curveToRelative(0.0f, 3.34f, 2.72f, 6.06f, 6.06f, 6.06f)
                curveToRelative(1.26f, 0.0f, 2.45f, -0.39f, 3.45f, -1.09f)
                curveTo(19.82f, 11.14f, 20.0f, 12.05f, 20.0f, 13.0f)
                curveTo(20.0f, 17.41f, 16.41f, 21.0f, 12.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
        }
        .build()
        return _face2!!
    }

private var _face2: ImageVector? = null
