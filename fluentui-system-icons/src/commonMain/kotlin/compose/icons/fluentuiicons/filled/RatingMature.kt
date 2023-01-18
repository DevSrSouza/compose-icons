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

public val FilledGroup.RatingMature: ImageVector
    get() {
        if (_ratingMature != null) {
            return _ratingMature!!
        }
        _ratingMature = Builder(name = "RatingMature", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(8.8262f, 8.2699f)
                curveTo(8.624f, 8.0273f, 8.2916f, 7.9373f, 7.9947f, 8.0448f)
                curveTo(7.6978f, 8.1523f, 7.5f, 8.4343f, 7.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(7.5f, 15.6643f, 7.8358f, 16.0f, 8.25f, 16.0f)
                curveTo(8.6642f, 16.0f, 9.0f, 15.6643f, 9.0f, 15.25f)
                verticalLineTo(10.8216f)
                lineTo(11.4238f, 13.7302f)
                curveTo(11.5663f, 13.9012f, 11.7774f, 14.0f, 12.0f, 14.0f)
                curveTo(12.2226f, 14.0f, 12.4337f, 13.9012f, 12.5762f, 13.7302f)
                lineTo(15.0f, 10.8216f)
                verticalLineTo(15.25f)
                curveTo(15.0f, 15.6643f, 15.3358f, 16.0f, 15.75f, 16.0f)
                curveTo(16.1642f, 16.0f, 16.5f, 15.6643f, 16.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(16.5f, 8.4343f, 16.3022f, 8.1523f, 16.0053f, 8.0448f)
                curveTo(15.7084f, 7.9373f, 15.376f, 8.0273f, 15.1738f, 8.2699f)
                lineTo(12.0f, 12.0785f)
                lineTo(8.8262f, 8.2699f)
                close()
            }
        }
        .build()
        return _ratingMature!!
    }

private var _ratingMature: ImageVector? = null
