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

public val MaterialDesignIcons.BaseballDiamondOutline: ImageVector
    get() {
        if (_baseballDiamondOutline != null) {
            return _baseballDiamondOutline!!
        }
        _baseballDiamondOutline = Builder(name = "BaseballDiamondOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(5.0f, 2.0f, 1.0f, 9.0f, 1.0f, 9.0f)
                lineTo(9.3f, 17.3f)
                curveTo(9.74f, 16.77f, 10.32f, 16.37f, 11.0f, 16.17f)
                lineTo(7.83f, 13.0f)
                lineTo(12.0f, 8.83f)
                lineTo(16.17f, 13.0f)
                lineTo(13.0f, 16.17f)
                curveTo(13.68f, 16.37f, 14.27f, 16.77f, 14.7f, 17.3f)
                lineTo(23.0f, 9.0f)
                curveTo(23.0f, 9.0f, 19.0f, 2.0f, 12.0f, 2.0f)
                moveTo(17.59f, 11.59f)
                lineTo(12.0f, 6.0f)
                lineTo(6.41f, 11.59f)
                lineTo(3.59f, 8.76f)
                curveTo(4.95f, 7.0f, 7.89f, 4.0f, 12.0f, 4.0f)
                curveTo(16.08f, 4.0f, 19.03f, 7.0f, 20.4f, 8.77f)
                lineTo(17.59f, 11.59f)
                moveTo(13.0f, 13.0f)
                curveTo(13.0f, 13.55f, 12.55f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(11.0f, 13.55f, 11.0f, 13.0f)
                reflectiveCurveTo(11.45f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(13.0f, 12.45f, 13.0f, 13.0f)
                moveTo(13.5f, 20.0f)
                lineTo(12.0f, 21.0f)
                lineTo(10.5f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _baseballDiamondOutline!!
    }

private var _baseballDiamondOutline: ImageVector? = null
