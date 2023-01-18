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

public val FilledGroup.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7488f, 4.0f)
                curveTo(20.9915f, 4.0f, 21.9988f, 5.0074f, 21.9988f, 6.25f)
                verticalLineTo(17.7546f)
                curveTo(21.9988f, 18.9972f, 20.9915f, 20.0046f, 19.7488f, 20.0046f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0046f, 2.0f, 18.9972f, 2.0f, 17.7546f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.7488f)
                close()
                moveTo(15.7482f, 9.0f)
                horizontalLineTo(8.0f)
                lineTo(7.8237f, 9.0051f)
                curveTo(6.2489f, 9.0963f, 5.0f, 10.4023f, 5.0f, 12.0f)
                curveTo(5.0f, 13.6569f, 6.3432f, 15.0f, 8.0f, 15.0f)
                curveTo(9.6568f, 15.0f, 11.0f, 13.6569f, 11.0f, 12.0f)
                curveTo(11.0f, 11.5317f, 10.8927f, 11.0885f, 10.7014f, 10.6936f)
                lineTo(10.5988f, 10.5003f)
                horizontalLineTo(13.4012f)
                curveTo(13.146f, 10.9415f, 13.0f, 11.4537f, 13.0f, 12.0f)
                curveTo(13.0f, 13.6569f, 14.3431f, 15.0f, 16.0f, 15.0f)
                curveTo(17.6569f, 15.0f, 19.0f, 13.6569f, 19.0f, 12.0f)
                curveTo(19.0f, 10.4023f, 17.7511f, 9.0963f, 16.1763f, 9.0051f)
                lineTo(16.0f, 9.0f)
                lineTo(15.8304f, 9.0044f)
                lineTo(15.7482f, 9.0f)
                close()
                moveTo(8.0f, 10.5f)
                curveTo(8.8284f, 10.5f, 9.5f, 11.1716f, 9.5f, 12.0f)
                curveTo(9.5f, 12.8284f, 8.8284f, 13.5f, 8.0f, 13.5f)
                curveTo(7.1716f, 13.5f, 6.5f, 12.8284f, 6.5f, 12.0f)
                curveTo(6.5f, 11.1716f, 7.1716f, 10.5f, 8.0f, 10.5f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(16.8284f, 10.5f, 17.5f, 11.1716f, 17.5f, 12.0f)
                curveTo(17.5f, 12.8284f, 16.8284f, 13.5f, 16.0f, 13.5f)
                curveTo(15.1716f, 13.5f, 14.5f, 12.8284f, 14.5f, 12.0f)
                curveTo(14.5f, 11.1716f, 15.1716f, 10.5f, 16.0f, 10.5f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
