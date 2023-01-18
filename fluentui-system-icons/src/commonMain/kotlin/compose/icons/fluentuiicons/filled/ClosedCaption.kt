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

public val FilledGroup.ClosedCaption: ImageVector
    get() {
        if (_closedCaption != null) {
            return _closedCaption!!
        }
        _closedCaption = Builder(name = "ClosedCaption", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 4.0f)
                curveTo(20.5449f, 4.0f, 22.0f, 5.4551f, 22.0f, 7.25f)
                verticalLineTo(16.7546f)
                curveTo(22.0f, 18.5495f, 20.5449f, 20.0046f, 18.75f, 20.0046f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0046f, 2.0f, 18.5495f, 2.0f, 16.7546f)
                verticalLineTo(7.25f)
                curveTo(2.0f, 5.517f, 3.3565f, 4.1007f, 5.0656f, 4.0051f)
                lineTo(5.25f, 4.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(10.6216f, 8.5985f)
                curveTo(8.2132f, 7.2247f, 5.5f, 8.8544f, 5.5f, 12.0f)
                curveTo(5.5f, 15.1433f, 8.2154f, 16.7747f, 10.6208f, 15.4066f)
                curveTo(10.9808f, 15.2018f, 11.1067f, 14.7439f, 10.9019f, 14.3838f)
                curveTo(10.6971f, 14.0238f, 10.2392f, 13.8979f, 9.8792f, 14.1027f)
                curveTo(8.4841f, 14.8962f, 7.0f, 14.0046f, 7.0f, 12.0f)
                curveTo(7.0f, 9.9936f, 8.4807f, 9.1042f, 9.8784f, 9.9015f)
                curveTo(10.2382f, 10.1067f, 10.6962f, 9.9814f, 10.9015f, 9.6216f)
                curveTo(11.1067f, 9.2618f, 10.9814f, 8.8038f, 10.6216f, 8.5985f)
                close()
                moveTo(18.1216f, 8.5985f)
                curveTo(15.7132f, 7.2247f, 13.0f, 8.8544f, 13.0f, 12.0f)
                curveTo(13.0f, 15.1433f, 15.7154f, 16.7747f, 18.1208f, 15.4066f)
                curveTo(18.4808f, 15.2018f, 18.6067f, 14.7439f, 18.4019f, 14.3838f)
                curveTo(18.1971f, 14.0238f, 17.7392f, 13.8979f, 17.3792f, 14.1027f)
                curveTo(15.9841f, 14.8962f, 14.5f, 14.0046f, 14.5f, 12.0f)
                curveTo(14.5f, 9.9936f, 15.9807f, 9.1042f, 17.3784f, 9.9015f)
                curveTo(17.7382f, 10.1067f, 18.1962f, 9.9814f, 18.4015f, 9.6216f)
                curveTo(18.6067f, 9.2618f, 18.4814f, 8.8038f, 18.1216f, 8.5985f)
                close()
            }
        }
        .build()
        return _closedCaption!!
    }

private var _closedCaption: ImageVector? = null
