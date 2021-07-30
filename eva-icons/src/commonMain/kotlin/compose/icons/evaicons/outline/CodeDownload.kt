package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.CodeDownload: ImageVector
    get() {
        if (_codeDownload != null) {
            return _codeDownload!!
        }
        _codeDownload = Builder(name = "CodeDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.29f, 12.0f)
                lineTo(8.77f, 6.64f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 7.23f, 5.36f)
                lineToRelative(-5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.27f)
                lineToRelative(4.83f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 0.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -1.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.78f, 11.37f)
                lineTo(17.0f, 5.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.56f, 1.26f)
                lineTo(19.71f, 12.0f)
                lineToRelative(-4.48f, 5.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.13f, 1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.77f, -0.36f)
                lineToRelative(5.0f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.78f, 11.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.72f, 11.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineTo(13.0f, 12.64f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(4.59f)
                lineToRelative(-1.29f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineToRelative(3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.69f, -0.28f)
                lineToRelative(3.0f, -2.9f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.72f, 11.41f)
                close()
            }
        }
        .build()
        return _codeDownload!!
    }

private var _codeDownload: ImageVector? = null
