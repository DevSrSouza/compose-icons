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

public val FilledGroup.CheckmarkLock: ImageVector
    get() {
        if (_checkmarkLock != null) {
            return _checkmarkLock!!
        }
        _checkmarkLock = Builder(name = "CheckmarkLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 12.4265f, 21.9733f, 12.8468f, 21.9215f, 13.2593f)
                curveTo(21.5816f, 11.682f, 20.1789f, 10.5f, 18.5f, 10.5f)
                curveTo(16.567f, 10.5f, 15.0f, 12.067f, 15.0f, 14.0f)
                verticalLineTo(14.05f)
                curveTo(13.8589f, 14.2816f, 13.0f, 15.2905f, 13.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(13.0f, 21.6524f, 13.0136f, 21.8017f, 13.0398f, 21.9466f)
                curveTo(12.698f, 21.9819f, 12.3511f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.2197f, 8.9697f)
                lineTo(10.75f, 13.4393f)
                lineTo(8.7803f, 11.4697f)
                curveTo(8.4874f, 11.1768f, 8.0126f, 11.1768f, 7.7197f, 11.4697f)
                curveTo(7.4268f, 11.7626f, 7.4268f, 12.2374f, 7.7197f, 12.5303f)
                lineTo(10.2197f, 15.0303f)
                curveTo(10.5126f, 15.3232f, 10.9874f, 15.3232f, 11.2803f, 15.0303f)
                lineTo(16.2803f, 10.0303f)
                curveTo(16.5732f, 9.7374f, 16.5732f, 9.2626f, 16.2803f, 8.9697f)
                curveTo(15.9874f, 8.6768f, 15.5126f, 8.6768f, 15.2197f, 8.9697f)
                close()
                moveTo(18.5f, 11.5f)
                curveTo(19.8807f, 11.5f, 21.0f, 12.6193f, 21.0f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.5f)
                curveTo(21.5141f, 15.0f, 21.5281f, 15.0002f, 21.542f, 15.0006f)
                curveTo(22.351f, 15.0228f, 23.0f, 15.6856f, 23.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(23.0f, 22.3284f, 22.3284f, 23.0f, 21.5f, 23.0f)
                horizontalLineTo(15.5f)
                curveTo(14.7722f, 23.0f, 14.1655f, 22.4817f, 14.0288f, 21.7941f)
                curveTo(14.0099f, 21.699f, 14.0f, 21.6006f, 14.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 15.6716f, 14.6716f, 15.0f, 15.5f, 15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 12.6193f, 17.1193f, 11.5f, 18.5f, 11.5f)
                close()
                moveTo(18.1065f, 19.9196f)
                curveTo(18.2273f, 19.9713f, 18.3603f, 20.0f, 18.5f, 20.0f)
                curveTo(19.0523f, 20.0f, 19.5f, 19.5523f, 19.5f, 19.0f)
                curveTo(19.5f, 18.8863f, 19.481f, 18.777f, 19.4461f, 18.6752f)
                curveTo(19.3112f, 18.2823f, 18.9386f, 18.0f, 18.5f, 18.0f)
                curveTo(17.9477f, 18.0f, 17.5f, 18.4477f, 17.5f, 19.0f)
                curveTo(17.5f, 19.4126f, 17.7499f, 19.7668f, 18.1065f, 19.9196f)
                close()
                moveTo(17.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.0f)
                curveTo(19.5f, 13.4477f, 19.0523f, 13.0f, 18.5f, 13.0f)
                curveTo(17.9477f, 13.0f, 17.5f, 13.4477f, 17.5f, 14.0f)
                close()
            }
        }
        .build()
        return _checkmarkLock!!
    }

private var _checkmarkLock: ImageVector? = null
