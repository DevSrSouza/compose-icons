package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ElectricCar: ImageVector
    get() {
        if (_electricCar != null) {
            return _electricCar!!
        }
        _electricCar = Builder(name = "ElectricCar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.92f, 2.01f)
                curveTo(18.72f, 1.42f, 18.16f, 1.0f, 17.5f, 1.0f)
                horizontalLineToRelative(-11.0f)
                curveTo(5.84f, 1.0f, 5.29f, 1.42f, 5.08f, 2.01f)
                lineTo(3.11f, 7.68f)
                curveTo(3.04f, 7.89f, 3.0f, 8.11f, 3.0f, 8.34f)
                verticalLineToRelative(7.16f)
                curveTo(3.0f, 16.33f, 3.67f, 17.0f, 4.5f, 17.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.33f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(8.34f)
                curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f)
                lineTo(18.92f, 2.01f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(5.67f, 12.0f, 5.0f, 11.33f, 5.0f, 10.5f)
                reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f)
                reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f)
                reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f)
                reflectiveCurveTo(19.0f, 9.67f, 19.0f, 10.5f)
                reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(5.0f, 7.0f)
                lineToRelative(1.27f, -3.82f)
                curveTo(6.41f, 2.78f, 6.79f, 2.5f, 7.22f, 2.5f)
                horizontalLineToRelative(9.56f)
                curveToRelative(0.43f, 0.0f, 0.81f, 0.28f, 0.95f, 0.68f)
                lineTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
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
        return _electricCar!!
    }

private var _electricCar: ImageVector? = null
