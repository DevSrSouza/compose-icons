package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Sports: ImageVector
    get() {
        if (_sports != null) {
            return _sports!!
        }
        _sports = Builder(name = "Sports", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.23f, 6.0f)
                curveTo(9.57f, 6.0f, 8.01f, 6.66f, 6.87f, 7.73f)
                curveTo(6.54f, 6.73f, 5.61f, 6.0f, 4.5f, 6.0f)
                curveTo(3.12f, 6.0f, 2.0f, 7.12f, 2.0f, 8.5f)
                curveTo(2.0f, 9.88f, 3.12f, 11.0f, 4.5f, 11.0f)
                curveToRelative(0.21f, 0.0f, 0.41f, -0.03f, 0.61f, -0.08f)
                curveToRelative(-0.05f, 0.25f, -0.09f, 0.51f, -0.1f, 0.78f)
                curveToRelative(-0.18f, 3.68f, 2.95f, 6.68f, 6.68f, 6.27f)
                curveToRelative(2.55f, -0.28f, 4.68f, -2.26f, 5.19f, -4.77f)
                curveToRelative(0.15f, -0.71f, 0.15f, -1.4f, 0.06f, -2.06f)
                curveToRelative(-0.09f, -0.6f, 0.38f, -1.13f, 0.99f, -1.13f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.23f)
                close()
                moveTo(4.5f, 9.0f)
                curveTo(4.22f, 9.0f, 4.0f, 8.78f, 4.0f, 8.5f)
                curveTo(4.0f, 8.22f, 4.22f, 8.0f, 4.5f, 8.0f)
                reflectiveCurveTo(5.0f, 8.22f, 5.0f, 8.5f)
                curveTo(5.0f, 8.78f, 4.78f, 9.0f, 4.5f, 9.0f)
                close()
                moveTo(11.0f, 15.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveTo(12.66f, 15.0f, 11.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _sports!!
    }

private var _sports: ImageVector? = null
