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

public val LineAwesomeIcons.GiftSolid: ImageVector
    get() {
        if (_giftSolid != null) {
            return _giftSolid!!
        }
        _giftSolid = Builder(name = "GiftSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(10.355f, 5.0f, 9.0f, 6.355f, 9.0f, 8.0f)
                curveTo(9.0f, 8.352f, 9.074f, 8.684f, 9.188f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(27.0f, 15.0f)
                lineTo(28.0f, 15.0f)
                lineTo(28.0f, 9.0f)
                lineTo(22.813f, 9.0f)
                curveTo(22.926f, 8.684f, 23.0f, 8.352f, 23.0f, 8.0f)
                curveTo(23.0f, 6.355f, 21.645f, 5.0f, 20.0f, 5.0f)
                curveTo(18.25f, 5.0f, 17.063f, 6.328f, 16.281f, 7.438f)
                curveTo(16.176f, 7.586f, 16.094f, 7.73f, 16.0f, 7.875f)
                curveTo(15.906f, 7.73f, 15.824f, 7.586f, 15.719f, 7.438f)
                curveTo(14.938f, 6.328f, 13.75f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.625f, 7.0f, 13.438f, 7.672f, 14.063f, 8.563f)
                curveTo(14.215f, 8.781f, 14.191f, 8.793f, 14.313f, 9.0f)
                lineTo(12.0f, 9.0f)
                curveTo(11.434f, 9.0f, 11.0f, 8.566f, 11.0f, 8.0f)
                curveTo(11.0f, 7.434f, 11.434f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(20.0f, 7.0f)
                curveTo(20.566f, 7.0f, 21.0f, 7.434f, 21.0f, 8.0f)
                curveTo(21.0f, 8.566f, 20.566f, 9.0f, 20.0f, 9.0f)
                lineTo(17.688f, 9.0f)
                curveTo(17.809f, 8.793f, 17.785f, 8.781f, 17.938f, 8.563f)
                curveTo(18.563f, 7.672f, 19.375f, 7.0f, 20.0f, 7.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(26.0f, 11.0f)
                lineTo(26.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                close()
            }
        }
        .build()
        return _giftSolid!!
    }

private var _giftSolid: ImageVector? = null
