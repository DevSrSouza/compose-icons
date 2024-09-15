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
                curveToRelative(0.0f, 17.67f, -14.33f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, 14.33f, 32.0f, 32.0f)
                close()
                moveTo(48.05f, 320.0f)
                horizontalLineToRelative(351.89f)
                curveToRelative(41.65f, 0.0f, 63.58f, -49.67f, 35.38f, -80.43f)
                lineTo(259.38f, 47.56f)
                curveToRelative(-19.01f, -20.74f, -51.75f, -20.74f, -70.77f, 0.0f)
                lineTo(12.67f, 239.57f)
                curveTo(-15.48f, 270.27f, 6.32f, 320.0f, 48.05f, 320.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
