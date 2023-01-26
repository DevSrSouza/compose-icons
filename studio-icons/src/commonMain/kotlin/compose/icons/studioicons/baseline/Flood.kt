package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Flood: ImageVector
    get() {
        if (_flood != null) {
            return _flood!!
        }
        _flood = Builder(name = "Flood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.67f, 19.0f)
                curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f)
                curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f)
                curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.95f, 0.0f, 2.11f, -1.0f, 3.34f, -1.0f)
                curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f)
                curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.93f, 0.0f, 2.1f, -1.0f, 3.33f, -1.0f)
                curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f)
                verticalLineToRelative(-2.0f)
                curveTo(20.76f, 20.0f, 20.62f, 19.0f, 18.67f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.68f, 17.5f)
                curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f)
                curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f)
                curveToRelative(1.19f, 0.0f, 1.4f, 0.98f, 3.31f, 1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.63f, 0.0f, -1.0f, -0.28f, -1.48f, -0.55f)
                lineToRelative(-2.02f, -7.53f)
                lineToRelative(2.09f, 0.85f)
                lineToRelative(0.74f, -1.86f)
                lineTo(9.78f, 2.0f)
                lineTo(2.0f, 11.61f)
                lineToRelative(1.57f, 1.23f)
                lineToRelative(1.39f, -1.78f)
                lineToRelative(0.93f, 3.48f)
                curveToRelative(-0.18f, -0.02f, -0.35f, -0.05f, -0.56f, -0.05f)
                curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f)
                curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f)
                close()
                moveTo(14.04f, 10.18f)
                lineToRelative(1.42f, 5.31f)
                curveToRelative(-1.34f, 0.09f, -1.47f, -0.99f, -3.47f, -0.99f)
                curveToRelative(-0.36f, 0.0f, -0.65f, 0.04f, -0.91f, 0.1f)
                lineToRelative(-0.91f, -3.39f)
                lineTo(14.04f, 10.18f)
                close()
            }
        }
        .build()
        return _flood!!
    }

private var _flood: ImageVector? = null
