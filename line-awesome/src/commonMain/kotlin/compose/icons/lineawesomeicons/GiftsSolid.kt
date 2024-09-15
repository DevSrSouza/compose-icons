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

public val LineAwesomeIcons.GiftsSolid: ImageVector
    get() {
        if (_giftsSolid != null) {
            return _giftsSolid!!
        }
        _giftsSolid = Builder(name = "GiftsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(9.0f, 7.234f)
                lineTo(5.516f, 5.143f)
                lineTo(4.484f, 6.857f)
                lineTo(6.389f, 8.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 27.0f)
                lineTo(9.0f, 27.0f)
                lineTo(9.0f, 25.0f)
                lineTo(5.0f, 25.0f)
                lineTo(5.0f, 10.0f)
                lineTo(13.027f, 10.0f)
                curveTo(13.86f, 9.38f, 14.884f, 9.0f, 16.0f, 9.0f)
                curveTo(16.352f, 9.0f, 16.682f, 9.042f, 17.0f, 9.102f)
                lineTo(17.0f, 8.0f)
                lineTo(13.611f, 8.0f)
                lineTo(15.516f, 6.857f)
                lineTo(14.484f, 5.143f)
                lineTo(11.0f, 7.234f)
                lineTo(11.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(14.355f, 11.0f, 13.0f, 12.355f, 13.0f, 14.0f)
                curveTo(13.0f, 14.352f, 13.075f, 14.684f, 13.188f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 17.0f)
                lineTo(11.0f, 27.0f)
                lineTo(29.0f, 27.0f)
                lineTo(29.0f, 17.0f)
                lineTo(29.0f, 15.0f)
                lineTo(26.813f, 15.0f)
                curveTo(26.927f, 14.684f, 27.0f, 14.352f, 27.0f, 14.0f)
                curveTo(27.0f, 12.355f, 25.645f, 11.0f, 24.0f, 11.0f)
                curveTo(22.25f, 11.0f, 21.062f, 12.328f, 20.281f, 13.438f)
                curveTo(20.176f, 13.585f, 20.093f, 13.732f, 20.0f, 13.877f)
                curveTo(19.906f, 13.732f, 19.824f, 13.587f, 19.719f, 13.438f)
                curveTo(18.937f, 12.328f, 17.75f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(16.625f, 13.0f, 17.438f, 13.672f, 18.063f, 14.563f)
                curveTo(18.215f, 14.781f, 18.191f, 14.794f, 18.313f, 15.002f)
                lineTo(16.0f, 15.002f)
                curveTo(15.434f, 15.002f, 15.0f, 14.568f, 15.0f, 14.002f)
                curveTo(15.0f, 13.436f, 15.434f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(24.0f, 13.0f)
                curveTo(24.566f, 13.0f, 25.0f, 13.434f, 25.0f, 14.0f)
                curveTo(25.0f, 14.566f, 24.566f, 15.0f, 24.0f, 15.0f)
                lineTo(21.688f, 15.0f)
                curveTo(21.809f, 14.793f, 21.785f, 14.781f, 21.938f, 14.563f)
                curveTo(22.563f, 13.672f, 23.375f, 13.0f, 24.0f, 13.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 17.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(27.0f, 17.0f)
                lineTo(27.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                lineTo(21.0f, 17.0f)
                close()
            }
        }
        .build()
        return _giftsSolid!!
    }

private var _giftsSolid: ImageVector? = null
