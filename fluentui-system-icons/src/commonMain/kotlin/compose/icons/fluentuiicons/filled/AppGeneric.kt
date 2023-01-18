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

public val FilledGroup.AppGeneric: ImageVector
    get() {
        if (_appGeneric != null) {
            return _appGeneric!!
        }
        _appGeneric = Builder(name = "AppGeneric", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(4.5f, 8.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(8.0f)
                close()
                moveTo(6.0f, 10.35f)
                curveTo(6.0f, 9.8806f, 6.3806f, 9.5f, 6.85f, 9.5f)
                horizontalLineTo(10.15f)
                curveTo(10.6194f, 9.5f, 11.0f, 9.8806f, 11.0f, 10.35f)
                verticalLineTo(17.15f)
                curveTo(11.0f, 17.6194f, 10.6194f, 18.0f, 10.15f, 18.0f)
                horizontalLineTo(6.85f)
                curveTo(6.3806f, 18.0f, 6.0f, 17.6194f, 6.0f, 17.15f)
                verticalLineTo(10.35f)
                close()
                moveTo(7.5f, 11.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(12.75f, 9.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 9.5f, 18.0f, 9.8358f, 18.0f, 10.25f)
                curveTo(18.0f, 10.6642f, 17.6642f, 11.0f, 17.25f, 11.0f)
                horizontalLineTo(12.75f)
                curveTo(12.3358f, 11.0f, 12.0f, 10.6642f, 12.0f, 10.25f)
                curveTo(12.0f, 9.8358f, 12.3358f, 9.5f, 12.75f, 9.5f)
                close()
                moveTo(12.0f, 13.25f)
                curveTo(12.0f, 12.8358f, 12.3358f, 12.5f, 12.75f, 12.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 12.5f, 17.0f, 12.8358f, 17.0f, 13.25f)
                curveTo(17.0f, 13.6642f, 16.6642f, 14.0f, 16.25f, 14.0f)
                horizontalLineTo(12.75f)
                curveTo(12.3358f, 14.0f, 12.0f, 13.6642f, 12.0f, 13.25f)
                close()
            }
        }
        .build()
        return _appGeneric!!
    }

private var _appGeneric: ImageVector? = null
