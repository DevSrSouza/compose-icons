package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 3.0f)
                curveTo(3.4551f, 3.0f, 2.0f, 4.4551f, 2.0f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(2.0f, 16.5449f, 3.4551f, 18.0f, 5.25f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.75f)
                curveTo(6.0f, 21.7801f, 7.176f, 22.368f, 8.0f, 21.75f)
                lineTo(13.0f, 18.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 18.0f, 22.0f, 16.5449f, 22.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.4551f, 20.5449f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
