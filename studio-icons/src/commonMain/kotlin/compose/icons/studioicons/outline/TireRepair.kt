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

public val OutlineGroup.TireRepair: ImageVector
    get() {
        if (_tireRepair != null) {
            return _tireRepair!!
        }
        _tireRepair = Builder(name = "TireRepair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.28f, 0.11f, -0.53f, 0.29f, -0.71f)
                curveToRelative(0.4f, -0.4f, 2.46f, -1.04f, 2.46f, -1.04f)
                reflectiveCurveToRelative(-0.64f, 2.06f, -1.04f, 2.46f)
                curveTo(19.53f, 7.89f, 19.28f, 8.0f, 19.0f, 8.0f)
                close()
                moveTo(20.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(8.17f)
                curveToRelative(0.31f, -0.11f, 0.65f, -0.17f, 1.0f, -0.17f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(0.0f, -1.42f)
                curveToRelative(-1.77f, -0.77f, -3.0f, -2.53f, -3.0f, -4.58f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.05f, -1.23f, 3.81f, -3.0f, 4.58f)
                lineTo(21.0f, 13.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveTo(22.0f, 8.66f, 22.0f, 7.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(8.0f, 9.0f)
                verticalLineTo(6.17f)
                lineTo(9.17f, 5.0f)
                horizontalLineTo(4.83f)
                lineTo(6.0f, 6.17f)
                verticalLineTo(9.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(2.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(14.0f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(2.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(19.0f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-2.83f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(12.0f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-2.83f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _tireRepair!!
    }

private var _tireRepair: ImageVector? = null
