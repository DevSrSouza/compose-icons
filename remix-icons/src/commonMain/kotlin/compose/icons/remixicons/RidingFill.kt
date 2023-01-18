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

public val RemixIcons.RidingFill: ImageVector
    get() {
        if (_ridingFill != null) {
            return _ridingFill!!
        }
        _ridingFill = Builder(name = "RidingFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 21.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, -9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 9.0f)
                close()
                moveTo(5.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(18.5f, 21.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, -9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 9.0f)
                close()
                moveTo(18.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(11.531f, 9.797f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-2.719f, -2.266f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 7.671f)
                lineToRelative(2.828f, -2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.829f, 0.0f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(6.969f, 6.969f, 0.0f, false, false, 3.917f, 1.975f)
                lineToRelative(-0.01f, 2.015f)
                arcToRelative(8.962f, 8.962f, 0.0f, false, true, -5.321f, -2.575f)
                lineTo(11.53f, 9.797f)
                close()
                moveTo(16.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _ridingFill!!
    }

private var _ridingFill: ImageVector? = null
