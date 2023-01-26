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

public val TwotoneGroup.Deck: ImageVector
    get() {
        if (_deck != null) {
            return _deck!!
        }
        _deck = Builder(name = "Deck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.44f)
                lineToRelative(-3.66f, 2.56f)
                lineToRelative(7.32f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                lineTo(12.0f, 2.0f)
                lineTo(2.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(12.0f, 4.44f)
                lineTo(15.66f, 7.0f)
                horizontalLineTo(8.34f)
                lineTo(12.0f, 4.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.14f, 12.0f)
                lineToRelative(-1.96f, 0.37f)
                lineToRelative(0.82f, 4.37f)
                lineToRelative(0.0f, 5.26f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.02f, -4.0f)
                lineToRelative(1.98f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-4.1f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1f, 16.0f)
                lineToRelative(-4.1f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(1.98f, 0.0f)
                lineToRelative(0.02f, 4.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -5.26f)
                lineToRelative(0.82f, -4.37f)
                lineToRelative(-1.96f, -0.37f)
                close()
            }
        }
        .build()
        return _deck!!
    }

private var _deck: ImageVector? = null
