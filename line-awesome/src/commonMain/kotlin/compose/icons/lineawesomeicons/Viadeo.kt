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

public val LineAwesomeIcons.Viadeo: ImageVector
    get() {
        if (_viadeo != null) {
            return _viadeo!!
        }
        _viadeo = Builder(name = "Viadeo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(16.4f, 5.4f, 17.6996f, 7.9992f, 18.5996f, 10.6992f)
                curveTo(18.3996f, 8.0992f, 17.2f, 4.5f, 15.0f, 3.0f)
                close()
                moveTo(25.6992f, 4.0f)
                curveTo(24.1992f, 7.2f, 21.7996f, 6.3004f, 20.0996f, 7.9004f)
                curveTo(19.4996f, 8.4004f, 19.0996f, 9.5008f, 19.0996f, 10.3008f)
                curveTo(19.0996f, 11.0008f, 19.2992f, 11.5992f, 19.6992f, 12.1992f)
                curveTo(21.9992f, 11.6992f, 24.4004f, 10.0008f, 25.4004f, 7.8008f)
                curveTo(25.4004f, 8.0008f, 25.1996f, 8.4992f, 25.0996f, 8.6992f)
                curveTo(24.0996f, 10.3992f, 22.0008f, 11.9008f, 20.3008f, 12.8008f)
                curveTo(21.1008f, 13.5008f, 22.0f, 14.0f, 23.0f, 14.0f)
                curveTo(26.8f, 14.0f, 28.2992f, 7.5f, 25.6992f, 4.0f)
                close()
                moveTo(18.5f, 10.6992f)
                lineTo(18.5f, 12.5f)
                curveTo(18.5f, 17.1395f, 17.5538f, 24.5667f, 12.6152f, 26.8652f)
                curveTo(9.3916f, 26.2318f, 7.0f, 23.4248f, 7.0f, 20.0f)
                curveTo(7.0f, 16.1f, 10.1f, 13.0f, 14.0f, 13.0f)
                curveTo(14.8f, 13.0f, 15.4992f, 13.1004f, 16.1992f, 13.4004f)
                curveTo(16.2992f, 12.8004f, 16.5008f, 12.1996f, 16.8008f, 11.5996f)
                lineTo(16.9004f, 11.5f)
                curveTo(16.0004f, 11.2f, 15.0f, 11.0f, 14.0f, 11.0f)
                curveTo(9.0f, 11.0f, 5.0f, 15.0f, 5.0f, 20.0f)
                curveTo(5.0f, 25.0f, 9.0f, 29.0f, 14.0f, 29.0f)
                curveTo(19.0f, 29.0f, 23.0f, 25.0f, 23.0f, 20.0f)
                curveTo(23.0f, 18.7f, 22.6992f, 17.4008f, 22.1992f, 16.3008f)
                curveTo(22.0992f, 16.3008f, 22.0008f, 16.4f, 21.8008f, 16.5f)
                curveTo(21.4008f, 16.8f, 20.9004f, 16.9996f, 20.4004f, 17.0996f)
                curveTo(20.8004f, 17.9996f, 21.0f, 19.0f, 21.0f, 20.0f)
                curveTo(21.0f, 23.9f, 17.9f, 27.0f, 14.0f, 27.0f)
                curveTo(13.9723f, 27.0f, 13.9456f, 26.9964f, 13.918f, 26.9961f)
                curveTo(17.6969f, 24.5878f, 19.5f, 20.8769f, 19.5f, 16.5f)
                curveTo(19.5f, 14.5f, 19.2f, 12.4992f, 18.5f, 10.6992f)
                close()
            }
        }
        .build()
        return _viadeo!!
    }

private var _viadeo: ImageVector? = null
