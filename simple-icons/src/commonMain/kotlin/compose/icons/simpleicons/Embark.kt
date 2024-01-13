package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Embark: ImageVector
    get() {
        if (_embark != null) {
            return _embark!!
        }
        _embark = Builder(name = "Embark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.658f, 16.662f)
                verticalLineToRelative(-6.644f)
                curveTo(9.197f, 10.017f, 13.687f, 5.533f, 13.69f, 0.0f)
                horizontalLineToRelative(6.653f)
                curveToRelative(-0.003f, 9.202f, -7.472f, 16.662f, -16.685f, 16.662f)
                close()
                moveTo(3.656f, 24.0f)
                verticalLineToRelative(-6.672f)
                horizontalLineToRelative(16.689f)
                verticalLineTo(24.0f)
                horizontalLineTo(3.657f)
            }
        }
        .build()
        return _embark!!
    }

private var _embark: ImageVector? = null
