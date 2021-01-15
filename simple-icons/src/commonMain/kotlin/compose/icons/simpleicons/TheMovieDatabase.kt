package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.TheMovieDatabase: ImageVector
    get() {
        if (_theMovieDatabase != null) {
            return _theMovieDatabase!!
        }
        _theMovieDatabase = Builder(name = "TheMovieDatabase", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.491f, 21.899f)
                curveToRelative(2.106f, 0.0f, 3.531f, -1.424f, 3.531f, -3.531f)
                lineTo(23.022f, 3.531f)
                curveTo(23.022f, 1.425f, 21.598f, 0.0f, 19.491f, 0.0f)
                lineTo(4.509f, 0.0f)
                curveTo(2.403f, 0.0f, 0.978f, 1.424f, 0.978f, 3.531f)
                lineTo(0.978f, 24.0f)
                lineToRelative(1.809f, -2.101f)
                lineTo(2.787f, 3.531f)
                arcToRelative(1.721f, 1.721f, 0.0f, false, true, 1.719f, -1.719f)
                horizontalLineToRelative(14.982f)
                curveToRelative(0.949f, 0.002f, 1.718f, 0.77f, 1.719f, 1.719f)
                verticalLineToRelative(14.837f)
                arcToRelative(1.721f, 1.721f, 0.0f, false, true, -1.719f, 1.719f)
                lineTo(6.92f, 20.087f)
                lineToRelative(-1.81f, 1.812f)
                lineToRelative(-0.011f, -0.014f)
                close()
                moveTo(8.787f, 11.466f)
                lineTo(7.09f, 11.466f)
                verticalLineToRelative(5.698f)
                horizontalLineToRelative(1.697f)
                curveToRelative(3.793f, 0.0f, 3.793f, -5.698f, 0.0f, -5.698f)
                close()
                moveTo(8.787f, 16.025f)
                horizontalLineToRelative(-0.551f)
                verticalLineToRelative(-3.419f)
                horizontalLineToRelative(0.551f)
                curveToRelative(2.215f, 0.0f, 2.215f, 3.418f, 0.0f, 3.418f)
                close()
                moveTo(8.456f, 10.389f)
                horizontalLineToRelative(1.139f)
                lineTo(9.595f, 5.83f)
                horizontalLineToRelative(1.418f)
                lineTo(11.013f, 4.699f)
                lineTo(7.037f, 4.699f)
                lineTo(7.037f, 5.83f)
                horizontalLineToRelative(1.419f)
                verticalLineToRelative(4.559f)
                close()
                moveTo(14.063f, 7.201f)
                lineToRelative(-1.971f, -2.502f)
                horizontalLineToRelative(-0.366f)
                verticalLineToRelative(5.785f)
                horizontalLineToRelative(1.156f)
                verticalLineToRelative(-3.18f)
                lineToRelative(1.182f, 1.531f)
                lineToRelative(1.183f, -1.531f)
                lineToRelative(-0.008f, 3.18f)
                horizontalLineToRelative(1.156f)
                lineTo(16.395f, 4.699f)
                horizontalLineToRelative(-0.36f)
                lineToRelative(-1.971f, 2.502f)
                close()
                moveTo(15.983f, 14.315f)
                curveToRelative(0.358f, -0.247f, 0.51f, -0.689f, 0.526f, -1.124f)
                curveToRelative(0.023f, -1.004f, -0.606f, -1.729f, -1.617f, -1.729f)
                horizontalLineToRelative(-2.255f)
                verticalLineToRelative(5.706f)
                horizontalLineToRelative(2.255f)
                arcToRelative(1.695f, 1.695f, 0.0f, false, false, 1.681f, -1.694f)
                verticalLineToRelative(-0.02f)
                verticalLineToRelative(-0.008f)
                curveToRelative(0.0f, -0.466f, -0.231f, -0.878f, -0.585f, -1.127f)
                lineToRelative(-0.004f, -0.003f)
                close()
                moveTo(13.779f, 12.601f)
                horizontalLineToRelative(1.013f)
                curveToRelative(0.327f, 0.0f, 0.526f, 0.255f, 0.526f, 0.573f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.526f, 0.574f)
                horizontalLineToRelative(-1.013f)
                lineTo(13.779f, 12.6f)
                close()
                moveTo(14.792f, 16.028f)
                horizontalLineToRelative(-1.013f)
                verticalLineToRelative(-1.139f)
                horizontalLineToRelative(1.027f)
                curveToRelative(0.309f, 0.0f, 0.559f, 0.25f, 0.559f, 0.559f)
                verticalLineToRelative(0.014f)
                arcToRelative(0.566f, 0.566f, 0.0f, false, true, -0.566f, 0.566f)
                horizontalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _theMovieDatabase!!
    }

private var _theMovieDatabase: ImageVector? = null
