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

public val MaterialDesignIcons.BedKingOutline: ImageVector
    get() {
        if (_bedKingOutline != null) {
            return _bedKingOutline!!
        }
        _bedKingOutline = Builder(name = "BedKingOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 5.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 7.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.33f)
                lineTo(4.0f, 19.0f)
                horizontalLineTo(5.0f)
                lineTo(5.67f, 17.0f)
                horizontalLineTo(18.33f)
                lineTo(19.0f, 19.0f)
                horizontalLineTo(20.0f)
                lineTo(20.67f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 10.0f)
                moveTo(13.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _bedKingOutline!!
    }

private var _bedKingOutline: ImageVector? = null
