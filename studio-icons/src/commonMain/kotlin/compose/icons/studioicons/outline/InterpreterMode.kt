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

public val OutlineGroup.InterpreterMode: ImageVector
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
                moveTo(13.0f, 8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveTo(13.0f, 6.9f, 13.0f, 8.0f)
                close()
                moveTo(15.0f, 15.0f)
                curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f)
                curveTo(9.2f, 16.5f, 9.0f, 16.84f, 9.0f, 17.22f)
                verticalLineTo(18.0f)
                lineToRelative(7.17f, 0.0f)
                curveToRelative(0.5f, 0.86f, 1.25f, 1.56f, 2.15f, 2.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f)
                curveTo(10.29f, 13.7f, 12.47f, 13.0f, 15.0f, 13.0f)
                curveToRelative(0.39f, 0.0f, 0.77f, 0.02f, 1.14f, 0.05f)
                curveToRelative(-0.33f, 0.59f, -0.55f, 1.26f, -0.62f, 1.96f)
                curveTo(15.35f, 15.0f, 15.18f, 15.0f, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _interpreterMode!!
    }

private var _interpreterMode: ImageVector? = null
