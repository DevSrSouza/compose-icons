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

public val BaselineGroup.CarRepair: ImageVector
    get() {
        if (_carRepair != null) {
            return _carRepair!!
        }
        _carRepair = Builder(name = "CarRepair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.22f, 12.0f)
                curveToRelative(0.68f, 0.0f, 1.22f, -0.54f, 1.22f, -1.22f)
                curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f)
                reflectiveCurveTo(15.0f, 10.11f, 15.0f, 10.78f)
                curveTo(15.0f, 11.46f, 15.55f, 12.0f, 16.22f, 12.0f)
                close()
                moveTo(6.56f, 10.78f)
                curveToRelative(0.0f, 0.67f, 0.54f, 1.22f, 1.22f, 1.22f)
                reflectiveCurveTo(9.0f, 11.46f, 9.0f, 10.78f)
                curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f)
                reflectiveCurveTo(6.56f, 10.11f, 6.56f, 10.78f)
                close()
                moveTo(7.61f, 4.0f)
                lineTo(6.28f, 8.0f)
                horizontalLineToRelative(11.43f)
                lineToRelative(-1.33f, -4.0f)
                horizontalLineTo(7.61f)
                close()
                moveTo(16.28f, 3.0f)
                curveToRelative(0.0f, 0.0f, 0.54f, 0.01f, 0.92f, 0.54f)
                curveToRelative(0.02f, 0.02f, 0.03f, 0.04f, 0.05f, 0.07f)
                curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f)
                curveTo(17.66f, 4.66f, 19.0f, 8.69f, 19.0f, 8.69f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f)
                horizontalLineToRelative(-0.44f)
                curveTo(17.35f, 16.0f, 17.0f, 15.64f, 17.0f, 15.19f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.19f)
                curveTo(7.0f, 15.64f, 6.65f, 16.0f, 6.22f, 16.0f)
                horizontalLineTo(5.78f)
                curveTo(5.35f, 16.0f, 5.0f, 15.64f, 5.0f, 15.19f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, 0.0f, 1.34f, -4.02f, 1.55f, -4.69f)
                curveToRelative(0.05f, -0.16f, 0.12f, -0.28f, 0.19f, -0.4f)
                curveTo(6.77f, 3.58f, 6.78f, 3.56f, 6.8f, 3.54f)
                curveTo(7.18f, 3.01f, 7.72f, 3.0f, 7.72f, 3.0f)
                horizontalLineTo(16.28f)
                close()
                moveTo(4.0f, 17.01f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.01f)
                close()
            }
        }
        .build()
        return _carRepair!!
    }

private var _carRepair: ImageVector? = null
