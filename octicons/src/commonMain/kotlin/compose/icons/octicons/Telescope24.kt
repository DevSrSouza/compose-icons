package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.Octicons

public val Octicons.Telescope24: ImageVector
    get() {
        if (_telescope24 != null) {
            return _telescope24!!
        }
        _telescope24 = Builder(name = "Telescope24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.408f, 15.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -2.642f)
                lineTo(17.038f, 1.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.85f, 0.602f)
                lineToRelative(2.828f, 4.644f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.851f, 2.847f)
                lineToRelative(-17.762f, 8.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.59f, -0.807f)
                lineTo(0.408f, 15.13f)
                close()
                moveTo(5.671f, 11.064f)
                lineToRelative(7.842f, -5.455f)
                lineToRelative(2.857f, 4.76f)
                lineToRelative(-8.712f, 4.135f)
                lineToRelative(-1.987f, -3.44f)
                close()
                moveTo(4.436f, 11.924f)
                lineTo(1.854f, 13.72f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.147f, 0.66f)
                lineToRelative(1.105f, 1.915f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.648f, 0.201f)
                lineToRelative(2.838f, -1.347f)
                lineToRelative(-1.862f, -3.225f)
                close()
                moveTo(17.731f, 9.724f)
                lineTo(14.747f, 4.75f)
                lineToRelative(3.148f, -2.19f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.713f, 0.151f)
                lineToRelative(2.826f, 4.644f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.212f, 0.712f)
                lineToRelative(-3.49f, 1.656f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.155f, 22.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.226f, -1.036f)
                lineToRelative(-4.0f, -6.239f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.941f, -0.278f)
                lineToRelative(-2.75f, 1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.318f, 0.274f)
                lineToRelative(-3.25f, 4.989f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.256f, 0.819f)
                lineToRelative(3.131f, -4.806f)
                lineToRelative(0.51f, -0.232f)
                verticalLineToRelative(5.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineToRelative(-6.22f)
                lineToRelative(3.6f, 5.613f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.036f, 0.226f)
                close()
            }
        }
        .build()
        return _telescope24!!
    }

private var _telescope24: ImageVector? = null
