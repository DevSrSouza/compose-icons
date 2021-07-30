package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ViadeoSquare: ImageVector
    get() {
        if (_viadeoSquare != null) {
            return _viadeoSquare!!
        }
        _viadeoSquare = Builder(name = "ViadeoSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4004f, 5.0f)
                curveTo(6.1004f, 5.0f, 5.0f, 6.1004f, 5.0f, 7.4004f)
                lineTo(5.0f, 24.6992f)
                curveTo(5.0f, 25.8992f, 6.1004f, 27.0f, 7.4004f, 27.0f)
                lineTo(24.6992f, 27.0f)
                curveTo(25.9992f, 27.0f, 27.0996f, 25.8996f, 27.0996f, 24.5996f)
                lineTo(27.0996f, 7.4004f)
                curveTo(26.9996f, 6.1004f, 25.8996f, 5.0f, 24.5996f, 5.0f)
                lineTo(7.4004f, 5.0f)
                close()
                moveTo(15.3008f, 7.6992f)
                curveTo(16.7008f, 8.5992f, 17.3996f, 10.9f, 17.5996f, 12.5f)
                curveTo(17.9996f, 13.6f, 18.1992f, 14.8996f, 18.1992f, 16.0996f)
                curveTo(18.1992f, 18.8987f, 17.0995f, 21.0977f, 14.7012f, 22.5977f)
                curveTo(17.1502f, 22.6369f, 19.0f, 20.5662f, 19.0f, 18.1992f)
                curveTo(19.0f, 17.5992f, 18.8996f, 17.0004f, 18.5996f, 16.4004f)
                curveTo(19.0996f, 16.3004f, 19.5004f, 16.1004f, 19.9004f, 15.9004f)
                curveTo(20.8004f, 17.7004f, 20.7004f, 20.2992f, 18.9004f, 22.1992f)
                curveTo(16.7004f, 24.5992f, 12.7996f, 24.5992f, 10.5996f, 22.1992f)
                curveTo(7.0996f, 18.3992f, 9.5992f, 12.1992f, 14.6992f, 12.1992f)
                curveTo(15.3992f, 12.1992f, 16.0992f, 12.3f, 16.6992f, 12.5f)
                curveTo(16.4992f, 12.9f, 16.3008f, 13.4004f, 16.3008f, 13.9004f)
                curveTo(15.8008f, 13.7004f, 15.2992f, 13.5996f, 14.6992f, 13.5996f)
                curveTo(12.1992f, 13.5996f, 10.4004f, 15.6996f, 10.4004f, 18.0996f)
                curveTo(10.4004f, 20.2996f, 11.9004f, 22.1f, 13.9004f, 22.5f)
                curveTo(17.0004f, 21.3f, 17.5996f, 16.4996f, 17.5996f, 13.5996f)
                lineTo(17.5996f, 12.5f)
                curveTo(16.9996f, 10.8f, 16.2008f, 9.1992f, 15.3008f, 7.6992f)
                close()
                moveTo(14.7012f, 22.5977f)
                curveTo(14.667f, 22.5971f, 14.634f, 22.601f, 14.5996f, 22.5996f)
                lineTo(14.6992f, 22.5996f)
                curveTo(14.7f, 22.5991f, 14.7004f, 22.5982f, 14.7012f, 22.5977f)
                close()
                moveTo(22.0996f, 8.1992f)
                curveTo(23.7996f, 10.3992f, 22.9008f, 14.6992f, 20.3008f, 14.6992f)
                curveTo(19.6008f, 14.6992f, 19.0f, 14.3004f, 18.5f, 13.9004f)
                curveTo(19.6f, 13.3004f, 20.9992f, 12.2992f, 21.6992f, 11.1992f)
                curveTo(21.7992f, 10.9992f, 21.9004f, 10.7996f, 21.9004f, 10.5996f)
                curveTo(21.3004f, 11.9996f, 19.5996f, 13.1f, 18.0996f, 13.5f)
                curveTo(17.8996f, 13.1f, 17.6992f, 12.7008f, 17.6992f, 12.3008f)
                curveTo(17.6992f, 11.8008f, 18.0004f, 11.0992f, 18.4004f, 10.6992f)
                curveTo(19.5004f, 9.6992f, 21.0996f, 10.2992f, 22.0996f, 8.1992f)
                close()
            }
        }
        .build()
        return _viadeoSquare!!
    }

private var _viadeoSquare: ImageVector? = null
