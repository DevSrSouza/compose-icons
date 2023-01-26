package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.DepartureBoard: ImageVector
    get() {
        if (_departureBoard != null) {
            return _departureBoard!!
        }
        _departureBoard = Builder(name = "DepartureBoard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 16.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 16.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                curveToRelative(-2.39f, 0.0f, -4.49f, 1.2f, -5.75f, 3.02f)
                curveTo(9.84f, 4.01f, 9.43f, 4.0f, 9.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f)
                lineTo(2.0f, 22.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f)
                verticalLineToRelative(-3.08f)
                curveToRelative(3.39f, -0.49f, 6.0f, -3.39f, 6.0f, -6.92f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(0.29f)
                curveToRelative(-0.09f, 0.32f, -0.16f, 0.66f, -0.21f, 0.99f)
                lineTo(3.34f, 6.99f)
                curveTo(3.89f, 6.46f, 5.31f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(3.0f, 8.99f)
                horizontalLineToRelative(6.08f)
                curveToRelative(0.16f, 1.11f, 0.57f, 2.13f, 1.18f, 3.01f)
                lineTo(3.0f, 12.0f)
                lineTo(3.0f, 8.99f)
                close()
                moveTo(15.0f, 18.0f)
                curveToRelative(0.0f, 0.37f, -0.21f, 0.62f, -0.34f, 0.73f)
                lineToRelative(-0.29f, 0.27f)
                lineTo(3.63f, 19.0f)
                lineToRelative(-0.29f, -0.27f)
                curveTo(3.21f, 18.62f, 3.0f, 18.37f, 3.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(9.41f)
                curveToRelative(0.78f, 0.47f, 1.65f, 0.79f, 2.59f, 0.92f)
                lineTo(15.0f, 18.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(16.5f, 4.0f)
                lineTo(15.0f, 4.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(3.62f, 2.16f)
                lineToRelative(0.75f, -1.23f)
                lineToRelative(-2.87f, -1.68f)
                close()
            }
        }
        .build()
        return _departureBoard!!
    }

private var _departureBoard: ImageVector? = null
