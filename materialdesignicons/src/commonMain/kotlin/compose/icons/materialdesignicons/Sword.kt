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

public val MaterialDesignIcons.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.92f, 5.0f)
                horizontalLineTo(5.0f)
                lineTo(14.0f, 14.0f)
                lineTo(15.0f, 13.06f)
                moveTo(19.96f, 19.12f)
                lineTo(19.12f, 19.96f)
                curveTo(18.73f, 20.35f, 18.1f, 20.35f, 17.71f, 19.96f)
                lineTo(14.59f, 16.84f)
                lineTo(11.91f, 19.5f)
                lineTo(10.5f, 18.09f)
                lineTo(11.92f, 16.67f)
                lineTo(3.0f, 7.75f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.75f)
                lineTo(16.67f, 11.92f)
                lineTo(18.09f, 10.5f)
                lineTo(19.5f, 11.91f)
                lineTo(16.83f, 14.58f)
                lineTo(19.95f, 17.7f)
                curveTo(20.35f, 18.1f, 20.35f, 18.73f, 19.96f, 19.12f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
