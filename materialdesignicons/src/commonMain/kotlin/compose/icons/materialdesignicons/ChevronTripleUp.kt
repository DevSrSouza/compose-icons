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

public val MaterialDesignIcons.ChevronTripleUp: ImageVector
    get() {
        if (_chevronTripleUp != null) {
            return _chevronTripleUp!!
        }
        _chevronTripleUp = Builder(name = "ChevronTripleUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.59f, 9.42f)
                lineTo(12.0f, 4.83f)
                lineTo(7.41f, 9.42f)
                lineTo(6.0f, 8.0f)
                lineTo(12.0f, 2.0f)
                lineTo(18.0f, 8.0f)
                lineTo(16.59f, 9.42f)
                moveTo(16.59f, 15.42f)
                lineTo(12.0f, 10.83f)
                lineTo(7.41f, 15.42f)
                lineTo(6.0f, 14.0f)
                lineTo(12.0f, 8.0f)
                lineTo(18.0f, 14.0f)
                lineTo(16.59f, 15.42f)
                moveTo(16.59f, 21.42f)
                lineTo(12.0f, 16.83f)
                lineTo(7.41f, 21.42f)
                lineTo(6.0f, 20.0f)
                lineTo(12.0f, 14.0f)
                lineTo(18.0f, 20.0f)
                lineTo(16.59f, 21.42f)
                close()
            }
        }
        .build()
        return _chevronTripleUp!!
    }

private var _chevronTripleUp: ImageVector? = null
