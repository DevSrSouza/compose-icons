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

public val SimpleIcons.Avira: ImageVector
    get() {
        if (_avira != null) {
            return _avira!!
        }
        _avira = Builder(name = "Avira", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 23.414f)
                arcToRelative(0.586f, 0.586f, 0.0f, false, true, -0.586f, 0.587f)
                lineTo(0.585f, 24.001f)
                arcTo(0.586f, 0.586f, 0.0f, false, true, 0.0f, 23.414f)
                lineTo(0.0f, 0.586f)
                curveToRelative(0.0f, -0.324f, 0.262f, -0.587f, 0.585f, -0.587f)
                horizontalLineToRelative(22.829f)
                curveToRelative(0.325f, 0.0f, 0.586f, 0.263f, 0.586f, 0.587f)
                verticalLineToRelative(22.828f)
                close()
                moveTo(19.029f, 13.739f)
                lineTo(18.989f, 13.695f)
                lineTo(17.666f, 14.951f)
                arcToRelative(0.925f, 0.925f, 0.0f, false, true, -1.342f, 1.272f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, true, -0.118f, -0.122f)
                lineToRelative(-3.56f, -3.753f)
                lineToRelative(4.857f, -4.609f)
                curveToRelative(-3.034f, -2.858f, -7.795f, -2.984f, -10.765f, -0.111f)
                curveToRelative(-2.969f, 2.874f, -3.337f, 7.527f, -0.539f, 10.838f)
                lineToRelative(5.106f, -4.845f)
                lineToRelative(3.748f, 3.952f)
                arcToRelative(2.777f, 2.777f, 0.0f, false, false, 1.995f, 0.74f)
                arcToRelative(2.681f, 2.681f, 0.0f, false, false, 1.772f, -0.742f)
                curveToRelative(0.559f, -0.526f, 0.894f, -1.272f, 0.887f, -2.022f)
                arcToRelative(2.702f, 2.702f, 0.0f, false, false, -0.678f, -1.81f)
                close()
                moveTo(14.456f, 8.189f)
                lineTo(6.806f, 15.448f)
                curveToRelative(-2.576f, -4.553f, 2.815f, -10.009f, 7.65f, -7.259f)
                close()
            }
        }
        .build()
        return _avira!!
    }

private var _avira: ImageVector? = null
