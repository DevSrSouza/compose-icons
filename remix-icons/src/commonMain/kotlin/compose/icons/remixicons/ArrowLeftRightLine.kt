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

public val RemixIcons.ArrowLeftRightLine: ImageVector
    get() {
        if (_arrowLeftRightLine != null) {
            return _arrowLeftRightLine!!
        }
        _arrowLeftRightLine = Builder(name = "ArrowLeftRightLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.05f, 12.05f)
                lineTo(21.0f, 17.0f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.536f, -2.537f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.172f)
                lineToRelative(-2.536f, -2.536f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(7.95f, 2.05f)
                lineToRelative(1.414f, 1.414f)
                lineTo(6.828f, 6.0f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.828f, 8.0f)
                lineToRelative(2.536f, 2.536f)
                lineTo(7.95f, 11.95f)
                lineTo(3.0f, 7.0f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }
        .build()
        return _arrowLeftRightLine!!
    }

private var _arrowLeftRightLine: ImageVector? = null
