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

public val TwotoneGroup.LineWeight: ImageVector
    get() {
        if (_lineWeight != null) {
            return _lineWeight!!
        }
        _lineWeight = Builder(name = "LineWeight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                close()
            }
        }
        .build()
        return _lineWeight!!
    }

private var _lineWeight: ImageVector? = null
