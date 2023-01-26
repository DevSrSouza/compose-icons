package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.UnfoldMoreDouble: ImageVector
    get() {
        if (_unfoldMoreDouble != null) {
            return _unfoldMoreDouble!!
        }
        _unfoldMoreDouble = Builder(name = "UnfoldMoreDouble", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.83f)
                lineTo(15.17f, 11.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.0f, 5.0f)
                lineTo(7.41f, 9.59f)
                lineTo(8.83f, 11.0f)
                lineTo(12.0f, 7.83f)
                close()
                moveTo(12.0f, 2.83f)
                lineTo(15.17f, 6.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.0f, 0.0f)
                lineTo(7.41f, 4.59f)
                lineTo(8.83f, 6.0f)
                lineTo(12.0f, 2.83f)
                close()
                moveTo(12.0f, 21.17f)
                lineTo(8.83f, 18.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.0f, 24.0f)
                lineToRelative(4.59f, -4.59f)
                lineTo(15.17f, 18.0f)
                lineTo(12.0f, 21.17f)
                close()
                moveTo(12.0f, 16.17f)
                lineTo(8.83f, 13.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.0f, 19.0f)
                lineToRelative(4.59f, -4.59f)
                lineTo(15.17f, 13.0f)
                lineTo(12.0f, 16.17f)
                close()
            }
        }
        .build()
        return _unfoldMoreDouble!!
    }

private var _unfoldMoreDouble: ImageVector? = null
