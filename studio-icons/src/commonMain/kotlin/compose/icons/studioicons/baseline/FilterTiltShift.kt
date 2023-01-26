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

public val BaselineGroup.FilterTiltShift: ImageVector
    get() {
        if (_filterTiltShift != null) {
            return _filterTiltShift!!
        }
        _filterTiltShift = Builder(name = "FilterTiltShift", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.07f)
                lineTo(11.0f, 2.05f)
                curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f)
                lineTo(7.1f, 5.69f)
                curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f)
                close()
                moveTo(18.32f, 4.26f)
                curveTo(16.84f, 3.05f, 15.01f, 2.25f, 13.0f, 2.05f)
                verticalLineToRelative(2.02f)
                curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f)
                lineToRelative(1.42f, -1.43f)
                close()
                moveTo(19.93f, 11.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.2f, -2.01f, -1.0f, -3.84f, -2.21f, -5.32f)
                lineTo(18.31f, 7.1f)
                curveToRelative(0.86f, 1.11f, 1.44f, 2.44f, 1.62f, 3.9f)
                close()
                moveTo(5.69f, 7.1f)
                lineTo(4.26f, 5.68f)
                curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f)
                close()
                moveTo(4.07f, 13.0f)
                lineTo(2.05f, 13.0f)
                curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f)
                lineToRelative(1.43f, -1.43f)
                curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f)
                close()
                moveTo(15.0f, 12.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                close()
                moveTo(18.31f, 16.9f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(1.21f, -1.48f, 2.01f, -3.32f, 2.21f, -5.32f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.18f, 1.45f, -0.76f, 2.78f, -1.62f, 3.89f)
                close()
                moveTo(13.0f, 19.93f)
                verticalLineToRelative(2.02f)
                curveToRelative(2.01f, -0.2f, 3.84f, -1.0f, 5.32f, -2.21f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-1.1f, 0.86f, -2.43f, 1.44f, -3.89f, 1.62f)
                close()
                moveTo(5.68f, 19.74f)
                curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f)
                lineToRelative(-1.42f, 1.43f)
                close()
            }
        }
        .build()
        return _filterTiltShift!!
    }

private var _filterTiltShift: ImageVector? = null
