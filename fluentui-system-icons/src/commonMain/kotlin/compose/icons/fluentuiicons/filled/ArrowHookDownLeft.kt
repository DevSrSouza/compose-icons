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

public val FilledGroup.ArrowHookDownLeft: ImageVector
    get() {
        if (_arrowHookDownLeft != null) {
            return _arrowHookDownLeft!!
        }
        _arrowHookDownLeft = Builder(name = "ArrowHookDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 4.4477f, 7.4477f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(15.2424f, 4.0f, 17.0109f, 4.7778f, 18.2179f, 6.0226f)
                curveTo(19.4136f, 7.2556f, 20.0f, 8.8871f, 20.0f, 10.5f)
                curveTo(20.0f, 12.1129f, 19.4136f, 13.7444f, 18.2179f, 14.9774f)
                curveTo(17.0109f, 16.2222f, 15.2424f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(8.4142f)
                lineTo(10.4571f, 19.0429f)
                curveTo(10.8476f, 19.4334f, 10.8476f, 20.0666f, 10.4571f, 20.4571f)
                curveTo(10.0666f, 20.8476f, 9.4334f, 20.8476f, 9.0429f, 20.4571f)
                lineTo(5.2929f, 16.7071f)
                curveTo(4.9024f, 16.3166f, 4.9024f, 15.6834f, 5.2929f, 15.2929f)
                lineTo(9.0429f, 11.5429f)
                curveTo(9.4334f, 11.1524f, 10.0666f, 11.1524f, 10.4571f, 11.5429f)
                curveTo(10.8476f, 11.9334f, 10.8476f, 12.5666f, 10.4571f, 12.9571f)
                lineTo(8.4142f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(14.7576f, 15.0f, 15.9892f, 14.4028f, 16.7821f, 13.5851f)
                curveTo(17.5864f, 12.7556f, 18.0f, 11.6371f, 18.0f, 10.5f)
                curveTo(18.0f, 9.3629f, 17.5864f, 8.2444f, 16.7821f, 7.4149f)
                curveTo(15.9891f, 6.5972f, 14.7576f, 6.0f, 13.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 6.0f, 7.0f, 5.5523f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _arrowHookDownLeft!!
    }

private var _arrowHookDownLeft: ImageVector? = null
