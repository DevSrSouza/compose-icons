package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.LinkSquare: ImageVector
    get() {
        if (_linkSquare != null) {
            return _linkSquare!!
        }
        _linkSquare = Builder(name = "LinkSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(12.25f)
                curveTo(3.0f, 14.0449f, 4.4551f, 15.5f, 6.25f, 15.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 14.0f, 4.5f, 13.2165f, 4.5f, 12.25f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(12.25f)
                curveTo(13.2165f, 4.5f, 14.0f, 5.2835f, 14.0f, 6.25f)
                verticalLineTo(12.25f)
                curveTo(14.0f, 13.2165f, 13.2165f, 14.0f, 12.25f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(12.25f)
                curveTo(14.0449f, 15.5f, 15.5f, 14.0449f, 15.5f, 12.25f)
                verticalLineTo(6.25f)
                curveTo(15.5f, 4.4551f, 14.0449f, 3.0f, 12.25f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(10.0f, 11.75f)
                curveTo(10.0f, 10.7835f, 10.7835f, 10.0f, 11.75f, 10.0f)
                horizontalLineTo(12.9982f)
                verticalLineTo(8.5f)
                horizontalLineTo(11.75f)
                curveTo(9.9551f, 8.5f, 8.5f, 9.9551f, 8.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(8.5f, 19.5449f, 9.9551f, 21.0f, 11.75f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(21.0f, 9.9551f, 19.5449f, 8.5f, 17.75f, 8.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 10.0f, 19.5f, 10.7835f, 19.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(11.75f)
                curveTo(10.7835f, 19.5f, 10.0f, 18.7165f, 10.0f, 17.75f)
                verticalLineTo(11.75f)
                close()
            }
        }
        .build()
        return _linkSquare!!
    }

private var _linkSquare: ImageVector? = null
