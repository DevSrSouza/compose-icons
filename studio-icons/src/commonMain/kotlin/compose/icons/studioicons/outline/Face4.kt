package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Face4: ImageVector
    get() {
        if (_face4 != null) {
            return _face4!!
        }
        _face4 = Builder(name = "Face4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-0.96f, 0.0f, -1.88f, 0.14f, -2.75f, 0.39f)
                curveTo(8.37f, 0.96f, 6.8f, 0.0f, 5.0f, 0.0f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                curveToRelative(0.0f, 1.8f, 0.96f, 3.37f, 2.39f, 4.25f)
                curveTo(2.14f, 10.12f, 2.0f, 11.04f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.9f, 0.0f, 5.44f, 1.56f, 6.84f, 3.88f)
                curveTo(18.41f, 7.95f, 17.96f, 8.0f, 17.5f, 8.0f)
                curveToRelative(-2.9f, 0.0f, -5.44f, -1.56f, -6.84f, -3.88f)
                horizontalLineToRelative(0.0f)
                curveTo(11.09f, 4.05f, 11.54f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(4.42f, 9.47f)
                lineTo(4.42f, 9.47f)
                curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f)
                curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f)
                close()
                moveTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.95f, 0.0f, 1.8f, 0.46f, 2.35f, 1.15f)
                curveTo(5.56f, 4.09f, 4.09f, 5.56f, 3.15f, 7.35f)
                curveTo(2.46f, 6.8f, 2.0f, 5.95f, 2.0f, 5.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f)
                curveToRelative(2.6f, -0.98f, 4.68f, -2.99f, 5.74f, -5.55f)
                curveTo(11.58f, 8.56f, 14.37f, 10.0f, 17.5f, 10.0f)
                curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f)
                curveTo(19.88f, 10.47f, 20.0f, 11.22f, 20.0f, 12.0f)
                curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f)
                close()
            }
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
        }
        .build()
        return _face4!!
    }

private var _face4: ImageVector? = null
