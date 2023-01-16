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

public val MaterialDesignIcons.Gold: ImageVector
    get() {
        if (_gold != null) {
            return _gold!!
        }
        _gold = Builder(name = "Gold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 22.0f)
                lineTo(2.5f, 17.0f)
                horizontalLineTo(9.5f)
                lineTo(11.0f, 22.0f)
                horizontalLineTo(1.0f)
                moveTo(13.0f, 22.0f)
                lineTo(14.5f, 17.0f)
                horizontalLineTo(21.5f)
                lineTo(23.0f, 22.0f)
                horizontalLineTo(13.0f)
                moveTo(6.0f, 15.0f)
                lineTo(7.5f, 10.0f)
                horizontalLineTo(14.5f)
                lineTo(16.0f, 15.0f)
                horizontalLineTo(6.0f)
                moveTo(23.0f, 6.05f)
                lineTo(19.14f, 7.14f)
                lineTo(18.05f, 11.0f)
                lineTo(16.96f, 7.14f)
                lineTo(13.1f, 6.05f)
                lineTo(16.96f, 4.96f)
                lineTo(18.05f, 1.1f)
                lineTo(19.14f, 4.96f)
                lineTo(23.0f, 6.05f)
                close()
            }
        }
        .build()
        return _gold!!
    }

private var _gold: ImageVector? = null
