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

public val OutlineGroup.Cyclone: ImageVector
    get() {
        if (_cyclone != null) {
            return _cyclone!!
        }
        _cyclone = Builder(name = "Cyclone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveTo(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.47f)
                verticalLineTo(5.35f)
                curveTo(20.05f, 4.77f, 16.56f, 4.0f, 12.0f, 4.0f)
                curveTo(9.85f, 4.0f, 7.89f, 4.86f, 6.46f, 6.24f)
                curveTo(6.59f, 5.39f, 6.86f, 3.84f, 7.47f, 2.0f)
                horizontalLineTo(5.35f)
                curveTo(4.77f, 3.95f, 4.0f, 7.44f, 4.0f, 12.0f)
                curveToRelative(0.0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f)
                curveToRelative(-0.85f, -0.14f, -2.4f, -0.4f, -4.24f, -1.01f)
                verticalLineToRelative(2.12f)
                curveTo(3.95f, 19.23f, 7.44f, 20.0f, 12.0f, 20.0f)
                curveToRelative(2.15f, 0.0f, 4.11f, -0.86f, 5.54f, -2.24f)
                curveToRelative(-0.14f, 0.85f, -0.4f, 2.4f, -1.01f, 4.24f)
                horizontalLineToRelative(2.12f)
                curveTo(19.23f, 20.05f, 20.0f, 16.56f, 20.0f, 12.0f)
                curveToRelative(0.0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f)
                curveTo(18.61f, 6.59f, 20.16f, 6.86f, 22.0f, 7.47f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveTo(15.31f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cyclone!!
    }

private var _cyclone: ImageVector? = null
