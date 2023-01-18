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

public val RemixIcons.MoonClearFill: ImageVector
    get() {
        if (_moonClearFill != null) {
            return _moonClearFill!!
        }
        _moonClearFill = Builder(name = "MoonClearFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.822f, 2.238f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 11.94f, 11.94f)
                curveTo(20.768f, 18.654f, 16.775f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -4.775f, 3.346f, -8.768f, 7.822f, -9.762f)
                close()
                moveTo(18.164f, 2.291f)
                lineTo(19.0f, 2.5f)
                verticalLineToRelative(1.0f)
                lineToRelative(-0.836f, 0.209f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, 1.455f)
                lineTo(16.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.209f, -0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, -1.455f)
                lineTo(13.0f, 3.5f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.836f, -0.209f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.29f, 0.836f)
                lineTo(15.5f, 0.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.209f, 0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.455f, 1.455f)
                close()
                moveTo(23.164f, 7.291f)
                lineTo(24.0f, 7.5f)
                verticalLineToRelative(1.0f)
                lineToRelative(-0.836f, 0.209f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, 1.455f)
                lineTo(21.5f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.209f, -0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.455f, -1.455f)
                lineTo(18.0f, 8.5f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.836f, -0.209f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.455f, -1.455f)
                lineTo(20.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.209f, 0.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.455f, 1.455f)
                close()
            }
        }
        .build()
        return _moonClearFill!!
    }

private var _moonClearFill: ImageVector? = null
