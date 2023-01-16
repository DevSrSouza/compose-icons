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

public val MaterialDesignIcons.ChevronTripleDown: ImageVector
    get() {
        if (_chevronTripleDown != null) {
            return _chevronTripleDown!!
        }
        _chevronTripleDown = Builder(name = "ChevronTripleDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.41f, 14.58f)
                lineTo(12.0f, 19.17f)
                lineTo(16.59f, 14.58f)
                lineTo(18.0f, 16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(6.0f, 16.0f)
                lineTo(7.41f, 14.58f)
                moveTo(7.41f, 8.58f)
                lineTo(12.0f, 13.17f)
                lineTo(16.59f, 8.58f)
                lineTo(18.0f, 10.0f)
                lineTo(12.0f, 16.0f)
                lineTo(6.0f, 10.0f)
                lineTo(7.41f, 8.58f)
                moveTo(7.41f, 2.58f)
                lineTo(12.0f, 7.17f)
                lineTo(16.59f, 2.58f)
                lineTo(18.0f, 4.0f)
                lineTo(12.0f, 10.0f)
                lineTo(6.0f, 4.0f)
                lineTo(7.41f, 2.58f)
                close()
            }
        }
        .build()
        return _chevronTripleDown!!
    }

private var _chevronTripleDown: ImageVector? = null
