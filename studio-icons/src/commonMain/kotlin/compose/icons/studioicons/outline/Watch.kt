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

public val OutlineGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.31f, 2.0f)
                lineToRelative(0.41f, 2.48f)
                curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f)
                lineTo(9.7f, 2.0f)
                horizontalLineToRelative(4.61f)
                moveToRelative(0.41f, 17.52f)
                lineTo(14.31f, 22.0f)
                lineTo(9.7f, 22.0f)
                lineToRelative(-0.41f, -2.47f)
                curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f)
                curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f)
                moveTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineToRelative(-0.95f, 5.73f)
                curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f)
                reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.96f, -5.73f)
                curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f)
                reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f)
                lineTo(16.0f, 0.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
