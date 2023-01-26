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

public val BaselineGroup.VapingRooms: ImageVector
    get() {
        if (_vapingRooms != null) {
            return _vapingRooms!!
        }
        _vapingRooms = Builder(name = "VapingRooms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.5f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f)
                close()
                moveTo(22.0f, 12.76f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.23f)
                curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f)
                verticalLineTo(7.2f)
                curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f)
                reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f)
                verticalLineTo(2.0f)
                curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f)
                curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f)
                curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f)
                close()
                moveTo(19.5f, 13.36f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-1.3f)
                curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f)
                horizontalLineTo(14.5f)
                curveToRelative(-1.85f, 0.0f, -3.35f, -1.5f, -3.35f, -3.35f)
                reflectiveCurveToRelative(1.5f, -3.35f, 3.35f, -3.35f)
                verticalLineToRelative(1.5f)
                curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f)
                reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f)
                horizontalLineToRelative(1.53f)
                curveTo(17.9f, 10.2f, 19.5f, 11.55f, 19.5f, 13.36f)
                close()
            }
        }
        .build()
        return _vapingRooms!!
    }

private var _vapingRooms: ImageVector? = null
