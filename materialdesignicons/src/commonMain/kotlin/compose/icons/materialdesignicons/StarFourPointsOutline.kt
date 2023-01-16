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

public val MaterialDesignIcons.StarFourPointsOutline: ImageVector
    get() {
        if (_starFourPointsOutline != null) {
            return _starFourPointsOutline!!
        }
        _starFourPointsOutline = Builder(name = "StarFourPointsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.7f)
                lineTo(13.45f, 10.55f)
                lineTo(17.3f, 12.0f)
                lineTo(13.45f, 13.45f)
                lineTo(12.0f, 17.3f)
                lineTo(10.55f, 13.45f)
                lineTo(6.7f, 12.0f)
                lineTo(10.55f, 10.55f)
                lineTo(12.0f, 6.7f)
                moveTo(12.0f, 1.0f)
                lineTo(9.0f, 9.0f)
                lineTo(1.0f, 12.0f)
                lineTo(9.0f, 15.0f)
                lineTo(12.0f, 23.0f)
                lineTo(15.0f, 15.0f)
                lineTo(23.0f, 12.0f)
                lineTo(15.0f, 9.0f)
                lineTo(12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _starFourPointsOutline!!
    }

private var _starFourPointsOutline: ImageVector? = null
