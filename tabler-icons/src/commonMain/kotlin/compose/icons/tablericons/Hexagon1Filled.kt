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

public val TablerIcons.Hexagon1Filled: ImageVector
    get() {
        if (_hexagon1Filled != null) {
            return _hexagon1Filled!!
        }
        _hexagon1Filled = Builder(name = "Hexagon1Filled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.425f, 1.414f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, true, 3.216f, 0.0f)
                lineToRelative(6.775f, 3.995f)
                curveToRelative(0.067f, 0.04f, 0.127f, 0.084f, 0.18f, 0.133f)
                lineToRelative(0.008f, 0.007f)
                lineToRelative(0.107f, 0.076f)
                arcToRelative(3.223f, 3.223f, 0.0f, false, true, 1.284f, 2.39f)
                lineToRelative(0.005f, 0.203f)
                verticalLineToRelative(7.284f)
                curveToRelative(0.0f, 1.175f, -0.643f, 2.256f, -1.623f, 2.793f)
                lineToRelative(-6.804f, 4.302f)
                curveToRelative(-0.98f, 0.538f, -2.166f, 0.538f, -3.2f, -0.032f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.226f, 3.226f, 0.0f, false, true, -1.678f, -2.826f)
                verticalLineToRelative(-7.285f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, 1.65f, -2.808f)
                close()
                moveTo(11.377f, 7.217f)
                lineToRelative(-0.084f, 0.076f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.226f, 0.0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.293f, -0.293f)
                verticalLineToRelative(5.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-8.0f)
                lineToRelative(-0.006f, -0.114f)
                curveToRelative(-0.083f, -0.777f, -1.008f, -1.16f, -1.617f, -0.67f)
                close()
            }
        }
        .build()
        return _hexagon1Filled!!
    }

private var _hexagon1Filled: ImageVector? = null
