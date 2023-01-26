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

public val RoundGroup.ElectricMeter: ImageVector
    get() {
        if (_electricMeter != null) {
            return _electricMeter!!
        }
        _electricMeter = Builder(name = "ElectricMeter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.73f, 2.0f)
                curveTo(7.05f, 2.14f, 3.15f, 6.03f, 3.0f, 10.71f)
                curveToRelative(-0.13f, 4.04f, 2.42f, 7.5f, 6.0f, 8.77f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0.33f, 0.04f, 0.66f, 0.06f, 1.0f, 0.06f)
                reflectiveCurveToRelative(0.67f, -0.02f, 1.0f, -0.06f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.53f)
                curveToRelative(3.49f, -1.24f, 6.0f, -4.57f, 6.0f, -8.47f)
                curveTo(21.0f, 5.95f, 16.82f, 1.85f, 11.73f, 2.0f)
                close()
                moveTo(13.54f, 14.71f)
                lineTo(12.0f, 16.25f)
                curveToRelative(-0.41f, 0.41f, -1.09f, 0.41f, -1.5f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.41f, -0.41f, -0.41f, -1.09f, 0.0f, -1.5f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(-0.54f, -0.54f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(12.0f, 10.75f)
                curveToRelative(0.41f, -0.41f, 1.09f, -0.41f, 1.5f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.41f, 0.41f, 0.41f, 1.09f, 0.0f, 1.5f)
                lineToRelative(-0.5f, 0.5f)
                lineToRelative(0.54f, 0.54f)
                curveTo(13.93f, 13.68f, 13.93f, 14.32f, 13.54f, 14.71f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineTo(9.0f)
                curveTo(8.45f, 9.0f, 8.0f, 8.55f, 8.0f, 8.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(16.0f, 8.55f, 15.55f, 9.0f, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _electricMeter!!
    }

private var _electricMeter: ImageVector? = null
