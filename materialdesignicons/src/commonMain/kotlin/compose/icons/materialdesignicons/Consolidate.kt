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

public val MaterialDesignIcons.Consolidate: ImageVector
    get() {
        if (_consolidate != null) {
            return _consolidate!!
        }
        _consolidate = Builder(name = "Consolidate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                lineTo(15.0f, 10.0f)
                lineTo(18.0f, 7.0f)
                moveTo(14.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 10.0f)
                moveTo(2.0f, 11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                lineTo(9.0f, 10.0f)
                lineTo(6.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 11.0f)
                moveTo(15.0f, 16.0f)
                lineTo(12.0f, 13.0f)
                lineTo(9.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
            }
        }
        .build()
        return _consolidate!!
    }

private var _consolidate: ImageVector? = null
