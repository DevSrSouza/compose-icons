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

public val RemixIcons.WubiInput: ImageVector
    get() {
        if (_wubiInput != null) {
            return _wubiInput!!
        }
        _wubiInput = Builder(name = "WubiInput", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.662f)
                lineToRelative(1.234f, -7.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.249f)
                lineToRelative(0.881f, -5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.839f)
                lineToRelative(-0.882f, 5.0f)
                lineTo(18.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(16.0f, 12.0f)
                lineTo(9.927f, 12.0f)
                lineToRelative(-1.235f, 7.0f)
                lineTo(16.0f, 19.0f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _wubiInput!!
    }

private var _wubiInput: ImageVector? = null
