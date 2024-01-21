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

public val TablerIcons.Hexagon2Filled: ImageVector
    get() {
        if (_hexagon2Filled != null) {
            return _hexagon2Filled!!
        }
        _hexagon2Filled = Builder(name = "Hexagon2Filled", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.844f, 1.838f)
                lineToRelative(-0.006f, 0.157f)
                verticalLineToRelative(2.0f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.844f, -1.838f)
                lineToRelative(0.006f, -0.157f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.838f, -1.844f)
                lineToRelative(-0.157f, -0.006f)
                close()
            }
        }
        .build()
        return _hexagon2Filled!!
    }

private var _hexagon2Filled: ImageVector? = null
