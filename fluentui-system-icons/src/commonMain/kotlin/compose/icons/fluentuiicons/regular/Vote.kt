package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Vote: ImageVector
    get() {
        if (_vote != null) {
            return _vote!!
        }
        _vote = Builder(name = "Vote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.498f, 15.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(20.498f)
                verticalLineTo(15.5f)
                close()
                moveTo(21.9445f, 14.4719f)
                lineTo(21.9661f, 14.5337f)
                lineTo(21.9892f, 14.6345f)
                lineTo(21.9981f, 14.7331f)
                verticalLineTo(21.25f)
                curveTo(21.9981f, 21.6297f, 21.7159f, 21.9435f, 21.3499f, 21.9932f)
                lineTo(21.2481f, 22.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3703f, 22.0f, 2.0565f, 21.7179f, 2.0069f, 21.3518f)
                lineTo(2.0f, 21.25f)
                verticalLineTo(14.7506f)
                lineTo(2.0018f, 14.6977f)
                lineTo(2.0127f, 14.6122f)
                curveTo(2.0229f, 14.5584f, 2.0384f, 14.5072f, 2.0589f, 14.4587f)
                lineTo(4.8182f, 8.44f)
                curveTo(4.9252f, 8.2068f, 5.1424f, 8.0468f, 5.3915f, 8.0105f)
                lineTo(5.5f, 8.0026f)
                lineTo(8.0398f, 8.0018f)
                lineTo(7.2509f, 9.3721f)
                lineTo(7.1828f, 9.5018f)
                lineTo(5.981f, 9.502f)
                lineTo(3.918f, 13.9998f)
                horizontalLineTo(20.07f)
                lineTo(18.0428f, 9.6538f)
                lineTo(18.9052f, 8.1565f)
                curveTo(18.9718f, 8.2074f, 19.0301f, 8.2696f, 19.0771f, 8.3411f)
                lineTo(19.1297f, 8.4355f)
                lineTo(21.9445f, 14.4719f)
                close()
                moveTo(13.3652f, 2.0557f)
                lineTo(13.4566f, 2.1006f)
                lineTo(18.6447f, 5.1038f)
                curveTo(18.9729f, 5.2937f, 19.1033f, 5.6952f, 18.9636f, 6.0373f)
                lineTo(18.9187f, 6.1289f)
                lineTo(16.112f, 11.001f)
                lineTo(17.25f, 11.0016f)
                curveTo(17.6642f, 11.0016f, 18.0f, 11.3374f, 18.0f, 11.7516f)
                curveTo(18.0f, 12.1313f, 17.7178f, 12.4451f, 17.3518f, 12.4948f)
                lineTo(17.25f, 12.5016f)
                lineTo(15.248f, 12.501f)
                lineTo(15.2471f, 12.504f)
                horizontalLineTo(11.1691f)
                lineTo(11.166f, 12.501f)
                lineTo(6.75f, 12.5016f)
                curveTo(6.3358f, 12.5016f, 6.0f, 12.1658f, 6.0f, 11.7516f)
                curveTo(6.0f, 11.3719f, 6.2821f, 11.0581f, 6.6482f, 11.0085f)
                lineTo(6.75f, 11.0016f)
                lineTo(8.573f, 11.001f)
                lineTo(8.3914f, 10.8963f)
                curveTo(8.0633f, 10.7063f, 7.9328f, 10.3048f, 8.0726f, 9.9627f)
                lineTo(8.1175f, 9.8711f)
                lineTo(12.4341f, 2.3754f)
                curveTo(12.6235f, 2.0463f, 13.024f, 1.9156f, 13.3652f, 2.0557f)
                close()
                moveTo(13.3559f, 3.7753f)
                lineTo(9.7878f, 9.9712f)
                lineTo(11.566f, 11.001f)
                horizontalLineTo(14.383f)
                lineTo(17.248f, 6.0282f)
                lineTo(13.3559f, 3.7753f)
                close()
            }
        }
        .build()
        return _vote!!
    }

private var _vote: ImageVector? = null
