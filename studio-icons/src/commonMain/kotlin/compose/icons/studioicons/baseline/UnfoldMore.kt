package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.UnfoldMore: ImageVector
    get() {
        if (_unfoldMore != null) {
            return _unfoldMore!!
        }
        _unfoldMore = Builder(name = "UnfoldMore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.83f)
                lineTo(15.17f, 9.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.0f, 3.0f)
                lineTo(7.41f, 7.59f)
                lineTo(8.83f, 9.0f)
                lineTo(12.0f, 5.83f)
                close()
                moveTo(12.0f, 18.17f)
                lineTo(8.83f, 15.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.0f, 21.0f)
                lineToRelative(4.59f, -4.59f)
                lineTo(15.17f, 15.0f)
                lineTo(12.0f, 18.17f)
                close()
            }
        }
        .build()
        return _unfoldMore!!
    }

private var _unfoldMore: ImageVector? = null
