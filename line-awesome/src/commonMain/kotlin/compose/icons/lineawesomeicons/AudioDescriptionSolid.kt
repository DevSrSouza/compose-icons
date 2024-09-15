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

public val LineAwesomeIcons.AudioDescriptionSolid: ImageVector
    get() {
        if (_audioDescriptionSolid != null) {
            return _audioDescriptionSolid!!
        }
        _audioDescriptionSolid = Builder(name = "AudioDescriptionSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.594f, 7.0f)
                lineTo(5.281f, 7.281f)
                curveTo(5.281f, 7.281f, 2.0f, 10.602f, 2.0f, 16.0f)
                curveTo(2.0f, 21.398f, 5.281f, 24.719f, 5.281f, 24.719f)
                lineTo(5.594f, 25.0f)
                lineTo(26.406f, 25.0f)
                lineTo(26.719f, 24.719f)
                curveTo(26.719f, 24.719f, 30.0f, 21.398f, 30.0f, 16.0f)
                curveTo(30.0f, 10.602f, 26.719f, 7.281f, 26.719f, 7.281f)
                lineTo(26.406f, 7.0f)
                close()
                moveTo(6.531f, 9.0f)
                lineTo(25.469f, 9.0f)
                curveTo(25.805f, 9.355f, 28.0f, 11.73f, 28.0f, 16.0f)
                curveTo(28.0f, 20.27f, 25.805f, 22.645f, 25.469f, 23.0f)
                lineTo(6.531f, 23.0f)
                curveTo(6.195f, 22.645f, 4.0f, 20.27f, 4.0f, 16.0f)
                curveTo(4.0f, 11.73f, 6.195f, 9.355f, 6.531f, 9.0f)
                close()
                moveTo(10.375f, 12.0f)
                lineTo(6.375f, 20.0f)
                lineTo(8.625f, 20.0f)
                lineTo(9.125f, 19.0f)
                lineTo(11.0f, 19.0f)
                lineTo(11.0f, 20.0f)
                lineTo(13.0f, 20.0f)
                curveTo(15.199f, 20.0f, 17.0f, 18.199f, 17.0f, 16.0f)
                curveTo(17.0f, 13.801f, 15.199f, 12.0f, 13.0f, 12.0f)
                close()
                moveTo(15.969f, 12.0f)
                curveTo(17.195f, 12.91f, 18.0f, 14.359f, 18.0f, 16.0f)
                curveTo(18.0f, 17.641f, 17.195f, 19.09f, 15.969f, 20.0f)
                lineTo(18.75f, 20.0f)
                curveTo(19.543f, 18.863f, 20.0f, 17.488f, 20.0f, 16.0f)
                curveTo(20.0f, 14.512f, 19.543f, 13.137f, 18.75f, 12.0f)
                close()
                moveTo(19.906f, 12.0f)
                curveTo(20.59f, 13.18f, 21.0f, 14.543f, 21.0f, 16.0f)
                curveTo(21.0f, 17.457f, 20.59f, 18.82f, 19.906f, 20.0f)
                lineTo(22.156f, 20.0f)
                curveTo(22.691f, 18.773f, 23.0f, 17.422f, 23.0f, 16.0f)
                curveTo(23.0f, 14.578f, 22.695f, 13.227f, 22.156f, 12.0f)
                close()
                moveTo(23.25f, 12.0f)
                curveTo(23.738f, 13.242f, 24.0f, 14.59f, 24.0f, 16.0f)
                curveTo(24.0f, 17.41f, 23.738f, 18.758f, 23.25f, 20.0f)
                lineTo(25.375f, 20.0f)
                curveTo(25.785f, 18.738f, 26.0f, 17.395f, 26.0f, 16.0f)
                curveTo(26.0f, 14.605f, 25.785f, 13.262f, 25.375f, 12.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveTo(14.117f, 14.0f, 15.0f, 14.883f, 15.0f, 16.0f)
                curveTo(15.0f, 17.117f, 14.117f, 18.0f, 13.0f, 18.0f)
                close()
                moveTo(11.0f, 15.25f)
                lineTo(11.0f, 17.0f)
                lineTo(10.125f, 17.0f)
                close()
            }
        }
        .build()
        return _audioDescriptionSolid!!
    }

private var _audioDescriptionSolid: ImageVector? = null
