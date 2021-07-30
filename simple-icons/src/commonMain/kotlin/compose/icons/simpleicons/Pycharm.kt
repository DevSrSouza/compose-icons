package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pycharm: ImageVector
    get() {
        if (_pycharm != null) {
            return _pycharm!!
        }
        _pycharm = Builder(name = "Pycharm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.833f, 6.666f)
                verticalLineToRelative(-0.055f)
                curveToRelative(0.0f, -1.0f, -0.667f, -1.5f, -1.778f, -1.5f)
                lineTo(4.389f, 5.111f)
                verticalLineToRelative(3.055f)
                horizontalLineToRelative(1.723f)
                curveToRelative(1.111f, 0.0f, 1.721f, -0.666f, 1.721f, -1.5f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(2.223f, 3.167f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.389f, 0.0f, 3.833f, 1.389f, 3.833f, 3.445f)
                verticalLineToRelative(0.055f)
                curveToRelative(0.0f, 2.278f, -1.778f, 3.5f, -4.001f, 3.5f)
                lineTo(4.389f, 10.167f)
                verticalLineToRelative(2.945f)
                lineTo(2.223f, 13.112f)
                lineTo(2.223f, 3.167f)
                close()
                moveTo(11.277f, 21.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.277f, 21.0f)
                close()
                moveTo(16.056f, 13.223f)
                curveToRelative(-2.944f, 0.055f, -5.111f, -2.223f, -5.111f, -5.057f)
                curveTo(10.944f, 5.333f, 13.056f, 3.0f, 16.111f, 3.0f)
                curveToRelative(1.889f, 0.0f, 3.0f, 0.611f, 3.944f, 1.556f)
                lineToRelative(-1.389f, 1.61f)
                curveToRelative(-0.778f, -0.722f, -1.556f, -1.111f, -2.556f, -1.111f)
                curveToRelative(-1.658f, 0.0f, -2.873f, 1.375f, -2.887f, 3.084f)
                curveToRelative(0.014f, 1.709f, 1.174f, 3.083f, 2.887f, 3.083f)
                curveToRelative(1.111f, 0.0f, 1.833f, -0.445f, 2.61f, -1.167f)
                lineToRelative(1.39f, 1.389f)
                curveToRelative(-0.999f, 1.112f, -2.166f, 1.779f, -4.054f, 1.779f)
                close()
            }
        }
        .build()
        return _pycharm!!
    }

private var _pycharm: ImageVector? = null
