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

public val MaterialDesignIcons.AlignVerticalDistribute: ImageVector
    get() {
        if (_alignVerticalDistribute != null) {
            return _alignVerticalDistribute!!
        }
        _alignVerticalDistribute = Builder(name = "AlignVerticalDistribute", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                moveTo(7.0f, 10.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(7.0f)
                moveTo(2.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _alignVerticalDistribute!!
    }

private var _alignVerticalDistribute: ImageVector? = null
