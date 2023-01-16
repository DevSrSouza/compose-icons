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

public val MaterialDesignIcons.StarThreePoints: ImageVector
    get() {
        if (_starThreePoints != null) {
            return _starThreePoints!!
        }
        _starThreePoints = Builder(name = "StarThreePoints", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.6f)
                lineTo(9.0f, 12.4f)
                lineTo(2.0f, 19.9f)
                lineTo(12.0f, 17.6f)
                lineTo(22.0f, 20.0f)
                lineTo(15.0f, 12.5f)
                lineTo(12.0f, 2.6f)
                close()
            }
        }
        .build()
        return _starThreePoints!!
    }

private var _starThreePoints: ImageVector? = null
