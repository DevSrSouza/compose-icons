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

public val SimpleIcons.Penpot: ImageVector
    get() {
        if (_penpot != null) {
            return _penpot!!
        }
        _penpot = Builder(name = "Penpot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.654f, 0.0f)
                lineTo(5.13f, 3.554f)
                verticalLineToRelative(2.01f)
                lineTo(2.934f, 6.608f)
                lineToRelative(-0.02f, -0.009f)
                verticalLineToRelative(13.109f)
                lineToRelative(8.563f, 4.045f)
                lineTo(12.0f, 24.0f)
                lineToRelative(0.523f, -0.247f)
                lineToRelative(8.563f, -4.045f)
                lineTo(21.086f, 6.6f)
                lineToRelative(-0.017f, 0.008f)
                lineToRelative(-2.196f, -1.045f)
                lineTo(18.873f, 3.555f)
                lineToRelative(-0.077f, -0.108f)
                lineTo(16.349f, 0.001f)
                lineToRelative(-2.524f, 3.554f)
                verticalLineToRelative(0.004f)
                lineTo(11.989f, 0.973f)
                lineToRelative(-1.823f, 2.566f)
                lineToRelative(-0.065f, -0.091f)
                close()
                moveTo(8.101f, 2.065f)
                lineTo(9.077f, 3.439f)
                lineTo(6.232f, 3.439f)
                lineToRelative(0.964f, -1.358f)
                close()
                moveTo(16.795f, 2.065f)
                lineTo(17.771f, 3.439f)
                horizontalLineToRelative(-2.845f)
                lineToRelative(0.965f, -1.358f)
                close()
                moveTo(12.435f, 3.036f)
                lineTo(13.411f, 4.411f)
                horizontalLineToRelative(-2.845f)
                lineToRelative(0.965f, -1.359f)
                close()
                moveTo(5.962f, 4.132f)
                horizontalLineToRelative(1.35f)
                verticalLineToRelative(4.544f)
                lineToRelative(-1.35f, -0.638f)
                close()
                moveTo(8.004f, 4.132f)
                horizontalLineToRelative(1.343f)
                verticalLineToRelative(5.506f)
                lineToRelative(-1.343f, -0.635f)
                close()
                moveTo(14.656f, 4.132f)
                horizontalLineToRelative(1.35f)
                lineTo(16.006f, 9.0f)
                lineToRelative(-1.35f, 0.637f)
                lineTo(14.656f, 4.132f)
                close()
                moveTo(16.698f, 4.132f)
                horizontalLineToRelative(1.343f)
                verticalLineToRelative(3.905f)
                lineToRelative(-1.343f, 0.634f)
                close()
                moveTo(10.296f, 5.104f)
                horizontalLineToRelative(1.35f)
                verticalLineToRelative(5.62f)
                lineToRelative(-1.35f, -0.638f)
                close()
                moveTo(12.338f, 5.104f)
                horizontalLineToRelative(1.343f)
                verticalLineToRelative(4.993f)
                lineToRelative(-1.343f, 0.634f)
                close()
                moveTo(18.872f, 6.597f)
                lineTo(20.06f, 7.083f)
                lineTo(18.872f, 7.644f)
                close()
                moveTo(5.13f, 6.6f)
                verticalLineToRelative(1.047f)
                lineToRelative(-1.187f, -0.561f)
                close()
                moveTo(3.96f, 8.251f)
                lineToRelative(7.517f, 3.55f)
                verticalLineToRelative(10.795f)
                lineToRelative(-7.516f, -3.55f)
                close()
                moveTo(20.04f, 8.251f)
                verticalLineToRelative(10.794f)
                lineToRelative(-7.517f, 3.55f)
                lineTo(12.523f, 11.802f)
                close()
            }
        }
        .build()
        return _penpot!!
    }

private var _penpot: ImageVector? = null
