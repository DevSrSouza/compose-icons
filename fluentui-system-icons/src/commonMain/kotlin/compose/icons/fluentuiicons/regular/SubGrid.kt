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

public val RegularGroup.SubGrid: ImageVector
    get() {
        if (_subGrid != null) {
            return _subGrid!!
        }
        _subGrid = Builder(name = "SubGrid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.75f)
                curveTo(8.2312f, 7.0f, 7.0f, 8.2312f, 7.0f, 9.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(7.0f, 12.75f)
                verticalLineTo(14.25f)
                curveTo(7.0f, 15.7688f, 8.2312f, 17.0f, 9.75f, 17.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.0f)
                close()
                moveTo(11.25f, 15.5f)
                horizontalLineTo(9.75f)
                curveTo(9.0596f, 15.5f, 8.5f, 14.9404f, 8.5f, 14.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.5f)
                close()
                moveTo(12.75f, 17.0f)
                horizontalLineTo(14.25f)
                curveTo(15.7688f, 17.0f, 17.0f, 15.7688f, 17.0f, 14.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.5f, 12.75f)
                verticalLineTo(14.25f)
                curveTo(15.5f, 14.9404f, 14.9404f, 15.5f, 14.25f, 15.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(15.5f)
                close()
                moveTo(17.0f, 11.25f)
                verticalLineTo(9.75f)
                curveTo(17.0f, 8.2312f, 15.7688f, 7.0f, 14.25f, 7.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(17.0f)
                close()
                moveTo(12.75f, 8.5f)
                horizontalLineTo(14.25f)
                curveTo(14.9404f, 8.5f, 15.5f, 9.0596f, 15.5f, 9.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.5f)
                close()
                moveTo(11.25f, 8.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.75f)
                curveTo(8.5f, 9.0596f, 9.0596f, 8.5f, 9.75f, 8.5f)
                horizontalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _subGrid!!
    }

private var _subGrid: ImageVector? = null
