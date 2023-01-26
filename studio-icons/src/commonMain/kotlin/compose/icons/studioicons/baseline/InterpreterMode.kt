package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.InterpreterMode: ImageVector
    get() {
        if (_interpreterMode != null) {
            return _interpreterMode!!
        }
        _interpreterMode = Builder(name = "InterpreterMode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 16.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 15.83f, 21.33f, 16.5f, 20.5f, 16.5f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -1.54f, 0.0f, -1.54f)
                curveToRelative(1.69f, -0.24f, 3.0f, -1.7f, 3.0f, -3.46f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(18.0f, 16.38f, 18.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 1.76f, 1.31f, 3.22f, 3.0f, 3.46f)
                curveTo(20.0f, 18.46f, 20.0f, 20.0f, 20.0f, 20.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                curveToRelative(0.47f, 0.0f, 0.92f, 0.08f, 1.34f, 0.23f)
                curveTo(9.5f, 5.26f, 9.0f, 6.57f, 9.0f, 8.0f)
                curveToRelative(0.0f, 1.43f, 0.5f, 2.74f, 1.34f, 3.77f)
                curveTo(9.92f, 11.92f, 9.47f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(7.11f, 13.13f)
                curveTo(5.79f, 14.05f, 5.0f, 15.57f, 5.0f, 17.22f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f)
                curveTo(3.85f, 13.92f, 5.37f, 13.37f, 7.11f, 13.13f)
                close()
                moveTo(11.0f, 8.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveTo(11.0f, 10.21f, 11.0f, 8.0f)
                close()
                moveTo(18.32f, 20.0f)
                curveToRelative(-1.67f, -0.81f, -2.82f, -2.52f, -2.82f, -4.5f)
                curveToRelative(0.0f, -0.89f, 0.23f, -1.73f, 0.64f, -2.45f)
                curveTo(15.77f, 13.02f, 15.39f, 13.0f, 15.0f, 13.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(7.61f, 15.07f, 7.0f, 16.1f, 7.0f, 17.22f)
                verticalLineTo(20.0f)
                lineTo(18.32f, 20.0f)
                close()
            }
        }
        .build()
        return _interpreterMode!!
    }

private var _interpreterMode: ImageVector? = null
