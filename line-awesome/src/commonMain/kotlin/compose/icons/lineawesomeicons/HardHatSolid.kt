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

public val LineAwesomeIcons.HardHatSolid: ImageVector
    get() {
        if (_hardHatSolid != null) {
            return _hardHatSolid!!
        }
        _hardHatSolid = Builder(name = "HardHatSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                lineTo(13.0f, 8.406f)
                curveTo(8.035f, 9.688f, 4.41f, 14.082f, 4.125f, 19.375f)
                curveTo(2.953f, 19.785f, 2.0f, 20.695f, 2.0f, 22.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 22.0f)
                curveTo(30.0f, 20.695f, 29.047f, 19.785f, 27.875f, 19.375f)
                curveTo(27.59f, 14.082f, 23.965f, 9.688f, 19.0f, 8.406f)
                lineTo(19.0f, 7.0f)
                close()
                moveTo(15.031f, 9.0f)
                lineTo(17.0f, 9.0f)
                curveTo(16.98f, 9.113f, 16.98f, 9.23f, 17.0f, 9.344f)
                lineTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 10.5f)
                curveTo(22.738f, 11.68f, 25.566f, 14.973f, 25.969f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 21.0f)
                lineTo(27.0f, 21.0f)
                curveTo(27.566f, 21.0f, 28.0f, 21.434f, 28.0f, 22.0f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 22.0f)
                curveTo(4.0f, 21.434f, 4.434f, 21.0f, 5.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 19.0f)
                lineTo(6.031f, 19.0f)
                curveTo(6.434f, 14.973f, 9.262f, 11.68f, 13.0f, 10.5f)
                lineTo(13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 9.5f)
                curveTo(15.051f, 9.34f, 15.063f, 9.168f, 15.031f, 9.0f)
                close()
            }
        }
        .build()
        return _hardHatSolid!!
    }

private var _hardHatSolid: ImageVector? = null
