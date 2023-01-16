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

public val MaterialDesignIcons.Yeast: ImageVector
    get() {
        if (_yeast != null) {
            return _yeast!!
        }
        _yeast = Builder(name = "Yeast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 18.0f)
                lineTo(14.09f, 17.15f)
                curveTo(14.05f, 16.45f, 13.92f, 15.84f, 13.55f, 15.5f)
                curveTo(13.35f, 15.3f, 13.07f, 15.19f, 12.75f, 15.13f)
                curveTo(11.79f, 15.68f, 10.68f, 16.0f, 9.5f, 16.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 3.0f, 9.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 9.5f, 3.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 16.0f, 9.5f)
                curveTo(16.0f, 10.68f, 15.68f, 11.79f, 15.13f, 12.75f)
                curveTo(15.19f, 13.07f, 15.3f, 13.35f, 15.5f, 13.55f)
                curveTo(15.84f, 13.92f, 16.45f, 14.05f, 17.15f, 14.09f)
                lineTo(18.0f, 14.0f)
                moveTo(7.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 10.0f)
                moveTo(9.5f, 5.0f)
                curveTo(7.0f, 5.0f, 5.0f, 7.0f, 5.0f, 9.5f)
                curveTo(5.0f, 12.0f, 7.0f, 14.0f, 9.5f, 14.0f)
                curveTo(12.0f, 14.0f, 14.0f, 12.0f, 14.0f, 9.5f)
                curveTo(14.0f, 7.0f, 12.0f, 5.0f, 9.5f, 5.0f)
                close()
            }
        }
        .build()
        return _yeast!!
    }

private var _yeast: ImageVector? = null
