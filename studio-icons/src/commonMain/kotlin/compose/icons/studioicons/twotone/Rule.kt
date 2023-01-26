package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Rule: ImageVector
    get() {
        if (_rule != null) {
            return _rule!!
        }
        _rule = Builder(name = "Rule", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.54f, 11.0f)
                lineTo(13.0f, 7.46f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(16.54f, 11.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(21.0f, 13.41f)
                lineTo(19.59f, 12.0f)
                lineTo(17.0f, 14.59f)
                lineTo(14.41f, 12.0f)
                lineTo(13.0f, 13.41f)
                lineTo(15.59f, 16.0f)
                lineTo(13.0f, 18.59f)
                lineTo(14.41f, 20.0f)
                lineTo(17.0f, 17.41f)
                lineTo(19.59f, 20.0f)
                lineTo(21.0f, 18.59f)
                lineTo(18.41f, 16.0f)
                lineTo(21.0f, 13.41f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _rule!!
    }

private var _rule: ImageVector? = null
