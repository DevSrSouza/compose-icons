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

public val BaselineGroup.NoLuggage: ImageVector
    get() {
        if (_noLuggage != null) {
            return _noLuggage!!
        }
        _noLuggage = Builder(name = "NoLuggage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 9.0f)
                verticalLineToRelative(0.92f)
                lineToRelative(1.75f, 1.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(4.17f)
                lineToRelative(3.0f, 3.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.83f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(10.5f, 3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.5f)
                close()
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(3.63f, 3.63f)
                curveTo(5.02f, 7.9f, 5.0f, 7.95f, 5.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f)
                lineToRelative(1.85f, 1.85f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineToRelative(-7.17f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(12.75f, 18.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.92f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _noLuggage!!
    }

private var _noLuggage: ImageVector? = null
