package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FeedIssueClosed16: ImageVector
    get() {
        if (_feedIssueClosed16 != null) {
            return _feedIssueClosed16!!
        }
        _feedIssueClosed16 = Builder(name = "FeedIssueClosed16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(11.457f, 6.957f)
                arcToRelative(0.999f, 0.999f, 0.0f, true, false, -1.414f, -1.414f)
                lineTo(7.25f, 8.336f)
                lineTo(5.957f, 7.043f)
                arcToRelative(0.999f, 0.999f, 0.0f, true, false, -1.414f, 1.414f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _feedIssueClosed16!!
    }

private var _feedIssueClosed16: ImageVector? = null
