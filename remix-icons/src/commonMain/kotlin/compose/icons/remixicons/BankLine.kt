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

public val RemixIcons.BankLine: ImageVector
    get() {
        if (_bankLine != null) {
            return _bankLine!!
        }
        _bankLine = Builder(name = "BankLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineToRelative(10.0f, -5.0f)
                lineToRelative(10.0f, 5.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(4.0f, 8.236f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-0.764f)
                lineToRelative(-8.0f, -4.0f)
                lineToRelative(-8.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bankLine!!
    }

private var _bankLine: ImageVector? = null
