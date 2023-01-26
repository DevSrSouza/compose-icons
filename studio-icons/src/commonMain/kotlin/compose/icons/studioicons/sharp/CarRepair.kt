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

public val SharpGroup.CarRepair: ImageVector
    get() {
        if (_carRepair != null) {
            return _carRepair!!
        }
        _carRepair = Builder(name = "CarRepair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 17.01f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.99f)
                horizontalLineTo(4.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.69f)
                lineTo(17.11f, 3.0f)
                horizontalLineTo(6.89f)
                lineTo(5.0f, 8.69f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.0f, 11.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(9.55f, 11.5f, 9.0f, 11.5f)
                close()
                moveTo(15.0f, 11.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(15.55f, 11.5f, 15.0f, 11.5f)
                close()
                moveTo(8.33f, 5.0f)
                horizontalLineToRelative(7.34f)
                lineToRelative(0.66f, 2.0f)
                horizontalLineTo(7.67f)
                lineTo(8.33f, 5.0f)
                close()
            }
        }
        .build()
        return _carRepair!!
    }

private var _carRepair: ImageVector? = null
