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

public val OutlineGroup.Animation: ImageVector
    get() {
        if (_animation != null) {
            return _animation!!
        }
        _animation = Builder(name = "Animation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                curveToRelative(-2.71f, 0.0f, -5.05f, 1.54f, -6.22f, 3.78f)
                curveToRelative(-1.28f, 0.67f, -2.34f, 1.72f, -3.0f, 3.0f)
                curveTo(3.54f, 9.95f, 2.0f, 12.29f, 2.0f, 15.0f)
                curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f)
                curveToRelative(2.71f, 0.0f, 5.05f, -1.54f, 6.22f, -3.78f)
                curveToRelative(1.28f, -0.67f, 2.34f, -1.72f, 3.0f, -3.0f)
                curveTo(20.46f, 14.05f, 22.0f, 11.71f, 22.0f, 9.0f)
                curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f)
                close()
                moveTo(9.0f, 20.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f)
                curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f)
                curveTo(11.16f, 19.63f, 10.12f, 20.0f, 9.0f, 20.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f)
                curveToRelative(0.0f, 3.86f, 3.13f, 6.99f, 7.0f, 7.0f)
                curveTo(14.16f, 16.63f, 13.12f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(16.7f, 13.7f)
                curveTo(16.17f, 13.89f, 15.6f, 14.0f, 15.0f, 14.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f)
                curveTo(10.83f, 7.11f, 11.4f, 7.0f, 12.0f, 7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveTo(17.0f, 12.6f, 16.89f, 13.17f, 16.7f, 13.7f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -3.86f, -3.13f, -6.99f, -7.0f, -7.0f)
                curveToRelative(0.84f, -0.63f, 1.87f, -1.0f, 3.0f, -1.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveTo(20.0f, 10.12f, 19.63f, 11.16f, 19.0f, 12.0f)
                close()
            }
        }
        .build()
        return _animation!!
    }

private var _animation: ImageVector? = null
