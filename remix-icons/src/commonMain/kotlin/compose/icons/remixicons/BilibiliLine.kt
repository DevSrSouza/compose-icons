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

public val RemixIcons.BilibiliLine: ImageVector
    get() {
        if (_bilibiliLine != null) {
            return _bilibiliLine!!
        }
        _bilibiliLine = Builder(name = "BilibiliLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.172f, 2.757f)
                lineTo(10.414f, 6.0f)
                horizontalLineToRelative(3.171f)
                lineToRelative(3.243f, -3.242f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 1.415f)
                lineToRelative(-1.829f, 1.827f)
                lineTo(18.5f, 6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.0f, 9.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.0f, 17.5f)
                verticalLineToRelative(-8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 6.0f)
                horizontalLineToRelative(2.085f)
                lineTo(5.757f, 4.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, -1.415f)
                close()
                moveTo(18.5f, 8.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.493f, 1.356f)
                lineTo(4.0f, 9.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.356f, 1.493f)
                lineTo(5.5f, 19.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.493f, -1.356f)
                lineTo(20.0f, 17.5f)
                verticalLineToRelative(-8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 8.0f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(16.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bilibiliLine!!
    }

private var _bilibiliLine: ImageVector? = null
