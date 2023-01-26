package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SnippetFolder: ImageVector
    get() {
        if (_snippetFolder != null) {
            return _snippetFolder!!
        }
        _snippetFolder = Builder(name = "SnippetFolder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.17f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(16.0f, 0.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-8.83f)
                lineTo(9.17f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(17.5f, 12.12f)
                verticalLineToRelative(3.38f)
                lineToRelative(-3.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.38f)
                lineTo(17.5f, 12.12f)
                close()
                moveTo(16.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(6.0f, 0.0f)
                verticalLineToRelative(-5.5f)
                lineTo(16.5f, 9.0f)
                lineTo(16.5f, 9.0f)
                close()
            }
        }
        .build()
        return _snippetFolder!!
    }

private var _snippetFolder: ImageVector? = null
