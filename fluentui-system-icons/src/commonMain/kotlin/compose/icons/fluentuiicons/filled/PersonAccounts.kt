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

public val FilledGroup.PersonAccounts: ImageVector
    get() {
        if (_personAccounts != null) {
            return _personAccounts!!
        }
        _personAccounts = Builder(name = "PersonAccounts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0501f)
                verticalLineTo(13.9999f)
                horizontalLineTo(4.2528f)
                curveTo(3.0108f, 13.9999f, 2.0039f, 15.0068f, 2.0039f, 16.2488f)
                verticalLineTo(17.1688f)
                curveTo(2.0039f, 17.7409f, 2.1823f, 18.2987f, 2.5143f, 18.7646f)
                curveTo(4.0564f, 20.9289f, 6.5794f, 22.0011f, 10.0004f, 22.0011f)
                curveTo(10.3578f, 22.0011f, 10.7055f, 21.9894f, 11.0433f, 21.9659f)
                curveTo(11.0149f, 21.815f, 11.0f, 21.6592f, 11.0f, 21.5f)
                verticalLineTo(16.5001f)
                curveTo(11.0f, 15.2906f, 11.8589f, 14.2817f, 13.0f, 14.0501f)
                close()
                moveTo(10.0004f, 2.0046f)
                curveTo(12.7618f, 2.0046f, 15.0004f, 4.2432f, 15.0004f, 7.0046f)
                curveTo(15.0004f, 9.7661f, 12.7618f, 12.0046f, 10.0004f, 12.0046f)
                curveTo(7.2389f, 12.0046f, 5.0004f, 9.7661f, 5.0004f, 7.0046f)
                curveTo(5.0004f, 4.2432f, 7.2389f, 2.0046f, 10.0004f, 2.0046f)
                close()
                moveTo(14.0f, 15.0001f)
                horizontalLineTo(13.5f)
                curveTo(12.6716f, 15.0001f, 12.0f, 15.6716f, 12.0f, 16.5001f)
                verticalLineTo(21.5f)
                curveTo(12.0f, 22.3284f, 12.6716f, 23.0f, 13.5f, 23.0f)
                horizontalLineTo(21.5f)
                curveTo(22.3284f, 23.0f, 23.0f, 22.3284f, 23.0f, 21.5f)
                verticalLineTo(16.5001f)
                curveTo(23.0f, 15.6716f, 22.3284f, 15.0001f, 21.5f, 15.0001f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.75f)
                curveTo(21.0f, 12.7835f, 20.2165f, 12.0f, 19.25f, 12.0f)
                horizontalLineTo(15.75f)
                curveTo(14.7835f, 12.0f, 14.0f, 12.7835f, 14.0f, 13.75f)
                verticalLineTo(15.0001f)
                close()
                moveTo(15.5f, 13.75f)
                curveTo(15.5f, 13.6119f, 15.6119f, 13.5f, 15.75f, 13.5f)
                horizontalLineTo(19.25f)
                curveTo(19.3881f, 13.5f, 19.5f, 13.6119f, 19.5f, 13.75f)
                verticalLineTo(15.0001f)
                horizontalLineTo(15.5f)
                verticalLineTo(13.75f)
                close()
            }
        }
        .build()
        return _personAccounts!!
    }

private var _personAccounts: ImageVector? = null
