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

public val SimpleIcons.Nixos: ImageVector
    get() {
        if (_nixos != null) {
            return _nixos!!
        }
        _nixos = Builder(name = "Nixos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.352f, 1.592f)
                lineToRelative(-1.364f, 0.002f)
                lineTo(5.32f, 2.75f)
                lineToRelative(1.557f, 2.713f)
                lineToRelative(-3.137f, -0.008f)
                lineToRelative(-1.32f, 2.34f)
                lineTo(14.11f, 7.795f)
                lineToRelative(-1.353f, -2.332f)
                lineToRelative(-3.192f, -0.006f)
                lineToRelative(-2.214f, -3.865f)
                close()
                moveTo(13.527f, 1.592f)
                lineToRelative(-2.687f, 0.025f)
                lineToRelative(5.846f, 10.127f)
                lineToRelative(1.341f, -2.34f)
                lineToRelative(-1.59f, -2.765f)
                lineToRelative(2.24f, -3.85f)
                lineToRelative(-0.683f, -1.182f)
                horizontalLineToRelative(-1.336f)
                lineToRelative(-1.57f, 2.705f)
                lineToRelative(-1.56f, -2.72f)
                close()
                moveTo(20.414f, 5.787f)
                lineToRelative(-5.846f, 10.125f)
                lineToRelative(2.696f, -0.008f)
                lineToRelative(1.601f, -2.76f)
                lineToRelative(4.453f, 0.016f)
                lineToRelative(0.682f, -1.183f)
                lineToRelative(-0.666f, -1.157f)
                lineToRelative(-3.13f, -0.008f)
                lineTo(21.778f, 8.1f)
                lineToRelative(-1.365f, -2.313f)
                close()
                moveTo(9.432f, 8.086f)
                lineToRelative(-2.696f, 0.008f)
                lineToRelative(-1.601f, 2.76f)
                lineToRelative(-4.453f, -0.016f)
                lineTo(0.0f, 12.02f)
                lineToRelative(0.666f, 1.157f)
                lineToRelative(3.13f, 0.008f)
                lineToRelative(-1.575f, 2.71f)
                lineToRelative(1.365f, 2.315f)
                lineTo(9.432f, 8.086f)
                close()
                moveTo(7.33f, 12.25f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-1.342f, 2.34f)
                lineToRelative(1.59f, 2.765f)
                lineToRelative(-2.24f, 3.85f)
                lineToRelative(0.684f, 1.182f)
                lineTo(7.35f, 22.393f)
                lineToRelative(0.004f, -0.006f)
                horizontalLineToRelative(0.001f)
                lineToRelative(1.567f, -2.698f)
                lineToRelative(1.558f, 2.72f)
                lineToRelative(2.688f, -0.026f)
                lineToRelative(-0.004f, -0.006f)
                horizontalLineToRelative(0.01f)
                lineTo(7.33f, 12.25f)
                close()
                moveTo(9.88f, 16.18f)
                lineToRelative(1.354f, 2.332f)
                lineToRelative(3.192f, 0.006f)
                lineToRelative(2.215f, 3.865f)
                lineToRelative(1.363f, -0.002f)
                lineToRelative(0.668f, -1.156f)
                lineToRelative(-1.557f, -2.713f)
                lineToRelative(3.137f, 0.008f)
                lineToRelative(1.32f, -2.34f)
                lineTo(9.881f, 16.18f)
                close()
            }
        }
        .build()
        return _nixos!!
    }

private var _nixos: ImageVector? = null
