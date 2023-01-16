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

public val MaterialDesignIcons.BaseballDiamond: ImageVector
    get() {
        if (_baseballDiamond != null) {
            return _baseballDiamond!!
        }
        _baseballDiamond = Builder(name = "BaseballDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.79f, 12.79f)
                lineTo(2.0f, 9.0f)
                curveTo(2.0f, 9.0f, 6.0f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(22.0f, 9.0f, 22.0f, 9.0f)
                lineTo(18.21f, 12.79f)
                lineTo(12.0f, 6.59f)
                lineTo(5.79f, 12.79f)
                moveTo(13.5f, 18.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(20.0f)
                lineTo(12.0f, 21.0f)
                lineTo(13.5f, 20.0f)
                verticalLineTo(18.0f)
                moveTo(16.79f, 14.21f)
                lineTo(14.2f, 16.8f)
                curveTo(13.6f, 16.31f, 12.84f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(10.4f, 16.31f, 9.8f, 16.8f)
                lineTo(7.21f, 14.21f)
                lineTo(12.0f, 9.41f)
                lineTo(16.79f, 14.21f)
                moveTo(13.0f, 14.0f)
                curveTo(13.0f, 13.45f, 12.55f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(11.0f, 13.45f, 11.0f, 14.0f)
                reflectiveCurveTo(11.45f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(13.0f, 14.55f, 13.0f, 14.0f)
                close()
            }
        }
        .build()
        return _baseballDiamond!!
    }

private var _baseballDiamond: ImageVector? = null
