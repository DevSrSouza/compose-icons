package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FunnelSharp: ImageVector
    get() {
        if (_funnelSharp != null) {
            return _funnelSharp!!
        }
        _funnelSharp = Builder(name = "FunnelSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 48.0f)
                lineToRelative(192.0f, 240.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(128.0f, 48.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(192.0f, -240.0f)
                lineToRelative(-512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _funnelSharp!!
    }

private var _funnelSharp: ImageVector? = null
