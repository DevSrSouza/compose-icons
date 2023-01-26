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

public val RoundGroup.AddLocationAlt: ImageVector
    get() {
        if (_addLocationAlt != null) {
            return _addLocationAlt!!
        }
        _addLocationAlt = Builder(name = "AddLocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(1.0f)
                curveTo(18.0f, 0.45f, 18.45f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(10.9f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(14.72f, 2.47f)
                curveTo(14.28f, 2.83f, 14.0f, 3.38f, 14.0f, 4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.32f, 0.0f, 0.62f, -0.08f, 0.89f, -0.21f)
                curveTo(19.96f, 9.24f, 20.0f, 9.71f, 20.0f, 10.2f)
                curveToRelative(0.0f, 3.18f, -2.45f, 6.92f, -7.34f, 11.23f)
                curveToRelative(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0.0f)
                curveTo(6.45f, 17.12f, 4.0f, 13.38f, 4.0f, 10.2f)
                curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f)
                curveTo(12.94f, 2.0f, 13.86f, 2.16f, 14.72f, 2.47f)
                close()
            }
        }
        .build()
        return _addLocationAlt!!
    }

private var _addLocationAlt: ImageVector? = null
