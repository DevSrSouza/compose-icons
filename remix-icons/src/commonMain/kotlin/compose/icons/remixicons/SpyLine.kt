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

public val RemixIcons.SpyLine: ImageVector
    get() {
        if (_spyLine != null) {
            return _spyLine!!
        }
        _spyLine = Builder(name = "SpyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.535f, -2.0f)
                horizontalLineToRelative(3.07f)
                arcTo(3.998f, 3.998f, 0.0f, false, true, 17.0f, 13.0f)
                close()
                moveTo(7.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(17.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(16.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(16.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                curveToRelative(-1.054f, 0.0f, -2.0f, 0.95f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 7.0f)
                curveToRelative(0.0f, -1.054f, -0.95f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _spyLine!!
    }

private var _spyLine: ImageVector? = null
