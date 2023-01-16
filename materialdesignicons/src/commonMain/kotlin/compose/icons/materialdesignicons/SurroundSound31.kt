package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.SurroundSound31: ImageVector
    get() {
        if (_surroundSound31 != null) {
            return _surroundSound31!!
        }
        _surroundSound31 = Builder(name = "SurroundSound31", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                moveTo(10.0f, 15.0f)
                curveTo(10.0f, 16.1f, 9.1f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                curveTo(9.1f, 7.0f, 10.0f, 7.9f, 10.0f, 9.0f)
                verticalLineTo(10.5f)
                curveTo(10.0f, 11.3f, 9.3f, 12.0f, 8.5f, 12.0f)
                curveTo(9.3f, 12.0f, 10.0f, 12.7f, 10.0f, 13.5f)
                verticalLineTo(15.0f)
            }
        }
        .build()
        return _surroundSound31!!
    }

private var _surroundSound31: ImageVector? = null
