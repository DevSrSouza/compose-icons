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

public val LineAwesomeIcons.CreativeCommonsPd: ImageVector
    get() {
        if (_creativeCommonsPd != null) {
            return _creativeCommonsPd!!
        }
        _creativeCommonsPd = Builder(name = "CreativeCommonsPd", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 17.238f, 26.783f, 18.425f, 26.404f, 19.537f)
                lineTo(14.0f, 14.016f)
                lineTo(14.0f, 14.0f)
                curveTo(14.0f, 12.897f, 14.897f, 12.0f, 16.0f, 12.0f)
                curveTo(17.103f, 12.0f, 18.0f, 12.897f, 18.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                curveTo(20.0f, 11.794f, 18.206f, 10.0f, 16.0f, 10.0f)
                curveTo(14.081f, 10.0f, 12.478f, 11.359f, 12.092f, 13.164f)
                lineTo(6.408f, 10.635f)
                curveTo(8.294f, 7.278f, 11.884f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(5.596f, 12.463f)
                lineTo(12.0f, 15.314f)
                lineTo(12.0f, 18.0f)
                curveTo(12.0f, 20.206f, 13.794f, 22.0f, 16.0f, 22.0f)
                curveTo(17.919f, 22.0f, 19.522f, 20.641f, 19.908f, 18.836f)
                lineTo(25.592f, 21.365f)
                curveTo(23.706f, 24.722f, 20.116f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 14.762f, 5.217f, 13.575f, 5.596f, 12.463f)
                close()
                moveTo(14.0f, 16.205f)
                lineTo(18.033f, 18.0f)
                lineTo(18.0f, 18.0f)
                curveTo(18.0f, 19.103f, 17.103f, 20.0f, 16.0f, 20.0f)
                curveTo(14.897f, 20.0f, 14.0f, 19.103f, 14.0f, 18.0f)
                lineTo(14.0f, 16.205f)
                close()
            }
        }
        .build()
        return _creativeCommonsPd!!
    }

private var _creativeCommonsPd: ImageVector? = null
