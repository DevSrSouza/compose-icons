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

public val MaterialDesignIcons.BedQueenOutline: ImageVector
    get() {
        if (_bedQueenOutline != null) {
            return _bedQueenOutline!!
        }
        _bedQueenOutline = Builder(name = "BedQueenOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 5.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 7.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.33f)
                lineTo(5.0f, 19.0f)
                horizontalLineTo(6.0f)
                lineTo(6.67f, 17.0f)
                horizontalLineTo(17.33f)
                lineTo(18.0f, 19.0f)
                horizontalLineTo(19.0f)
                lineTo(19.67f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                moveTo(19.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _bedQueenOutline!!
    }

private var _bedQueenOutline: ImageVector? = null
