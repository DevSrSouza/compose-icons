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

public val FilledGroup.HomeCheckmark: ImageVector
    get() {
        if (_homeCheckmark != null) {
            return _homeCheckmark!!
        }
        _homeCheckmark = Builder(name = "HomeCheckmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.537f, 2.5337f)
                curveTo(11.3747f, 1.8255f, 12.6012f, 1.8246f, 13.4399f, 2.5317f)
                lineTo(20.2002f, 8.231f)
                curveTo(20.7073f, 8.6585f, 21.0f, 9.2879f, 21.0f, 9.9512f)
                verticalLineTo(19.7498f)
                curveTo(21.0f, 20.7163f, 20.2165f, 21.4998f, 19.25f, 21.4998f)
                horizontalLineTo(4.75f)
                curveTo(3.7835f, 21.4998f, 3.0f, 20.7163f, 3.0f, 19.7498f)
                verticalLineTo(9.9499f)
                curveTo(3.0f, 9.2878f, 3.2917f, 8.6592f, 3.7973f, 8.2317f)
                lineTo(10.537f, 2.5337f)
                close()
                moveTo(15.7837f, 11.7767f)
                curveTo(16.0766f, 11.4838f, 16.0766f, 11.009f, 15.7837f, 10.7161f)
                curveTo(15.4908f, 10.4232f, 15.0159f, 10.4232f, 14.723f, 10.7161f)
                lineTo(10.75f, 14.6892f)
                lineTo(9.2803f, 13.2195f)
                curveTo(8.9874f, 12.9266f, 8.5126f, 12.9266f, 8.2197f, 13.2195f)
                curveTo(7.9268f, 13.5124f, 7.9268f, 13.9873f, 8.2197f, 14.2802f)
                lineTo(10.2197f, 16.2802f)
                curveTo(10.3603f, 16.4208f, 10.5511f, 16.4998f, 10.75f, 16.4998f)
                curveTo(10.9489f, 16.4998f, 11.1397f, 16.4208f, 11.2803f, 16.2802f)
                lineTo(15.7837f, 11.7767f)
                close()
            }
        }
        .build()
        return _homeCheckmark!!
    }

private var _homeCheckmark: ImageVector? = null
