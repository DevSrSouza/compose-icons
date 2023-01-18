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

public val FilledGroup.DoubleTapSwipeUp: ImageVector
    get() {
        if (_doubleTapSwipeUp != null) {
            return _doubleTapSwipeUp!!
        }
        _doubleTapSwipeUp = Builder(name = "DoubleTapSwipeUp", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7071f, 2.2929f)
                curveTo(12.3166f, 1.9024f, 11.6834f, 1.9024f, 11.2929f, 2.2929f)
                lineTo(8.2929f, 5.2929f)
                curveTo(7.9024f, 5.6834f, 7.9024f, 6.3166f, 8.2929f, 6.7071f)
                curveTo(8.6834f, 7.0976f, 9.3166f, 7.0976f, 9.7071f, 6.7071f)
                lineTo(11.0f, 5.4142f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 15.5523f, 11.4477f, 16.0f, 12.0f, 16.0f)
                curveTo(12.5523f, 16.0f, 13.0f, 15.5523f, 13.0f, 15.0f)
                verticalLineTo(5.4142f)
                lineTo(14.2929f, 6.7071f)
                curveTo(14.6834f, 7.0976f, 15.3166f, 7.0976f, 15.7071f, 6.7071f)
                curveTo(16.0976f, 6.3166f, 16.0976f, 5.6834f, 15.7071f, 5.2929f)
                lineTo(12.7071f, 2.2929f)
                close()
                moveTo(4.5f, 14.9999f)
                curveTo(4.5f, 11.5504f, 6.8288f, 8.6448f, 10.0f, 7.7695f)
                verticalLineTo(9.8749f)
                curveTo(7.9513f, 10.6749f, 6.5f, 12.6679f, 6.5f, 14.9999f)
                curveTo(6.5f, 18.0375f, 8.9624f, 20.4999f, 12.0f, 20.4999f)
                curveTo(15.0376f, 20.4999f, 17.5f, 18.0375f, 17.5f, 14.9999f)
                curveTo(17.5f, 12.6679f, 16.0487f, 10.6749f, 14.0f, 9.8749f)
                verticalLineTo(7.7695f)
                curveTo(17.1712f, 8.6448f, 19.5f, 11.5504f, 19.5f, 14.9999f)
                curveTo(19.5f, 19.1421f, 16.1421f, 22.4999f, 12.0f, 22.4999f)
                curveTo(7.8579f, 22.4999f, 4.5f, 19.1421f, 4.5f, 14.9999f)
                close()
                moveTo(7.5f, 14.9999f)
                curveTo(7.5f, 13.2331f, 8.5183f, 11.704f, 10.0f, 10.9677f)
                verticalLineTo(13.4997f)
                curveTo(9.686f, 13.9175f, 9.5f, 14.437f, 9.5f, 14.9999f)
                curveTo(9.5f, 16.3806f, 10.6193f, 17.4999f, 12.0f, 17.4999f)
                curveTo(13.3807f, 17.4999f, 14.5f, 16.3806f, 14.5f, 14.9999f)
                curveTo(14.5f, 14.437f, 14.314f, 13.9175f, 14.0f, 13.4997f)
                verticalLineTo(10.9677f)
                curveTo(15.4817f, 11.704f, 16.5f, 13.2331f, 16.5f, 14.9999f)
                curveTo(16.5f, 17.4852f, 14.4853f, 19.4999f, 12.0f, 19.4999f)
                curveTo(9.5147f, 19.4999f, 7.5f, 17.4852f, 7.5f, 14.9999f)
                close()
            }
        }
        .build()
        return _doubleTapSwipeUp!!
    }

private var _doubleTapSwipeUp: ImageVector? = null
