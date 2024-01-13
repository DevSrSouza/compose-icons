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

public val SimpleIcons.Zerodha: ImageVector
    get() {
        if (_zerodha != null) {
            return _zerodha!!
        }
        _zerodha = Builder(name = "Zerodha", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.378f, 5.835f)
                arcTo(27.267f, 27.267f, 0.0f, false, true, 24.0f, 12.169f)
                verticalLineTo(0.0f)
                horizontalLineTo(13.666f)
                curveToRelative(2.486f, 1.343f, 4.763f, 3.308f, 6.712f, 5.835f)
                close()
                moveTo(5.48f, 1.297f)
                curveToRelative(-1.914f, 0.0f, -3.755f, 0.409f, -5.48f, 1.166f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(22.944f)
                curveTo(22.766f, 11.44f, 15.0f, 1.297f, 5.48f, 1.297f)
                close()
            }
        }
        .build()
        return _zerodha!!
    }

private var _zerodha: ImageVector? = null
