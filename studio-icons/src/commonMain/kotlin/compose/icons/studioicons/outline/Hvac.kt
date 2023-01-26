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

public val OutlineGroup.Hvac: ImageVector
    get() {
        if (_hvac != null) {
            return _hvac!!
        }
        _hvac = Builder(name = "Hvac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(15.44f, 10.0f)
                curveToRelative(0.26f, 0.45f, 0.44f, 0.96f, 0.51f, 1.5f)
                horizontalLineToRelative(-7.9f)
                curveToRelative(0.07f, -0.54f, 0.24f, -1.05f, 0.51f, -1.5f)
                horizontalLineTo(15.44f)
                close()
                moveTo(15.95f, 12.5f)
                curveToRelative(-0.07f, 0.54f, -0.24f, 1.05f, -0.51f, 1.5f)
                horizontalLineTo(8.56f)
                curveToRelative(-0.26f, -0.45f, -0.44f, -0.96f, -0.51f, -1.5f)
                horizontalLineTo(15.95f)
                close()
                moveTo(9.38f, 15.0f)
                horizontalLineToRelative(5.24f)
                curveToRelative(-0.7f, 0.61f, -1.61f, 1.0f, -2.62f, 1.0f)
                reflectiveCurveTo(10.09f, 15.61f, 9.38f, 15.0f)
                close()
                moveTo(14.62f, 9.0f)
                horizontalLineTo(9.38f)
                curveToRelative(0.7f, -0.61f, 1.61f, -1.0f, 2.62f, -1.0f)
                reflectiveCurveTo(13.91f, 8.39f, 14.62f, 9.0f)
                close()
            }
        }
        .build()
        return _hvac!!
    }

private var _hvac: ImageVector? = null