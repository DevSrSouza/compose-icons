package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GiftLine: ImageVector
    get() {
        if (_giftLine != null) {
            return _giftLine!!
        }
        _giftLine = Builder(name = "GiftLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.464f, 6.001f)
                lineTo(23.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 10.0f)
                lineTo(1.0f, 10.0f)
                lineTo(1.0f, 8.0f)
                lineToRelative(4.536f, 0.001f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 3.355f)
                arcTo(3.983f, 3.983f, 0.0f, false, true, 15.0f, 2.0f)
                close()
                moveTo(11.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(9.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.15f, 3.995f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.697f, -1.977f)
                lineToRelative(-0.154f, -0.018f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(15.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.995f, -1.85f)
                lineTo(17.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _giftLine!!
    }

private var _giftLine: ImageVector? = null
