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

public val MaterialDesignIcons.ChevronTripleLeft: ImageVector
    get() {
        if (_chevronTripleLeft != null) {
            return _chevronTripleLeft!!
        }
        _chevronTripleLeft = Builder(name = "ChevronTripleLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.42f, 7.41f)
                lineTo(4.83f, 12.0f)
                lineTo(9.42f, 16.59f)
                lineTo(8.0f, 18.0f)
                lineTo(2.0f, 12.0f)
                lineTo(8.0f, 6.0f)
                lineTo(9.42f, 7.41f)
                moveTo(15.42f, 7.41f)
                lineTo(10.83f, 12.0f)
                lineTo(15.42f, 16.59f)
                lineTo(14.0f, 18.0f)
                lineTo(8.0f, 12.0f)
                lineTo(14.0f, 6.0f)
                lineTo(15.42f, 7.41f)
                moveTo(21.42f, 7.41f)
                lineTo(16.83f, 12.0f)
                lineTo(21.42f, 16.59f)
                lineTo(20.0f, 18.0f)
                lineTo(14.0f, 12.0f)
                lineTo(20.0f, 6.0f)
                lineTo(21.42f, 7.41f)
                close()
            }
        }
        .build()
        return _chevronTripleLeft!!
    }

private var _chevronTripleLeft: ImageVector? = null
