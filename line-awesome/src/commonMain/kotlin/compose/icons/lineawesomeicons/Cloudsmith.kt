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

public val LineAwesomeIcons.Cloudsmith: ImageVector
    get() {
        if (_cloudsmith != null) {
            return _cloudsmith!!
        }
        _cloudsmith = Builder(name = "Cloudsmith", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.854f, 3.0f)
                curveTo(16.444f, 3.0f, 14.291f, 4.951f, 14.291f, 7.35f)
                curveTo(14.291f, 9.76f, 12.76f, 11.291f, 10.35f, 11.291f)
                curveTo(7.951f, 11.291f, 6.0f, 13.443f, 6.0f, 15.854f)
                curveTo(6.0f, 18.265f, 7.951f, 20.0f, 10.35f, 20.0f)
                curveTo(12.76f, 20.0f, 14.707f, 18.266f, 14.707f, 15.855f)
                curveTo(14.707f, 13.444f, 16.444f, 11.709f, 18.854f, 11.709f)
                curveTo(21.254f, 11.709f, 23.0f, 9.76f, 23.0f, 7.35f)
                curveTo(23.0f, 4.951f, 21.254f, 3.0f, 18.854f, 3.0f)
                close()
                moveTo(19.506f, 20.0f)
                curveTo(17.016f, 20.0f, 15.0f, 22.015f, 15.0f, 24.494f)
                curveTo(15.0f, 26.985f, 17.016f, 29.0f, 19.506f, 29.0f)
                curveTo(21.986f, 29.0f, 24.0f, 26.985f, 24.0f, 24.494f)
                curveTo(24.0f, 22.015f, 21.986f, 20.0f, 19.506f, 20.0f)
                close()
            }
        }
        .build()
        return _cloudsmith!!
    }

private var _cloudsmith: ImageVector? = null
