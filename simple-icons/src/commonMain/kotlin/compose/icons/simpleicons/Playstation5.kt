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

public val SimpleIcons.Playstation5: ImageVector
    get() {
        if (_playstation5 != null) {
            return _playstation5!!
        }
        _playstation5 = Builder(name = "Playstation5", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.45f, 14.569f)
                arcToRelative(1.383f, 1.383f, 0.0f, false, false, 1.383f, -1.383f)
                verticalLineToRelative(-2.378f)
                arcToRelative(0.833f, 0.833f, 0.0f, false, true, 0.834f, -0.833f)
                horizontalLineToRelative(2.684f)
                arcToRelative(0.037f, 0.037f, 0.0f, false, false, 0.036f, -0.037f)
                lineTo(15.387f, 9.461f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, false, -0.036f, -0.036f)
                lineTo(12.117f, 9.425f)
                arcToRelative(1.383f, 1.383f, 0.0f, false, false, -1.384f, 1.383f)
                verticalLineToRelative(2.38f)
                arcToRelative(0.834f, 0.834f, 0.0f, false, true, -0.833f, 0.834f)
                lineTo(7.253f, 14.022f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, false, -0.036f, 0.036f)
                verticalLineToRelative(0.476f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, false, 0.036f, 0.036f)
                close()
                moveTo(16.495f, 11.357f)
                lineTo(16.495f, 9.461f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, true, 0.036f, -0.036f)
                horizontalLineToRelative(7.308f)
                arcToRelative(0.037f, 0.037f, 0.0f, false, true, 0.037f, 0.036f)
                verticalLineToRelative(0.476f)
                arcToRelative(0.038f, 0.038f, 0.0f, false, true, -0.037f, 0.037f)
                horizontalLineToRelative(-6.209f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, false, -0.036f, 0.036f)
                verticalLineToRelative(1.236f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, 0.396f, 0.397f)
                horizontalLineToRelative(4.623f)
                arcToRelative(1.465f, 1.465f, 0.0f, false, true, 0.0f, 2.925f)
                horizontalLineToRelative(-6.081f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, true, -0.036f, -0.036f)
                verticalLineToRelative(-0.474f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, true, 0.036f, -0.036f)
                horizontalLineToRelative(5.53f)
                arcToRelative(0.916f, 0.916f, 0.0f, true, false, -0.007f, -1.831f)
                horizontalLineToRelative(-4.727f)
                arcToRelative(0.833f, 0.833f, 0.0f, false, true, -0.833f, -0.834f)
                moveToRelative(-10.846f, 0.286f)
                arcToRelative(0.835f, 0.835f, 0.0f, false, false, 0.0f, -1.669f)
                lineTo(0.037f, 9.975f)
                arcToRelative(0.037f, 0.037f, 0.0f, false, true, -0.036f, -0.037f)
                lineTo(0.0f, 9.461f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, true, 0.036f, -0.036f)
                horizontalLineToRelative(6.153f)
                arcToRelative(1.384f, 1.384f, 0.0f, false, true, 0.0f, 2.767f)
                lineTo(1.933f, 12.192f)
                arcToRelative(0.833f, 0.833f, 0.0f, false, false, -0.833f, 0.834f)
                verticalLineToRelative(1.513f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, true, -0.036f, 0.036f)
                lineTo(0.037f, 14.575f)
                arcToRelative(0.036f, 0.036f, 0.0f, false, true, -0.036f, -0.04f)
                verticalLineToRelative(-1.513f)
                arcToRelative(1.383f, 1.383f, 0.0f, false, true, 1.384f, -1.378f)
                close()
            }
        }
        .build()
        return _playstation5!!
    }

private var _playstation5: ImageVector? = null
