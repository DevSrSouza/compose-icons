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

public val FilledGroup.MatchAppLayout: ImageVector
    get() {
        if (_matchAppLayout != null) {
            return _matchAppLayout!!
        }
        _matchAppLayout = Builder(name = "MatchAppLayout", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 8.0f)
                curveTo(10.4665f, 8.0f, 11.25f, 8.7835f, 11.25f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(11.25f, 15.2165f, 10.4665f, 16.0f, 9.5f, 16.0f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 16.0f, 2.0f, 15.2165f, 2.0f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(2.0f, 8.8318f, 2.7071f, 8.0788f, 3.6065f, 8.0058f)
                lineTo(3.75f, 8.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(20.25f, 8.0f)
                curveTo(21.2165f, 8.0f, 22.0f, 8.7835f, 22.0f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(22.0f, 15.2165f, 21.2165f, 16.0f, 20.25f, 16.0f)
                horizontalLineTo(14.5f)
                curveTo(13.5335f, 16.0f, 12.75f, 15.2165f, 12.75f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(12.75f, 8.7835f, 13.5335f, 8.0f, 14.5f, 8.0f)
                horizontalLineTo(20.25f)
                close()
            }
        }
        .build()
        return _matchAppLayout!!
    }

private var _matchAppLayout: ImageVector? = null
