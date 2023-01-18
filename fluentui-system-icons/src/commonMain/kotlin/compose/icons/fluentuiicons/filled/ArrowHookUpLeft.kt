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

public val FilledGroup.ArrowHookUpLeft: ImageVector
    get() {
        if (_arrowHookUpLeft != null) {
            return _arrowHookUpLeft!!
        }
        _arrowHookUpLeft = Builder(name = "ArrowHookUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                curveTo(7.0f, 19.5523f, 7.4477f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(13.0f)
                curveTo(15.2424f, 20.0f, 17.0109f, 19.2222f, 18.2179f, 17.9774f)
                curveTo(19.4136f, 16.7444f, 20.0f, 15.1129f, 20.0f, 13.5f)
                curveTo(20.0f, 11.8871f, 19.4136f, 10.2556f, 18.2179f, 9.0226f)
                curveTo(17.0109f, 7.7778f, 15.2424f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(8.4142f)
                lineTo(10.4571f, 4.9571f)
                curveTo(10.8476f, 4.5666f, 10.8476f, 3.9334f, 10.4571f, 3.5429f)
                curveTo(10.0666f, 3.1524f, 9.4334f, 3.1524f, 9.0429f, 3.5429f)
                lineTo(5.2929f, 7.2929f)
                curveTo(4.9024f, 7.6834f, 4.9024f, 8.3166f, 5.2929f, 8.7071f)
                lineTo(9.0429f, 12.4571f)
                curveTo(9.4334f, 12.8476f, 10.0666f, 12.8476f, 10.4571f, 12.4571f)
                curveTo(10.8476f, 12.0666f, 10.8476f, 11.4334f, 10.4571f, 11.0429f)
                lineTo(8.4142f, 9.0f)
                horizontalLineTo(13.0f)
                curveTo(14.7576f, 9.0f, 15.9892f, 9.5972f, 16.7821f, 10.4149f)
                curveTo(17.5864f, 11.2444f, 18.0f, 12.3629f, 18.0f, 13.5f)
                curveTo(18.0f, 14.6371f, 17.5864f, 15.7556f, 16.7821f, 16.5851f)
                curveTo(15.9891f, 17.4028f, 14.7576f, 18.0f, 13.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 18.0f, 7.0f, 18.4477f, 7.0f, 19.0f)
                close()
            }
        }
        .build()
        return _arrowHookUpLeft!!
    }

private var _arrowHookUpLeft: ImageVector? = null
