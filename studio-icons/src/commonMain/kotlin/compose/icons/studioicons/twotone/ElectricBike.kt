package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ElectricBike: ImageVector
    get() {
        if (_electricBike != null) {
            return _electricBike!!
        }
        _electricBike = Builder(name = "ElectricBike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-0.82f)
                lineToRelative(-1.7f, -4.68f)
                curveTo(16.19f, 1.53f, 15.44f, 1.0f, 14.6f, 1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.6f)
                lineToRelative(1.46f, 4.0f)
                horizontalLineToRelative(-4.81f)
                lineToRelative(-0.36f, -1.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.75f)
                lineToRelative(1.82f, 5.0f)
                horizontalLineTo(9.9f)
                curveTo(9.46f, 8.77f, 7.59f, 7.12f, 5.25f, 7.01f)
                curveTo(2.45f, 6.87f, 0.0f, 9.2f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f)
                horizontalLineToRelative(4.2f)
                curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f)
                curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f)
                curveTo(24.0f, 9.2f, 21.8f, 7.0f, 19.0f, 7.0f)
                close()
                moveTo(7.82f, 13.0f)
                curveToRelative(-0.4f, 1.17f, -1.49f, 2.0f, -2.82f, 2.0f)
                curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.32f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.82f)
                close()
                moveTo(14.1f, 11.0f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-0.73f, -2.0f)
                horizontalLineTo(15.0f)
                curveTo(14.56f, 9.58f, 14.24f, 10.25f, 14.1f, 11.0f)
                close()
                moveTo(19.0f, 15.0f)
                curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f)
                lineToRelative(0.96f, 2.64f)
                lineToRelative(1.88f, -0.68f)
                lineToRelative(-0.97f, -2.67f)
                curveTo(18.94f, 9.01f, 18.97f, 9.0f, 19.0f, 9.0f)
                curveToRelative(1.68f, 0.0f, 3.0f, 1.32f, 3.0f, 3.0f)
                reflectiveCurveTo(20.68f, 15.0f, 19.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(6.0f, 3.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(-6.0f, -3.0f)
                close()
            }
        }
        .build()
        return _electricBike!!
    }

private var _electricBike: ImageVector? = null
