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

public val RemixIcons.CakeLine: ImageVector
    get() {
        if (_cakeLine != null) {
            return _cakeLine!!
        }
        _cakeLine = Builder(name = "CakeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(13.83f, 0.402f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.732f, 4.5f)
                lineTo(11.0f, 5.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.098f, -4.098f)
                lineToRelative(1.732f, -1.0f)
                close()
            }
        }
        .build()
        return _cakeLine!!
    }

private var _cakeLine: ImageVector? = null
