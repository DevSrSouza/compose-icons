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

public val OutlineGroup.LeakRemove: ImageVector
    get() {
        if (_leakRemove != null) {
            return _leakRemove!!
        }
        _leakRemove = Builder(name = "LeakRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.35f, -0.31f, 2.63f, -0.84f, 3.77f)
                lineToRelative(1.49f, 1.49f)
                curveTo(13.51f, 6.7f, 14.0f, 4.91f, 14.0f, 3.0f)
                close()
                moveTo(21.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.91f, 0.0f, -3.7f, 0.49f, -5.27f, 1.35f)
                lineToRelative(1.49f, 1.49f)
                curveToRelative(1.15f, -0.53f, 2.43f, -0.84f, 3.78f, -0.84f)
                close()
                moveTo(21.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.79f, 0.0f, -1.54f, 0.13f, -2.24f, 0.37f)
                lineToRelative(1.68f, 1.68f)
                curveToRelative(0.19f, -0.01f, 0.37f, -0.05f, 0.56f, -0.05f)
                close()
                moveTo(10.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(0.0f, 0.19f, -0.04f, 0.37f, -0.06f, 0.56f)
                lineToRelative(1.68f, 1.68f)
                curveToRelative(0.25f, -0.7f, 0.38f, -1.46f, 0.38f, -2.24f)
                close()
                moveTo(4.41f, 2.86f)
                lineTo(3.0f, 4.27f)
                lineToRelative(2.84f, 2.84f)
                curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f)
                lineTo(8.7f, 9.97f)
                curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.72f, 0.0f, 5.2f, -0.99f, 7.11f, -2.62f)
                lineToRelative(2.51f, 2.51f)
                curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.7f)
                lineToRelative(1.43f, 1.43f)
                curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f)
                lineTo(19.73f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                close()
            }
        }
        .build()
        return _leakRemove!!
    }

private var _leakRemove: ImageVector? = null
