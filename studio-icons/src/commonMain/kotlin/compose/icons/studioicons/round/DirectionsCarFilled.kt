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

public val RoundGroup.DirectionsCarFilled: ImageVector
    get() {
        if (_directionsCarFilled != null) {
            return _directionsCarFilled!!
        }
        _directionsCarFilled = Builder(name = "DirectionsCarFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.92f, 6.01f)
                curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f)
                horizontalLineToRelative(-11.0f)
                curveTo(5.84f, 5.0f, 5.29f, 5.42f, 5.08f, 6.01f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(7.5f)
                curveTo(3.0f, 20.33f, 3.67f, 21.0f, 4.5f, 21.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.33f, 21.0f, 6.0f, 20.33f, 6.0f, 19.5f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(12.0f)
                lineTo(18.92f, 6.01f)
                close()
                moveTo(7.5f, 16.0f)
                curveTo(6.67f, 16.0f, 6.0f, 15.33f, 6.0f, 14.5f)
                reflectiveCurveTo(6.67f, 13.0f, 7.5f, 13.0f)
                reflectiveCurveTo(9.0f, 13.67f, 9.0f, 14.5f)
                reflectiveCurveTo(8.33f, 16.0f, 7.5f, 16.0f)
                close()
                moveTo(16.5f, 16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.33f, 16.0f, 16.5f, 16.0f)
                close()
                moveTo(5.81f, 10.0f)
                lineToRelative(1.04f, -3.0f)
                horizontalLineToRelative(10.29f)
                lineToRelative(1.04f, 3.0f)
                horizontalLineTo(5.81f)
                close()
            }
        }
        .build()
        return _directionsCarFilled!!
    }

private var _directionsCarFilled: ImageVector? = null
