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

public val LineAwesomeIcons.Yarn: ImageVector
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = Builder(name = "Yarn", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8f, 3.0f, 3.0f, 8.8f, 3.0f, 16.0f)
                curveTo(3.0f, 23.2f, 8.8f, 29.0f, 16.0f, 29.0f)
                curveTo(23.2f, 29.0f, 29.0f, 23.2f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8f, 23.2f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.1f, 5.0f, 27.0f, 9.9f, 27.0f, 16.0f)
                curveTo(27.0f, 22.1f, 22.1f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9f, 27.0f, 5.0f, 22.1f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9f, 9.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.209f, 9.0449f)
                curveTo(15.7592f, 9.1215f, 15.3008f, 10.5f, 15.3008f, 10.5f)
                curveTo(15.3008f, 10.5f, 14.0996f, 10.3008f, 13.0996f, 11.3008f)
                curveTo(12.8996f, 11.5008f, 12.7004f, 11.5992f, 12.4004f, 11.6992f)
                curveTo(12.3004f, 11.7992f, 12.2f, 11.8004f, 12.0f, 12.4004f)
                curveTo(11.6f, 13.3004f, 12.5996f, 14.4004f, 12.5996f, 14.4004f)
                curveTo(10.4996f, 15.9004f, 10.5992f, 17.9004f, 10.6992f, 18.4004f)
                curveTo(9.3992f, 19.5004f, 9.8992f, 20.9008f, 10.1992f, 21.3008f)
                curveTo(10.3992f, 21.6008f, 10.5992f, 21.5f, 10.6992f, 21.5f)
                curveTo(10.6992f, 21.6f, 10.1992f, 22.2004f, 10.6992f, 22.4004f)
                curveTo(11.1992f, 22.7004f, 12.0004f, 22.8004f, 12.4004f, 22.4004f)
                curveTo(12.7004f, 22.1004f, 12.8004f, 21.4992f, 12.9004f, 21.1992f)
                curveTo(13.0004f, 21.0992f, 13.0004f, 21.3996f, 13.4004f, 21.5996f)
                curveTo(13.4004f, 21.5996f, 12.7f, 21.8996f, 13.0f, 22.5996f)
                curveTo(13.1f, 22.7996f, 13.4f, 23.0f, 14.0f, 23.0f)
                curveTo(14.2f, 23.0f, 16.5992f, 22.8992f, 17.1992f, 22.6992f)
                curveTo(17.5992f, 22.5992f, 17.6992f, 22.4004f, 17.6992f, 22.4004f)
                curveTo(20.2992f, 21.7004f, 20.7996f, 20.5992f, 22.5996f, 20.1992f)
                curveTo(23.1996f, 20.0992f, 23.1996f, 19.0992f, 22.0996f, 19.1992f)
                curveTo(21.2996f, 19.1992f, 20.6f, 19.6f, 20.0f, 20.0f)
                curveTo(19.0f, 20.6f, 18.3008f, 20.6996f, 18.3008f, 20.5996f)
                curveTo(18.2008f, 20.4996f, 18.6992f, 19.3f, 18.1992f, 18.0f)
                curveTo(17.6992f, 16.6f, 16.8004f, 16.1996f, 16.9004f, 16.0996f)
                curveTo(17.2004f, 15.5996f, 17.8992f, 14.8004f, 18.1992f, 13.4004f)
                curveTo(18.2992f, 12.5004f, 18.3004f, 11.0008f, 17.9004f, 10.3008f)
                curveTo(17.8004f, 10.1008f, 17.1992f, 10.5f, 17.1992f, 10.5f)
                curveTo(17.1992f, 10.5f, 16.6004f, 9.1996f, 16.4004f, 9.0996f)
                curveTo(16.3379f, 9.0496f, 16.2732f, 9.034f, 16.209f, 9.0449f)
                close()
            }
        }
        .build()
        return _yarn!!
    }

private var _yarn: ImageVector? = null
