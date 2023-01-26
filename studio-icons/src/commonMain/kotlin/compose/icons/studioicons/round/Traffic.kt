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

public val RoundGroup.Traffic: ImageVector
    get() {
        if (_traffic != null) {
            return _traffic!!
        }
        _traffic = Builder(name = "Traffic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.96f, 10.59f)
                curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f)
                lineTo(17.0f, 10.0f)
                lineTo(17.0f, 8.86f)
                curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f)
                curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.54f, 5.0f)
                curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f)
                curveTo(4.28f, 7.18f, 5.46f, 8.46f, 7.0f, 8.86f)
                lineTo(7.0f, 10.0f)
                lineTo(4.54f, 10.0f)
                curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f)
                curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f)
                lineTo(7.0f, 15.0f)
                lineTo(4.54f, 15.0f)
                curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f)
                curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f)
                lineTo(7.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f)
                curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.89f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _traffic!!
    }

private var _traffic: ImageVector? = null
