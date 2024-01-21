package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BugFilled: ImageVector
    get() {
        if (_bugFilled != null) {
            return _bugFilled!!
        }
        _bugFilled = Builder(name = "BugFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.995f, 3.8f)
                lineToRelative(0.005f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.428f, 0.096f)
                lineToRelative(3.033f, -1.938f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.078f, 1.684f)
                lineToRelative(-3.015f, 1.931f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, 0.476f, 2.227f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, true, -0.195f, 1.525f)
                lineToRelative(2.708f, 1.616f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.026f, 1.718f)
                lineToRelative(-2.514f, -1.501f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, true, -3.973f, 2.56f)
                verticalLineToRelative(-5.918f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(5.917f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, true, -3.973f, -2.56f)
                lineToRelative(-2.514f, 1.503f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.026f, -1.718f)
                lineToRelative(2.708f, -1.616f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, true, -0.195f, -1.526f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.001f)
                verticalLineToRelative(-0.055f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.474f, -2.173f)
                lineToRelative(-3.014f, -1.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.078f, -1.684f)
                lineToRelative(3.032f, 1.939f)
                lineToRelative(0.024f, -0.012f)
                lineToRelative(0.068f, -0.027f)
                lineToRelative(0.019f, -0.005f)
                lineToRelative(0.016f, -0.006f)
                lineToRelative(0.032f, -0.008f)
                lineToRelative(0.04f, -0.013f)
                lineToRelative(0.034f, -0.007f)
                lineToRelative(0.034f, -0.004f)
                lineToRelative(0.045f, -0.008f)
                lineToRelative(0.015f, -0.001f)
                lineToRelative(0.015f, -0.002f)
                lineToRelative(0.087f, -0.004f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bugFilled!!
    }

private var _bugFilled: ImageVector? = null
