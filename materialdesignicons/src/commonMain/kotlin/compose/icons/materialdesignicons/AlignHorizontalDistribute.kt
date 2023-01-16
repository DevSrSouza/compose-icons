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

public val MaterialDesignIcons.AlignHorizontalDistribute: ImageVector
    get() {
        if (_alignHorizontalDistribute != null) {
            return _alignHorizontalDistribute!!
        }
        _alignHorizontalDistribute = Builder(name = "AlignHorizontalDistribute", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                moveTo(22.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                moveTo(13.5f, 7.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _alignHorizontalDistribute!!
    }

private var _alignHorizontalDistribute: ImageVector? = null
