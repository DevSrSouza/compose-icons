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

public val FilledGroup.DocumentPageTopLeft: ImageVector
    get() {
        if (_documentPageTopLeft != null) {
            return _documentPageTopLeft!!
        }
        _documentPageTopLeft = Builder(name = "DocumentPageTopLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2562f, 8.999f)
                lineTo(9.4937f, 7.499f)
                horizontalLineTo(10.975f)
                lineTo(10.7375f, 8.999f)
                horizontalLineTo(9.2562f)
                close()
                moveTo(17.7499f, 2.0f)
                curveTo(18.9407f, 2.0f, 19.9155f, 2.9252f, 19.9947f, 4.096f)
                lineTo(19.9999f, 4.25f)
                verticalLineTo(19.7481f)
                curveTo(19.9999f, 20.9389f, 19.0747f, 21.9137f, 17.9039f, 21.9929f)
                lineTo(17.7499f, 21.9981f)
                horizontalLineTo(6.25f)
                curveTo(5.0591f, 21.9981f, 4.0844f, 21.0729f, 4.0052f, 19.9021f)
                lineTo(4.0f, 19.7481f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0591f, 4.9252f, 2.0844f, 6.096f, 2.0052f)
                lineTo(6.25f, 2.0f)
                horizontalLineTo(17.7499f)
                close()
                moveTo(10.3954f, 11.1598f)
                curveTo(10.3306f, 11.5689f, 10.6097f, 11.9531f, 11.0188f, 12.0179f)
                curveTo(11.428f, 12.0827f, 11.8121f, 11.8035f, 11.8769f, 11.3944f)
                lineTo(12.0187f, 10.499f)
                horizontalLineTo(12.75f)
                curveTo(13.1642f, 10.499f, 13.5f, 10.1632f, 13.5f, 9.749f)
                curveTo(13.5f, 9.3348f, 13.1642f, 8.999f, 12.75f, 8.999f)
                horizontalLineTo(12.2562f)
                lineTo(12.4937f, 7.499f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 7.499f, 14.0f, 7.1632f, 14.0f, 6.749f)
                curveTo(14.0f, 6.3348f, 13.6642f, 5.999f, 13.25f, 5.999f)
                horizontalLineTo(12.7312f)
                lineTo(12.8934f, 4.9744f)
                curveTo(12.9582f, 4.5653f, 12.6791f, 4.1811f, 12.2699f, 4.1163f)
                curveTo(11.8608f, 4.0515f, 11.4767f, 4.3307f, 11.4119f, 4.7398f)
                lineTo(11.2125f, 5.999f)
                horizontalLineTo(9.7312f)
                lineTo(9.8934f, 4.9744f)
                curveTo(9.9582f, 4.5653f, 9.6791f, 4.1811f, 9.2699f, 4.1163f)
                curveTo(8.8608f, 4.0515f, 8.4767f, 4.3307f, 8.4119f, 4.7398f)
                lineTo(8.2125f, 5.999f)
                horizontalLineTo(7.25f)
                curveTo(6.8358f, 5.999f, 6.5f, 6.3348f, 6.5f, 6.749f)
                curveTo(6.5f, 7.1632f, 6.8358f, 7.499f, 7.25f, 7.499f)
                horizontalLineTo(7.975f)
                lineTo(7.7375f, 8.999f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 8.999f, 6.0f, 9.3348f, 6.0f, 9.749f)
                curveTo(6.0f, 10.1632f, 6.3358f, 10.499f, 6.75f, 10.499f)
                horizontalLineTo(7.5f)
                lineTo(7.3954f, 11.1598f)
                curveTo(7.3306f, 11.5689f, 7.6097f, 11.9531f, 8.0189f, 12.0179f)
                curveTo(8.428f, 12.0827f, 8.8121f, 11.8035f, 8.8769f, 11.3944f)
                lineTo(9.0187f, 10.499f)
                horizontalLineTo(10.5f)
                lineTo(10.3954f, 11.1598f)
                close()
            }
        }
        .build()
        return _documentPageTopLeft!!
    }

private var _documentPageTopLeft: ImageVector? = null
