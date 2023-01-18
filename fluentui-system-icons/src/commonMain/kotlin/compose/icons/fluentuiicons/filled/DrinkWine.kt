package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DrinkWine: ImageVector
    get() {
        if (_drinkWine != null) {
            return _drinkWine!!
        }
        _drinkWine = Builder(name = "DrinkWine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 2.0f)
                curveTo(6.3358f, 2.0f, 6.0f, 2.3358f, 6.0f, 2.75f)
                verticalLineTo(9.75f)
                curveTo(6.0f, 12.6714f, 8.1787f, 15.084f, 11.0f, 15.4515f)
                verticalLineTo(20.5083f)
                lineTo(8.7528f, 20.5f)
                curveTo(8.3386f, 20.4985f, 8.0015f, 20.833f, 8.0f, 21.2472f)
                curveTo(7.9985f, 21.6614f, 8.333f, 21.9985f, 8.7472f, 22.0f)
                lineTo(11.7472f, 22.0111f)
                lineTo(11.7524f, 22.0111f)
                lineTo(15.2524f, 22.0f)
                curveTo(15.6666f, 21.9987f, 16.0013f, 21.6618f, 16.0f, 21.2476f)
                curveTo(15.9987f, 20.8334f, 15.6618f, 20.4987f, 15.2476f, 20.5f)
                lineTo(12.5f, 20.5087f)
                verticalLineTo(15.4555f)
                curveTo(15.5982f, 15.0849f, 18.0f, 12.448f, 18.0f, 9.25f)
                verticalLineTo(2.75f)
                curveTo(18.0f, 2.3358f, 17.6642f, 2.0f, 17.25f, 2.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(7.5f, 7.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(15.6833f, 9.707f)
                curveTo(15.6141f, 10.0696f, 15.4927f, 10.4137f, 15.3273f, 10.7311f)
                curveTo(15.1221f, 11.1248f, 14.8493f, 11.4772f, 14.5244f, 11.7731f)
                curveTo(14.2093f, 12.06f, 13.8449f, 12.2942f, 13.445f, 12.4613f)
                curveTo(13.2293f, 12.5515f, 13.0034f, 12.6221f, 12.7695f, 12.6709f)
                curveTo(12.4992f, 12.7273f, 12.2343f, 12.5539f, 12.1779f, 12.2836f)
                curveTo(12.1215f, 12.0132f, 12.2949f, 11.7484f, 12.5652f, 11.692f)
                curveTo(12.7363f, 11.6562f, 12.9016f, 11.6046f, 13.0594f, 11.5387f)
                curveTo(13.3521f, 11.4163f, 13.6195f, 11.2447f, 13.851f, 11.0338f)
                curveTo(14.0899f, 10.8162f, 14.2901f, 10.5574f, 14.4405f, 10.2689f)
                curveTo(14.5616f, 10.0365f, 14.6504f, 9.7848f, 14.7011f, 9.5195f)
                curveTo(14.7529f, 9.2482f, 15.0148f, 9.0703f, 15.286f, 9.1221f)
                curveTo(15.5572f, 9.1739f, 15.7351f, 9.4358f, 15.6833f, 9.707f)
                close()
            }
        }
        .build()
        return _drinkWine!!
    }

private var _drinkWine: ImageVector? = null
