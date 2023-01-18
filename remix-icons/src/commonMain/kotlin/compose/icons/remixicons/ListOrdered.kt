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

public val RemixIcons.ListOrdered: ImageVector
    get() {
        if (_listOrdered != null) {
            return _listOrdered!!
        }
        _listOrdered = Builder(name = "ListOrdered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(5.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                lineTo(4.0f, 12.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 14.0f)
                close()
                moveTo(5.0f, 19.5f)
                lineTo(3.0f, 19.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _listOrdered!!
    }

private var _listOrdered: ImageVector? = null
