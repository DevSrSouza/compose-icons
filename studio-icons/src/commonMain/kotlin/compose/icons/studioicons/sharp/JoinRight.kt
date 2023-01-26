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

public val SharpGroup.JoinRight: ImageVector
    get() {
        if (_joinRight != null) {
            return _joinRight!!
        }
        _joinRight = Builder(name = "JoinRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 5.74f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 5.74f, 0.0f, true, false, -6.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                curveToRelative(0.0f, 0.97f, -0.23f, 4.16f, -3.03f, 6.5f)
                curveTo(14.25f, 18.81f, 15.1f, 19.0f, 16.0f, 19.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-0.9f, 0.0f, -1.75f, 0.19f, -2.53f, 0.5f)
                curveTo(16.27f, 7.84f, 16.5f, 11.03f, 16.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.0f)
                curveToRelative(0.9f, 0.0f, 1.75f, -0.19f, 2.53f, -0.5f)
                curveToRelative(-0.61f, -0.51f, -1.1f, -1.07f, -1.49f, -1.63f)
                curveTo(8.71f, 16.95f, 8.36f, 17.0f, 8.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                curveToRelative(0.36f, 0.0f, 0.71f, 0.05f, 1.04f, 0.13f)
                curveToRelative(0.39f, -0.56f, 0.88f, -1.12f, 1.49f, -1.63f)
                curveTo(9.75f, 5.19f, 8.9f, 5.0f, 8.0f, 5.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveTo(4.14f, 19.0f, 8.0f, 19.0f)
                close()
            }
        }
        .build()
        return _joinRight!!
    }

private var _joinRight: ImageVector? = null
