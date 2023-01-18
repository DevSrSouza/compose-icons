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

public val RegularGroup.AutoFitHeight: ImageVector
    get() {
        if (_autoFitHeight != null) {
            return _autoFitHeight!!
        }
        _autoFitHeight = Builder(name = "AutoFitHeight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                curveTo(5.3358f, 3.0f, 5.0f, 3.3358f, 5.0f, 3.75f)
                curveTo(5.0f, 4.1642f, 5.3358f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 4.5f, 19.0f, 4.1642f, 19.0f, 3.75f)
                curveTo(19.0f, 3.3358f, 18.6642f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(9.2216f, 14.2188f)
                curveTo(9.4879f, 13.9526f, 9.9045f, 13.9284f, 10.1982f, 14.1462f)
                lineTo(10.2823f, 14.2188f)
                lineTo(11.502f, 15.44f)
                verticalLineTo(12.3691f)
                lineTo(11.5f, 12.3437f)
                verticalLineTo(8.56f)
                lineTo(10.2803f, 9.7811f)
                lineTo(10.1962f, 9.8538f)
                curveTo(9.9026f, 10.0716f, 9.4859f, 10.0474f, 9.2197f, 9.7811f)
                curveTo(8.9534f, 9.5149f, 8.9292f, 9.0982f, 9.147f, 8.8046f)
                lineTo(9.2197f, 8.7205f)
                lineTo(11.5871f, 6.3504f)
                curveTo(11.7128f, 6.142f, 11.9629f, 6.0f, 12.2509f, 6.0f)
                curveTo(12.503f, 6.0f, 12.726f, 6.1089f, 12.862f, 6.2758f)
                lineTo(12.9148f, 6.3507f)
                lineTo(15.282f, 8.7205f)
                lineTo(15.3546f, 8.8046f)
                curveTo(15.5482f, 9.0656f, 15.5506f, 9.4238f, 15.3618f, 9.6872f)
                lineTo(15.282f, 9.7811f)
                lineTo(15.1979f, 9.8538f)
                curveTo(14.9369f, 10.0474f, 14.5787f, 10.0498f, 14.3153f, 9.8609f)
                lineTo(14.2213f, 9.7811f)
                lineTo(13.0f, 8.56f)
                verticalLineTo(11.6308f)
                lineTo(13.002f, 11.6562f)
                verticalLineTo(15.44f)
                lineTo(14.2233f, 14.2188f)
                curveTo(14.4895f, 13.9526f, 14.9062f, 13.9284f, 15.1998f, 14.1462f)
                lineTo(15.2839f, 14.2188f)
                curveTo(15.5502f, 14.4851f, 15.5744f, 14.9018f, 15.3565f, 15.1954f)
                lineTo(15.2839f, 15.2795f)
                lineTo(12.9167f, 17.6493f)
                curveTo(12.7911f, 17.8578f, 12.541f, 18.0f, 12.2529f, 18.0f)
                curveTo(11.9649f, 18.0f, 11.7147f, 17.858f, 11.589f, 17.6496f)
                lineTo(9.2216f, 15.2795f)
                curveTo(8.9287f, 14.9866f, 8.9287f, 14.5117f, 9.2216f, 14.2188f)
                close()
                moveTo(5.0f, 20.25f)
                curveTo(5.0f, 19.8358f, 5.3358f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 19.5f, 19.0f, 19.8358f, 19.0f, 20.25f)
                curveTo(19.0f, 20.6642f, 18.6642f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 21.0f, 5.0f, 20.6642f, 5.0f, 20.25f)
                close()
            }
        }
        .build()
        return _autoFitHeight!!
    }

private var _autoFitHeight: ImageVector? = null
