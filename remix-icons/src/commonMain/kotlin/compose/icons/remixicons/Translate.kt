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

public val RemixIcons.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, 1.995f)
                lineTo(7.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineToRelative(4.4f, 11.0f)
                horizontalLineToRelative(-2.155f)
                lineToRelative(-1.201f, -3.0f)
                horizontalLineToRelative(-4.09f)
                lineToRelative(-1.199f, 3.0f)
                horizontalLineToRelative(-2.154f)
                lineTo(16.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 12.885f)
                lineTo(15.753f, 16.0f)
                horizontalLineToRelative(2.492f)
                lineTo(17.0f, 12.885f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                lineTo(8.0f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 6.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
