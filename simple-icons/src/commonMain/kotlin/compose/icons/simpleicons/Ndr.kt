package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ndr: ImageVector
    get() {
        if (_ndr != null) {
            return _ndr!!
        }
        _ndr = Builder(name = "Ndr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.184f, 19.325f)
                lineToRelative(-3.137f, -5.648f)
                verticalLineToRelative(5.649f)
                lineTo(0.0f, 19.326f)
                lineTo(0.0f, 9.64f)
                horizontalLineToRelative(2.149f)
                lineToRelative(3.267f, 6.025f)
                lineTo(5.416f, 9.641f)
                horizontalLineToRelative(2.047f)
                verticalLineToRelative(9.684f)
                close()
                moveTo(7.463f, 9.641f)
                lineTo(7.463f, 0.537f)
                lineTo(8.61f, 0.537f)
                verticalLineToRelative(9.104f)
                close()
                moveTo(7.463f, 23.463f)
                verticalLineToRelative(-4.138f)
                lineTo(8.61f, 19.325f)
                verticalLineToRelative(4.138f)
                close()
                moveTo(12.037f, 9.64f)
                curveToRelative(2.395f, 0.0f, 3.63f, 1.147f, 3.63f, 3.368f)
                verticalLineToRelative(2.918f)
                curveToRelative(0.0f, 2.28f, -1.19f, 3.398f, -3.63f, 3.398f)
                lineTo(8.61f, 19.324f)
                lineTo(8.61f, 9.641f)
                close()
                moveTo(11.847f, 17.495f)
                curveToRelative(1.163f, 0.0f, 1.728f, -0.581f, 1.728f, -1.771f)
                verticalLineToRelative(-2.498f)
                curveToRelative(0.0f, -1.176f, -0.58f, -1.757f, -1.727f, -1.757f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(6.026f)
                close()
                moveTo(21.692f, 19.325f)
                lineToRelative(-1.728f, -3.718f)
                horizontalLineToRelative(-1.161f)
                verticalLineToRelative(3.717f)
                horizontalLineToRelative(-2.15f)
                lineTo(16.653f, 9.641f)
                horizontalLineToRelative(3.384f)
                curveToRelative(2.381f, 0.0f, 3.513f, 0.944f, 3.513f, 2.962f)
                curveToRelative(0.0f, 1.335f, -0.493f, 2.134f, -1.597f, 2.613f)
                lineTo(24.0f, 19.326f)
                close()
                moveTo(20.124f, 13.85f)
                curveToRelative(0.857f, 0.0f, 1.365f, -0.494f, 1.365f, -1.32f)
                curveToRelative(0.0f, -0.858f, -0.377f, -1.177f, -1.365f, -1.177f)
                lineTo(18.76f, 11.353f)
                verticalLineToRelative(2.498f)
                horizontalLineToRelative(1.365f)
                close()
            }
        }
        .build()
        return _ndr!!
    }

private var _ndr: ImageVector? = null
