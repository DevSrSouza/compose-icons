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

public val FilledGroup.DocumentPageNumber: ImageVector
    get() {
        if (_documentPageNumber != null) {
            return _documentPageNumber!!
        }
        _documentPageNumber = Builder(name = "DocumentPageNumber", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2562f, 12.999f)
                lineTo(11.4937f, 11.499f)
                horizontalLineTo(12.975f)
                lineTo(12.7375f, 12.999f)
                horizontalLineTo(11.2562f)
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
                moveTo(12.3954f, 15.1598f)
                curveTo(12.3306f, 15.5689f, 12.6097f, 15.9531f, 13.0188f, 16.0179f)
                curveTo(13.428f, 16.0827f, 13.8121f, 15.8035f, 13.8769f, 15.3944f)
                lineTo(14.0187f, 14.499f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 14.499f, 15.5f, 14.1632f, 15.5f, 13.749f)
                curveTo(15.5f, 13.3348f, 15.1642f, 12.999f, 14.75f, 12.999f)
                horizontalLineTo(14.2562f)
                lineTo(14.4937f, 11.499f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 11.499f, 16.0f, 11.1632f, 16.0f, 10.749f)
                curveTo(16.0f, 10.3348f, 15.6642f, 9.999f, 15.25f, 9.999f)
                horizontalLineTo(14.7312f)
                lineTo(14.8934f, 8.9744f)
                curveTo(14.9582f, 8.5653f, 14.6791f, 8.1811f, 14.2699f, 8.1163f)
                curveTo(13.8608f, 8.0515f, 13.4767f, 8.3307f, 13.4119f, 8.7398f)
                lineTo(13.2125f, 9.999f)
                horizontalLineTo(11.7312f)
                lineTo(11.8934f, 8.9744f)
                curveTo(11.9582f, 8.5653f, 11.6791f, 8.1811f, 11.2699f, 8.1163f)
                curveTo(10.8608f, 8.0515f, 10.4767f, 8.3307f, 10.4119f, 8.7398f)
                lineTo(10.2125f, 9.999f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 9.999f, 8.5f, 10.3348f, 8.5f, 10.749f)
                curveTo(8.5f, 11.1632f, 8.8358f, 11.499f, 9.25f, 11.499f)
                horizontalLineTo(9.975f)
                lineTo(9.7375f, 12.999f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 12.999f, 8.0f, 13.3348f, 8.0f, 13.749f)
                curveTo(8.0f, 14.1632f, 8.3358f, 14.499f, 8.75f, 14.499f)
                horizontalLineTo(9.5f)
                lineTo(9.3954f, 15.1598f)
                curveTo(9.3306f, 15.5689f, 9.6097f, 15.9531f, 10.0188f, 16.0179f)
                curveTo(10.428f, 16.0827f, 10.8121f, 15.8035f, 10.8769f, 15.3944f)
                lineTo(11.0187f, 14.499f)
                horizontalLineTo(12.5f)
                lineTo(12.3954f, 15.1598f)
                close()
            }
        }
        .build()
        return _documentPageNumber!!
    }

private var _documentPageNumber: ImageVector? = null
