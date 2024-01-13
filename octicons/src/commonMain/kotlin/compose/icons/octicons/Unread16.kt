package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unread16: ImageVector
    get() {
        if (_unread16 != null) {
            return _unread16!!
        }
        _unread16 = Builder(name = "Unread16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 3.5f)
                horizontalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.32f)
                lineTo(8.0f, 7.88f)
                lineToRelative(3.02f, -1.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.758f, 1.295f)
                lineTo(8.379f, 9.397f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.758f, 0.0f)
                lineTo(1.5f, 5.809f)
                verticalLineToRelative(6.441f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 14.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 12.25f)
                verticalLineTo(4.513f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -0.027f)
                verticalLineTo(3.75f)
                curveTo(0.0f, 2.784f, 0.784f, 2.0f, 1.75f, 2.0f)
                horizontalLineToRelative(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _unread16!!
    }

private var _unread16: ImageVector? = null
