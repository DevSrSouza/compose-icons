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

public val MaterialDesignIcons.ChevronTripleRight: ImageVector
    get() {
        if (_chevronTripleRight != null) {
            return _chevronTripleRight!!
        }
        _chevronTripleRight = Builder(name = "ChevronTripleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.58f, 16.59f)
                lineTo(19.17f, 12.0f)
                lineTo(14.58f, 7.41f)
                lineTo(16.0f, 6.0f)
                lineTo(22.0f, 12.0f)
                lineTo(16.0f, 18.0f)
                lineTo(14.58f, 16.59f)
                moveTo(8.58f, 16.59f)
                lineTo(13.17f, 12.0f)
                lineTo(8.58f, 7.41f)
                lineTo(10.0f, 6.0f)
                lineTo(16.0f, 12.0f)
                lineTo(10.0f, 18.0f)
                lineTo(8.58f, 16.59f)
                moveTo(2.58f, 16.59f)
                lineTo(7.17f, 12.0f)
                lineTo(2.58f, 7.41f)
                lineTo(4.0f, 6.0f)
                lineTo(10.0f, 12.0f)
                lineTo(4.0f, 18.0f)
                lineTo(2.58f, 16.59f)
                close()
            }
        }
        .build()
        return _chevronTripleRight!!
    }

private var _chevronTripleRight: ImageVector? = null
