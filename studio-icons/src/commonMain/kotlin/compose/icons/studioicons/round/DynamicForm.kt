package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DynamicForm: ImageVector
    get() {
        if (_dynamicForm != null) {
            return _dynamicForm!!
        }
        _dynamicForm = Builder(name = "DynamicForm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.68f, 9.71f)
                lineToRelative(-3.72f, 8.19f)
                curveTo(17.73f, 18.39f, 17.0f, 18.23f, 17.0f, 17.69f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f)
                horizontalLineToRelative(5.76f)
                curveToRelative(0.35f, 0.0f, 0.6f, 0.36f, 0.46f, 0.69f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(1.22f)
                curveTo(21.59f, 9.0f, 21.83f, 9.38f, 21.68f, 9.71f)
                close()
                moveTo(15.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(6.25f, 16.5f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveTo(6.25f, 16.91f, 6.25f, 16.5f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(6.25f, 7.5f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveTo(4.75f, 7.09f, 4.75f, 7.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveTo(6.25f, 7.91f, 6.25f, 7.5f)
                close()
            }
        }
        .build()
        return _dynamicForm!!
    }

private var _dynamicForm: ImageVector? = null
