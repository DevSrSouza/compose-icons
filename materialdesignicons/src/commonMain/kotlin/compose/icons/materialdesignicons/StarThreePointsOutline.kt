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

public val MaterialDesignIcons.StarThreePointsOutline: ImageVector
    get() {
        if (_starThreePointsOutline != null) {
            return _starThreePointsOutline!!
        }
        _starThreePointsOutline = Builder(name = "StarThreePointsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.5f)
                lineTo(13.2f, 13.5f)
                lineTo(16.0f, 16.5f)
                lineTo(12.0f, 15.6f)
                lineTo(7.9f, 16.5f)
                lineTo(10.7f, 13.5f)
                lineTo(12.0f, 9.5f)
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
        return _starThreePointsOutline!!
    }

private var _starThreePointsOutline: ImageVector? = null
