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

public val RoundGroup.NoLuggage: ImageVector
    get() {
        if (_noLuggage != null) {
            return _noLuggage!!
        }
        _noLuggage = Builder(name = "NoLuggage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.49f, 20.49f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.92f, 2.92f)
                curveTo(5.02f, 7.9f, 5.0f, 7.95f, 5.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f)
                lineToRelative(1.14f, 1.14f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
                moveTo(8.75f, 18.0f)
                curveTo(8.34f, 18.0f, 8.0f, 17.66f, 8.0f, 17.25f)
                verticalLineToRelative(-6.42f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(4.92f)
                curveTo(9.5f, 17.66f, 9.16f, 18.0f, 8.75f, 18.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-3.17f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(1.67f)
                curveTo(12.75f, 17.66f, 12.41f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.17f)
                lineToRelative(1.75f, 1.75f)
                verticalLineTo(9.75f)
                curveTo(14.5f, 9.34f, 14.84f, 9.0f, 15.25f, 9.0f)
                reflectiveCurveTo(16.0f, 9.34f, 16.0f, 9.75f)
                verticalLineToRelative(3.42f)
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
                lineToRelative(3.03f, 3.03f)
                curveTo(11.91f, 9.02f, 11.95f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(10.5f, 3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _noLuggage!!
    }

private var _noLuggage: ImageVector? = null
