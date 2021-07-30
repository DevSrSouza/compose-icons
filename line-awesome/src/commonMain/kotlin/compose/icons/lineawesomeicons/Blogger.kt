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

public val LineAwesomeIcons.Blogger: ImageVector
    get() {
        if (_blogger != null) {
            return _blogger!!
        }
        _blogger = Builder(name = "Blogger", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(13.0f, 10.0f, 13.0304f, 10.0195f, 12.4004f, 10.2695f)
                curveTo(11.2304f, 10.7395f, 10.3898f, 11.7205f, 10.0898f, 12.9805f)
                curveTo(10.0398f, 13.2105f, 10.0198f, 13.5898f, 10.0098f, 15.7598f)
                curveTo(9.9898f, 18.4698f, 10.0097f, 18.8702f, 10.1797f, 19.4102f)
                curveTo(10.5997f, 20.7402f, 11.7907f, 21.7195f, 12.9707f, 21.9395f)
                curveTo(13.3707f, 22.0095f, 18.26f, 22.0309f, 18.75f, 21.9609f)
                curveTo(19.63f, 21.8409f, 20.2995f, 21.4901f, 20.9395f, 20.8301f)
                curveTo(21.4095f, 20.3601f, 21.7006f, 19.8499f, 21.8906f, 19.1699f)
                curveTo(22.0306f, 18.6999f, 22.0209f, 15.3494f, 21.9609f, 15.1094f)
                curveTo(21.9109f, 14.8994f, 21.7909f, 14.6894f, 21.6309f, 14.6094f)
                curveTo(21.5809f, 14.5894f, 21.2809f, 14.5591f, 20.9609f, 14.5391f)
                curveTo(20.4209f, 14.5191f, 20.3595f, 14.5104f, 20.1895f, 14.4004f)
                curveTo(19.9295f, 14.2504f, 19.8496f, 14.0691f, 19.8496f, 13.6191f)
                curveTo(19.8496f, 12.7391f, 19.48f, 11.9099f, 18.75f, 11.1699f)
                curveTo(18.23f, 10.6399f, 17.6602f, 10.2801f, 16.9902f, 10.0801f)
                curveTo(16.8402f, 10.0401f, 16.19f, 10.0f, 15.0f, 10.0f)
                close()
                moveTo(13.7695f, 13.0f)
                lineTo(16.0625f, 13.0f)
                curveTo(16.4875f, 13.0f, 16.832f, 13.3445f, 16.832f, 13.7695f)
                curveTo(16.832f, 14.1945f, 16.4875f, 14.5391f, 16.0625f, 14.5391f)
                lineTo(13.7695f, 14.5391f)
                curveTo(13.3445f, 14.5391f, 13.0f, 14.1945f, 13.0f, 13.7695f)
                curveTo(13.0f, 13.3445f, 13.3445f, 13.0f, 13.7695f, 13.0f)
                close()
                moveTo(13.7695f, 17.4609f)
                lineTo(18.043f, 17.4609f)
                curveTo(18.468f, 17.4609f, 18.8125f, 17.8055f, 18.8125f, 18.2305f)
                curveTo(18.8125f, 18.6555f, 18.468f, 19.0f, 18.043f, 19.0f)
                lineTo(13.7695f, 19.0f)
                curveTo(13.3445f, 19.0f, 13.0f, 18.6555f, 13.0f, 18.2305f)
                curveTo(13.0f, 17.8055f, 13.3445f, 17.4609f, 13.7695f, 17.4609f)
                close()
            }
        }
        .build()
        return _blogger!!
    }

private var _blogger: ImageVector? = null
