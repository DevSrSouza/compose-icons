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

public val RemixIcons.PinyinInput: ImageVector
    get() {
        if (_pinyinInput != null) {
            return _pinyinInput!!
        }
        _pinyinInput = Builder(name = "PinyinInput", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.934f, 3.036f)
                lineToRelative(1.732f, 1.0f)
                lineTo(18.531f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.084f)
                curveToRelative(-0.325f, 2.862f, -1.564f, 5.394f, -3.37f, 7.193f)
                lineToRelative(-1.562f, -1.27f)
                curveToRelative(1.52f, -1.438f, 2.596f, -3.522f, 2.917f, -5.922f)
                lineTo(10.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(2.0f, -0.001f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.467f)
                lineToRelative(-1.133f, -1.964f)
                lineToRelative(1.732f, -1.0f)
                lineTo(14.777f, 6.0f)
                horizontalLineToRelative(1.444f)
                lineToRelative(1.713f, -2.964f)
                close()
                moveTo(5.0f, 13.803f)
                lineToRelative(-2.0f, 0.536f)
                verticalLineToRelative(-2.071f)
                lineToRelative(2.0f, -0.536f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.197f)
                lineToRelative(2.0f, -0.536f)
                verticalLineToRelative(2.07f)
                lineToRelative(-2.0f, 0.536f)
                verticalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.492f, -0.41f)
                lineTo(5.0f, 18.5f)
                verticalLineToRelative(-4.697f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _pinyinInput!!
    }

private var _pinyinInput: ImageVector? = null
