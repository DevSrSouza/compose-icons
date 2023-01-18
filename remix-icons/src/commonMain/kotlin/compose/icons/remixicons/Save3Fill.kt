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

public val RemixIcons.Save3Fill: ImageVector
    get() {
        if (_save3Fill != null) {
            return _save3Fill!!
        }
        _save3Fill = Builder(name = "Save3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(2.707f, 2.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.707f)
                lineTo(21.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(7.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.0f)
                lineTo(16.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.0f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 5.0f)
                close()
            }
        }
        .build()
        return _save3Fill!!
    }

private var _save3Fill: ImageVector? = null
