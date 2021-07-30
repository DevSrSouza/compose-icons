package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 384.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -17.673f, 14.327f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, 14.327f, 32.0f, 32.0f)
                close()
                moveTo(48.053f, 320.0f)
                horizontalLineToRelative(351.886f)
                curveToRelative(41.651f, 0.0f, 63.581f, -49.674f, 35.383f, -80.435f)
                lineTo(259.383f, 47.558f)
                curveToRelative(-19.014f, -20.743f, -51.751f, -20.744f, -70.767f, 0.0f)
                lineTo(12.67f, 239.565f)
                curveTo(-15.475f, 270.268f, 6.324f, 320.0f, 48.053f, 320.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
