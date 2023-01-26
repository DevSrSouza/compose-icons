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

public val BaselineGroup.Commute: ImageVector
    get() {
        if (_commute != null) {
            return _commute!!
        }
        _commute = Builder(name = "Commute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                curveTo(3.34f, 4.0f, 2.0f, 5.34f, 2.0f, 7.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                lineToRelative(-1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(2.0f, -2.03f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 5.98f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 7.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.0f, 14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(20.57f, 9.66f)
                curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.97f, -0.66f)
                horizontalLineToRelative(-7.19f)
                curveToRelative(-0.46f, 0.0f, -0.83f, 0.26f, -0.98f, 0.66f)
                lineTo(10.0f, 13.77f)
                lineToRelative(0.01f, 5.51f)
                curveToRelative(0.0f, 0.38f, 0.31f, 0.72f, 0.69f, 0.72f)
                horizontalLineToRelative(0.62f)
                curveToRelative(0.38f, 0.0f, 0.68f, -0.38f, 0.68f, -0.76f)
                lineTo(12.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.24f)
                curveToRelative(0.0f, 0.38f, 0.31f, 0.76f, 0.69f, 0.76f)
                horizontalLineToRelative(0.61f)
                curveToRelative(0.38f, 0.0f, 0.69f, -0.34f, 0.69f, -0.72f)
                lineToRelative(0.01f, -1.37f)
                verticalLineToRelative(-4.14f)
                lineToRelative(-1.43f, -4.11f)
                close()
                moveTo(12.41f, 10.0f)
                horizontalLineToRelative(7.19f)
                lineToRelative(1.03f, 3.0f)
                horizontalLineToRelative(-9.25f)
                lineToRelative(1.03f, -3.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(20.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _commute!!
    }

private var _commute: ImageVector? = null
