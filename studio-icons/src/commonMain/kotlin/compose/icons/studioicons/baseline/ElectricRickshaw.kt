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

public val BaselineGroup.ElectricRickshaw: ImageVector
    get() {
        if (_electricRickshaw != null) {
            return _electricRickshaw!!
        }
        _electricRickshaw = Builder(name = "ElectricRickshaw", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.18f)
                verticalLineTo(9.72f)
                curveToRelative(0.0f, -0.47f, -0.16f, -0.92f, -0.46f, -1.28f)
                lineTo(16.6f, 3.72f)
                curveTo(16.22f, 3.26f, 15.66f, 3.0f, 15.06f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.18f)
                curveTo(3.6f, 16.16f, 4.7f, 17.0f, 6.0f, 17.0f)
                reflectiveCurveToRelative(2.4f, -0.84f, 2.82f, -2.0f)
                horizontalLineToRelative(8.37f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                curveTo(23.0f, 12.7f, 22.16f, 11.6f, 21.0f, 11.18f)
                close()
                moveTo(18.4f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.12f)
                lineTo(18.4f, 9.0f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(6.55f, 15.0f, 6.0f, 15.0f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(20.55f, 15.0f, 20.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 20.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(6.0f, 3.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _electricRickshaw!!
    }

private var _electricRickshaw: ImageVector? = null
