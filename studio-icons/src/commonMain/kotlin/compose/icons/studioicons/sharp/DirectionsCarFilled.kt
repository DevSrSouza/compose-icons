package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DirectionsCarFilled: ImageVector
    get() {
        if (_directionsCarFilled != null) {
            return _directionsCarFilled!!
        }
        _directionsCarFilled = Builder(name = "DirectionsCarFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.57f, 5.0f)
                horizontalLineTo(5.43f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                lineTo(18.57f, 5.0f)
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
