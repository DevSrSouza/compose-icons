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

public val MaterialDesignIcons.HumanHandsdown: ImageVector
    get() {
        if (_humanHandsdown != null) {
            return _humanHandsdown!!
        }
        _humanHandsdown = Builder(name = "HumanHandsdown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(10.89f, 1.0f, 10.0f, 1.9f, 10.0f, 3.0f)
                curveTo(10.0f, 4.11f, 10.89f, 5.0f, 12.0f, 5.0f)
                curveTo(13.11f, 5.0f, 14.0f, 4.11f, 14.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 1.0f)
                moveTo(10.0f, 6.0f)
                curveTo(9.73f, 6.0f, 9.5f, 6.11f, 9.31f, 6.28f)
                horizontalLineTo(9.3f)
                lineTo(4.0f, 11.59f)
                lineTo(5.42f, 13.0f)
                lineTo(9.0f, 9.41f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.41f)
                lineTo(18.58f, 13.0f)
                lineTo(20.0f, 11.59f)
                lineTo(14.7f, 6.28f)
                curveTo(14.5f, 6.11f, 14.27f, 6.0f, 14.0f, 6.0f)
            }
        }
        .build()
        return _humanHandsdown!!
    }

private var _humanHandsdown: ImageVector? = null
