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

public val SimpleIcons.Instapaper: ImageVector
    get() {
        if (_instapaper != null) {
            return _instapaper!!
        }
        _instapaper = Builder(name = "Instapaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.766f, 20.259f)
                curveToRelative(0.0f, 1.819f, 0.271f, 2.089f, 2.934f, 2.292f)
                verticalLineTo(24.0f)
                horizontalLineTo(6.301f)
                verticalLineToRelative(-1.449f)
                curveToRelative(2.666f, -0.203f, 2.934f, -0.473f, 2.934f, -2.292f)
                verticalLineTo(3.708f)
                curveToRelative(0.0f, -1.784f, -0.27f, -2.089f, -2.934f, -2.292f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(11.398f)
                verticalLineToRelative(1.416f)
                curveToRelative(-2.662f, 0.203f, -2.934f, 0.506f, -2.934f, 2.292f)
                verticalLineToRelative(16.551f)
                close()
            }
        }
        .build()
        return _instapaper!!
    }

private var _instapaper: ImageVector? = null
