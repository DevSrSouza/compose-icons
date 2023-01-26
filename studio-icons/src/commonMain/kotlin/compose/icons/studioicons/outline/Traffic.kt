package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Traffic: ImageVector
    get() {
        if (_traffic != null) {
            return _traffic!!
        }
        _traffic = Builder(name = "Traffic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 8.86f)
                curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(7.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(7.0f, 15.0f)
                lineTo(4.0f, 15.0f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(7.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f)
                close()
                moveTo(15.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(12.83f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(12.83f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveTo(11.17f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _traffic!!
    }

private var _traffic: ImageVector? = null
