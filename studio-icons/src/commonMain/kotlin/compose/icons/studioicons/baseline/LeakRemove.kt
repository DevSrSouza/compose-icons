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

public val BaselineGroup.LeakRemove: ImageVector
    get() {
        if (_leakRemove != null) {
            return _leakRemove!!
        }
        _leakRemove = Builder(name = "LeakRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(0.0f, 0.37f, -0.04f, 0.72f, -0.12f, 1.06f)
                lineToRelative(1.59f, 1.59f)
                curveTo(9.81f, 4.84f, 10.0f, 3.94f, 10.0f, 3.0f)
                close()
                moveTo(3.0f, 4.27f)
                lineToRelative(2.84f, 2.84f)
                curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f)
                lineTo(8.7f, 9.97f)
                curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.71f, 0.0f, 5.19f, -0.99f, 7.11f, -2.62f)
                lineToRelative(2.5f, 2.5f)
                curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.69f)
                lineToRelative(1.43f, 1.43f)
                curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                lineTo(4.27f, 3.0f)
                lineTo(3.0f, 4.27f)
                close()
                moveTo(14.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.5f, -0.37f, 2.91f, -1.02f, 4.16f)
                lineToRelative(1.46f, 1.46f)
                curveTo(13.42f, 6.98f, 14.0f, 5.06f, 14.0f, 3.0f)
                close()
                moveTo(19.94f, 16.12f)
                curveToRelative(0.34f, -0.08f, 0.69f, -0.12f, 1.06f, -0.12f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.94f, 0.0f, -1.84f, 0.19f, -2.66f, 0.52f)
                lineToRelative(1.6f, 1.6f)
                close()
                moveTo(15.38f, 11.56f)
                lineToRelative(1.46f, 1.46f)
                curveTo(18.09f, 12.37f, 19.5f, 12.0f, 21.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.06f, 0.0f, -3.98f, 0.58f, -5.62f, 1.56f)
                close()
            }
        }
        .build()
        return _leakRemove!!
    }

private var _leakRemove: ImageVector? = null
