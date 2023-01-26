package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Face: ImageVector
    get() {
        if (_face != null) {
            return _face!!
        }
        _face = Builder(name = "Face", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 13.0f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13.0f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(15.0f, 11.75f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.48f, 10.0f, 10.0f)
                close()
                moveTo(10.66f, 4.12f)
                curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f)
                curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f)
                curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f)
                close()
                moveTo(4.42f, 9.47f)
                curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f)
                curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, -0.78f, -0.12f, -1.53f, -0.33f, -2.24f)
                curveToRelative(-0.7f, 0.15f, -1.42f, 0.24f, -2.17f, 0.24f)
                curveToRelative(-3.13f, 0.0f, -5.92f, -1.44f, -7.76f, -3.69f)
                curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4.0f, 11.86f)
                curveToRelative(0.01f, 0.04f, 0.0f, 0.09f, 0.0f, 0.14f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _face!!
    }

private var _face: ImageVector? = null
