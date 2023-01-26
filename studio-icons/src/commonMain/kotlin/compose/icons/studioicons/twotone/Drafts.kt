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

public val TwotoneGroup.Drafts: ImageVector
    get() {
        if (_drafts != null) {
            return _drafts!!
        }
        _drafts = Builder(name = "Drafts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.36f)
                lineToRelative(-8.0f, -5.02f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(-0.01f, -7.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.99f, 8.0f)
                curveToRelative(0.0f, -0.72f, -0.37f, -1.35f, -0.94f, -1.7f)
                lineTo(12.0f, 1.0f)
                lineTo(2.95f, 6.3f)
                curveTo(2.38f, 6.65f, 2.0f, 7.28f, 2.0f, 8.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineToRelative(-0.01f, -10.0f)
                close()
                moveTo(12.0f, 3.32f)
                lineTo(19.99f, 8.0f)
                verticalLineToRelative(0.01f)
                lineTo(12.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                lineToRelative(8.0f, -4.68f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineToRelative(-7.66f)
                lineToRelative(8.0f, 5.02f)
                lineToRelative(7.99f, -4.99f)
                lineTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _drafts!!
    }

private var _drafts: ImageVector? = null
