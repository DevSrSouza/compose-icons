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

public val FilledGroup.DoubleTapSwipeDown: ImageVector
    get() {
        if (_doubleTapSwipeDown != null) {
            return _doubleTapSwipeDown!!
        }
        _doubleTapSwipeDown = Builder(name = "DoubleTapSwipeDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7071f, 21.7071f)
                curveTo(12.3166f, 22.0976f, 11.6834f, 22.0976f, 11.2929f, 21.7071f)
                lineTo(8.2929f, 18.7071f)
                curveTo(7.9024f, 18.3166f, 7.9024f, 17.6834f, 8.2929f, 17.2929f)
                curveTo(8.6834f, 16.9024f, 9.3166f, 16.9024f, 9.7071f, 17.2929f)
                lineTo(11.0f, 18.5858f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 8.4477f, 11.4477f, 8.0f, 12.0f, 8.0f)
                curveTo(12.5523f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
                verticalLineTo(18.5858f)
                lineTo(14.2929f, 17.2929f)
                curveTo(14.6834f, 16.9024f, 15.3166f, 16.9024f, 15.7071f, 17.2929f)
                curveTo(16.0976f, 17.6834f, 16.0976f, 18.3166f, 15.7071f, 18.7071f)
                lineTo(12.7071f, 21.7071f)
                close()
                moveTo(4.5f, 9.0001f)
                curveTo(4.5f, 12.4496f, 6.8288f, 15.3552f, 10.0f, 16.2305f)
                verticalLineTo(14.1252f)
                curveTo(7.9513f, 13.3251f, 6.5f, 11.3321f, 6.5f, 9.0001f)
                curveTo(6.5f, 5.9625f, 8.9624f, 3.5001f, 12.0f, 3.5001f)
                curveTo(15.0376f, 3.5001f, 17.5f, 5.9625f, 17.5f, 9.0001f)
                curveTo(17.5f, 11.3321f, 16.0487f, 13.3251f, 14.0f, 14.1252f)
                verticalLineTo(16.2305f)
                curveTo(17.1712f, 15.3552f, 19.5f, 12.4496f, 19.5f, 9.0001f)
                curveTo(19.5f, 4.858f, 16.1421f, 1.5001f, 12.0f, 1.5001f)
                curveTo(7.8579f, 1.5001f, 4.5f, 4.858f, 4.5f, 9.0001f)
                close()
                moveTo(7.5f, 9.0001f)
                curveTo(7.5f, 10.767f, 8.5183f, 12.296f, 10.0f, 13.0323f)
                verticalLineTo(10.5003f)
                curveTo(9.686f, 10.0825f, 9.5f, 9.563f, 9.5f, 9.0001f)
                curveTo(9.5f, 7.6194f, 10.6193f, 6.5001f, 12.0f, 6.5001f)
                curveTo(13.3807f, 6.5001f, 14.5f, 7.6194f, 14.5f, 9.0001f)
                curveTo(14.5f, 9.563f, 14.314f, 10.0825f, 14.0f, 10.5003f)
                verticalLineTo(13.0323f)
                curveTo(15.4817f, 12.296f, 16.5f, 10.767f, 16.5f, 9.0001f)
                curveTo(16.5f, 6.5148f, 14.4853f, 4.5001f, 12.0f, 4.5001f)
                curveTo(9.5147f, 4.5001f, 7.5f, 6.5148f, 7.5f, 9.0001f)
                close()
            }
        }
        .build()
        return _doubleTapSwipeDown!!
    }

private var _doubleTapSwipeDown: ImageVector? = null
