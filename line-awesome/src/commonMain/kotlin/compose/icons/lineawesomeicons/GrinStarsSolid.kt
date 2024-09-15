package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.GrinStarsSolid: ImageVector
    get() {
        if (_grinStarsSolid != null) {
            return _grinStarsSolid!!
        }
        _grinStarsSolid = Builder(name = "GrinStarsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(12.0f, 10.268f)
                lineTo(11.125f, 12.232f)
                lineTo(9.0f, 12.465f)
                lineTo(10.59f, 13.893f)
                lineTo(10.143f, 16.0f)
                lineTo(12.0f, 14.93f)
                lineTo(13.857f, 16.0f)
                lineTo(13.41f, 13.893f)
                lineTo(15.0f, 12.465f)
                lineTo(12.875f, 12.232f)
                lineTo(12.0f, 10.268f)
                close()
                moveTo(20.0f, 10.268f)
                lineTo(19.125f, 12.232f)
                lineTo(17.0f, 12.465f)
                lineTo(18.59f, 13.893f)
                lineTo(18.143f, 16.0f)
                lineTo(20.0f, 14.93f)
                lineTo(21.857f, 16.0f)
                lineTo(21.41f, 13.893f)
                lineTo(23.0f, 12.465f)
                lineTo(20.875f, 12.232f)
                lineTo(20.0f, 10.268f)
                close()
                moveTo(10.811f, 19.0f)
                lineTo(9.09f, 20.0f)
                curveTo(9.264f, 20.299f, 9.455f, 20.585f, 9.664f, 20.857f)
                curveTo(9.873f, 21.13f, 10.101f, 21.389f, 10.342f, 21.633f)
                curveTo(10.583f, 21.876f, 10.839f, 22.105f, 11.109f, 22.316f)
                curveTo(11.65f, 22.738f, 12.245f, 23.093f, 12.883f, 23.365f)
                curveTo(13.202f, 23.502f, 13.532f, 23.617f, 13.871f, 23.711f)
                curveTo(14.549f, 23.899f, 15.262f, 24.0f, 16.0f, 24.0f)
                curveTo(18.212f, 24.0f, 20.211f, 23.094f, 21.658f, 21.633f)
                curveTo(21.899f, 21.389f, 22.127f, 21.13f, 22.336f, 20.857f)
                curveTo(22.545f, 20.585f, 22.736f, 20.299f, 22.91f, 20.0f)
                lineTo(21.189f, 19.0f)
                curveTo(20.279f, 20.566f, 18.696f, 21.689f, 16.82f, 21.945f)
                curveTo(16.552f, 21.982f, 16.279f, 22.0f, 16.0f, 22.0f)
                curveTo(15.721f, 22.0f, 15.448f, 21.982f, 15.18f, 21.945f)
                curveTo(14.912f, 21.909f, 14.649f, 21.854f, 14.395f, 21.783f)
                curveTo(13.885f, 21.642f, 13.403f, 21.435f, 12.959f, 21.172f)
                curveTo(12.737f, 21.04f, 12.523f, 20.895f, 12.32f, 20.736f)
                curveTo(11.915f, 20.42f, 11.553f, 20.051f, 11.24f, 19.643f)
                curveTo(11.084f, 19.438f, 10.941f, 19.224f, 10.811f, 19.0f)
                close()
            }
        }
        .build()
        return _grinStarsSolid!!
    }

private var _grinStarsSolid: ImageVector? = null
